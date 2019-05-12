package com.ugaoxin.springbootmybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ugaoxin.springbootmybatisplus.pojo.Product;
import com.ugaoxin.springbootmybatisplus.pojo.ProductData;

public interface ProductDataMapper extends BaseMapper<ProductData> {
    int deleteByPrimaryKey(Integer id);

    int insert(ProductData record);

    int insertSelective(ProductData record);

    ProductData selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProductData record);

    int updateByPrimaryKey(ProductData record);
}