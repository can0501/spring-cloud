package com.example.demo;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.ProviderService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DubboConsumerApplication {

    @Reference
    private ProviderService providerService;

    @GetMapping("/a")
    public String s(String a) {
        return providerService.provider(a);
    }

    public static void main(String[] args) {
        SpringApplication.run(DubboConsumerApplication.class, args);
    }

}
