package com.example.Webstore.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "images")
public class Image {
    @Id
    @GeneratedValue
    private int id;
    @JoinColumn(name = "shoes_id")
    @ManyToOne
    private Shoes shoes;
}
