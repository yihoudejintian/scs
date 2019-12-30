package com.ytq.s.gateway.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * @author yuantongqin
 * description:
 * 2019/12/30
 */
@Slf4j
@Component
public class SimpleFilter extends ZuulFilter {

    /**
     * 四种类型:pre,route,post,error
     * 之前,路由中,之后,错误
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 多个过滤器的情况下处理顺序
     * @return
     */
    @Override
    public int filterOrder() {
        return 1;
    }

    /**
     * 如果返回给true,执行run方法,返回false不执行
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();
        String userId = request.getHeader("userId");
        log.info(String.format("%s request to %s", request.getMethod(), request.getRequestURL().toString()));

        HttpServletResponse response = requestContext.getResponse();
        if(StringUtils.isEmpty(userId)){
//            response.
        }

        return null;
    }
}
