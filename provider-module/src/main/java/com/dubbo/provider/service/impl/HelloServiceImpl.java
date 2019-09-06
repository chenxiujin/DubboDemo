package com.dubbo.provider.service.impl;


import org.apache.dubbo.config.annotation.Service;
import org.apache.dubbo.spring.boot.demo.consumer.DemoService;
import org.apache.dubbo.spring.boot.demo.consumer.HelloService;

/**
 * @author cxiujin
 * @date 2019/09/05 15:09
 */
@Service(group = "faceWayTwo", version = "0.0.1")
public class HelloServiceImpl implements HelloService{

    @Override
    public String hello(String name) {
        return "Hello:"+name;
    }
}
