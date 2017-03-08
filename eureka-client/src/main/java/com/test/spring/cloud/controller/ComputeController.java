package com.test.spring.cloud.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by riven on 3/6/17.
 */
@RestController
public class ComputeController {

    private final static Logger logger = Logger.getLogger(ComputeController.class);
    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add(Integer a,Integer b){
        ServiceInstance si = discoveryClient.getLocalServiceInstance();
        Integer res = a+b;
        logger.info("host:"+si.getHost()+",port:"+si.getPort()+",res:"+si);
        return res;
    }
}
