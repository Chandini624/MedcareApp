package com.example.MedcareApp.signup;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "database_sequences")
public class user {

    private String FullName;
    private char EmailAddress;
    private int phoneNumber;
    private char password ;
    private char confirmPassword;

    public void setConfirmPassword(char confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public void setEmailAddress(char emailAddress) {
        EmailAddress = emailAddress;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public void setPassword(char password) {
        this.password = password;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public char getConfirmPassword() {
        return confirmPassword;
    }

    public char getEmailAddress() {
        return EmailAddress;
    }

    public String getFullName() {
        return FullName;
    }

    public char getPassword() {
        return password;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public user() {

    }

    public user(char confirmPassword, char emailAddress, String fullName, char password, int phoneNumber) {
        this.confirmPassword = confirmPassword;
        EmailAddress = emailAddress;
        FullName = fullName;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }


}



