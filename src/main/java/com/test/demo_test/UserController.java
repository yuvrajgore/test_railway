package com.test.demo_test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("user")
@RestController
public class UserController {

    @Autowired
    private UserServiceImpl userService;
    @GetMapping("/all")
    public ResponseEntity<List<User_info>> getAllUser() {
        return ResponseEntity.ok(userService.getAll());
    }
    @PostMapping
    public ResponseEntity<User_info> saveUser(@RequestBody User_info user) {
        return ResponseEntity.ok(userService.addUser(user));
    }

}
