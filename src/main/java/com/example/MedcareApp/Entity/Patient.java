package com.example.MedcareApp.Entity;
import java.util.Objects;
public class Patient {
    private String patientId;
    private String patientName;
    private String patientEmailId;
    private String patientmobileNo;
    private String patientAddress;
    private String patientPrescription;
    private String patientAppointmentdate;
    private String patientAdmitdate;
    private String patientWardnum;
    private String patientDischargedate;
    private String patientNurseassign;


    public Patient(String patientAddress, String patientAdmitdate, String patientAppointmentdate, String patientDischargedate, String patientEmailId, String patientId, String patientmobileNo, String patientName, String patientNurseassign, String patientPrescription, String patientWardnum) {
        this.patientAddress = patientAddress;
        this.patientAdmitdate = patientAdmitdate;
        this.patientAppointmentdate = patientAppointmentdate;
        this.patientDischargedate = patientDischargedate;
        this.patientEmailId = patientEmailId;
        this.patientId = patientId;
        this.patientmobileNo = patientmobileNo;
        this.patientName = patientName;
        this.patientNurseassign = patientNurseassign;
        this.patientPrescription = patientPrescription;
        this.patientWardnum = patientWardnum;
    }

    public Patient()
    {
     }

    public void setPatientAddress(String patientAddress) {
        this.patientAddress = patientAddress;
    }

    public void setPatientAdmitdate(String patientAdmitdate) {
        this.patientAdmitdate = patientAdmitdate;
    }

    public void setPatientAppointmentdate(String patientAppointmentdate) {
        this.patientAppointmentdate = patientAppointmentdate;
    }

    public void setPatientDischargedate(String patientDischargedate) {
        this.patientDischargedate = patientDischargedate;
    }

    public void setPatientEmailId(String patientEmailId) {
        this.patientEmailId = patientEmailId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public void setPatientmobileNo(String patientmobileNo) {
        this.patientmobileNo = patientmobileNo;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setPatientNurseassign(String patientNurseassign) {
        this.patientNurseassign = patientNurseassign;
    }

    public void setPatientPrescription(String patientPrescription) {
        this.patientPrescription = patientPrescription;
    }

    public void setPatientWardnum(String patientWardnum) {
        this.patientWardnum = patientWardnum;
    }

    public String getPatientAddress() {
        return patientAddress;
    }

    public String getPatientAdmitdate() {
        return patientAdmitdate;
    }

    public String getPatientAppointmentdate() {
        return patientAppointmentdate;
    }

    public String getPatientDischargedate() {
        return patientDischargedate;
    }

    public String getPatientEmailId() {
        return patientEmailId;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getPatientmobileNo() {
        return patientmobileNo;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getPatientNurseassign() {
        return patientNurseassign;
    }

    public String getPatientPrescription() {
        return patientPrescription;
    }

    public String getPatientWardnum() {
        return patientWardnum;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return Objects.equals(patientId, patient.patientId) && Objects.equals(patientName, patient.patientName) && Objects.equals(patientEmailId, patient.patientEmailId) && Objects.equals(patientmobileNo, patient.patientmobileNo) && Objects.equals(patientAddress, patient.patientAddress) && Objects.equals(patientPrescription, patient.patientPrescription) && Objects.equals(patientAppointmentdate, patient.patientAppointmentdate) && Objects.equals(patientAdmitdate, patient.patientAdmitdate) && Objects.equals(patientWardnum, patient.patientWardnum) && Objects.equals(patientDischargedate, patient.patientDischargedate) && Objects.equals(patientNurseassign, patient.patientNurseassign);
    }

    @Override
    public int hashCode() {
        return Objects.hash(patientId, patientName, patientEmailId, patientmobileNo, patientAddress, patientPrescription, patientAppointmentdate, patientAdmitdate, patientWardnum, patientDischargedate, patientNurseassign);
    }
}








