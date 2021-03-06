package com.example.dubbo_provider;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@EnableDubbo
@SpringBootApplication
@RestController
public class DubboProviderApplication {


    public static void main(String[] args) {

        SpringApplication.run(DubboProviderApplication.class, args);
    }

}
