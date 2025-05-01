package com.example.MedcareApp.Entity;

public class Doctor {

    private int doctorId;
    private String doctorSpecialistName;
    private String doctorAvailabletime;
    private String doctorslot;
    private String doctorfee;

    // No-argument constructor
    public Doctor() {
    }

    // All-argument constructor (matches usage in controller)
    public Doctor(int doctorId, String doctorSpecialistName, String doctorAvailabletime, String doctorslot, String doctorfee) {
        this.doctorId = doctorId;
        this.doctorSpecialistName = doctorSpecialistName;
        this.doctorAvailabletime = doctorAvailabletime;
        this.doctorslot = doctorslot;
        this.doctorfee = doctorfee;
    }

    // Getters and setters
    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorSpecialistName() {
        return doctorSpecialistName;
    }

    public void setDoctorSpecialistName(String doctorSpecialistName) {
        this.doctorSpecialistName = doctorSpecialistName;
    }

    public String getDoctorAvailabletime() {
        return doctorAvailabletime;
    }

    public void setDoctorAvailabletime(String doctorAvailabletime) {
        this.doctorAvailabletime = doctorAvailabletime;
    }

    public String getDoctorslot() {
        return doctorslot;
    }

    public void setDoctorslot(String doctorslot) {
        this.doctorslot = doctorslot;
    }

    public String getDoctorfee() {
        return doctorfee;
    }

    public void setDoctorfee(String doctorfee) {
        this.doctorfee = doctorfee;
    }
}
