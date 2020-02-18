package com.baizhi.exceptionResolver;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyExceptionResolver implements HandlerExceptionResolver {
    @Override
    //参数1：请求对象
    //参数2：响应对象
    //参数3：出现异常方法对象
    //参数4: 出现异常的异常对象
    //返回值：Model(模型|数据) AndView(视图)
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        return null;
    }
}
