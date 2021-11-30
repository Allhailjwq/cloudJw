package com.jw.qiu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.jw.qiu.dao")
@ComponentScan(basePackages = {"com.jw.qiu.*"})
@EnableEurekaClient
public class PaymentApplication1 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication1.class, args);
    }
}

