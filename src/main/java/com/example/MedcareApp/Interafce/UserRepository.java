package com.example.MedcareApp.Interafce;


import com.example.MedcareApp.Entity.user;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<user, String> {
    user findByEmailId(String emailId);
    List<user> findByUserId(String userId); // ✅ allow multiple users with same userId
    user findByPassword(String password);
    user findByMobileNo(String mobileNo);
    // Optional: find user by multiple fields
    user findByEmailIdAndPassword(String emailId, String password);
    Optional<user> findFirstByUserId(String userId);
    default void deleteByUserid(String userId) {

    }
}

