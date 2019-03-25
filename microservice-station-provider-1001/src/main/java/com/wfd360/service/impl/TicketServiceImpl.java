package com.wfd360.service.impl;

import com.wfd360.model.Ticket;
import com.wfd360.repository.TicketRepository;
import com.wfd360.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 姿势帝-博客园 on 2019/3/25.
 * 欢迎添加笔者wx(851298348)共同探讨、学习！
 */
@Service
public class TicketServiceImpl implements TicketService {
    @Autowired
    private TicketRepository ticketRepository;

    @Override
    public void save(Ticket student) {
        ticketRepository.save(student);
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
}
