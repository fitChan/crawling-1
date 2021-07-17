package com.example.crawling.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class Product{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id

    private Long id;
    @Column(nullable = false)
    private String productImg;
    @Column(nullable = false)
    private String price;
    @Column(nullable = false)
    private String country;
    @Column(nullable = false)
    private String information;
    @Column(nullable = false)
    private String productName;
    @Column(nullable = false)
    private String description;
}
