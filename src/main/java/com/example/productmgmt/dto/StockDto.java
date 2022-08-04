package com.example.productmgmt.dto;


import java.time.LocalDate;
import java.util.List;

public class StockDto extends AbstractDto<Long> {

    private LocalDate date;
    private int quantity;
    private List<ProductDto> product;

    public StockDto() {
    }



    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public List<ProductDto> getProduct() {
        return product;
    }

    public void setProduct(List<ProductDto> product) {
        this.product = product;
    }
}