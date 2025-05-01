package com.example.MedcareApp.Entity;

import java.util.Objects;

public class Ambulence {

    private int abulenceNo;
    private String hospitalName;
    private String patAddress;
    private String hospitalAddress;
    private  String mobileNo;
    private  String pagtEmail;

    public Ambulence(int abulenceNo, String hospitalName, String patAddress, String hospitalAddress, String mobileNo, String pagtEmail) {
        this.abulenceNo = abulenceNo;
        this.hospitalName = hospitalName;
        this.patAddress = patAddress;
        this.hospitalAddress = hospitalAddress;
        this.mobileNo = mobileNo;
        this.pagtEmail = pagtEmail;
    }

    public Ambulence() {

    }

    public void setAbulenceNo(int abulenceNo) {
        this.abulenceNo = abulenceNo;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public void setPatAddress(String patAddress) {
        this.patAddress = patAddress;
    }

    public void setHospitalAddress(String hospitalAddress) {
        this.hospitalAddress = hospitalAddress;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public void setPagtEmail(String pagtEmail) {
        this.pagtEmail = pagtEmail;
    }

    public int getAbulenceNo() {
        return abulenceNo;
    }

    public String getPatAddress() {
        return patAddress;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public String getHospitalAddress() {
        return hospitalAddress;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public String getPagtEmail() {
        return pagtEmail;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Ambulence ambulence = (Ambulence) o;
        return abulenceNo == ambulence.abulenceNo && Objects.equals(hospitalName, ambulence.hospitalName) && Objects.equals(patAddress, ambulence.patAddress) && Objects.equals(hospitalAddress, ambulence.hospitalAddress) && Objects.equals(mobileNo, ambulence.mobileNo) && Objects.equals(pagtEmail, ambulence.pagtEmail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(abulenceNo, hospitalName, patAddress, hospitalAddress, mobileNo, pagtEmail);
    }
}
