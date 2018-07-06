package com.abh.scripts;

import com.abhi.utils.EndpointUrl;
import com.abhi.utils.Url;
import com.abhi.webservice.methods.WebService;


public class Call_getwebservice {

	public static void main (String args[] )
	
	{
		String url=Url.fixurl+EndpointUrl.Add_circuuit.getresourcepath();
		System.out.println(url);
		
		WebService.Get(url);
	}
}
