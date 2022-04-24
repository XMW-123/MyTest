package com.rt.generalframework;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
/*(exclude={DataSourceAutoConfiguration.class})*/
@MapperScan("com.rt.generalframework.mapper")
public class GeneralframeworkApplication {
    public static void main(String[] args) {
        SpringApplication.run(GeneralframeworkApplication.class, args);
    }

}
