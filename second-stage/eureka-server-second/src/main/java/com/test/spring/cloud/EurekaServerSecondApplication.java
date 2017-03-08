package com.test.spring.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerSecondApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaServerSecondApplication.class).web(true).run(args);
    }
}
