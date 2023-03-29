package com.example.firststructure.Controllers;

import com.example.firststructure.models.User;
import com.example.firststructure.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/{id}")
    public Optional<User> getUser(@PathVariable("id") Long id){
        return userService.getUserById(id);
    }

    @PostMapping("/user")
    public User saveUser(@RequestBody User user) {
        System.out.println(user);
        return userService.saveUser(user);
    }
    @PutMapping("/user")
    public User updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }
    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable("id") Long id) {
        try {
            userService.deleteUser(id);
            return "User with ID: " + id + " has been deleted!";
        } catch (Exception ex) {
            return ex.getMessage();
        }

    }
}
