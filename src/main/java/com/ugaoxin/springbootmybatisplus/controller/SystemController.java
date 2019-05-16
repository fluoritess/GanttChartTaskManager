package com.ugaoxin.springbootmybatisplus.controller;

import com.ugaoxin.springbootmybatisplus.pojo.system;
import com.ugaoxin.springbootmybatisplus.pojo.user;
import com.ugaoxin.springbootmybatisplus.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wsw
 * @Package com.ugoxin.springbootmybatisplus.controller
 * @Description:用户controller
 * @date 2019年5月16日 22:31:11
 */
@RestController
public class SystemController {
    @Autowired
    SystemService systemService;
    /**
     * 获取系统参数
     */
    @RequestMapping("GetSystem")
    public Map<String,Object> GetSystem(){
        Map map=new HashMap();
        List<system> lists=systemService.list();
        map.put("system",lists.get(0));
        return map;
    }
}
