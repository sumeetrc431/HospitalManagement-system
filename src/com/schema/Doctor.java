package com.schema;


public class Doctor {

    public Doctor() {

    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getFirtName() {
        return firstName;
    }

    public void setFirstName(String firtName) {
        this.firstName = firtName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSpecialistaion() {
        return specialistaion;
    }

    public void setSpecialistaion(String specialistaion) {
        this.specialistaion = specialistaion;
    }

    private int doctorId;
   private String firstName;
   private String lastName;
   private String specialistaion;

    public Doctor(int doctorId,String firtName, String lasteName, String specialistaion) {
        this.doctorId = doctorId;
        this.firstName = firtName;
        this.lastName = lasteName;
        this.specialistaion = specialistaion;
    }
}
