package com.ugaoxin.springbootmybatisplus.shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

import java.security.SecureRandom;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.apache.tomcat.util.codec.binary.Base64.encodeBase64String;

public class ShanRealm extends AuthorizingRealm {
    String salt="wsw";
    Map<String,String> usermap=new HashMap<>();
    {
        Md5Hash md5Hash=new Md5Hash("123",salt);
        usermap.put("wen",md5Hash.toString());
        usermap.put("admin",md5Hash.toString());
        usermap.put("shan",md5Hash.toString());
        usermap.put("wang",md5Hash.toString());
    }
    //授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        AuthorizationInfo authorizationInfo=new SimpleAuthorizationInfo();
        String username=(String)principalCollection.getPrimaryPrincipal();
        Set<String> roles=getRolesByUserName(username);
        Set<String> permission=getPermissionByUserName(username);
        ((SimpleAuthorizationInfo) authorizationInfo).setRoles(roles);
        ((SimpleAuthorizationInfo) authorizationInfo).setStringPermissions(permission);
        return authorizationInfo;
    }
    //认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String username=(String)authenticationToken.getPrincipal();


        String password=getPassword(username);
        if(password==null){
            return null;
        }
        //加盐
        SimpleAuthenticationInfo authenticationInfo=new SimpleAuthenticationInfo(username,password,"ShanRealm");
        authenticationInfo.setCredentialsSalt(ByteSource.Util.bytes(salt));
        return authenticationInfo;
    }
    private String getPassword(String username){
        return  usermap.get(username);
    }
    //获取角色
    private Set<String> getRolesByUserName(String userName){
        Set<String> sets=new HashSet<>();
        sets.add("admin");
        sets.add("user");
        return sets;
    }
    //获取权限
    private Set<String> getPermissionByUserName(String userName){
        Set<String> sets=new HashSet<>();
        sets.add("user:delete");
        sets.add("user:add");
        return sets;
    }

    //生成盐
    private static String getSalt(){
        SecureRandom random = new SecureRandom();
        byte bytes[] = new byte[15];
        random.nextBytes(bytes);
        String salt =encodeBase64String(bytes);
        return salt;
    }
}
