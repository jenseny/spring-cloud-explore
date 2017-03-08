package com.test.spring.cloud.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by riven on 3/8/17.
 */
@RestController
public class ComputeController {

    private static final Logger logger = Logger.getLogger(ComputeController.class);

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/compute")
    public String compute(){
        ServiceInstance si = discoveryClient.getLocalServiceInstance();
        logger.info("host:"+si.getHost()+",port:"+si.getPort()+",result:"+si);
        return "serviceB";
    }
}
