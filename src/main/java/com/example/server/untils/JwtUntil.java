package com.example.ojbackend.untils;

import cn.hutool.jwt.JWT;
import cn.hutool.jwt.JWTUtil;
import cn.hutool.jwt.signers.JWTSigner;
import cn.hutool.jwt.signers.JWTSignerUtil;
import com.example.server.entity.User;
import com.example.server.service.IUserService;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;

@Component
public class JwtUntil {
    private static final String signer="SHK-7HG";
    @Resource
    private IUserService userService;

    private JWTSigner jwtSigner = JWTSignerUtil.hs256(signer.getBytes(StandardCharsets.UTF_8));
    public String createJWT(User user){
        Map<String,Object> data=new HashMap();
        data.put("user",user.getEmail());
        String expTime = LocalDateTime.now().plus(30, ChronoUnit.MINUTES).toString();
        data.put("exp",expTime);

        return JWTUtil.createToken(data, jwtSigner);
    }
    public String userEmail(String token){
        JWT jwt = JWTUtil.parseToken(token).setSigner(jwtSigner);
        User user = (User) jwt.getPayload("user");
        String email = user.getEmail();
        return email;
    }
    public String userPassword(String token){
        JWT jwt = JWTUtil.parseToken(token).setSigner(jwtSigner);
        User password = (User) jwt.getPayload("password");
        return password.getUserPassword();
    }
    private boolean isExp(String token){
        JWT jwt = JWTUtil.parseToken(token).setSigner(jwtSigner);
        Long exp = Long.valueOf((String) jwt.getPayload("exp") );
        return exp<System.currentTimeMillis();
    }
    public boolean addExp(String token){
        if(!isExp(token)){
            JWT jwt = JWTUtil.parseToken(token).setSigner(jwtSigner);
            jwt.getPayload().setPayload("exp",LocalDateTime.now().plus(30,ChronoUnit.MINUTES).toString());
            token=jwt.sign();
            return true;
        }
        return false;
    }
    public boolean checkUser(String token){
        //redis缓存，存取
        //数据库查询
        Integer count = userService.query().eq("email", userEmail(token)).eq("password", userPassword(token)).count();
        //放入缓存
        return count==1;
    }
    public User getUser(String token){
        JWT jwt = JWTUtil.parseToken(token).setSigner(jwtSigner);
        return (User) jwt.getPayload("user");
    }

}
