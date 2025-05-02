package com.example.MedcareApp.Controller;


import com.example.MedcareApp.Entity.Appointment;
import com.example.MedcareApp.Interafce.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*") // Allow CORS for frontend
@RestController
@RequestMapping("/api/appointments1")
public class AppointmentController {

    @Autowired
    private AppointmentRepository repository;

    @PostMapping
    public Appointment bookAppointment(@RequestBody Appointment appointment) {
        return repository.save(appointment);
    }
    @GetMapping
    public List<Appointment> getAllAppointments() {
        return repository.findAll();
    }
   /* @PatchMapping("/{id}")
    public Appointment updateStatus(@PathVariable String id, @RequestBody Map<String, String> payload) {
        Appointment appt = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        appt.setStatus(payload.get("status"));
        return repository.save(appt);
    }*/
}
