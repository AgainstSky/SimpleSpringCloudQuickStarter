package com.asky.sqs.userservice.entity;

import com.asky.qsq.common.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @description:
 * @author: AgainstSky
 * @create: 2022-05-16 19:46
 **/
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("t_user")
public class UserEntity extends BaseEntity {

    /**
     * 用户id
     */
    private String bid;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 密码
     */
    private String password;

    /**
     * 用用户昵称
     */
    private String nickName;

    /**
     * {@link com.asky.sqs.userservice.em.UserStatusEnum}
     * 用户状态 , 0 NORMAL
     */
    private Integer status;
}
