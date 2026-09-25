package com.example.shop;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Scheduled {
    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private LocalDateTime createAt;





}
