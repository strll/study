package com.htu.ssm.hander;

import com.htu.ssm.utils.GlobalException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    /**
     * 全局异常处理拦截
     * 异常发生之后执行当前方法，因为所有的异常都是Exception的子类
     * @param e
     * @return
     */
    @ResponseBody
    @ExceptionHandler(Exception.class)
    public Exception exceptionHandler( Exception e ){
        //报错的信息输出到控制台
        e.printStackTrace();
        // 判断异常类型是不是已知异常
        if(e instanceof GlobalException){
            return e;
        }else{
            // 未知异常则构造已知异常，将异常状态信息默认设置为 5000   提示文本信息 直接通过异常对象获取
            return new GlobalException(5000,e.getMessage());
        }
    }
}
