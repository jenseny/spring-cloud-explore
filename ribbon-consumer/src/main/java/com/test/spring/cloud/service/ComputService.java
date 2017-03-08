package com.test.spring.cloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by riven on 3/6/17.
 */
@Service
public class ComputService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "addServiceFailBack")
    public String addService(){
        return restTemplate.getForEntity("http://COMPUT-SERVER/add?a=10&b=20",String.class).getBody();
    }

    public String addServiceFailBack(){
        return "error";
    }
}
