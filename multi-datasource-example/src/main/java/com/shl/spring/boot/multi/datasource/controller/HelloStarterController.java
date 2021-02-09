package com.shl.spring.boot.multi.datasource.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author songhengliang
 * @date 2019/11/19
 */
@RestController
public class HelloStarterController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }



}
