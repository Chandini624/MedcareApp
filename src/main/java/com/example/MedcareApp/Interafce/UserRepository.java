package com.example.MedcareApp.Interafce;


import com.example.MedcareApp.Entity.user;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<user, String> {
    user findByEmailId(String emailId);
}
