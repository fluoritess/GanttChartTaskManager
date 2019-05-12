package com.ugaoxin.springbootmybatisplus.service.impl;

import com.ugaoxin.springbootmybatisplus.pojo.system;
import com.ugaoxin.springbootmybatisplus.pojo.user;
import com.ugaoxin.springbootmybatisplus.service.LoginService;
import com.ugaoxin.springbootmybatisplus.service.SystemService;
import com.ugaoxin.springbootmybatisplus.service.UserService;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private UserService userService;
    @Autowired
    SystemService systemService;
    @Override
    public Boolean Login(user user) {
        List<system> lists=systemService.list();
        String salt=lists.get(0).getSalt();
        String name=user.getUsername();
        String password=user.getUserpassword();
        Md5Hash md5Hash=new Md5Hash(password,salt);
        password=md5Hash.toString();
        List<user> list=userService.list();
        Iterator<user> it=list.iterator();
        while(it.hasNext()){
            user userd=it.next();
            if(name.equals(userd.getUsername())){
                if(password.equals(userd.getUserpassword()))
                {
                 return  true;
                }
            }
        }
        return false;
    }
}
