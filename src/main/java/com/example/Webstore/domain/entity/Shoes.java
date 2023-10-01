package com.example.Webstore.domain.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

@Data
@Entity
@Table(name = "shoes")
public class Shoes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double price;
    private String name;
    private String image;
    @Column(columnDefinition = "TEXT")
    private String description;
    private String brand;
    private  int size;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
