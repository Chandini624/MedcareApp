package com.example.MedcareApp.services;


import com.example.MedcareApp.Entity.user;
import com.example.MedcareApp.Interafce.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public user createUser(user newUser) {
        return userRepository.save(newUser);
    }

    public List<user> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<user> getUserById(String userId) {
        return userRepository.findById(userId);
    }

    public user updateUser(String userId, user updatedUser) {
        return userRepository.findById(userId).map(existingUser -> {
            existingUser.setPassword(updatedUser.getPassword());
            existingUser.setEmailId(updatedUser.getEmailId());
            existingUser.setMobileNo(updatedUser.getMobileNo());
            return userRepository.save(existingUser);
        }).orElse(null);
    }

    public boolean deleteUser(String userId) {
        if (userRepository.existsById(userId)) {
            userRepository.deleteById(userId);
            return true;
        }
        return false;
    }
    // ✅ This method supports login by email lookup
    public user getUserByEmail(String emailId) {
        return userRepository.findByEmailId(emailId);
    }
}
