package com.HVPO.HVPO.model;

import jakarta.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class principal {
    @Id
    private Integer schoolId;
    private String schoolAddress;
    private String schoolCity;
    private String principalName;
    private Integer principalId;
    private String schoolName;
    private String principalPassword;
    private String schoolEmail;
    private String SchoolNumber;

    public principal(String schoolName, String schoolAddress, String schoolCity, String principalName, Integer principalId, Integer schoolId, String principalPassword, String schoolEmail, String schoolNumber) {
        this.schoolName = schoolName;
        this.schoolAddress = schoolAddress;
        this.schoolCity = schoolCity;
        this.principalName = principalName;
        this.principalId = principalId;
        this.schoolId = schoolId;
        this.principalPassword = principalPassword;
        this.schoolEmail = schoolEmail;
        this.SchoolNumber = schoolNumber;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolAddress() {
        return schoolAddress;
    }

    public void setSchoolAddress(String schoolAddress) {
        this.schoolAddress = schoolAddress;
    }

    public String getSchoolCity() {
        return schoolCity;
    }

    public void setSchoolCity(String schoolCity) {
        this.schoolCity = schoolCity;
    }

    public String getPrincipalName() {
        return principalName;
    }

    public void setPrincipalName(String principalName) {
        this.principalName = principalName;
    }

    public int getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(int principalId) {
        this.principalId = principalId;
    }

    public int getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
    }

    public String getPrincipalPassword() {
        return principalPassword;
    }

    public void setPrincipalPassword(String principalPassword) {
        this.principalPassword = principalPassword;
    }

    public String getSchoolEmail() {
        return schoolEmail;
    }

    public void setSchoolEmail(String schoolEmail) {
        this.schoolEmail = schoolEmail;
    }

    public String getSchoolNumber() {
        return SchoolNumber;
    }

    public void setSchoolNumber(String schoolNumber) {
        SchoolNumber = schoolNumber;
    }
}
