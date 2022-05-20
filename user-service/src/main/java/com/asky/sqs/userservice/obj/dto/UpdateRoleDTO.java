package com.asky.sqs.userservice.obj.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description:
 * @author: AgainstSky
 * @create: 2022-05-19 16:26
 **/
@ApiModel("编辑角色")
@Data
public class UpdateRoleDTO {

    @ApiModelProperty(value = "角色id",required = true)
    private Long id;

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

    /**
     * 角色状态 0 NORMAL
     */
    @ApiModelProperty(value = "角色状态 0 NORMAL")
    private Integer status;

}
