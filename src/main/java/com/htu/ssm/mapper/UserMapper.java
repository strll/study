package com.htu.ssm.mapper;

import com.htu.ssm.po.User;
import org.apache.ibatis.annotations.Mapper;

/**
* @author CuiXiaoFang
* @description 针对表【user】的数据库操作Mapper
* @createDate 2023-12-06 14:42:40
* @Entity com.htu.ssm.po.User
*/
@Mapper
public interface UserMapper {

    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

}
