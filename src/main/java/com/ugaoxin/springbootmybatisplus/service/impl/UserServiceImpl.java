package com.ugaoxin.springbootmybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ugaoxin.springbootmybatisplus.mapper.ProductMapper;
import com.ugaoxin.springbootmybatisplus.mapper.systemMapper;
import com.ugaoxin.springbootmybatisplus.mapper.userMapper;
import com.ugaoxin.springbootmybatisplus.pojo.Product;
import com.ugaoxin.springbootmybatisplus.pojo.system;
import com.ugaoxin.springbootmybatisplus.pojo.user;
import com.ugaoxin.springbootmybatisplus.service.UserService;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<userMapper, user> implements UserService {

}
