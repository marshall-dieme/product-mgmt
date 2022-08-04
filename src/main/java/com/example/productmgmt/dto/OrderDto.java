package com.example.productmgmt.dto;

import com.example.productmgmt.model.Client;

import java.time.LocalDate;


public class OrderDto extends AbstractDto<Long> {

    private String date;
    private int status;
    private ClientDto client;

    public OrderDto() {
    }


    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return this.date;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return this.status;
    }

    public void setClient(ClientDto client) {
        this.client = client;
    }

    public ClientDto getClient() {
        return this.client;
    }
}