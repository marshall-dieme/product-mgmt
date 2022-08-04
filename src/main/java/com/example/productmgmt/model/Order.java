package com.example.productmgmt.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(columnDefinition = "date")
    private LocalDate date;

    private int status;

    @ManyToOne
    private Client client;
}
