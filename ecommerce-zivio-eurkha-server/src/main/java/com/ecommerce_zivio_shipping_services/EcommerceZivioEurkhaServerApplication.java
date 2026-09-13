package com.ecommerce_zivio_shipping_services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EcommerceZivioEurkhaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceZivioEurkhaServerApplication.class, args);
	}

}
