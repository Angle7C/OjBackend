package com.example.ojbackend.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.example.server.DTO.UserDTO;
import com.example.server.entity.User;
import com.example.server.mapper.UserMapper;
import com.example.server.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author chen
 * @since 2022-06-28 09:06:28
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Override
    public User login(String email, String password) {
        List<User> list = query().eq("email", email).eq("user_password", password).list();
        if(list.size()!=1){
            throw new RuntimeException("登录失败");
        }
        return list.get(0);
    }

    @Override
    public boolean register(UserDTO userDTO, String code) {
        //redis check code

        User user = BeanUtil.copyProperties(userDTO, User.class);
        String userPassword = user.getUserPassword();
        String email = user.getEmail();
        Integer count = query().eq("email", email).eq("user_password", userPassword).count();
        boolean save = save(user);
        return save;
    }
}
