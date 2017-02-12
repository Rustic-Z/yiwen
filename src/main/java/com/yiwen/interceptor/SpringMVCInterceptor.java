package com.yiwen.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 工程请求中的拦截器
 * Created by zhangchao on 2016/12/26.
 */
public class SpringMVCInterceptor implements HandlerInterceptor {

    /**
     * 该方法将在请求调用controller方法之前进行调用
     * 可以在改方法中处理一些请求的基本信息（如将域名，ip等存放到session中）
     * 返回true继续调用controller;false的话直接请求结束
     * @return
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
//        UserSessionContext userSessionContext = UserSessionContext.getInstance();
//        if () {
//
//        }
        return true;
    }

    /**
     * preHandle返回true时执行
     * 该方法将在controller执行结束之后，DispatcherServlet进行视图的渲染之前执行
     * 可以进行一些请求后置操作（如向请求响应数据中统一添加接口版本，响应服务器信息）
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {

    }

    /**
     * preHandle返回true时执行
     * 该方法将在整个请求完成之后，也就是DispatcherServlet渲染了视图执行
     * 这个方法的主要作用是用于清理资源的（如释放oss链接，关闭hibernate的session连接）
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {

    }
}
