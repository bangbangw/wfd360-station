package com.wfd360.service;

import com.wfd360.model.Ticket;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * Created by 姿势帝-博客园 on 2019/3/29.
 * 欢迎添加笔者wx(851298348)共同探讨、学习！
 */

/**
 * feign客户端接口
 */
@FeignClient(value = "MICROSERVICE-TICKET") //调用的服务名称
public interface TicketClientService {
    /**
     * 根据id查询车票信息
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/ticket/get/{id}")
    public Ticket get(@PathVariable("id") Integer id);

    /**
     * 查询车票信息
     *
     * @return
     */
    @GetMapping(value = "/ticket/list")
    public List<Ticket> list();

    /**
     * 添加或者修改车票信息
     *
     * @param ticket
     * @return
     */
    @PostMapping(value = "/ticket/save")
    public boolean save(Ticket ticket);

    /**
     * 根据id删除车票信息
     *
     * @return
     */
    @GetMapping(value = "/ticket/delete/{id}")
    public boolean delete(@PathVariable("id") Integer id);
}
