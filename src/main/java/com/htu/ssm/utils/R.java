package com.htu.ssm.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class R<T> {
    /*响应码，和http的响应码没有任何关系*/
    private Integer code;
    /*响应描述*/
    private String msg;
    /*响应数据*/
    private T data;

    /**
     * ok方法，正常返回结果的方法
     */
    public static <T> R ok(T data) {
        return new R(200, "success", data);
    }

    /**
     * error方法，返回异常结果的方法
     */
    public static <T> R error(int code, String msg) {
        return new R(code, msg, null);
    }

    public static <T> R error(GlobalException e) {
        return new R(e.getCode(),e.getMsg(), null);
    }
}
