package com.example.productmgmt.model;

import javax.persistence.*;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String fullName;

    @Column(length = 100, unique = true)
    private String email;

    @Column(length = 20, unique = true)
    private String tel;
}
