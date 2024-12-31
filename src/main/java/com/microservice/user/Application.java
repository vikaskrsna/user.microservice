package com.microservice.user;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.microservice.user.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws JsonProcessingException {
		SpringApplication.run(Application.class, args);
		User user = new User();
		user.setEmail("vikas.mishra@espire.com");
		user.setFirstName("Vikas");
		user.setLastName("Mishra");
		ObjectMapper objectMapper = new ObjectMapper();
		System.out.println(objectMapper.writeValueAsString(user));
	}

	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

}
