package com.asky.sqs.userservice.obj.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description:
 * @author: AgainstSky
 * @create: 2022-05-19 15:57
 **/
@ApiModel("添加角色")
@Data
public class AddRoleDTO {

    /**
     * 角色名称
     */
    @ApiModelProperty(value = "角色名称")
    private String name;

    /**
     * 角色简介
     */
    @ApiModelProperty(value = "角色简介")
    private String info;

}
