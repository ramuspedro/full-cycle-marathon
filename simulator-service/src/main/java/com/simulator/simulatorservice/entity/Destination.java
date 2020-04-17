package com.simulator.simulatorservice.entity;

import java.io.Serializable;

public class Destination implements Serializable {
    private Integer order;
    private String lat;
    private String lng;

    public Destination() {
    }

    public Destination(Integer order, String lat, String lng) {
        this.order = order;
        this.lat = lat;
        this.lng = lng;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }
}
