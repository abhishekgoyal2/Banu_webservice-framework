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
}
