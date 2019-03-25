package com.wfd360.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by admin on 2019/3/25.
 */
@Entity
@Table(name="t_ticket")
public class Ticket implements Serializable {
    /**
     *序列号
     */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private Integer id;
    /**
     * 出发车站
     */
    @Column
    private String startStation;
    /**
     * 到达车站
     */
    @Column
    private String stopStation;
    /**
     * 票价
     */
    @Column
    private Integer price;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStartStation() {
        return startStation;
    }

    public void setStartStation(String startStation) {
        this.startStation = startStation;
    }

    public String getStopStation() {
        return stopStation;
    }

    public void setStopStation(String stopStation) {
        this.stopStation = stopStation;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
