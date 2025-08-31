package com.test.demo_test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl {

    @Autowired
    private UserRepo userRepo;

    public User_info addUser(User_info user) {
        return userRepo.save(user);
    }

    public List<User_info> getAll() {
        return userRepo.findAll();
    }
}
