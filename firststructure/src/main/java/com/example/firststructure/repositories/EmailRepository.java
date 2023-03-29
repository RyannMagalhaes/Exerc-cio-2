package com.example.firststructure.repositories;

import com.example.firststructure.models.Email;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<Email, Long> {

}
