package com.paktak.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by LC on 2018/9/5.
 */
@RestController
@RequestMapping("/hello")
public class TestController {

    @RequestMapping("/getHello")
    public String getHello(){
        return "hello";
    }

}
