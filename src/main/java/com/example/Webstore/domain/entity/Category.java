package com.example.Webstore.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private  String categoryName;
    @OneToMany(mappedBy = "category")
    private List<Shoes> shoes;
}
