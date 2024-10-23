package com.jk.universalreview.demoConnector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DemoConnectorApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoConnectorApplication.class, args);
	}

}
