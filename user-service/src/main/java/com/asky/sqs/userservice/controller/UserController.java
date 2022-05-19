package com.asky.sqs.userservice.controller;

import com.asky.sqs.userservice.service.IUserService;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

/**
 * @description:
 * @author: AgainstSky
 * @create: 2022-05-16 19:54
 **/
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    DataSource dataSource;

    @Autowired
    IUserService userService;

    @GetMapping("count")
    public Integer countUser() {
        System.out.println(dataSource.getClass());
        return userService.countUser();
    }

}
