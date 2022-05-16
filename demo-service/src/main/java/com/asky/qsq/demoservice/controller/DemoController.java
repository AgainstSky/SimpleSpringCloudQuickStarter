package com.asky.qsq.demoservice.controller;

import com.asky.qsq.common.component.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: AgainstSky
 * @create: 2022-05-15 15:42
 **/
@RestController
@RequestMapping("demo")
public class DemoController {

    @Autowired
    Test test;

    @GetMapping("/test")
    public String test(){
//        return simple+":"+erp;
        return test.getMessage();
    }
}
