package com.abhi.utils;

public enum EndpointUrl {
	
	Add_circuuit("year/circuits");

	String Resourcepath;
	
	EndpointUrl(String Resourcepath)
	{
		this.Resourcepath=Resourcepath;
	}
	
	public String getresourcepath()
	{
		return this.Resourcepath;
	}
	
	public String getresourcepath(String data)
	{
		return this.Resourcepath+data;
	}
	
	public static void main (String args[] )
	{
		System.out.println(EndpointUrl.Add_circuuit.getresourcepath());
		
		System.out.println("making full country");
		String url=Url.fixurl+EndpointUrl.Add_circuuit.getresourcepath();
		
		System.out.println(url);

	}
}
