package com.asky.sqs.userservice.controller;

import com.asky.sqs.userservice.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: AgainstSky
 * @create: 2022-05-16 19:54
 **/
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    IUserService userService;

    @GetMapping("count")
    public Integer countUser(){
        return userService.countUser();
    }

}
