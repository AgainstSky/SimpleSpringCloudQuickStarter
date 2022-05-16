package com.asky.sqs.userservice.em;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @description:
 * @author: AgainstSky
 * @create: 2022-05-16 19:50
 **/
@AllArgsConstructor
@Getter
public enum UserStatusEnum {

    NORMAL(0,"正常");


    private Integer status;

    private String desc;

}
