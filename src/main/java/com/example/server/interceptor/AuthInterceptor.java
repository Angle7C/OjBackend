package com.example.ojbackend.interceptor;

import cn.hutool.core.util.ObjectUtil;
import com.example.server.entity.User;
import com.example.server.untils.JwtUntil;
import com.example.server.untils.UserHolder;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthInterceptor implements HandlerInterceptor {
    @Resource
    private JwtUntil jwtUtil;
    @Resource
    private UserHolder userHolder;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String token = request.getHeader("Auth-token");
        if(ObjectUtil.isEmpty(token)) return false;
        if(!jwtUtil.checkUser(token)) return false;
        User user = jwtUtil.getUser(token);
        userHolder.putUser(user);
        return true;
    }
}
