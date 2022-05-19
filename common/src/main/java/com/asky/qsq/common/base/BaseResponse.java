package com.asky.qsq.common.base;

import com.asky.qsq.common.em.ResponseCodeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @description:
 * @author: AgainstSky
 * @create: 2022-05-16 20:07
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BaseResponse<T> {

    /**
     * 状态代码
     */
    private String statusCode;

    /**
     * 返回数据
     */
    private T data;

    /**
     * 信息
     */
    private String msg;


    private boolean showMsg;

    /**
     * 返回时间
     */
    private Date time;

    public BaseResponse(String statusCode, T data, String msg,boolean showMsg) {
        this.statusCode = statusCode;
        this.data = data;
        this.msg = msg;
        this.time = new Date();
        this.showMsg = showMsg;
    }

    public BaseResponse(ResponseCodeEnum codeEnum, T data, boolean showMsg) {
        this.statusCode = codeEnum.getCode();
        this.data = data;
        this.msg = codeEnum.getDesc();
        this.showMsg = showMsg;
        this.time = new Date();
    }

    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse<>(ResponseCodeEnum.SUCCESS, data, false);
    }

    public static BaseResponse error(ResponseCodeEnum codeEnum) {
        return new BaseResponse<>(codeEnum, null, true);
    }

//    public static BaseResponse error(MethodArgumentNotValidException exception) {
//        String message = null;
//        if (exception.getBindingResult().getFieldError() != null) {
//            message = exception.getBindingResult().getFieldError().getDefaultMessage();
//        }
//        return new BaseResponse(
//                ResponseCodeEnum.METHOD_ARGUMENT_NOT_VALID.getCode(),
//                null,
//                message == null ? ResponseCodeEnum.METHOD_ARGUMENT_NOT_VALID.getDesc() : message,
//                true
//        );
//    }
//
//
//    public static BaseResponse error(AppException exception) {
//        return error(exception.errorInfo);
//    }

    /**
     * 是否调用成功
     *
     * @return
     */
    public boolean isSuccess() {
        return ResponseCodeEnum.SUCCESS.getCode().equals(statusCode);
    }
}
