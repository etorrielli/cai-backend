package com.ekeepoit.cai.model;

import org.springframework.data.annotation.Id;

public class TopStates {

    @Id
    private String State;
    private Integer total;

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
