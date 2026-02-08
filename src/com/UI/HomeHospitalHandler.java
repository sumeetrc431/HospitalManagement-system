package com.UI;

import com.DoctorCollection.DoctorCollection;

import java.util.Scanner;

public class HomeHospitalHandler {

    public static void returnHospitalHandler(){
        DoctorCollection dc = new DoctorCollection();
        Scanner sc = new Scanner(System.in);

        try {
            while (true) {

                System.out.println("-----------HOME HOSPITAL-------------");
                System.out.println("1. Add doctor");
                System.out.println("2. Display doctors by name");
                System.out.println("3. Display doctors by specialization");
                System.out.println("4. Delete doctor by ID");
                System.out.println("5. Update the doctor details");
                System.out.println("6. Display all current doctors");
                System.out.println("7. Exit");
                System.out.print("Enter your preference: ");
                int ch = sc.nextInt();

                switch (ch) {
                    case 1 -> {
                        System.out.print("Enter firstname: ");
                        String fn = sc.next();
                        System.out.print("Enter lastname: ");
                        String ln = sc.next();
                        System.out.print("Enter specialization: ");
                        String sp = sc.next();
                        dc.addDoctor(fn, ln, sp);
                    }
                    case 2 -> {
                        System.out.print("Enter doctor name: ");
                        String name = sc.next();
                        dc.displayDoctor(name);
                    }
                    case 3 -> {
                        System.out.print("Enter specialization: ");
                        String spc = sc.next();
                        dc.displayBySpecialization(spc);
                    }
                    case 4 -> {
                        System.out.print("Enter doctor ID to remove: ");
                        int dId = sc.nextInt();
                        dc.deleteDoctor(dId);
                    }
                    case 5 -> {
                        System.out.println("Enter the doctorName you want to modify: ");
                        String newName = sc.next();
                        System.out.println("Enter the lastName: ");
                        String newLname = sc.next();
                        System.out.println("Enter the newId for the doctor: ");
                        int newId = sc.nextInt();
                        System.out.println("Enter the specialization");
                        String nSpl = sc.next();
                        dc.modifyDoctorByName(newId, newName, newLname, nSpl);
                    }
                    case 6 -> {
                        System.out.println("Below are the current doctors: ");
                        dc.displayAllDoctors();
                    }
                    case 7 -> {
                        System.out.println("Exiting application...");
                        return;
                    }
                    default -> System.out.println("Invalid choice. Try again.");
                }
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please try again.");
        }
    }

}
