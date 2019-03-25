package com.wfd360.repository;

import com.wfd360.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created by 姿势帝-博客园 on 2019/3/25.
 * 欢迎添加笔者wx(851298348)共同探讨、学习！
 */

public interface TicketRepository  extends
        JpaRepository<Ticket, Integer>,JpaSpecificationExecutor<Ticket> {
}
