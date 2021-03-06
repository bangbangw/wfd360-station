package com.wfd360.controller;

import com.wfd360.model.Ticket;
import com.wfd360.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by 姿势帝-博客园 on 2019/3/25.
 * 欢迎添加笔者wx(851298348)共同探讨、学习！
 */
@Controller
@RequestMapping("/ticket")
public class TicketController {
    @Autowired
    private TicketService ticketService;
    /**
     * 添加或者修改车票信息-V1111
     * @param ticket
     * @return
     */
    @PostMapping(value="/save")
    @ResponseBody
    public boolean save(Ticket ticket){
        try{
            ticketService.save(ticket);
            return true;
        }catch(Exception e){
            return false;
        }
    }

    /**
     * 查询车票信息
     * @return
     */
    @GetMapping(value="/list")
    @ResponseBody
    public List<Ticket> list(){
        //测试用，用于区分是哪一个服务提供者
        System.out.println("=======1002============="); //后端需区分
        Ticket ticket = new Ticket();
        ticket.setStartStation("--1002服务提供-"); //前段区分

        List<Ticket> list = ticketService.list();
        list.add(ticket);
        return list;
    }

    /**
     * 根据id查询车票信息
     * @return
     */
    @GetMapping(value="/get/{id}")
    @ResponseBody
    public Ticket get(@PathVariable("id") Integer id){
        return ticketService.findById(id);
    }

    /**
     * 根据id删除车票信息
     * @return
     */
    @GetMapping(value="/delete/{id}")
    @ResponseBody
    public boolean delete(@PathVariable("id") Integer id){
        try{
            ticketService.delete(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}
