package com.wfd360.controller;

import com.wfd360.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

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
    private RestTemplate restTemplate;

    /**
     * 添加或者修改车票信息
     *
     * @param ticket
     * @return
     */
    @PostMapping(value = "/save")
    @ResponseBody
    public boolean save(Ticket ticket) {
        System.out.println("======su=====save=========");
        return restTemplate.postForObject("http://localhost:1001/ticket/save", ticket, Boolean.class);
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
        return restTemplate.getForObject("http://localhost:1001/ticket/list", List.class);
    }

    /**
     * 根据id查询车票信息
     *
     * @return
     */
    @GetMapping(value = "/get/{id}")
    @ResponseBody
    public Ticket get(@PathVariable("id") Integer id) {
        return restTemplate.getForObject("http://localhost:1001/ticket/get/" + id, Ticket.class);
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
            restTemplate.getForObject("http://localhost:1001/ticket/delete/" + id, Boolean.class);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
