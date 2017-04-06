package com.qianjiajia.kitchen.design.service.impl;

import com.qianjiajia.kitchen.common.utils.UUIDUtil;
import com.qianjiajia.kitchen.design.dao.AddressDetailsMapper;
import com.qianjiajia.kitchen.design.domain.AddressDetails;
import com.qianjiajia.kitchen.design.domain.Users;
import com.qianjiajia.kitchen.design.service.IAddressService;
import com.qianjiajia.kitchen.design.utils.UserLoginUtils;
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
    private AddressDetailsMapper addressMapper;

    @Transactional
    @Override
    public void save(AddressDetails address) {
        address.setId(UUIDUtil.getUUID());
        address.setUserId(UserLoginUtils.currentUser.getId());
        addressMapper.insert(address);
    }

    @Transactional
    @Override
    public void update(AddressDetails address) {
        address.setUserId(UserLoginUtils.currentUser.getId());
        addressMapper.updateByPrimaryKey(address);
    }

    @Transactional
    @Override
    public void delete(String addressId) {
        addressMapper.deleteByPrimaryKey(addressId);
    }

    @Override
    public List<AddressDetails> query() {

        return addressMapper.queryList();
    }

    @Override
    public List<AddressDetails> queryAll(String userId) {
        Users user = UserLoginUtils.currentUser;
        userId = user.getId();
        return addressMapper.queryAll(userId);
    }

    @Override
    public AddressDetails queryTo(String id) {
        return addressMapper.getById(id);
    }

    @Override
    public List<String> queryId() {
        Users users = UserLoginUtils.currentUser;
        return addressMapper.queryIdList(users.getId());
    }

    @Override
    public AddressDetails queryDetails(String addressId) {

        return addressMapper.queryAddress(addressId);
    }

}