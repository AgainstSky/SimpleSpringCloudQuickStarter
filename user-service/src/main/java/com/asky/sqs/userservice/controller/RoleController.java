package com.asky.sqs.userservice.controller;

import com.asky.qsq.common.base.BaseResponse;
import com.asky.sqs.userservice.obj.dto.AddRoleDTO;
import com.asky.sqs.userservice.obj.dto.UpdateRoleDTO;
import com.asky.sqs.userservice.obj.vo.RoleVO;
import com.asky.sqs.userservice.service.IRoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @description:
 * @author: AgainstSky
 * @create: 2022-05-19 16:29
 **/
@Api("角色管理")
@RestController
@RequestMapping("role")
public class RoleController {

    @Autowired
    IRoleService roleService;

    @ApiOperation("获取角色信息")
    @GetMapping("/{id}")
    public BaseResponse<RoleVO> getRole(@PathVariable("id") Long id){
        return BaseResponse.success(roleService.getRole(id));
    }

    @ApiOperation("删除角色")
    @DeleteMapping("/{id}")
    public BaseResponse<RoleVO> deleteRole(@PathVariable("id") Long id){
        return BaseResponse.success(roleService.deleteRole(id));
    }

    @ApiOperation("添加角色")
    @PostMapping("/add")
    public BaseResponse<RoleVO> addRole(@RequestBody AddRoleDTO dto){
        return BaseResponse.success(roleService.addRole(dto));
    }

    @ApiOperation("修改角色信息")
    @PostMapping("/update")
    public BaseResponse<RoleVO> updateRole(@RequestBody UpdateRoleDTO dto){
        return BaseResponse.success(roleService.updateRole(dto));
    }


}
