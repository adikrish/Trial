package com.adi.http;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;

public class Check {

	
	private HttpClient httpClient;
	
	public static void main(String[] args) throws ClientProtocolException, IOException {
		
		Check obj = new Check();
		HttpResponse httpResponse = obj.getRequest("http://www.google.com/url?q=http%3A%2F%2Fdev9.dev.freecharge.in%3A9081%2Frcd%2Freferral%2Fgetreferralhistorybyuserid%3FuserId%3D130010689&sa=D&sntz=1&usg=AFQjCNEq6pdMBsXEa2DO61O0t61q5x3c1A");
		
		 //String response = httpResponse
		 
		System.out.println("Response code : "+ httpResponse.getStatusLine().getStatusCode());

	}

	
	public HttpResponse getRequest(String restURL) throws ClientProtocolException, IOException {
		
		httpClient = HttpClients.createDefault();
		HttpGet request = new HttpGet(restURL);
		request.setHeader("User-Agent", "Mozilla/5.0");
		request.setHeader("Accept",
			"text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
		request.setHeader("Accept-Language", "en-US,en;q=0.5");
		HttpResponse httpResponse = httpClient.execute(request);
		return httpResponse;
	
		
	}
	
}
