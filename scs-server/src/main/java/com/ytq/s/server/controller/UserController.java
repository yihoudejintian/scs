package com.ytq.s.server.controller;

import com.ytq.s.server.config.LoginCheck;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yuantongqin
 * description:
 * 2019/12/30
 */
@Slf4j
@RestController
public class UserController {

    @GetMapping("/user/userInfo")
    @LoginCheck
    public String getUser(Long uid){
        log.info("获取用户信息");
        return "暂时没有用户信息"+uid;
    }
}
