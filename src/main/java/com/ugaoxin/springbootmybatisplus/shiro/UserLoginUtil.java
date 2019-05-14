package com.ugaoxin.springbootmybatisplus.shiro;


import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Service;

@Service
public class UserLoginUtil {
/*    public static void main(String[] args) {
        //1.创建SecurityManager及自定义Realm
       UserRealm userRealm=new UserRealm();
        DefaultSecurityManager defaultSecurityManager=new DefaultSecurityManager();
        defaultSecurityManager.setRealm(userRealm);
        //2.md5加密
        HashedCredentialsMatcher hashedCredentialsMatcher=new HashedCredentialsMatcher();
        hashedCredentialsMatcher.setHashAlgorithmName("md5");
        hashedCredentialsMatcher.setHashIterations(1);
        userRealm.setCredentialsMatcher(hashedCredentialsMatcher);
        //3.创建主体subject，主体提交认证请求
        SecurityUtils.setSecurityManager(defaultSecurityManager);
        Subject subject =SecurityUtils.getSubject();
        UsernamePasswordToken usernamePasswordToken=new UsernamePasswordToken("shan","123456");
        subject.login(usernamePasswordToken);
        System.out.println(subject.isAuthenticated());
        //4.检验角色及权限
        subject.checkRoles("admin","user");
        subject.checkPermissions("user:delete","user:add");
    }*/
    public Boolean LoginUtil(String name,String password){
        //1.创建SecurityManager及自定义Realm
        ShanRealm userRealm=new ShanRealm();
        DefaultSecurityManager defaultSecurityManager=new DefaultSecurityManager();
        defaultSecurityManager.setRealm(userRealm);
        //2.md5加密
        HashedCredentialsMatcher hashedCredentialsMatcher=new HashedCredentialsMatcher();
        hashedCredentialsMatcher.setHashAlgorithmName("md5");
        hashedCredentialsMatcher.setHashIterations(1);
        userRealm.setCredentialsMatcher(hashedCredentialsMatcher);
        //3.创建主体subject，主体提交认证请求
        SecurityUtils.setSecurityManager(defaultSecurityManager);
        Subject subject =SecurityUtils.getSubject();
        UsernamePasswordToken usernamePasswordToken=new UsernamePasswordToken(name,password);
        subject.login(usernamePasswordToken);
        System.out.println(subject.isAuthenticated());
        return subject.isAuthenticated();
    }
}
