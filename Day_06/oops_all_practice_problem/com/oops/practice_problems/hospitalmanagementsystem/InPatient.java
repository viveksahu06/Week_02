package com.oops.practice_problems.hospitalmanagementsystem;
class InPatient extends Patient implements MedicalRecord {
    private double roomCharges;
    private double treatmentCharges;
    private String medicalHistory = "";

    // Constructor
    public InPatient(int patientId, String name, int age, double roomCharges, double treatmentCharges) {
        super(patientId, name, age);
        this.roomCharges = roomCharges;
        this.treatmentCharges = treatmentCharges;
    }

    // Implementing calculateBill
    @Override
    public double calculateBill() {
        return roomCharges + treatmentCharges;
    }

    // Implementing MedicalRecord methods
    @Override
    public void addRecord(String record) {
        medicalHistory += record + "\n";
    }

    @Override
    public String viewRecords() {

        if (medicalHistory.isEmpty()) {
            return "No records available.";

        } else {
            return medicalHistory;
        }

    }
}

