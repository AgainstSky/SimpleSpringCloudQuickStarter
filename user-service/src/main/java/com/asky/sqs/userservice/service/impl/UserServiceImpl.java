package com.asky.sqs.userservice.service.impl;

import com.asky.sqs.userservice.dao.IUserMapper;
import com.asky.sqs.userservice.service.IUserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: AgainstSky
 * @create: 2022-05-16 19:53
 **/
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    IUserMapper userMapper;

    @Override
    public Integer countUser() {
        return userMapper.selectCount(new QueryWrapper<>());
    }
}
