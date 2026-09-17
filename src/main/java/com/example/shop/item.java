package com.example.shop;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@ToString
@Getter
@Setter
public class Item {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false , unique = true, columnDefinition = "Text")
    private String title;
    @Column(nullable = false)
    private Integer price;
}
