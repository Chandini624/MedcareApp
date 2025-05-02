package com.example.MedcareApp.Interafce;



import com.example.MedcareApp.Entity.Appointment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AppointmentRepository extends MongoRepository<Appointment, String> {
}
