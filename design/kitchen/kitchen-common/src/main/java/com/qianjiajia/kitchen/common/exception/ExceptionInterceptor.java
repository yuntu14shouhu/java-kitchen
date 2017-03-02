package com.qianjiajia.kitchen.common.exception;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.support.spring.FastJsonJsonView;
import com.qianjiajia.kitchen.common.result.MessageResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author qianjiajia
 * @version 1.0
 * @Date 2017-02-27 15:54
 * @Description 通用异常处理拦截器
 */
public class ExceptionInterceptor implements HandlerExceptionResolver {

    private static Logger log = LoggerFactory.getLogger(ExceptionInterceptor.class);
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        ModelAndView modelAndView = new ModelAndView();
        FastJsonJsonView view = new FastJsonJsonView();
        MessageResult messageResult;
        if(ex instanceof ApiException){
            ApiException apiException = (ApiException)ex;
            if(apiException.getMessageResult() != null){
                messageResult = apiException.getMessageResult();
            }else {
                messageResult = MessageResult.getErrorInstance(apiException.getCode(),apiException.getMessage());
            }
        }else {
            messageResult = MessageResult.getErrorInstance(ApiExceptionCode.SERVER_ERROR,"服务器出错\n"+ex.getMessage());
            ex.printStackTrace();
        }
        JSONObject object = (JSONObject) JSON.toJSON(messageResult);
        view.setAttributesMap(object);
        return modelAndView;
    }
}