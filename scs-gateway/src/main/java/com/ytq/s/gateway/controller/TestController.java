package com.ytq.s.gateway.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yuantongqin
 * description:
 * 2019/12/30
 */
@Slf4j
@RestController
public class TestController {

    @RequestMapping(value = "/available")
    public String available() {
        return "Spring in Action";
    }

    @RequestMapping(value = "/user/userInfo")
    public String checkedOut(String uid) {
        return "Spring Boot in Action"+uid;
    }


}
