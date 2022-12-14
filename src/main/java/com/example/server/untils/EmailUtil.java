package com.example.ojbackend.untils;

import cn.hutool.core.util.RandomUtil;
import cn.hutool.extra.mail.MailAccount;
import cn.hutool.extra.mail.MailUtil;
import com.example.server.DTO.Result;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
@Slf4j
public class EmailUtil {
    @Resource
    private RedisUntil redisUntil;
    private  MailAccount account=new MailAccount();
    @Pointcut
    private void init(){
        account.setHost("smtp.163.com");
        account.setPort(25);
        account.setAuth(true);
        account.setUser("15305067103@163.com");
        account.setPass("AFVQHCTJDIUDRVLE");
    }
    public Result sendCode(String email){
        String code = RandomUtil.randomString(6);
        log.info("【email code is】 {}",code);
        String sendInfo = MailUtil.send(account, email, "验证码", code, false);
        log.info("【email sendInfo】 {}",sendInfo);
        //reids存储
        return Result.ok("验证码发送成功");
    }
}
