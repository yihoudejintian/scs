package com.ytq.s.common.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.CollectionUtils;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author yuantongqin
 * description:
 * 2019/12/30
 */
@Configuration
public class WebInterceptConfig implements WebMvcConfigurer {

    @Autowired(required = false)
    private List<PathIntercept> intercepts;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        if(!CollectionUtils.isEmpty(intercepts)){
            // 将拦截器注入
            intercepts.stream().forEach(info->registry.addInterceptor(info).addPathPatterns(info.interceptPattern()));
        }
    }
}
