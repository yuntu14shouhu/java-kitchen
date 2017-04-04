package com.qianjiajia.kitchen.design.service.impl;

import com.qianjiajia.kitchen.common.utils.UUIDUtil;
import com.qianjiajia.kitchen.design.dao.AddressMapper;
import com.qianjiajia.kitchen.design.domain.Address;
import com.qianjiajia.kitchen.design.service.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author qianjiajia
 * @version 1.0
 * @email qianjiajia_2013@126.com
 * @Date 2017-03-18 18:39
 * @Description 收货地址
 */
@Service
public class AddressServiceImpl implements IAddressService {

    @Autowired
    private AddressMapper addressMapper;

    @Transactional
    @Override
    public void save(Address address) {
        address.setId(UUIDUtil.getUUID());
        addressMapper.insert(address);
    }

    @Transactional
    @Override
    public void update(Address address) {
        addressMapper.updateByPrimaryKey(address);
    }

    @Transactional
    @Override
    public void delete(String addressId) {
        addressMapper.deleteByPrimaryKey(addressId);
    }

    @Override
    public List<Address> query() {
        return addressMapper.queryList();
    }

    @Override
    public Address queryTo(String id) {
        return addressMapper.getById(id);
    }

    @Override
    public List<String> queryId() {
        return addressMapper.queryIdList();
    }

}