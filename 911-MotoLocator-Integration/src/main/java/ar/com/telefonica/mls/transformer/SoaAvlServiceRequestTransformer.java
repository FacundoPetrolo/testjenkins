package ar.com.telefonica.mls.transformer;

import java.util.Date;

import org.springframework.stereotype.Component;

import ar.com.telefonica.autogen.ws.mls.consumer.DeviceRecord;
import ar.com.telefonica.mls.model.SoaAvlServiceRequest;

@Component
public class SoaAvlServiceRequestTransformer
{
	public SoaAvlServiceRequest transform(DeviceRecord dr)
	{
		SoaAvlServiceRequest res = new SoaAvlServiceRequest();
		
		// TODO mross: verificar
		res.setDeviceCode(dr.getDeviceName());
		// TODO mross: verificar. Se usa para verificar si el dispositivo es un botón de pánico.
		res.setIdEvento(null);
		// TODO mross: verificar el formato y que relamente sea el updateTime.
		res.setTimestamp(new Date()/*dr.getUpdateTime()*/);
		// TODO mross: verificar el sistema de coordenadas
		res.setLatitud(String.valueOf(dr.getLatitude()));
		// TODO mross: verificar el sistema de coordenadas
		res.setLongitud(String.valueOf(dr.getLongitude()));
		// TODO mross: verificar la unidad de medida
		res.setVelocidad((int)Math.round(dr.getSpeed()));
		// TODO mross: verificar la unidad de medida
		res.setSentido((short)Math.round(dr.getBearing()));
		// TODO mross: verificar
		res.setAntena(null);
		// TODO mross: verificar. De todas maneras este dato simplemente se loguea. No se usa.
		res.setEdad(dr.getAgeBit());
		// TODO mross: verificar
		res.setSignalLevel(null);
		// TODO mross: verificar. De todas maneras este dato simplemente se loguea. No se usa.
		res.setAuxIn(null);
		
		return res;
	}
}
