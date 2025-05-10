package com.example.MedcareApp.services;

import com.example.MedcareApp.Entity.user;
import com.example.MedcareApp.Interafce.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<user> findByUserId(String userId) {
        return userRepository.findByUserId(userId);
    }

    public user updateUser(String userId, user updatedUser) {
        List<user> existingUsers = userRepository.findByUserId(userId);

        if (!existingUsers.isEmpty()) {
            user existingUser = existingUsers.get(0);  // Use the first match
            existingUser.setPassword(updatedUser.getPassword());
            existingUser.setEmailId(updatedUser.getEmailId());
            existingUser.setMobileNo(updatedUser.getMobileNo());
            return userRepository.save(existingUser);
        } else {
            updatedUser.setUserId(userId);
            return userRepository.save(updatedUser);
        }
    }

    public user getUserByEmail(String emailId) {
        return userRepository.findByEmailId(emailId);
    }
    public void deleteUser(String userId) {
        userRepository.deleteByUserid(userId);



    }
}

