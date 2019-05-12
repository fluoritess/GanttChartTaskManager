package com.ugaoxin.springbootmybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ugaoxin.springbootmybatisplus.mapper.systemMapper;
import com.ugaoxin.springbootmybatisplus.pojo.system;
import com.ugaoxin.springbootmybatisplus.service.SystemService;
import org.springframework.stereotype.Service;

@Service
public class SystemServiceImpl extends ServiceImpl<systemMapper, system> implements SystemService {
}
