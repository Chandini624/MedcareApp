package com.example.MedcareApp.Interafce;

import com.example.MedcareApp.Entity.AdmitPatients;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdmitPatientsRepository extends MongoRepository<AdmitPatients, String> {
    // Custom query methods can be added here if needed

    // Example: Find a patient by their patientId
    AdmitPatients findByPatientId(String patientId);

    // Example: Find all patients assigned to a specific nurse
    List<AdmitPatients> findByPatientNurseAssign(String nurseName);
}

