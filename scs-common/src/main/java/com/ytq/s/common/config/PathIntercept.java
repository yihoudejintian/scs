package com.ytq.s.common.config;

import org.springframework.web.servlet.HandlerInterceptor;

/**
 * @author yuantongqin
 * description:
 * 2019/12/30
 * 拦截处理
 */
public interface PathIntercept extends HandlerInterceptor {

    /**
     * 添加拦截规则
     * @return
     */
    default String interceptPattern(){
        return "/**";
    }

}
