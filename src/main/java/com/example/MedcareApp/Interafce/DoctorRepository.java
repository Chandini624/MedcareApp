package com.example.MedcareApp.Interafce;

import com.example.MedcareApp.Entity.Doctor;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DoctorRepository extends MongoRepository<Doctor, String> {
}