package ar.com.telefonica.mls.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.WebServiceIOException;

import ar.com.telefonica.autogen.ws.mls.client.LocfeedRegisterConsumerResponse;
import ar.com.telefonica.autogen.ws.mls.client.LoginStatus;
import ar.com.telefonica.autogen.ws.mls.client.MSSLoginResponse;
import ar.com.telefonica.autogen.ws.mls.client.MSSSelectRoleResponse;
import ar.com.telefonica.mls.client.MotoLocatorClient;
import ar.com.telefonica.mls.context.MotoLocatorContext;

@Service
public class ApplicationLifecycleService
{
	private static final Logger log = LoggerFactory.getLogger(ApplicationLifecycleService.class);
	
	@Value("${motoLocator.username}")
	private String motoLocatorUsername;
	@Value("${motoLocator.password}")
	private String motoLocatorPassword;
	@Value("${motoLocator.baseUrl}")
	private String motoLocatorWebServicesBaseUrl;
	
	@Autowired
	private MotoLocatorContext context;

	@Autowired
	private MotoLocatorClient wsClient;
	
	public void onContextInitialized()
	{
		log.info("Se levantó el contexto. A continuación se inicializará la comunicación con el MotoLocator...");
		log.info("Se intentará conectar con el MotoLocator en " + motoLocatorWebServicesBaseUrl);
		
		try
		{
			MSSLoginResponse mssLoginResponse = wsClient.mssLogin(motoLocatorUsername, motoLocatorPassword);
			context.setToken(mssLoginResponse.getToken());
			
			selectRoleIfNeeded(mssLoginResponse);
			
			LocfeedRegisterConsumerResponse locfeedRegisterConsumerResponse = wsClient.locfeedRegisterConsumer();
			if (locfeedRegisterConsumerResponse.isLocfeedRegisterConsumerResult())
				log.info("El registro del web service como consumer del MotoLocator se realizó con éxito.");
			else
				throw new RuntimeException("No se pudo registrar el web service como consumer del MotoLocator.");
		}
		catch (WebServiceIOException e)
		{
			log.error("Error intentando inicializar el servicio web de conexión a MotoLocator. El servicio no está registrado correctamente y no se recibirán actualizaciones de posición de los dispositivos. Compruebe que el MotoLocator está levantado en " + motoLocatorWebServicesBaseUrl, e);
		}
		
		log.info("La comunicación con el MotoLocator se inició con éxito!!!");
	}

	public void onContextClosed()
	{
		log.info("A continuación se finalizará la comunicación con el MotoLocator...");
		
		wsClient.locfeedDeregisterConsumer();
		wsClient.mssLogout();
		
		log.info("La comunicación con el MotoLocator se finalizó con éxito.");
	}

	private void selectRoleIfNeeded(MSSLoginResponse mssLoginResponse)
	{
		// Si el usuario tiene más de 1 rol asignado, es obligatorio elegir el rol antes de continuar.
		if (mssLoginResponse.getMSSLoginResult() == LoginStatus.PASS_NOT_FULL)
		{
			String role = mssLoginResponse.getRoles().getString().get(0);
			MSSSelectRoleResponse mssSelectRoleResponse = wsClient.mssSelectRole(role);
			
			if (mssSelectRoleResponse.getMSSSelectRoleResult() == LoginStatus.PASS)
				log.info(String.format("Se seleccionó manualmente el rol %s.", role));
			else
				throw new RuntimeException("No se pudo seleccionar un rol. No se inicia el MotoLocator. Se esperaba status PASS pero se obtuvo " + mssSelectRoleResponse.getMSSSelectRoleResult());
		}
	}
}
