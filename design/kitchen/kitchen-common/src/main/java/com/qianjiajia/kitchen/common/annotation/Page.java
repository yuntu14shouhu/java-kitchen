package com.qianjiajia.kitchen.common.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author qianjiajia
 * @version 1.0
 * @Date 2017-02-28 14:57
 * @Description 表示需要分页
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Page {
}