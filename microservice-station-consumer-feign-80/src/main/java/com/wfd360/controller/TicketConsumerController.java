package com.wfd360.controller;

import com.wfd360.model.Ticket;
import com.wfd360.service.TicketClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * Created by 姿势帝-博客园 on 2019/3/26.
 * 欢迎添加笔者wx(851298348)共同探讨、学习！
 */

/**
 * 知识点：@RestController注解相当于@ResponseBody ＋ @Controller合在一起的作用。
 */
@Controller
@RequestMapping("/ticket")
public class TicketConsumerController {
    @Autowired
    private TicketClientService ticketClientService;

    /**
     * 添加或者修改车票信息
     *
     * @param ticket
     * @return
     */
    @PostMapping(value = "/save")
    @ResponseBody
    public boolean save(Ticket ticket) {

        return ticketClientService.save(ticket);
    }

    /**
     * 查询车票信息
     *
     * @return
     */
    @SuppressWarnings("unchecked")
    @GetMapping(value = "/list")
    @ResponseBody
    public List<Ticket> list() {
        System.out.println("----------feign---------");
        return ticketClientService.list();
    }

    /**
     * 根据id查询车票信息
     *
     * @return
     */
    @GetMapping(value = "/get/{id}")
    @ResponseBody
    public Ticket get(@PathVariable("id") Integer id) {

        return ticketClientService.get(id);
    }

    /**
     * 根据id删除车票信息
     *
     * @return
     */
    @GetMapping(value = "/delete/{id}")
    @ResponseBody
    public boolean delete(@PathVariable("id") Integer id) {
        try {
            ticketClientService.delete(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    /**
     * 索票
     * @return
     */
    @GetMapping(value="/lockTicket")
    @ResponseBody
    public Map<String,Object> lockTicket(){
        System.out.println("------调用锁票业务------------");
        Map<String, Object> stringObjectMap = ticketClientService.lockTicket();
        System.out.println("------stringObjectMap------------"+stringObjectMap);
        return stringObjectMap;
    }
}
