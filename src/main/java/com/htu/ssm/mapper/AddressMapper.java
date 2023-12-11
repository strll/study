package com.htu.ssm.mapper;

import com.htu.ssm.po.Address;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author CuiXiaoFang
* @description 针对表【address】的数据库操作Mapper
* @createDate 2023-12-06 14:42:40
* @Entity com.htu.ssm.po.Address
*/
@Mapper
public interface AddressMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Address record);

    int insertSelective(Address record);

    Address selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Address record);

    int updateByPrimaryKey(Address record);

    List<Address> getAddAll(String wd);
}
