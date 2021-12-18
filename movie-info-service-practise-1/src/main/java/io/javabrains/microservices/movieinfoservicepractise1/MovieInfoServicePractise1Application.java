package io.javabrains.microservices.movieinfoservicepractise1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class MovieInfoServicePractise1Application {

	public static void main(String[] args) {
		SpringApplication.run(MovieInfoServicePractise1Application.class, args);
	}
	

	@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}

}
