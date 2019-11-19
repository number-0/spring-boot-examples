package com.shl.spring.boot.test.autoconfigure;

import com.shl.spring.boot.autoconfigure.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author songhengliang
 * @date 2019/11/19
 */
@RestController
public class HelloStarterController {

    @Autowired
    HelloService helloService;

    @GetMapping("/hello")
    public String hello(){
        return helloService.helloStarter();
    }



}
