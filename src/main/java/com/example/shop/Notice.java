package com.example.shop;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@ToString
public class Notice {
    @Id
    public Long id;

    public String title;
    public LocalDate date;


}
