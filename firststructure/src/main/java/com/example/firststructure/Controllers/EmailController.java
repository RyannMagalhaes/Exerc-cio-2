package com.example.firststructure.Controllers;

import com.example.firststructure.services.EmailService;
import com.example.firststructure.models.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1")
public class EmailController {

    @Autowired
    private EmailService emailService;

    @GetMapping("email")
    public List<Email> getAllEmail(){
        return emailService.getAllEmail();
    }
    @GetMapping("email/{id}")
    public Optional<Email> getUser(@PathVariable("id") Long id){
        return emailService.getEmailById(id);
    }

    @PostMapping("email")
    public Email saveUser(@RequestBody Email email) {
        return emailService.saveEmail(email);
    }
    @PutMapping("email")
    public Email updateEmail(@RequestBody Email email) {
        return emailService.updateEmail(email);
    }
    @DeleteMapping("email{id}")
    public String deleteUser(@PathVariable("id") Long id) {
        try {
            emailService.deleteEmail(id);
            return "User with ID: " + id + " has been deleted!";
        } catch (Exception ex) {
            return ex.getMessage();
        }

    }

}
