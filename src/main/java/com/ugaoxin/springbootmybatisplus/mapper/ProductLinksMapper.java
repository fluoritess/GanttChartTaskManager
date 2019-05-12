package com.ugaoxin.springbootmybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ugaoxin.springbootmybatisplus.pojo.Product;
import com.ugaoxin.springbootmybatisplus.pojo.ProductLinks;

public interface ProductLinksMapper extends BaseMapper<ProductLinks> {
    int insert(ProductLinks record);

    int insertSelective(ProductLinks record);
}