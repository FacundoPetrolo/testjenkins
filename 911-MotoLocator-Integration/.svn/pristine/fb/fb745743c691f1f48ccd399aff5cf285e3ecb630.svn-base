package ar.com.telefonica.mls.client;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.annotation.Resource;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;

import ar.com.telefonica.autogen.ws.soa.client.ObjectFactory;
import ar.com.telefonica.autogen.ws.soa.client.SendPosition;
import ar.com.telefonica.autogen.ws.soa.client.SendPositionResponse;
import ar.com.telefonica.mls.context.MotoLocatorContext;
import ar.com.telefonica.mls.model.SoaAvlServiceRequest;

@Component
public class SoaClient
{
	private static final Logger log = LoggerFactory.getLogger(SoaClient.class);
	
	@Value("${soa.baseUrl}")
	private String soaWebServicesBaseUrl;

	@Resource(name="soaWebServiceTemplate")
	private WebServiceTemplate webServiceTemplate;
	private ObjectFactory objectFactory = new ObjectFactory();
	
	@Autowired
	private MotoLocatorContext context;
	
	
	public SendPositionResponse avlservice(SoaAvlServiceRequest req)
	{
		log.info(String.format("Enviando nueva posición al SOA para el dispositivo %s", req.getDeviceCode()));
		
		try
		{
			XMLGregorianCalendar xmlGregorianCalendar = convertToXmlGregorianCalendar(req.getTimestamp());

			SendPosition request = objectFactory.createSendPosition();
			request.setIn0(req.getDeviceCode());
			request.setIn1(req.getIdEvento());
			request.setIn2(xmlGregorianCalendar);
			request.setIn3(req.getLatitud());
			request.setIn4(req.getLongitud());
			request.setIn5(req.getVelocidad());
			request.setIn6(req.getSentido());
			request.setIn7(req.getAntena());
			request.setIn8(req.getEdad());
			request.setIn9(req.getSignalLevel());
			request.setIn10(req.getAuxIn());

			SendPositionResponse response = (SendPositionResponse) webServiceTemplate.marshalSendAndReceive(
							soaWebServicesBaseUrl+"/avlservice",
							request);
			
			return response;
		}
		catch (DatatypeConfigurationException e)
		{
			log.error("Error tratando de convertir el timestamp a XMLGregorianCalendar para poder llamar al servicio. No se actualizará la posición para el dispositivo " + req.getDeviceCode(), e);
			return null;
		}
	}


	private XMLGregorianCalendar convertToXmlGregorianCalendar(Date timestamp) throws DatatypeConfigurationException
	{
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(timestamp);
		
		return DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
	}
}
