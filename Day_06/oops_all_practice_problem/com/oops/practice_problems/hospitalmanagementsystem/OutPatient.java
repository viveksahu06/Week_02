package com.oops.practice_problems.hospitalmanagementsystem;
class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private double medicineCharges;
    private String medicalHistory = "";

    // Constructor
    public OutPatient(int patientId, String name, int age, double consultationFee, double medicineCharges) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.medicineCharges = medicineCharges;
    }

    // Implementing calculateBill
    @Override
    public double calculateBill() {
        return consultationFee + medicineCharges;
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

