package com.sample.model;

public class Employee {

    private String employeeId;
    private String firstname;
    private String lastname;
    private boolean accademic;
    private String designation;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public boolean isAccademic() {
        return accademic;
    }

    public void setAccademic(boolean accademic) {
        this.accademic = accademic;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
