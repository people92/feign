package com.people.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "local-service", url = "http://localhost:8080")
public interface SampleFeignClient {

    @GetMapping("/xml/feign-test")
    public void callFeignTest();
}
