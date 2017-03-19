package com.qianjiajia.kitchen.design.service;

import com.qianjiajia.kitchen.design.domain.Address;

import java.util.List;

/**
 * @author qianjiajia
 * @version 1.0
 * @email qianjiajia_2013@126.com
 * @Date 2017-03-18 18:39
 * @Description 收货地址
 */
public interface IAddressService {

    void save(Address address);

    void update(Address address);

    void delete(String addressId);

    List<Address> query();
}
