package com.htu.ssm.service;

import com.htu.ssm.po.Address;

import java.util.List;

public interface AddressService {
    List<Address> getAdds(String wd);

    int delAddByNo(Long adUserId);

    Address getAddByNo(Long adUserId);

    int addAdd(Address address);

    int editAdd(Address address);
}
