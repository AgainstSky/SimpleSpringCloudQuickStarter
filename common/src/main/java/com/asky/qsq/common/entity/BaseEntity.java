package com.asky.qsq.common.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

/**
 * @description:
 * @author: AgainstSky
 * @create: 2022-05-16 19:46
 **/
@Data
public class BaseEntity {

    /**
     * 物理主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 创建时间
     */
    private Date ct;

    /**
     * 更新时间
     */
    private Date ut;

    /**
     * 是否删除 ture 逻辑删除
     */
    private Boolean deleted;
}
