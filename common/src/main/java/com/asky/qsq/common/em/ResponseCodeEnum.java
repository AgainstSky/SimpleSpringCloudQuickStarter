package com.asky.qsq.common.em;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @description: 系统返回状态码
 * @author: AgainstSky
 * @create: 2021-08-23 16:49
 **/
@Getter
@AllArgsConstructor
public enum ResponseCodeEnum {
    SUCCESS("200","请求成功"),
    FORBIDDEN("403","无访问权限"),
    UN_AUTHORIZED("403","未登入"),

    //1000-1999 用户相关业务
    USER_OR_PASSWORD_ERROR("1000","手机号或密码错误"),
    PHONE_ALREADY_USED("1001","手机号码已被使用"),
    MEMBER_LEVEL_EXITS("1002","会员等级已存在"),
    ROLE_EXITS("1003","角色已存在"),
    USER_NOT_FOUND("1004","用户不存在"),
    ROLE_NOT_FOUND("1005","角色不存在"),

    //2000-2999 作品相关业务
    CATEGORY_EXITS("2000","分类已经存在"),
    CATEGORY_NOT_FOUND("2001","分类不存在"),
    PUBLISH_TIME_NOT_FOUND("2002","发布时间不存在"),

    //9000-9999 通用
    PARAM_ERROR("9000","参数错误或者不存在"),
    METHOD_ARGUMENT_NOT_VALID("9001","参数校验错误"),
    MODIFY_COUNT_ERROR("9002","修改数据条数失败"),
    ID_GENERATOR_ERROR("9003","idservice生成id失败"),
    SYSTEM_EXCEPTION("9998","系统异常，请稍后重试"),
    SYSTEM_ERROR("9999","系统错误");

    private String code;

    private String desc;
}
