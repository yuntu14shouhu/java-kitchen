package com.qianjiajia.kitchen.design.utils;

import com.qianjiajia.kitchen.design.domain.Users;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Map;

/**
 * @author qianjiajia
 * @version 1.0
 * @Date 2017-03-01 10:41
 * @Description 本地线程domain
 */
@AllArgsConstructor
@Data
@NoArgsConstructor
public class LocalDomain implements Serializable {

    /**
     * 存放sesion的值
     */
    private  Map<String,Object> session;

    /**
     * 存放当前token的值
     */
    private String token;

    /**
     * 存放用户信息
     */
    private Users users;

}