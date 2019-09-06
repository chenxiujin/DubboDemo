package com.dubbo.provider.service.impl;

import org.apache.dubbo.config.annotation.Service;
import org.apache.dubbo.spring.boot.demo.consumer.DemoService;

/**
 * @author cxiujin
 * @date 2019/09/06 15:00
 */
@Service(version = "0.0.1")
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "Demo:"+name;
    }
}
