package com.example.productmgmt.dto;

import java.time.LocalDateTime;

public class AbstractDto<E> {

    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}