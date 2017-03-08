package com.test.spring.cloud;

import com.test.spring.cloud.service.ComputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by riven on 3/6/17.
 */
@RestController
public class CustomerController {

    @Autowired
    private ComputService computService;

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public String add(){
        return computService.addService();
    }
}
