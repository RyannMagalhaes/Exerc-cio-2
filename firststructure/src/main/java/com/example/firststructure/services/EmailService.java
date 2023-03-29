package com.example.firststructure.services;

import com.example.firststructure.repositories.EmailRepository;
import com.example.firststructure.models.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class EmailService {
    @Autowired
    private EmailRepository emailRepository;

    public List<Email> getAllEmail() {
        return emailRepository.findAll();
    }
    public Optional<Email> getEmailById(Long id) {
        return emailRepository.findById(id);
    }
    public Email saveEmail(Email email) {
        return emailRepository.save(email);
    }
    public Email updateEmail(Email email) {
        var dbPerson = getEmailById(email.getId());
        if( dbPerson != null && !dbPerson.isEmpty()) {
            return emailRepository.save(email);
        }
        return null;
    }
    public void deleteEmail(Long id) {
        var dbPerson = getEmailById(id);
        if( dbPerson != null && !dbPerson.isEmpty()) {
            emailRepository.deleteById(id);
        }
    }

}
