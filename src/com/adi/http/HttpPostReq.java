package com.adi.http;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class HttpPostReq {

	public static void main(String args[]) throws ClientProtocolException, IOException {
	
		String url = "";

		JSONObject jsonObj = new JSONObject();
		String jsonData = jsonObj.toString();

		HttpClient httpclient = HttpClients.createDefault();
		HttpPost post = new HttpPost(url);

		post.setHeader("Content-Type", "application/json");

		StringEntity params = new StringEntity(jsonData);

		post.setEntity(params);
		HttpResponse response = httpclient.execute(post);

		System.out.println(response.getStatusLine().getStatusCode());

		String json = EntityUtils.toString(response.getEntity());
		System.out.println(json);
			 

	}

}
