package com.hsj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hsj.mapper")
public class SpringbootDataMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDataMybatisApplication.class, args);
    }

}
