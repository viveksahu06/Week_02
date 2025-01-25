package com.oops.practice_problems.employeemanagement;

public class FullTimeEmployee extends Employee implements Department{
    private double fixedSalary;
    private String department;

    // Constructor
    public FullTimeEmployee(int employeeId, String name, double baseSalary, double fixedSalary) {
        super(employeeId, name, baseSalary);
        this.fixedSalary = fixedSalary;
    }

    // Override calculateSalary
    @Override
    public double calculateSalary() {
        return getBaseSalary() + fixedSalary;
    }

    //override department
    @Override
    public void assignDepartment(String department) {
        this.department = department;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department is: "+department;
    }
}
