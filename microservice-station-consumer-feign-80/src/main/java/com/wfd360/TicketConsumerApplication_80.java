package com.wfd360;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by 姿势帝-博客园 on 2019/3/26.
 * 欢迎添加笔者wx(851298348)共同探讨、学习！
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
//@EnableEurekaClient  //容易出错的地方，这里配置了 @EnableFeignClients，就要注释掉之前的配置 //@EnableEurekaClient
@EnableFeignClients
public class TicketConsumerApplication_80 {
    public static void main(String[] args) {
        SpringApplication.run(TicketConsumerApplication_80.class, args);
    }
}
