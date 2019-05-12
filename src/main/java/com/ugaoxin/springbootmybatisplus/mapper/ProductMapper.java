package com.ugaoxin.springbootmybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ugaoxin.springbootmybatisplus.pojo.Product;

/**
 * 使用mybatisplus内置的baseMapper
 */
public interface ProductMapper extends BaseMapper<Product> {
    int deleteByPrimaryKey(String id);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);
}