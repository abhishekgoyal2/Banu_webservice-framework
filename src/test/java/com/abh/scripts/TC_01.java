package com.abh.scripts;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.abhi.utils.EndpointUrl;
import com.abhi.utils.Url;
import com.abhi.webservice.methods.WebService;

import io.restassured.response.Response;


public class TC_01 {
Response response;

@BeforeClass

public void setup()
{
	
}

@Test 
public void verifygetyearcircuits()

{
	String url =Url.fixurl+EndpointUrl.Add_circuuit.getresourcepath();
	System.out.println(url);
	response =WebService.Get(url);
	System.out.println(response.getBody().asString());
}

}
