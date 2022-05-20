package com.asky.sqs.userservice.service.impl;

import com.asky.qsq.common.em.ResponseCodeEnum;
import com.asky.qsq.common.ex.AppException;
import com.asky.sqs.userservice.dao.IRoleMapper;
import com.asky.sqs.userservice.em.RoleStatusEnum;
import com.asky.sqs.userservice.entity.RoleEntity;
import com.asky.sqs.userservice.obj.dto.AddRoleDTO;
import com.asky.sqs.userservice.obj.dto.UpdateRoleDTO;
import com.asky.sqs.userservice.obj.vo.RoleVO;
import com.asky.sqs.userservice.service.IRoleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @description:
 * @author: AgainstSky
 * @create: 2022-05-16 20:06
 **/
@Service
@Slf4j
public class RoleServiceImpl implements IRoleService {

    @Autowired
    IRoleMapper mapper;

    @Override
    public RoleVO addRole(AddRoleDTO dto) {
        RoleEntity entity = new RoleEntity();
        BeanUtils.copyProperties(dto, entity);
        entity.setStatus(RoleStatusEnum.NORMAL.getStatus());
        mapper.insert(entity);
        RoleVO vo = new RoleVO();
        BeanUtils.copyProperties(entity, vo);
        return vo;
    }

    @Override
    public RoleVO deleteRole(Long roleId) {
        RoleEntity entity = mapper.selectById(roleId);
        if (entity == null) {
            throw new AppException(ResponseCodeEnum.DATE_NOT_EXITS);
        }
        mapper.deleteById(roleId);
        RoleVO vo = new RoleVO();
        BeanUtils.copyProperties(entity, vo);
        return vo;
    }

    @Override
    public RoleVO updateRole(UpdateRoleDTO dto) {
        RoleEntity entity = mapper.selectById(dto.getId());
        if (entity == null) {
            throw new AppException(ResponseCodeEnum.DATE_NOT_EXITS);
        }

        RoleEntity update = new RoleEntity();
        BeanUtils.copyProperties(dto, update);
        mapper.updateById(update);

        RoleVO vo = new RoleVO();
        BeanUtils.copyProperties(update, vo);
        return vo;
    }

    @Override
    public RoleVO getRole(Long roleId) {
        RoleEntity entity = mapper.selectById(roleId);
        if (entity == null) {
            throw new AppException(ResponseCodeEnum.DATE_NOT_EXITS);
        }
        RoleVO vo = new RoleVO();
        BeanUtils.copyProperties(entity, vo);
        return vo;
    }


}
