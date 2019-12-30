package com.ytq.s.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author yuantongqin
 * description:
 * 2019/12/30
 * EnableZuulProxy这会将网关应用程序变成反向代理,该代理将相关请求,路由到具体服务上
 */
@SpringBootApplication
@EnableZuulProxy
public class GateWayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GateWayApplication.class);
    }

}
