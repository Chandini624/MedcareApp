package com.example.MedcareApp.Controller;

import com.example.MedcareApp.Entity.Doctor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/doctors")
@CrossOrigin(origins = "*")
public class DoctorController {

    @GetMapping("/test")
    public ResponseEntity<Doctor> getDoctorExample() {
        Doctor doctor = new Doctor(0, "Test Specialist", "9:00 AM - 1:00 PM", "5 slots", "300");
        return new ResponseEntity<>(doctor, HttpStatus.OK);
    }

    @GetMapping("/all")
    public List<Doctor> getAllDoctors() {
        return Arrays.asList(
                new Doctor(1, "Cardiologist", "10:00 AM - 2:00 PM", "10 slots", "500"),
                new Doctor(2, "Dermatologist", "2:00 PM - 6:00 PM", "8 slots", "400"),
                new Doctor(3, "Neurologist", "9:00 AM - 12:00 PM", "6 slots", "700")
        );
    }

    @PostMapping("/appointment")
    public ResponseEntity<String> createAppointment(@RequestBody Doctor doctor) {
        System.out.println("Creating appointment with Doctor ID: " + doctor.getDoctorId());
        return new ResponseEntity<>("Appointment created", HttpStatus.CREATED);
    }
}
