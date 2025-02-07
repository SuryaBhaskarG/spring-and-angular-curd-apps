package net.javaguides.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import net.javaguides.springboot.model.User;
import net.javaguides.springboot.service.UserService;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class ClientController 
{

    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public String adduser(@RequestBody User user){
        userService.addUser(user);
        return "User Added Successfully...";
    }

    @GetMapping("/users")
    public List<User> getUsers(){
        System.out.println("Users..");
        return userService.getUser();
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") int id){
        return userService.getUserByid(id);
    }

    @PutMapping("/update/{id}")
    public String updateUser(@PathVariable("id") int id, @RequestBody User user){
        userService.updateUser(id, user);
        return "User Updated Successfully...";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") int id){
        userService.deleteUser(id);
        return "User Deleted Successfully...";
    }

}

