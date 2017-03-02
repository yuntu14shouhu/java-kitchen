package com.qianjiajia.kitchen.common.utils;

import org.apache.shiro.crypto.hash.Sha512Hash;

/**
 * @author qianjiajia
 * @version 1.0
 * @Date 2017-03-01 9:47
 */
public class PasswordUtil {

    public static String salt(){
        return UUIDUtil.getUUID().substring(0,15);
    }

    public static String password(String password,String salt){
        return new Sha512Hash(password,salt).toHex();
    }
}