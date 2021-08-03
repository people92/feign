package com.people.feign;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FeignApplicationTests {

    @Autowired
    SampleFeignClient sampleFeignClient;

    @Test
    void feignRetryTest() {
        sampleFeignClient.callFeignTest();
    }

}
