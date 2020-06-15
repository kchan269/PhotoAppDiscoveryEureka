package com.appsdeveloperblog.photapp.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PhotoAppDiscoveryEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhotoAppDiscoveryEurekaApplication.class, args);
	}

}
