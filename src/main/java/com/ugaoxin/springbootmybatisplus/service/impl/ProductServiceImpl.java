package com.ugaoxin.springbootmybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ugaoxin.springbootmybatisplus.mapper.ProductMapper;
import com.ugaoxin.springbootmybatisplus.pojo.Product;
import com.ugaoxin.springbootmybatisplus.service.ProductSerivce;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductSerivce {

}
