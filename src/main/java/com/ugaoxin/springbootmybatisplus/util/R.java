package com.ugaoxin.springbootmybatisplus.util;


import java.util.HashMap;
import java.util.Map;
/**
 * @author wsw
 * @Package com.ugoxin.springbootmybatisplus.util
 * @Description:json封装工具类
 * @date 2019年5月15日 21:17:11
 */
public class R extends HashMap<String, Object> {
    private static final long serialVersionUID = 1L;

    public R() {
        put("code", "0");
    }

    public static R error() {
        return error("500", "未知异常，请联系管理员");
    }

    public static R error(String msg) {
        return error("500", msg);
    }

    public static R error(String code, String msg) {
        R r = new R();
        r.put("code", code);
        r.put("msg", msg);
        return r;
    }
    public static R error(Map<String, Object> map) {
        R r = new R();
        r.put("code", "500");
        r.putAll(map);
        return r;
    }

    public static R ok(String msg) {
        R r = new R();
        r.put("msg", msg);
        return r;
    }

    public static R ok(Map<String, Object> map) {
        R r = new R();
        r.putAll(map);
        return r;
    }


    public static R ok() {
        return new R();
    }

    public R put(String key, Object value) {
        super.put(key, value);
        return this;
    }
}