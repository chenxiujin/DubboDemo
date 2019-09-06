package com.dubbo.consumer.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.spring.boot.demo.consumer.DemoService;
import org.apache.dubbo.spring.boot.demo.consumer.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cxiujin
 * @date 2019/09/05 16:31
 */
@RestController
public class DubboController {

    @Reference(version = "0.0.1")
    private DemoService demoService;

    @Reference(group = "faceWayOne", version = "0.0.1")
    private HelloService hayService;

    @Reference(group = "faceWayTwo", version = "0.0.1")
    private HelloService helloService;

    @GetMapping("/hello")
    public String helloDubbo(){
        return helloService.hello("hello");
    }

    @GetMapping("/hay")
    public String hayDubbo(){
        return hayService.hello("hay");
    }

    @GetMapping(value = "/demo")
    public String demoDubbo(){
        return demoService.sayHello("example");
    }
}
