package com.adi.test3;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class HttpReq {

	public static void main(String[] args) throws JSONException, ClientProtocolException, IOException {
		String url = "http://10.245.36.30:8080/vms/registerParamType";

		String profileName = "aditya";
		String paramType = "credit";

		JSONObject RegisterParamType = new JSONObject();

		RegisterParamType.put("profileName", profileName);
		RegisterParamType.put("paramType", paramType);

		JSONArray sum = new JSONArray();

		JSONObject keyUnit = new JSONObject();
		keyUnit.put("key", 24);
		keyUnit.put("unit", "HOUR");
		sum.put(keyUnit);

		keyUnit = new JSONObject();
		keyUnit.put("key", 7);
		keyUnit.put("unit", "DAY");
		sum.put(keyUnit);

		JSONArray count = new JSONArray();

		keyUnit = new JSONObject();
		keyUnit.put("key", 24);
		keyUnit.put("unit", "HOUR");
		count.put(keyUnit);

		keyUnit = new JSONObject();
		keyUnit.put("key", 7);
		keyUnit.put("unit", "DAY");
		count.put(keyUnit);

		keyUnit = new JSONObject();
		keyUnit.put("key", 30);
		keyUnit.put("unit", "DAY");
		count.put(keyUnit);

		JSONObject windowConfigurationByAggregateRequest = new JSONObject();
		windowConfigurationByAggregateRequest.put("SUM", sum);
		windowConfigurationByAggregateRequest.put("COUNT", count);

		String[] mandatorykeys = new String[] { "key1", "key2" };

		RegisterParamType.put("windowConfigurationByAggregateRequest", windowConfigurationByAggregateRequest);
		RegisterParamType.put("tagsMandatoryKeys", mandatorykeys);
		System.out.println(RegisterParamType.toString());

		String jsonData = RegisterParamType.toString();

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
