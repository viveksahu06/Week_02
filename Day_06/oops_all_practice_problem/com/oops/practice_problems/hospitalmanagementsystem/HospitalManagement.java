package com.oops.practice_problems.hospitalmanagementsystem;


import java.util.ArrayList;
import java.util.List;

public class HospitalManagement {
    public static void main(String[] args) {
        //  creating objects of inpatient and outpatient
        Patient inPatient = new InPatient(1, "Vivek", 43, 5000, 2000);
        Patient outPatient = new OutPatient(2, "Pratham", 33, 500, 300);

        // Adding Medical Records
        if (inPatient instanceof MedicalRecord) {
            ((MedicalRecord) inPatient).addRecord("Admitted for surgery.");
            ((MedicalRecord) inPatient).addRecord("Discharged after 5 days.");
        }

        if (outPatient instanceof MedicalRecord) {
            ((MedicalRecord) outPatient).addRecord("Consulted for fever.");
            ((MedicalRecord) outPatient).addRecord("Prescribed medicines.");
        }

        // List of Patients
        List<Patient> patients = new ArrayList<>();
        patients.add(inPatient);
        patients.add(outPatient);

        // Displaying Patient Details and Billing
        for (Patient patient : patients) {
            patient.getPatientDetails();
            System.out.println("Total Bill: " + patient.calculateBill());

            if (patient instanceof MedicalRecord) {
                System.out.println("Medical History:");
                System.out.println(((MedicalRecord) patient).viewRecords());
            }
            System.out.println("*************************************************************");
        }
    }
}

