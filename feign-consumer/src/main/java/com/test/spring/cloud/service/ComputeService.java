package com.test.spring.cloud.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by riven on 3/6/17.
 */
@FeignClient(value = "comput-server",fallback = FallBackService.class)
public interface ComputeService {

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    Integer add(@RequestParam("a") Integer a,@RequestParam("b") Integer b);
}
