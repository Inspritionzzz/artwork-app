package com.csc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.csc.modules.ums.mapper")
public class ArtWorkApplication {

    public static void main(String[] args) {
        System.out.println("just a test");
        SpringApplication.run(ArtWorkApplication.class, args);
    }

}
