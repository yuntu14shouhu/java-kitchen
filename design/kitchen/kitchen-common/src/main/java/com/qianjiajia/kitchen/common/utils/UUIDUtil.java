package com.qianjiajia.kitchen.common.utils;

import java.util.UUID;

/**
 * @author qianjiajia
 * @version 1.0
 * @Date 2017-02-28 15:02
 * @Description 32为id
 */
public class UUIDUtil {

    public static String getUUID(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }

    public static String getUUID(int length){
        return "{"+UUID.randomUUID().toString().toUpperCase()+"}";
    }
}