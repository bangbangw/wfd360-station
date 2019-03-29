package com.wfd360.config;

        import org.springframework.cloud.client.loadbalancer.LoadBalanced;
        import org.springframework.context.annotation.Bean;
        import org.springframework.context.annotation.Configuration;
        import org.springframework.web.client.RestTemplate;

/**
 * Created by 姿势帝-博客园 on 2019/3/26.
 * 欢迎添加笔者wx(851298348)共同探讨、学习！
 *
 * springCloud相关配置
 */
@Configuration
public class SpringCloudConfig {
    /**
     * 调用服务模版
     * @return
     */
    @Bean
    @LoadBalanced  // 引入ribbon负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
