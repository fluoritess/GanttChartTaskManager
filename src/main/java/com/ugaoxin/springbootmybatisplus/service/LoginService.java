package com.ugaoxin.springbootmybatisplus.service;

import com.ugaoxin.springbootmybatisplus.pojo.user;
/**
 * @author wsw
 * @Package com.ugoxin.springbootmybatisplus.service
 * @Description:登录service
 * @date 2019年5月11日 18:46:39
 */
public interface LoginService {
    Boolean Login(user user);
    String getSalt();
}
