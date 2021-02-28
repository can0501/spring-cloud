package com.example.eurekaclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("eureka-provider")
public interface Feign {
    @GetMapping(value = "/eureka-provider/a")
    String a();

}
