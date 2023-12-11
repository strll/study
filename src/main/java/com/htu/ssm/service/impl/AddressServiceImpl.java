package com.htu.ssm.service.impl;

import com.htu.ssm.mapper.AddressMapper;
import com.htu.ssm.po.Address;
import com.htu.ssm.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressMapper addressMapper;

    @Override
    public List<Address> getAdds(String wd){
        return addressMapper.getAddAll(wd);
    }

    @Override
    public int delAddByNo(Long adUserId) {
        return addressMapper.deleteByPrimaryKey(adUserId);
    }

    @Override
    public Address getAddByNo(Long adUserId) {
        return addressMapper.selectByPrimaryKey(adUserId);
    }

    @Override
    public int addAdd(Address address) {
        return addressMapper.insertSelective(address);
    }

    @Override
    public int editAdd(Address address) {
        return addressMapper.updateByPrimaryKeySelective(address);
    }


}
