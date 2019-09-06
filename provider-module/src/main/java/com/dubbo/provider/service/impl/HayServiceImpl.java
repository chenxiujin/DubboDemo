package com.dubbo.provider.service.impl;

import org.apache.dubbo.config.annotation.Service;
import org.apache.dubbo.spring.boot.demo.consumer.HelloService;

/**
 * @author cxiujin
 * @date 2019/09/06 15:07
 */
@Service(group = "faceWayOne", version = "0.0.1")
public class HayServiceImpl implements HelloService {
    @Override
    public String hello(String name) {
        return "Hay:"+name;
    }
}
