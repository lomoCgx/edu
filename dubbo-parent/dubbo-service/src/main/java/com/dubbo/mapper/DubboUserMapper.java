package com.dubbo.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import api.entity.DubboUser;
import api.entity.DubboUserExample;
@Repository
public interface DubboUserMapper {
	
    int countByExample(DubboUserExample example);

    int deleteByExample(DubboUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DubboUser record);

    int insertSelective(DubboUser record);

    List<DubboUser> selectByExampleWithBLOBs(DubboUserExample example);

    List<DubboUser> selectByExample(DubboUserExample example);

    DubboUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DubboUser record, @Param("example") DubboUserExample example);

    int updateByExampleWithBLOBs(@Param("record") DubboUser record, @Param("example") DubboUserExample example);

    int updateByExample(@Param("record") DubboUser record, @Param("example") DubboUserExample example);

    int updateByPrimaryKeySelective(DubboUser record);

    int updateByPrimaryKeyWithBLOBs(DubboUser record);

    int updateByPrimaryKey(DubboUser record);
}