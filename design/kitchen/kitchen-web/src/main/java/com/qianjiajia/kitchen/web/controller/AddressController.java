package com.qianjiajia.kitchen.web.controller;

import com.qianjiajia.kitchen.common.result.MessageResult;
import com.qianjiajia.kitchen.design.domain.AddressDetails;
import com.qianjiajia.kitchen.design.service.IAddressService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author qianjiajia
 * @version 1.0
 * @email qianjiajia_2013@126.com
 * @Date 2017-03-18 23:38
 * @Description 收货地址控制器
 */
@Api("收货地址控制器")
@RequestMapping("/address")
@Controller
public class AddressController {

    @Autowired
    private IAddressService addressService;

    @ApiOperation(value = "保存收货地址")
    @ResponseBody
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public MessageResult save (@RequestBody @ApiParam AddressDetails address){
        addressService.save(address);
        return MessageResult.getSuccessInstance();
    }

    @ApiOperation(value = "删除收货地址")
    @ResponseBody
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public MessageResult delete(String addressId){
        addressService.delete(addressId);
        return MessageResult.getSuccessInstance();
    }

    @ApiOperation(value = "查询收货地址")
    @ResponseBody
    @RequestMapping(value = "/quertAll",method = RequestMethod.GET)
    public MessageResult queryAll(){
        List<AddressDetails> addresses = addressService.query();
        return MessageResult.getSuccessInstance(addresses);
    }

    @ApiOperation(value = "查询收货地址详情")
    @ResponseBody
    @RequestMapping(value = "/queryDetails",method = RequestMethod.GET)
    public MessageResult queryDetails(String addressId){
        AddressDetails addresses = addressService.queryDetails(addressId);
        return MessageResult.getSuccessInstance(addresses);
    }

    @ApiOperation(value = "修改收货地址")
    @ResponseBody
    @RequestMapping(value = "update",method = RequestMethod.POST)
    public MessageResult update(@RequestBody @ApiParam AddressDetails address){
        addressService.update(address);
        return MessageResult.getSuccessInstance();
    }

}