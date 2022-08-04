package com.example.productmgmt.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 50, unique = true)
    private String productNumber;

    @Column(length = 50, unique = true)
    private String name;

    @Column(columnDefinition = "text")
    private String description;

    private double price;

    private int quantity;

    @ManyToMany
    private List<Stock> stocks;

    @ManyToMany
    private List<Order> orders;
}
