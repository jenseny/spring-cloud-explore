package com.test.spring.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Hello world!
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ServiceAApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ServiceAApplication.class).web(true).run(args);
    }
}
