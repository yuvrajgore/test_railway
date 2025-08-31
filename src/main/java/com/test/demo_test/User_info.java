package com.test.demo_test;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name="user_info")
public class User_info {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    private String name;
}
