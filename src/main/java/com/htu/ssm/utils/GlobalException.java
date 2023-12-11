package com.htu.ssm.utils;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GlobalException extends RuntimeException{
    /*定义异常状态码*/
    private  Integer code;
    /*定义异常信息*/
    private String msg;

    /**
     * 构造方法将自定义的异常信息放进自定义异常对象中
     * @param error
     */
    public GlobalException(GlobalExceptionEnum error) {
        this.code = error.getCode();
        this.msg = error.getMsg();
    }
}
