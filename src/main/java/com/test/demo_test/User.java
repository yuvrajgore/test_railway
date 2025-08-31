package com.test.demo_test;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    private String name;
}
