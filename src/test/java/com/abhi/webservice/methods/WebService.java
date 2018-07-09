package com.abhi.webservice.methods;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class WebService {

	
	public static void  Post(String Uri,String Json)
	{
		RequestSpecification requestspec=RestAssured.given().body(Json) ;
		
		requestspec.contentType(ContentType.JSON);
		Response responjson=requestspec.post(Uri);
	}
	
	public static Response  Get(String Uri)
	{
		RequestSpecification requestspec=RestAssured.given() ;
		
		requestspec.contentType(ContentType.JSON);
		Response responjson=requestspec.get(Uri);
		System.out.println(responjson);
		return responjson;
	}
	
	public static void  Put(String Uri,String Json)
	{
		RequestSpecification requestspec=RestAssured.given().body(Json) ;
		
		requestspec.contentType(ContentType.JSON);
		Response responjson=requestspec.put(Uri);
	}
	
	public static void  delete(String Uri)
	{
		RequestSpecification requestspec=RestAssured.given() ;
		
		requestspec.contentType(ContentType.JSON);
		Response responjson=requestspec.delete(Uri);
	}
	
	
}
