package com.example.productmgmt.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(columnDefinition = "date")
    private LocalDate date;

    private int quantity;

    @ManyToMany
    private List<Product> product;

    @ManyToOne
    private User user;

}
