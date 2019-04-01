package com.wfd360;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by 姿势帝-博客园 on 2019/3/25.
 * 欢迎添加笔者wx(851298348)共同探讨、学习！
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class TicketProviderApplication_1004 {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(TicketProviderApplication_1004.class, args);
    }
}
