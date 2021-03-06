package com.example.dubbo_provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@RestController
@SpringBootApplication
@EnableDiscoveryClient // 激活DiscoveryClient
@EnableFeignClients //添加 feign
public class EurakaClientApplication {


        @Autowired
        private Feign feign;

    @GetMapping("/a")
    public String a(){



//        RestTemplate restTemplate = new RestTemplate();
//        ResponseEntity<String> forEntity = restTemplate.getForEntity("http://eureka-provider/eureka-provider/a", String.class);

        return feign.a();
    }

    public static void main(String[] args) {
        SpringApplication.run(EurakaClientApplication.class, args);
    }

}
