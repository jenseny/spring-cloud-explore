package com.test.spring.cloud.controller;

import com.test.spring.cloud.service.ComputeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by riven on 3/6/17.
 */
@RestController
public class ComputeController {

    @Autowired
    private ComputeService computeService;

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public Integer add(){
        return computeService.add(1,2);
    }
}
