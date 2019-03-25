package com.wfd360.service;

import com.wfd360.model.Ticket;

import java.util.List;

/**
 * Created by 姿势帝-博客园 on 2019/3/25.
 * 欢迎添加笔者wx(851298348)共同探讨、学习！
 */

public interface TicketService {
    /**
     * 添加或者修改车票信息
     * @param student
     */
    public void save(Ticket student);

    /**
     * 根据id查找车票信息
     * @param id
     * @return
     */
    public Ticket findById(Integer id);

    /**
     * 查询车票信息
     * @return
     */
    public List<Ticket> list();

    /**
     * 根据id删除车票信息
     * @param id
     */
    public void delete(Integer id);
}
