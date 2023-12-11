package com.htu.ssm.utils;

public class GlobalExceptionEnum {

//    USER_NAME_NOTFOUND(50001,"用户名不存在"),
//    USER_PASSWORD_ERROR(50002,"用户密码错误"),
//    USER_PERMISSION_DENIED(50003,"用户权限不够");


    /*异常状态码*/
    private  Integer code;
    /*异常描述信息*/
    private String msg ;

    /**
     * 枚举类型的构造方法
     * @param code
     * @param msg
     */
    GlobalExceptionEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
