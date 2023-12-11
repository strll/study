package com.htu.ssm.hander;

import com.htu.ssm.utils.GlobalException;
import com.htu.ssm.utils.R;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;
@RestControllerAdvice
public class GlobalResponseHandler implements ResponseBodyAdvice {
    /**
     * 执行beforeBodyWrite方法的前置方法。
     * @param returnType  方法返回值类型
     * @param converterType  数据转换的类型
     * @return  返回true 则继续执行beforeBodyWrite  否则不执行
     */
    @Override
    public boolean supports(MethodParameter returnType, Class converterType) {
        return true;
    }

    /**
     * 写入响应数据之前的操作
     * @param body   body为控制器中返回的数据
     * @param returnType
     * @param selectedContentType
     * @param selectedConverterType
     * @param request
     * @param response
     * @return
     */
    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
        //如果控制器返回json数据对象为异常类型
        if(body instanceof GlobalException){
            //统一结果返回的error
            return R.error((GlobalException) body);
        }
        //body不是异常对象，则走正常返回
        return R.ok(body);
    }
}
