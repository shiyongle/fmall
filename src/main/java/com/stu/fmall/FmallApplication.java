package com.stu.fmall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.stu.fmall.mapper")
public class FmallApplication {

    public static void main(String[] args) {
        SpringApplication.run(FmallApplication.class, args);
    }

}
