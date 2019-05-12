package com.ugaoxin.springbootmybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ugaoxin.springbootmybatisplus.pojo.system;
import com.ugaoxin.springbootmybatisplus.pojo.systemExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
public interface systemMapper extends BaseMapper<system> {
    int countByExample(systemExample example);

    int deleteByExample(systemExample example);

    int deleteByPrimaryKey(Integer systemId);

    int insert(system record);

    int insertSelective(system record);

    List<system> selectByExample(systemExample example);

    system selectByPrimaryKey(Integer systemId);

    int updateByExampleSelective(@Param("record") system record, @Param("example") systemExample example);

    int updateByExample(@Param("record") system record, @Param("example") systemExample example);

    int updateByPrimaryKeySelective(system record);

    int updateByPrimaryKey(system record);
}