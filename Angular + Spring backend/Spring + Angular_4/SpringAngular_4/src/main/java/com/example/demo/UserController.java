package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
public class UserController 
{

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public List<my_user> getUsers() 
    {
        return (List<my_user>) userRepository.findAll();
    }

    @PostMapping("/users")
    void addUser(@RequestBody my_user user) {
        userRepository.save(user);
    }
    
}
