package com.test.spring.cloud.service;

import org.springframework.stereotype.Component;

/**
 * Created by riven on 3/8/17.
 */
@Component
public class FallBackService implements ComputeService {
    @Override
    public Integer add(Integer a, Integer b) {
        return -9999;
    }
}
