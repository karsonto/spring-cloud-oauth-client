package com.karson.webmagic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.client.DefaultOAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.token.grant.password.ResourceOwnerPasswordResourceDetails;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication()
 
 
public class WebmagicApplication  {
	 
	public static void main(String[] args) {
		SpringApplication.run(WebmagicApplication.class, args);
	}
	@Bean 
	public RestTemplate getOauth2RestTemplate() {
		   ResourceOwnerPasswordResourceDetails resourceDetails = new ResourceOwnerPasswordResourceDetails();
	        resourceDetails.setUsername("karson");
	        resourceDetails.setPassword("karson");
	        resourceDetails.setAccessTokenUri("http://localhost:9001/oauth/token");
	        resourceDetails.setClientId("client_1");
	        resourceDetails.setClientSecret("123456");
	        resourceDetails.setGrantType("password");
	        List<String> list = new ArrayList<String>();
	        list.add("select");
	        resourceDetails.setScope(list);

	        DefaultOAuth2ClientContext clientContext = new DefaultOAuth2ClientContext();

	        OAuth2RestTemplate restTemplate = new OAuth2RestTemplate(resourceDetails, clientContext);
		return restTemplate;
		
	}

	 
}
