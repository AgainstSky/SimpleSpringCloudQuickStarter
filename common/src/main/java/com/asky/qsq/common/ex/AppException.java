package com.asky.qsq.common.ex;

import com.asky.qsq.common.em.ResponseCodeEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @description: 系统通用异常
 * @author: AgainstSky
 * @create: 2022-02-22 14:09
 **/
@EqualsAndHashCode(callSuper = true)
@Data
public class AppException extends RuntimeException{

    public ResponseCodeEnum errorInfo;

    public String notice;

    public AppException(ResponseCodeEnum errorInfo, String msg) {
        super(errorInfo.getDesc());
        this.errorInfo = errorInfo;
        this.notice = msg;
    }

    public AppException(ResponseCodeEnum errorInfo) {
        this(errorInfo,null);
    }
}
