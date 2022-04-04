package com.yuqn.config;

import com.yuqn.handlerInterceptor.HandlerInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//创建一个类，用于注册拦截器，相当于配置文件，实现WebMvcConfigurer接口
/*
* addInterceptor:指定拦截器
* addPathPatterns：指定通过请求
* excludePathPatterns：指定拦截请求
* */
@Configuration
public class MyConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        String [] path={"/hello/**","/go/**"};
        String [] Epath={"/user/go"};
        registry.addInterceptor(new HandlerInterceptor()).addPathPatterns(path).excludePathPatterns(Epath);
    }
}
