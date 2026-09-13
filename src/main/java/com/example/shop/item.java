package com.example.shop;

import jakarta.persistence.*;

@Entity
public class item {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(nullable = false , unique = true)
    public String title;
    @Column(nullable = false)
    public Integer price;

}
