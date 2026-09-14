package com.example.shop;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Scheduled {

    @Id
    @GeneratedValue
    public Long id;

    public String title;
    public LocalDateTime scheduledAt;


}
