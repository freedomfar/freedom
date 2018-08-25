package com.personal.freedom.common.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 类描述：springMVC的配置
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    /**
     * 重写方法描述：实现在url中输入相应的地址的时候直接跳转到某个地址
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //登入页面配置
//        registry.addViewController("/login").setViewName("login");
        //主页配置
//        registry.addViewController("/main").setViewName("main");
        //出错页面配置
        registry.addViewController("/error").setViewName("error");
    }

}
