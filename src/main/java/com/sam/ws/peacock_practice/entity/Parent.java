package com.sam.ws.peacock_practice.entity;

import jakarta.persistence.*;

@Entity
@Table
public class Parent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long parentId;
    private String parentName;
    private String parentEmail;
    private String parentPhone;
    private String parentAddress;
    private String parentCity;
    private String parentState;
    private String parentCountry;
    private String parentZip;

    public Parent() {}

    public Parent(long parentId, String parentName, String parentEmail, String parentPhone, String parentAddress, String parentCity, String parentState, String parentCountry, String parentZip) {
        this.parentId = parentId;
        this.parentName = parentName;
        this.parentEmail = parentEmail;
        this.parentPhone = parentPhone;
        this.parentAddress = parentAddress;
        this.parentCity = parentCity;
        this.parentState = parentState;
        this.parentCountry = parentCountry;
        this.parentZip = parentZip;
    }

    public Parent(String parentName, String parentEmail, String parentPhone, String parentAddress, String parentCity, String parentState, String parentCountry, String parentZip) {
        this.parentName = parentName;
        this.parentEmail = parentEmail;
        this.parentPhone = parentPhone;
        this.parentAddress = parentAddress;
        this.parentCity = parentCity;
        this.parentState = parentState;
        this.parentCountry = parentCountry;
        this.parentZip = parentZip;
    }

    public long getParentId() {
        return parentId;
    }

    public void setParentId(long parentId) {
        this.parentId = parentId;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getParentEmail() {
        return parentEmail;
    }

    public void setParentEmail(String parentEmail) {
        this.parentEmail = parentEmail;
    }

    public String getParentPhone() {
        return parentPhone;
    }

    public void setParentPhone(String parentPhone) {
        this.parentPhone = parentPhone;
    }

    public String getParentAddress() {
        return parentAddress;
    }

    public void setParentAddress(String parentAddress) {
        this.parentAddress = parentAddress;
    }

    public String getParentCity() {
        return parentCity;
    }

    public void setParentCity(String parentCity) {
        this.parentCity = parentCity;
    }

    public String getParentState() {
        return parentState;
    }

    public void setParentState(String parentState) {
        this.parentState = parentState;
    }

    public String getParentCountry() {
        return parentCountry;
    }

    public void setParentCountry(String parentCountry) {
        this.parentCountry = parentCountry;
    }

    public String getParentZip() {
        return parentZip;
    }

    public void setParentZip(String parentZip) {
        this.parentZip = parentZip;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "parentId=" + parentId +
                ", parentName='" + parentName + '\'' +
                ", parentEmail='" + parentEmail + '\'' +
                ", parentPhone='" + parentPhone + '\'' +
                ", parentAddress='" + parentAddress + '\'' +
                ", parentCity='" + parentCity + '\'' +
                ", parentState='" + parentState + '\'' +
                ", parentCountry='" + parentCountry + '\'' +
                ", parentZip='" + parentZip + '\'' +
                '}';
    }
}
