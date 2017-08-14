package ar.com.telefonica.mls.model;

import java.util.Date;

public class SoaAvlServiceRequest
{
	private String deviceCode;
	private Integer idEvento;
	private Date timestamp;
	private String latitud;
	private String longitud; 
	private Integer velocidad;
	private Short sentido;
	private Short antena;
	private Short edad;
	private String signalLevel;
	private Short auxIn;
	
	
	public String getDeviceCode()
	{
		return deviceCode;
	}
	
	public void setDeviceCode(String deviceCode)
	{
		this.deviceCode = deviceCode;
	}

	public Integer getIdEvento()
	{
		return idEvento;
	}

	public void setIdEvento(Integer idEvento)
	{
		this.idEvento = idEvento;
	}

	public Date getTimestamp()
	{
		return timestamp;
	}

	public void setTimestamp(Date timestamp)
	{
		this.timestamp = timestamp;
	}

	public String getLatitud()
	{
		return latitud;
	}

	public void setLatitud(String latitud)
	{
		this.latitud = latitud;
	}

	public String getLongitud()
	{
		return longitud;
	}

	public void setLongitud(String longitud)
	{
		this.longitud = longitud;
	}

	public Integer getVelocidad()
	{
		return velocidad;
	}

	public void setVelocidad(Integer velocidad)
	{
		this.velocidad = velocidad;
	}

	public Short getSentido()
	{
		return sentido;
	}

	public void setSentido(Short sentido)
	{
		this.sentido = sentido;
	}

	public Short getAntena()
	{
		return antena;
	}

	public void setAntena(Short antena)
	{
		this.antena = antena;
	}

	public Short getEdad()
	{
		return edad;
	}

	public void setEdad(Short edad)
	{
		this.edad = edad;
	}

	public String getSignalLevel()
	{
		return signalLevel;
	}

	public void setSignalLevel(String signalLevel)
	{
		this.signalLevel = signalLevel;
	}

	public Short getAuxIn()
	{
		return auxIn;
	}

	public void setAuxIn(Short auxIn)
	{
		this.auxIn = auxIn;
	}
}
