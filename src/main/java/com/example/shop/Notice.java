package com.example.shop;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@ToString
@Getter
@Setter
public class Notice {
    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private LocalDate date;


}
