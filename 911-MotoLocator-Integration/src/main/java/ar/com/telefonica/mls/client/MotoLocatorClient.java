package ar.com.telefonica.mls.client;

import java.io.IOException;

import javax.annotation.Resource;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.SoapHeader;
import org.springframework.ws.soap.SoapMessage;
import org.springframework.xml.transform.StringSource;

import ar.com.telefonica.autogen.ws.mls.client.LocfeedDeregisterConsumer;
import ar.com.telefonica.autogen.ws.mls.client.LocfeedDeregisterConsumerResponse;
import ar.com.telefonica.autogen.ws.mls.client.LocfeedRegisterConsumer;
import ar.com.telefonica.autogen.ws.mls.client.LocfeedRegisterConsumerResponse;
import ar.com.telefonica.autogen.ws.mls.client.MSSLogin;
import ar.com.telefonica.autogen.ws.mls.client.MSSLoginResponse;
import ar.com.telefonica.autogen.ws.mls.client.MSSLogout;
import ar.com.telefonica.autogen.ws.mls.client.MSSLogoutResponse;
import ar.com.telefonica.autogen.ws.mls.client.MSSSelectRole;
import ar.com.telefonica.autogen.ws.mls.client.MSSSelectRoleResponse;
import ar.com.telefonica.autogen.ws.mls.client.ObjectFactory;
import ar.com.telefonica.mls.context.MotoLocatorContext;

@Component
public class MotoLocatorClient
{
	private static final Logger log = LoggerFactory.getLogger(MotoLocatorClient.class);
	
	private static final int DEVICE_RECORDS_TYPE = 3;

	@Value("${location.minReportingPeriod}")
	private Integer minReportingPeriod;
	
	@Value("${consumer.url}")
	private String consumerWebServiceUrl;
	
	@Value("${motoLocator.baseUrl}")
	private String motoLocatorWebServicesBaseUrl;

	@Resource(name="motoLocatorWebServiceTemplate")
	private WebServiceTemplate webServiceTemplate;
	private ObjectFactory objectFactory = new ObjectFactory();
	
	@Autowired
	private MotoLocatorContext context;

	
	public MSSLoginResponse mssLogin(String user, String password)
	{
		log.info(String.format("Enviando request de MSSLogin: [user=%s, password=%s]", user, password));

		MSSLogin request = objectFactory.createMSSLogin();
		request.setUser(user);
		request.setPassword(password);

		MSSLoginResponse response = (MSSLoginResponse) webServiceTemplate.marshalSendAndReceive(
						motoLocatorWebServicesBaseUrl+"/MSSLogin",
						request);
		
		log.info("MSSLogin result: " + response.getMSSLoginResult().name());
		return response;
	}

	public MSSSelectRoleResponse mssSelectRole(String role)
	{
		log.info(String.format("Enviando request de MSSSelectRole: [role=%s]", role));
		
		MSSSelectRole request = objectFactory.createMSSSelectRole();
		request.setRole(role);
		
		MSSSelectRoleResponse response = (MSSSelectRoleResponse) webServiceTemplate.marshalSendAndReceive(
				motoLocatorWebServicesBaseUrl+"/MSSSelectRole",
				request, new WebServiceSessionHeaderCallBack(context));
		
		return response;
	}
	
	public LocfeedRegisterConsumerResponse locfeedRegisterConsumer()
	{
		log.info(String.format("Enviando request de locfeed_RegisterConsumer: [url=%s, minReportingPeriod=%d]", consumerWebServiceUrl, minReportingPeriod));
		
		LocfeedRegisterConsumer request = objectFactory.createLocfeedRegisterConsumer();
		request.setURL(consumerWebServiceUrl);
		request.setMinReportingPeriod(minReportingPeriod);
		request.setConsumerType(DEVICE_RECORDS_TYPE);
		request.setAutoSubscribe(false);
		
		LocfeedRegisterConsumerResponse response = (LocfeedRegisterConsumerResponse) webServiceTemplate.marshalSendAndReceive(
				motoLocatorWebServicesBaseUrl+"/locfeed_RegisterConsumer",
				request, new WebServiceSessionHeaderCallBack(context));
		
		return response;
	}
	
	public LocfeedDeregisterConsumerResponse locfeedDeregisterConsumer()
	{
		log.info(String.format("Enviando request de locfeed_DeregisterConsumer: [url=%s]", consumerWebServiceUrl));
		
		LocfeedDeregisterConsumer request = objectFactory.createLocfeedDeregisterConsumer();
		request.setURL(consumerWebServiceUrl);
		
		LocfeedDeregisterConsumerResponse response = (LocfeedDeregisterConsumerResponse) webServiceTemplate.marshalSendAndReceive(
				motoLocatorWebServicesBaseUrl+"/locfeed_DeregisterConsumer",
				request, new WebServiceSessionHeaderCallBack(context));
		
		return response;
	}
	
	public MSSLogoutResponse mssLogout()
	{
		log.info("Enviando request de MSSLogout");
		
		MSSLogout request = objectFactory.createMSSLogout();
		request.setToken(context.getToken());
		
		MSSLogoutResponse response = (MSSLogoutResponse) webServiceTemplate.marshalSendAndReceive(
				motoLocatorWebServicesBaseUrl+"/MSSLogout",
				request);
		
		return response;
	}
	
	
	
	private static class WebServiceSessionHeaderCallBack implements WebServiceMessageCallback
	{
		private String token;
		private String ip;
		
		public WebServiceSessionHeaderCallBack(MotoLocatorContext context)
		{
			this(context.getToken(), context.getIp());
		}

		public WebServiceSessionHeaderCallBack(String token, String ip)
		{
			this.token = token;
			this.ip = ip;
		}

		@Override
		public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException
		{
			SoapMessage soapMessage = (SoapMessage)message;
			SoapHeader header = soapMessage.getSoapHeader();
			
			String headerAsXml = "<MSSSoapHeader xmlns=\"http://www.motorola.com/mls\">\n" +
					"<Token>" + token + "</Token>\n" +
					(ip!=null ? "<Ip>" + ip + "</Ip>\n" : "") +
					"</MSSSoapHeader>";
			StringSource headerSource = new StringSource(headerAsXml);
			
			Transformer transformer = TransformerFactory.newInstance().newTransformer();
			transformer.transform(headerSource, header.getResult());
		}
	}
}
