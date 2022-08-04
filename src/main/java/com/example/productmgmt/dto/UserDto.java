package com.example.productmgmt.dto;


import java.util.List;

public class UserDto extends AbstractDto<Long> {

    private String username;
    private String password;
    private List<StockDto> stocks;

    public UserDto() {
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<StockDto> getStocks() {
        return stocks;
    }

    public void setStocks(List<StockDto> stocks) {
        this.stocks = stocks;
    }
}