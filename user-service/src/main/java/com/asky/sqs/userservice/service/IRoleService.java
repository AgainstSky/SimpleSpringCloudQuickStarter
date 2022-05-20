package com.asky.sqs.userservice.service;

import com.asky.sqs.userservice.entity.RoleEntity;
import com.asky.sqs.userservice.obj.dto.AddRoleDTO;
import com.asky.sqs.userservice.obj.dto.UpdateRoleDTO;
import com.asky.sqs.userservice.obj.vo.RoleVO;

/**
 * @description:
 * @author: AgainstSky
 * @create: 2022-05-16 20:06
 **/
public interface IRoleService {

    RoleVO addRole(AddRoleDTO dto);

    RoleVO deleteRole(Long roleId);

    RoleVO updateRole(UpdateRoleDTO dto);

    RoleVO getRole(Long roleId);
}
