package com.imooc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import tk.mybatis.spring.annotation.MapperScan;


@SpringBootApplication()
//扫描mybaits通用mapper所在包
@MapperScan(basePackages = "com.imooc.mapper")
//扫描所有包和相关组件包
@ComponentScan(basePackages = {"com.imooc","org.n3r.idworker"})
@EnableScheduling   //开启定时任务
public class Application {
    public static void main(String[] args) {
        try{

        SpringApplication.run(Application.class,args);
        }catch (Exception e ){
            System.out.println(e);
        }
    }
}
