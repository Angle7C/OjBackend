package com.example.ojbackend.controller;
import com.example.server.DTO.Result;
import com.example.server.DTO.UserDTO;
import com.example.server.entity.User;
import com.example.server.untils.EmailUtil;
import com.example.server.untils.JwtUntil;
import com.example.server.service.IUserService;

import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private IUserService userService;
    @Resource
    private JwtUntil jwtUntil;
    @Resource
    private EmailUtil emailUtil;
    @PostMapping("/login/{email}/{password}")
    public Result login(@PathVariable("email") String email, @PathVariable("password") String password){
        User login = userService.login(email, password);
        String jwt = jwtUntil.createJWT(login);
       return Result.ok("登录成功",jwt);
    }
    @PostMapping("/register/{code}")
    public Result register(@RequestBody UserDTO userDTO, @PathVariable("code") String code){
        boolean register = userService.register(userDTO, code);

        return null;
    }
    @PostMapping("/sendCode/{email}")
    public Result sendCode(@PathVariable String email){
        return  emailUtil.sendCode(email);

    }

}
