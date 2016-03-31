package com.adi.http;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class HttpGetReq {

	public static void main(String[] args) throws ParseException, IOException {
	

		 HttpClient httpclient = HttpClients.createDefault();
		 HttpGet get = new HttpGet("http://dev9.dev.freecharge.in:9081/rcd/referral/getreferralhistorybyuserid?userId=130010689");
		 HttpResponse getResponse = httpclient.execute(get);
		 
		 System.out.println(getResponse.getStatusLine().getStatusCode());
		 System.out.println(EntityUtils.toString(getResponse.getEntity()));

	
	}

}
