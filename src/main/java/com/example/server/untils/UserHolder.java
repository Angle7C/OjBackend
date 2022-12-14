package com.example.ojbackend.untils;

import com.example.server.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserHolder {
    private ThreadLocal<User> map=new ThreadLocal<>();
    public void putUser(User user){
        map.set(user);
    }
    public void removeUser(User user){
        map.remove();
    }
}
