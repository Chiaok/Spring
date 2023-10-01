package com.example.Webstore.domain.entity;

import jakarta.persistence.*;
import jdk.jfr.Name;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "orders")
public class Order{
    @GeneratedValue
    @Id
    private int id;
    @ManyToOne
    @JoinColumn(name = "shoes_id")
    private Shoes shoes;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private  User user;
    @Column(name = "time_of_order")
    @CreatedDate
    private LocalDateTime orderTime;


}
