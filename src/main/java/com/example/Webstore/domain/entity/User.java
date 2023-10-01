package com.example.Webstore.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private String fullName;
    private String password;
    private String email;
    private String city;
    private String country;
    private double phoneNumber;
}
