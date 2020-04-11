package com.simulator.simulatorservice.model;

import java.io.Serializable;

public class Order implements Serializable {
    private Integer order;
    private Integer destination;

    public Order() {
    }

    public Order(Integer order, Integer destination) {
        this.order = order;
        this.destination = destination;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Integer getDestination() {
        return destination;
    }

    public void setDestination(Integer destination) {
        this.destination = destination;
    }
}
