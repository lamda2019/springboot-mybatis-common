package com.wsc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wsc.mapper")
public class SpringbootMybatisCommonApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisCommonApplication.class, args);
    }

}
