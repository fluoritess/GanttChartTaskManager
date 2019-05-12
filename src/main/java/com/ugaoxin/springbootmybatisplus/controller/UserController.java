package com.ugaoxin.springbootmybatisplus.controller;


import com.baomidou.mybatisplus.extension.api.R;
import com.ugaoxin.springbootmybatisplus.pojo.user;
import com.ugaoxin.springbootmybatisplus.service.LoginService;
import com.ugaoxin.springbootmybatisplus.service.UserRegister;
import com.ugaoxin.springbootmybatisplus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
/**
 * @author wsw
 * @Package com.ugoxin.springbootmybatisplus.controller
 * @Description:用户controller
 * @date 2019年5月10日 17:47:12
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    UserRegister userRegister;
    @Autowired
    LoginService loginService;
    /**
     * 用户注册
     */
    @RequestMapping("UserRegister")
    public Map<String,Object> UserRegister(@RequestBody Map<String,Object> reMap){
        String name=(String)reMap.get("name");
        String password=(String)reMap.get("password");
      /*  int permission=(int)reMap.get("permission");*/
        user user=new user(name,password,1);
        Boolean b=userRegister.Register(user);
        Map map=new HashMap();
        map.put("data",b);
        return map;
    }
    /**
     * 用户登录
     */
    @RequestMapping("Login")
    public Map<String,Object> Login(@RequestBody Map<String,Object> reMap){
        String name=(String)reMap.get("name");
        String password=(String)reMap.get("password");
       /* int permission=(int)reMap.get("permission");*/
        user user=new user(name,password,1);
        Boolean b=loginService.Login(user);
        Map map=new HashMap();
        map.put("data",b);
        return map;
    }
}
