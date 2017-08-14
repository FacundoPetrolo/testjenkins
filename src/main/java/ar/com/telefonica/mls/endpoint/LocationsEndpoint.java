package ar.com.telefonica.mls.endpoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.WebServiceException;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import ar.com.telefonica.autogen.ws.mls.consumer.DeviceRecord;
import ar.com.telefonica.autogen.ws.mls.consumer.MlsNewData;
import ar.com.telefonica.autogen.ws.mls.consumer.MlsNewDataDeviceNames;
import ar.com.telefonica.autogen.ws.mls.consumer.MlsNewDataDeviceNamesResponse;
import ar.com.telefonica.autogen.ws.mls.consumer.MlsNewDataDeviceRecords;
import ar.com.telefonica.autogen.ws.mls.consumer.MlsNewDataDeviceRecordsResponse;
import ar.com.telefonica.autogen.ws.mls.consumer.MlsNewDataResponse;
import ar.com.telefonica.autogen.ws.mls.consumer.OamConfirmReconnect;
import ar.com.telefonica.autogen.ws.mls.consumer.OamConfirmReconnectResponse;
import ar.com.telefonica.autogen.ws.mls.consumer.OamReportError;
import ar.com.telefonica.autogen.ws.mls.consumer.OamReportErrorResponse;
import ar.com.telefonica.autogen.ws.mls.consumer.ObjectFactory;
import ar.com.telefonica.mls.client.SoaClient;
import ar.com.telefonica.mls.model.SoaAvlServiceRequest;
import ar.com.telefonica.mls.transformer.SoaAvlServiceRequestTransformer;

@Endpoint
public class LocationsEndpoint
{
	private static final Logger log = LoggerFactory.getLogger(LocationsEndpoint.class);

	private static final String NAMESPACE_URI = "http://schemas.motorola.com/LocationServer/MapServer";
	
	private ObjectFactory objectFactory = new ObjectFactory();
	
	@Autowired
	private SoaClient soaClient;
	@Autowired
	private SoaAvlServiceRequestTransformer soaTransformer;
	

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "mls_NewDataDeviceRecords")
	@ResponsePayload
	public MlsNewDataDeviceRecordsResponse mlsNewDataDeviceRecords(@RequestPayload MlsNewDataDeviceRecords request) {
		log.info("Se recibieron " + request.getParam1().getDeviceRecord().size() + " nuevas posiciones desde MotoLocator.");
		
		MlsNewDataDeviceRecordsResponse response = objectFactory.createMlsNewDataDeviceRecordsResponse();
		response.setMlsNewDataDeviceRecordsResult(true);

		for (DeviceRecord dr : request.getParam1().getDeviceRecord())
		{
			SoaAvlServiceRequest soaAvlServiceRequest = soaTransformer.transform(dr);
			try
			{
				soaClient.avlservice(soaAvlServiceRequest);
			}
			catch (WebServiceException e)
			{
				log.error("Error de comunicación al enviar nuevas posiciones a SOA mediante avlservice.", e);
			}
			catch (RuntimeException e)
			{
				log.error("Error inesperado al enviar nuevas posiciones a SOA mediante avlservice.", e);
			}
		}
		return response;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "mls_NewDataDeviceNames")
	@ResponsePayload
	public MlsNewDataDeviceNamesResponse mlsNewDataDeviceNames(@RequestPayload MlsNewDataDeviceNames request) {
		log.warn("Se recibió un llamado a mls_NewDataDeviceNames desde MotoLocator, pero se esperaba que se use el servicio alternativo mls_NewDataDeviceRecords. Es probable que al hacer el locfeed_RegisterConsumer se haya pasado el consumerType equivocado (debería pasarse '3').");
		
		MlsNewDataDeviceNamesResponse response = objectFactory.createMlsNewDataDeviceNamesResponse();
		response.setMlsNewDataDeviceNamesResult(false);
		
		return response;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "mls_NewData")
	@ResponsePayload
	public MlsNewDataResponse mlsNewDataDeviceNames(@RequestPayload MlsNewData request) {
		log.warn("Se recibió un llamado a mls_NewData desde MotoLocator, pero se esperaba que se use el servicio alternativo mls_NewDataDeviceRecords. Es probable que al hacer el locfeed_RegisterConsumer se haya pasado el consumerType equivocado (debería pasarse '3').");
		
		MlsNewDataResponse response = objectFactory.createMlsNewDataResponse();
		response.setMlsNewDataResult(false);
		
		return response;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "oam_ReportError")
	@ResponsePayload
	public OamReportErrorResponse oamReportError(@RequestPayload OamReportError request) {
		log.error("Se recibió un reporte de error desde MotoLocator: " + request.getErrMsg());
		
		OamReportErrorResponse response = objectFactory.createOamReportErrorResponse();
		response.setOamReportErrorResult(true);
		
		return response;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "oam_ConfirmReconnect")
	@ResponsePayload
	public OamConfirmReconnectResponse oamConfirmReconnect(@RequestPayload OamConfirmReconnect request) {
		log.error("Se recibió un pedido de confirmación de reconexión desde MotoLocator. Se intentará reconectar.");
		
		OamConfirmReconnectResponse response = objectFactory.createOamConfirmReconnectResponse();
		response.setOamConfirmReconnectResult(true);
		
		return response;
	}
}
