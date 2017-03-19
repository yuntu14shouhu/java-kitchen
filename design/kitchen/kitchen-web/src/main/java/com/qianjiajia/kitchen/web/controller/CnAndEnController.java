package com.qianjiajia.kitchen.web.controller;

import com.qianjiajia.kitchen.common.result.MessageResult;
import com.qianjiajia.kitchen.design.domain.CnAndEn;
import com.qianjiajia.kitchen.design.service.ICnAndEnService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author qianjiajia
 * @version 1.0
 * @email qianjiajia_2013@126.com
 * @Date 2017-03-18 14:42
 * @Description 中英文对照
 */
@Api("中英文对照")
@RequestMapping("/cnanden")
@Controller
public class CnAndEnController {

    @Autowired
    private ICnAndEnService cnAndEnService;

    @ApiOperation(value = "插入")
    @ResponseBody
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public MessageResult save(@RequestBody @ApiParam CnAndEn cnAndEn){
        cnAndEnService.save(cnAndEn);
        return MessageResult.getSuccessInstance();
    }
}