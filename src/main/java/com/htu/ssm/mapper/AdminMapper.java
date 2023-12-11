package com.htu.ssm.mapper;

import com.htu.ssm.po.Admin;
import org.apache.ibatis.annotations.Mapper;

/**
* @author CuiXiaoFang
* @description 针对表【admin】的数据库操作Mapper
* @createDate 2023-12-06 14:42:40
* @Entity com.htu.ssm.po.Admin
*/
@Mapper
public interface AdminMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);

}
