package com.asky.sqs.userservice.entity;

import com.asky.qsq.common.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @description:
 * @author: AgainstSky
 * @create: 2022-05-16 20:04
 **/
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("t_role")
public class RoleEntity extends BaseEntity {

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
