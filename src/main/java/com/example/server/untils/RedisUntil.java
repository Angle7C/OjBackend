package com.example.ojbackend.untils;


import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class RedisUntil {
    @Resource
    private RedisTemplate redisTemplate;
}
