package com.example.firststructure.models;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "users")
public class User implements Serializable {
    @Id
    @GeneratedValue
    @Column(name =  "id", nullable = false, length = 100)
    Long id;
    @Column(name = "first_name", nullable = false, length = 100)
    String firstName;
    @Column(name = "last_name", nullable = false, length = 100)
    String lastName;
    @Column(name = "user_name", nullable = false, length = 100)
    String userName;
    @Column(name = "password", nullable = false, length = 100)
    String password;
    @Column(name = "phone", nullable = false, length = 100)
    String phone;
    @Column(name = "social_network", nullable = false, length = 100)
    String socialNetwork;

    //Constructor
    public User(String firstName, String lastName, String userName, String password, String phone, String socialNetwork) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.phone = phone;
        this.socialNetwork = socialNetwork;
    }

    //Encapsulamento
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSocialNetwork() {
        return socialNetwork;
    }

    public void setSocialNetwork(String socialNetwork) {
        this.socialNetwork = socialNetwork;
    }
}
