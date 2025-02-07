package net.javaguides.springboot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import net.javaguides.springboot.Entity.User;
import net.javaguides.springboot.Service.UserService;



@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    // standard constructors
    @Autowired
    private  UserService userService;
    
    
    
    
    @PostMapping("/users")
    public  User addUser(@RequestBody User user)
    {
    	return userService.addUser(user);
    }
    
    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/getUserById/{id}")
    public User getUserById(@PathVariable Long id)
    {
    	return userService.getUserById(id);
    }

    
}