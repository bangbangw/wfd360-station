package com.wfd360.service.impl;

import com.wfd360.model.Ticket;
import com.wfd360.repository.TicketRepository;
import com.wfd360.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 姿势帝-博客园 on 2019/3/25.
 * 欢迎添加笔者wx(851298348)共同探讨、学习！
 */
@Service
public class TicketServiceImpl implements TicketService {
    @Autowired
    private TicketRepository ticketRepository;

    @Override
    public void save(Ticket ticket) {
        ticketRepository.save(ticket);
    }

    @Override
    public Ticket findById(Integer id) {
        return ticketRepository.findOne(id);
    }

    @Override
    public List<Ticket> list() {
        return ticketRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        ticketRepository.delete(id);
    }

    @Override
    public Map<String, Object> lockTicket() {
        try {
            //模拟超时用
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("code", 200);
        map.put("msg", "锁定的车票数据xxxxx3000");
        return map;
    }
}
