package com.jry.ssm.resolver;

import com.jry.ssm.exception.TransferException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description: java类作用描述
 * @Author: jry
 * @CreateDate: 2019/1/12 19:35
 * @Version: 1.0
 */

public class MyResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("error");
        TransferException transferException;
        if (e instanceof TransferException) {
            transferException = (TransferException) e;
            mv.addObject("errorMsg", transferException.getMessage());
        }else if (e instanceof RuntimeException){
            mv.addObject("errorMsg", "服务器正忙,请稍后再试");
        }
        return mv;
    }
}
