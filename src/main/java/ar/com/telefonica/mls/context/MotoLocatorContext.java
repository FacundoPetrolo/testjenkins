package ar.com.telefonica.mls.context;

import org.springframework.stereotype.Component;

@Component
public class MotoLocatorContext
{
	private String token;
	private String ip;
	
	
	public String getToken()
	{
		return token;
	}
	
	public void setToken(String token)
	{
		this.token = token;
	}
	
	public String getIp()
	{
		return ip;
	}
	
	public void setIp(String ip)
	{
		this.ip = ip;
	}
}
