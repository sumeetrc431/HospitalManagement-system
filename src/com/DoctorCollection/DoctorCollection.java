package com.DoctorCollection;

import com.schema.Doctor;
import java.util.ArrayList;
import java.util.Iterator;

public class DoctorCollection {

    ArrayList<Doctor> doc = new ArrayList<>();
    int id = 1;

    public void addDoctor(String fname, String lname, String spec) {
        doc.add(new Doctor(id, fname, lname, spec));
        System.out.println("Doctor details successfully added with ID: " + id);
        id++;
    }

    public void displayDoctor(String name) {

        if (doc.size() == 0) {
            System.out.println("List is empty");
            return;
        }

        boolean found = false;
        System.out.println("DOCID\tFNAME\tLNAME\tSPECIALISATION");

        for (Doctor d : doc) {
            if (d.getFirtName().equalsIgnoreCase(name)) {
                System.out.println(d.getDoctorId() + "\t" +
                        d.getFirtName() + "\t" +
                        d.getLastName() + "\t" +
                        d.getSpecialistaion());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No doctor found with that name.");
        }
    }

    public void displayAllDoctors(){
        if (doc.size() == 0) {
            System.out.println("List is empty");
        }else {
            System.out.println("DOCID\tFNAME\tLNAME\tSPECIALISATION");
            for (Doctor d : doc) {
                System.out.println(d.getDoctorId() + "\t" +
                        d.getFirtName() + "\t" +
                        d.getLastName() + "\t" +
                        d.getSpecialistaion());
            }
        }
    }

    public void displayBySpecialization(String spec) {

        if (doc.size() == 0) {
            System.out.println("List is empty");
            return;
        }

        boolean found = false;
        System.out.println("DOCID\tFNAME\tLNAME\tSPECIALISATION");

        for (Doctor d : doc) {
            if (d.getSpecialistaion().equalsIgnoreCase(spec)) {
                System.out.println(d.getDoctorId() + "\t" +
                        d.getFirtName() + "\t" +
                        d.getLastName() + "\t" +
                        d.getSpecialistaion());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No doctor found for this specialization.");
        }
    }

    public void modifyDoctorByName(int id, String name, String lname, String spc) {

        boolean found = false;

        for (Doctor d : doc) {
            if (d.getFirtName().equals(name)) {
                d.setDoctorId(id);
                d.setFirstName(name);
                d.setLastName(lname);
                d.setSpecialistaion(spc);
                System.out.println("Doctor modified successfully.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Doctor name not found.");
        }
    }

    public void deleteDoctor(int id) {

        if (doc.size() == 0) {
            System.out.println("List is empty");
            return;
        }

        Iterator<Doctor> it = doc.iterator();
        boolean found = false;

        while (it.hasNext()) {
            Doctor d = it.next();
            if (d.getDoctorId() == id) {
                it.remove();
                System.out.println("Doctor removed successfully.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Doctor ID not found.");
        }
    }
}
