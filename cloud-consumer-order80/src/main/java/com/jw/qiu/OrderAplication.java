package com.jw.qiu;

//import com.jw.rule.RandomRuleRibbon;
import com.jw.rule.RandomRuleRibbon;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
@RibbonClient(name="CLOUD-PAYMENT-SERVICE",configuration = RandomRuleRibbon.class)
public class OrderAplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderAplication.class, args);
    }
}
