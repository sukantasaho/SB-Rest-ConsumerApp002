package com.main;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SbRestConsumerApp002Application 
{

	public static void main(String[] args) 
	{
		SpringApplication.run(SbRestConsumerApp002Application.class, args);
		
		//create rest template object
		RestTemplate temp =  new RestTemplate();
		//define rest api url
		String url = "http://localhost:8080/api/getWish/{name}/{id}";
		//Generate Http request with GET mode to consume the webservice api
		//ResponseEntity<String> response =  temp.getForEntity(url, String.class,"Manoj",1022);
		ResponseEntity<String> response =  temp.getForEntity(url, String.class,Map.of("id",30003,"name","Rajveer"));
		System.out.println("Response Body : "+response.getBody());
		System.out.println("Status code value : "+response.getStatusCodeValue());
		System.out.println("Status Code : "+response.getStatusCode());
		
		System.exit(0);
	}

}
