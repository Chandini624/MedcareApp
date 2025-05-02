package com.example.MedcareApp.Entity;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "appointments")
public class Appointment {
    @Id
    private String id;

    private String patientName;
    private String doctor;
    private String date;
    private String time;
    private String reason;
    private String fee;
}
