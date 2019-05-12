package com.ugaoxin.springbootmybatisplus.service.impl;

import com.ugaoxin.springbootmybatisplus.pojo.system;
import com.ugaoxin.springbootmybatisplus.pojo.user;
import com.ugaoxin.springbootmybatisplus.service.SystemService;
import com.ugaoxin.springbootmybatisplus.service.UserRegister;
import com.ugaoxin.springbootmybatisplus.service.UserService;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRegisterImpl implements UserRegister {
    @Autowired
    private UserService userService;
    @Autowired
    SystemService systemService;
    @Override
    public Boolean Register(user user) {
        int id=userService.count()+1;
        List<system> list=systemService.list();
        String salt=list.get(0).getSalt();
        String password=user.getUserpassword();
        Md5Hash md5Hash=new Md5Hash(password,salt);
        password=md5Hash.toString();
        user.setUserpassword(password);
        user.setId(id);
        return  userService.save(user);
    }
}
