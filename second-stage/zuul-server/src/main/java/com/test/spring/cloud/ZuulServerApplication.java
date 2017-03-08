package com.test.spring.cloud;

import com.test.spring.cloud.filter.AccessFilter;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * Hello world!
 */
@SpringCloudApplication
@EnableZuulProxy
public class ZuulServerApplication {

    @Bean
    public AccessFilter accessFilter(){
        return new AccessFilter();
    }
    public static void main(String[] args) {
        new SpringApplicationBuilder(ZuulServerApplication.class).web(true).run(args);
    }
}
