package com.ytq.s.server.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.lang.reflect.Method;

import com.ytq.s.common.config.PathIntercept;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.web.method.HandlerMethod;

/**
 * @author yuantongqin
 * description:
 * 2019/12/30
 */
@Slf4j
@Component
public class LoginIntercept implements PathIntercept {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if(handler != null && handler instanceof HandlerMethod){
            HandlerMethod hm = (HandlerMethod) handler;
            Method[] declaredMethods = hm.getBean().getClass().getDeclaredMethods();
            if (declaredMethods != null && declaredMethods.length > 0) {
                for (Method m : declaredMethods) {
                    LoginCheck loginCheck = m.getDeclaredAnnotation(LoginCheck.class);
                    if(loginCheck != null){
                        log.info("请先到登录");
                        return true;
                    }
                }
            }
        }
        // return false 不继续往下执行
        return true;
    }
}
