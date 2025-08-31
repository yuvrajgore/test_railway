package com.test.demo_test;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name="user_info")
public class User_info {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String name;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
