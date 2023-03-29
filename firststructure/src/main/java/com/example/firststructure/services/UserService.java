package com.example.firststructure.services;

import com.example.firststructure.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.firststructure.repositories.UserRepository;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUser() {
        return userRepository.findAll();
    }
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }
    public User saveUser(User user) {
        return userRepository.save(user);
    }
    public User updateUser(User user) {
            return userRepository.save(user);

    }
    public void deleteUser(Long id) {
        var dbPerson = getUserById(id);
        if( dbPerson != null && !dbPerson.isEmpty()) {
            userRepository.deleteById(id);
        }
    }
}
