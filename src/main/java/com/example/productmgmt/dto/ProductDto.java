package com.example.productmgmt.dto;

import java.util.List;


public class ProductDto extends AbstractDto<Long> {

    private String productNumber;

    private String name;

    private String description;
    private double price;
    private int quantity;
    private List<StockDto> stocks;
    private List<OrderDto> orders;

    public ProductDto() {
    }


    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    public String getProductNumber() {
        return this.productNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public List<StockDto> getStocks() {
        return stocks;
    }

    public void setStocks(List<StockDto> stocks) {
        this.stocks = stocks;
    }

    public List<OrderDto> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderDto> orders) {
        this.orders = orders;
    }
}