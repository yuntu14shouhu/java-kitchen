/**
 * _/          _/  _/        _/_/_/
 * _/          _/  _/        _/    _/
 * _/    _/    _/  _/        _/_/_/
 * _/  _/  _/    _/        _/    _/
 * _/  _/      _/_/_/_/  _/_/_/
 * <p>
 * Project: lovegame
 * <p>
 * HoldOrderConfig.java File Created at 涓???11:04:47
 * <p>
 * <p>
 * Copyright 2014 Taobao.com Corporation Limited.
 * All rights reserved.
 * <p>
 * This software is the confidential and proprietary information of
 * Taobao Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Taobao.com.
 */
package com.qianjiajia.kitchen.web.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @version 1.0
 * @since 2017/2/24
 */
@Configuration
@EnableSwagger2
@EnableWebMvc
@ComponentScan(basePackages ={"com.qianjiajia.kitchen.web"})
public class SwaggerConfig  {

    //extends WebMvcConfigurerAdapter
    /**
     * Every Docket bean is picked up by the swagger-mvc framework - allowing for multiple
     * swagger groups i.e. same code base multiple swagger resource listings.
     */
    @Bean
    public Docket customDocket() {
        return new Docket(DocumentationType.SWAGGER_2);
//            .select()  // 选择那些路径和api会生成document
//            .apis(RequestHandlerSelectors.any()) // 对所有api进行监控
//            .paths(paths())
//            .build();
    }


//    private Predicate<String> paths() {
//        return or(regex(".*?"), regex("/test.*"));
//    }
//
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("swagger-ui.html")
//            .addResourceLocations("classpath:/META-INF/resources/");
//
//        registry.addResourceHandler("/webjars/**")
//            .addResourceLocations("classpath:/META-INF/resources/webjars/");
//    }

}
