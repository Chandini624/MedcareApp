package com.example.MedcareApp.Controller;

import com.example.MedcareApp.Entity.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/operations")
@CrossOrigin(origins = "*")
public class OperationController {

    // Return a test operation
    @GetMapping("/test")
    public ResponseEntity<Operation> getTestOperation() {
        Operation op = new Operation();
        op.setOperationDate(20250424);
        op.setOperationTheatre("Theatre A");
        op.setAssignDoctor("Dr. Sam");
        op.setOperationPatientId("P123");
        op.setOperationDuration(90);

        return new ResponseEntity<>(op, HttpStatus.OK);
    }

    // Return a list of hardcoded operations
    @GetMapping("/all")
    public List<Operation> getAllOperations() {
        Operation op1 = new Operation();
        op1.setOperationDate(20250424);
        op1.setOperationTheatre("Theatre A");
        op1.setAssignDoctor("Dr. Smith");
        op1.setOperationPatientId("P123");
        op1.setOperationDuration(90);

        Operation op2 = new Operation();
        op2.setOperationDate(20250425);
        op2.setOperationTheatre("Theatre B");
        op2.setAssignDoctor("Dr. Jones");
        op2.setOperationPatientId("P456");
        op2.setOperationDuration(120);

        return Arrays.asList(op1, op2);
    }

    // Receive and log a new operation
    @PostMapping("/create")
    public ResponseEntity<String> createOperation(@RequestBody Operation operation) {
        System.out.println("Received operation for patient ID: " + operation.getOperationPatientId());
        System.out.println("Type: " + operation.getOperationType());
        return new ResponseEntity<>("Operation scheduled successfully", HttpStatus.CREATED);
    }
}
