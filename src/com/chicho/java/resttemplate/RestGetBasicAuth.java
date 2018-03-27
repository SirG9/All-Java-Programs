package com.chicho.java.resttemplate;
import java.nio.charset.Charset;

import org.apache.commons.codec.binary.Base64;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

public class RestGetBasicAuth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char pwd1 = '"';
		String pwd2 = "ewf";
		String pwd = "dnXhw98r$W3d23D?" + pwd1 + pwd2;

		String uri = "https://chevronproductsuklim-dev.outsystemsenterprise.com/LubeChartWS/rest/eWave/GetRecommendedProductDelta?From=2017-10-07";

		RestTemplate restTemplate = new RestTemplate();
		Object str = restTemplate.exchange(uri, HttpMethod.GET,
				new HttpEntity<String>(createHeaders("eWaveLCUser", pwd)), String.class);
		System.out.println(str);
	}

	static HttpHeaders createHeaders(String username, String password) {
		return new HttpHeaders() {
			{
				String auth = username + ":" + password;
				byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
				String authHeader = "Basic " + new String(encodedAuth);
				set("Authorization", authHeader);
			}
		};
	}
}
