package com.imooc.config;

import org.springframework.web.filter.CorsFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@Configuration
public class CorsConfig {
    public CorsConfig(){


    }

    @Bean
    public CorsFilter corsFilter(){
        //1.添加cors配置信息
        CorsConfiguration config  = new CorsConfiguration();
        config.addAllowedOrigin("http://localhost:8080");

        //设置是否发送cookie信息
        config.setAllowCredentials(true);

        //设置允许请求方式
        config.addAllowedMethod("*");

        //设置允许的header
        config.addAllowedHeader("*");


        //2. 为url添加

        UrlBasedCorsConfigurationSource corsSource = new UrlBasedCorsConfigurationSource();
        corsSource.registerCorsConfiguration("/**",config);

        return new CorsFilter(corsSource);
    }
}
