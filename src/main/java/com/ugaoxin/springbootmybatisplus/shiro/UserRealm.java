package com.ugaoxin.springbootmybatisplus.shiro;

import com.ugaoxin.springbootmybatisplus.pojo.system;
import com.ugaoxin.springbootmybatisplus.pojo.user;
import com.ugaoxin.springbootmybatisplus.service.LoginService;
import com.ugaoxin.springbootmybatisplus.service.SystemService;
import com.ugaoxin.springbootmybatisplus.service.UserService;
import com.ugaoxin.springbootmybatisplus.service.impl.LoginServiceImpl;
import com.ugaoxin.springbootmybatisplus.service.impl.SystemServiceImpl;
import com.ugaoxin.springbootmybatisplus.service.impl.UserServiceImpl;
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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;


@Component
public class UserRealm extends AuthorizingRealm {
    @Autowired
    SystemService systemService=new SystemServiceImpl();
    @Autowired
    UserService userService=new UserServiceImpl();
    @Autowired
    LoginService loginService=new LoginServiceImpl();

    int permissions=1;
    String password="123";
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
        String salt=loginService.getSalt();
        Set<String> roles=getRolesByUserName(username);
        if(password==null){
            return null;
        }
        //加盐
        SimpleAuthenticationInfo authenticationInfo=new SimpleAuthenticationInfo(username,password,"UserRealm");
        authenticationInfo.setCredentialsSalt(ByteSource.Util.bytes(salt));
        return authenticationInfo;
    }
   /* private String getPassword(String username){
        return  usermap.get(username);
    }*/
    //获取角色
    private Set<String> getRolesByUserName(String userName){
        List<user> list=userService.list();
        Iterator<user> it=list.iterator();
        while(it.hasNext()){
            user userd=it.next();
            if(userName.equals(userd.getUsername())){
                permissions=userd.getPermissions();
                password=userd.getUserpassword();
            }
        }
        Set<String> sets=new HashSet<>();
        if(permissions==2){
            sets.add("admin");
        }
       else {
            sets.add("user");
        }
        return sets;
    }
    //获取权限
    private Set<String> getPermissionByUserName(String userName){
        Set<String> sets=new HashSet<>();
        sets.add("user:delete");
        sets.add("user:add");
        return sets;
    }

 /*   //生成盐
    private  String getSalt(){
        List<system> lists=systemService.list();
        String salt=lists.get(0).getSalt();
        return salt;
    }*/
}
