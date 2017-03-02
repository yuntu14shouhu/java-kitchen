package com.qianjiajia.kitchen.design.utils;

import com.qianjiajia.kitchen.design.domain.Users;
import org.springframework.context.ApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @author qianjiajia
 * @version 1.0
 * @Date 2017-03-01 10:38
 * @Description 上下文工具类
 */
public class ContextUtils {
    private static ThreadLocal<HttpServletRequest> requestThreadLocal = new ThreadLocal<HttpServletRequest>();
    private static ThreadLocal<HttpServletResponse> responseThreadLocal = new ThreadLocal<HttpServletResponse>();
    private static ThreadLocal<LocalDomain> local = new ThreadLocal<LocalDomain>();
    private static ApplicationContext applicationContext;
    private static ServletContext servletContext;
    private static String contextPath;

    public static String getContextPath(){
        return requestThreadLocal.get().getContextPath();
    }

    public static void init(HttpServletRequest request,HttpServletResponse response,LocalDomain localDomain){
        requestThreadLocal.set(request);
        responseThreadLocal.set(response);
        local.set(localDomain);
    }

    /**
     * 获取一个session(伪)
     */
    public static Map<String,Object> getSession(){
        return local.get().getSession();
    }

    public static HttpServletResponse getResponse(){
        return responseThreadLocal.get();
    }

    /**
     * 获取用户请求的ip
     */
    public static String getRemoteIp(){
        try {
            if(requestThreadLocal.get() != null){
                HttpServletRequest servletRequest = requestThreadLocal.get();
                if(servletRequest != null){
                    String addr = servletRequest.getRemoteAddr();
                    return addr;
                }
            }
        }catch (Exception e){

        }
        return null;
    }

    /**
     * 获取当前登陆的用户
     * 对当前信息修改无效
     */
    public static Users getUsers(){
        LocalDomain localDomain = local.get();
        Users users;
        if(localDomain == null){
            return null;
        }else{
            users = localDomain.getUsers();
        }
        return users;
    }

    public static Cookie[] getCookis(){
        return requestThreadLocal.get().getCookies();
    }

    public static void addCookie(Cookie cookie){
        responseThreadLocal.get().addCookie(cookie);
    }

    public static LocalDomain getLocalDomain(){
        return local.get();
    }


}