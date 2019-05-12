package com.ugaoxin.springbootmybatisplus.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ugaoxin.springbootmybatisplus.mapper.ProductLinksMapper;
import com.ugaoxin.springbootmybatisplus.pojo.ProductLinks;
import org.springframework.stereotype.Service;

@Service
public class ProductLinksServiceImpl extends ServiceImpl<ProductLinksMapper, ProductLinks> implements  ProductLinksService {
}
