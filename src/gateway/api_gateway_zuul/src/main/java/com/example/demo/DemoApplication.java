package com.example.demo;

import com.example.demo.filter.AccessFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class DemoApplication {

	@Bean
	public AccessFilter accessFilter() {
		return new AccessFilter();
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
