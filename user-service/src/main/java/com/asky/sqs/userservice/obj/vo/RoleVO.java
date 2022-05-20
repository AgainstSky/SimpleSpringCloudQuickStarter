package com.asky.sqs.userservice.obj.vo;

import lombok.Data;

/**
 * @description:
 * @author: AgainstSky
 * @create: 2022-05-19 16:15
 **/
@Data
public class RoleVO {

    private Long id;
    /**
     * 角色名称
     */
    private String name;

    /**
     * 角色简介
     */
    private String info;

    /**
     * 角色状态 0 NORMAL
     */
    private Integer status;
}
