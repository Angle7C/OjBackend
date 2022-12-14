package com.example.ojbackend.service;

import com.example.server.DTO.UserDTO;
import com.example.server.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author chen
 * @since 2022-06-28 09:06:28
 */
public interface IUserService extends IService<User> {
    User login(String email, String password);
    boolean register(UserDTO userDTO, String code);
}
