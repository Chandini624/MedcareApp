package com.example.MedcareApp.Controller;

import com.example.MedcareApp.Entity.AdmidtPatients;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/paitients")
@CrossOrigin(origins = "*")
public class patientController {

    @GetMapping("/all1")
    public ResponseEntity<AdmidtPatients> getAllUsers() {

        AdmidtPatients pt = new AdmidtPatients();

        return new ResponseEntity<>(pt ,HttpStatus.OK);
    }
    @GetMapping("/all")
    public List<AdmidtPatients> getAllPatients() {
        return Arrays.asList(
                new AdmidtPatients("P001", "John Doe", "john.doe@example.com", "1234567890", "123 Main St", "Prescription 1", "2025-04-22", "2025-04-20", "101", "2025-04-25", "Nurse A"),
                new AdmidtPatients("P002", "Jane Smith", "jane.smith@example.com", "0987654321", "456 Elm St", "Prescription 2", "2025-04-23", "2025-04-21", "102", "2025-04-26", "Nurse B")
        );
    }

    @PostMapping("/paitientappointment")
    public ResponseEntity<?> signup(@RequestBody AdmidtPatients Patient) {
        System.out.println("hello------");


                return new ResponseEntity<>("appointment created", HttpStatus.CONFLICT);

        }
}




