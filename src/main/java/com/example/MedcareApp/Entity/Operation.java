package com.example.MedcareApp.Entity;

import java.util.Objects;

public class Operation {
    private int operationDate;
    private String operationTheatre;
    private String assignDoctor;
    private String operationPatientId;
    private int operationDuration;
    private OperationType operationType;


    public enum OperationType {
        SURGERY,
        DIAGNOSTIC,
        EMERGENCY,
        ELECTIVE,
        TRANSPLANT,
        ORTHOPEDIC,
        CARDIAC,
        NEUROSURGERY,
        OBSTETRIC,
        GYNECOLOGICAL,
        UROLOGICAL,
        KIDNEY // Fixed case
    }

    public void setAssignDoctor(String assignDoctor) {
        this.assignDoctor = assignDoctor;
    }

    public void setOperationDate(int operationDate) {
        this.operationDate = operationDate;
    }

    public void setOperationDuration(int operationDuration) {
        this.operationDuration = operationDuration;
    }

    public void setOperationPatientId(String operationPatientId) {
        this.operationPatientId = operationPatientId;
    }

    public void setOperationTheatre(String operationTheatre) {
        this.operationTheatre = operationTheatre;
    }

    public void setOperationType(OperationType operationType) {
        this.operationType = operationType;
    }


    public String getAssignDoctor() {
        return assignDoctor;
    }

    public int getOperationDate() {
        return operationDate;
    }

    public int getOperationDuration() {
        return operationDuration;
    }

    public String getOperationPatientId() {
        return operationPatientId;
    }

    public String getOperationTheatre() {
        return operationTheatre;
    }

    public OperationType getOperationType() {
        return operationType;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Operation operation = (Operation) o;
        return operationDate == operation.operationDate && operationDuration == operation.operationDuration && Objects.equals(operationTheatre, operation.operationTheatre) && Objects.equals(assignDoctor, operation.assignDoctor) && Objects.equals(operationPatientId, operation.operationPatientId) && operationType == operation.operationType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(operationDate, operationTheatre, assignDoctor, operationPatientId, operationDuration, operationType);
    }
}


