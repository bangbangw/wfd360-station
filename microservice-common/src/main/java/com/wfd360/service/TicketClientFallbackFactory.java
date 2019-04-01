package com.wfd360.service;

import com.wfd360.model.Ticket;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 姿势帝-博客园 on 2019/4/1.
 * 欢迎添加笔者wx(851298348)共同探讨、学习！
 */
@Component
public class TicketClientFallbackFactory implements FallbackFactory<TicketClientService> {
    @Override
    public TicketClientService create(Throwable throwable) {
        return new TicketClientService() {
            @Override
            public Ticket get(@PathVariable("id") Integer id) {
                // 服务超时或者出错时 返回的业务逻辑
                return null;
            }

            @Override
            public List<Ticket> list() {
                // 服务超时或者出错时 返回的业务逻辑
                return null;
            }

            @Override
            public boolean save(Ticket ticket) {
                // 服务超时或者出错时 返回的业务逻辑
                return false;
            }

            @Override
            public boolean delete(@PathVariable("id") Integer id) {
                // 服务超时或者出错时 返回的业务逻辑
                return false;
            }

            @Override
            public Map<String, Object> lockTicket() {
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("code", 500);
                map.put("msg", "系统出错，稍后重试");
                return map;
            }
        };
    }
}
