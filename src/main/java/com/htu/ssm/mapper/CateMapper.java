package com.htu.ssm.mapper;

import com.htu.ssm.po.Cate;
import org.apache.ibatis.annotations.Mapper;

/**
* @author CuiXiaoFang
* @description 针对表【cate】的数据库操作Mapper
* @createDate 2023-12-06 14:42:40
* @Entity com.htu.ssm.po.Cate
*/
@Mapper
public interface CateMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Cate record);

    int insertSelective(Cate record);

    Cate selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Cate record);

    int updateByPrimaryKey(Cate record);

}
