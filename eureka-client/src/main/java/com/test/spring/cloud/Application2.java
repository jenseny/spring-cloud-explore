package com.test.spring.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by riven on 3/6/17.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Application2 {

    public static void main(String[] args) {
        new SpringApplicationBuilder(Application2.class).web(true).run(args);
    }
}
