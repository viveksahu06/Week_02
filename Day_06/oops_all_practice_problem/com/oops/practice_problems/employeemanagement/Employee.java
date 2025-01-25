
//Employee Management System
//Description: Build an employee management system with the following requirements:
//Use an abstract class Employee with fields like employeeId, name, and baseSalary.
//Provide an abstract method calculateSalary() and a concrete method displayDetails().
//Create two subclasses: FullTimeEmployee and PartTimeEmployee, implementing calculateSalary() based on work hours or fixed salary.
//Use encapsulation to restrict direct access to fields and provide getter and setter methods.
//Create an interface Department with methods like assignDepartment() and getDepartmentDetails().
//Ensure polymorphism by processing a list of employees and displaying their details using the Employee reference.
package com.oops.practice_problems.employeemanagement;
abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;
    //to initialize the value
    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }
    //getter setter

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    //abstract method to calculate salary
    public abstract double calculateSalary();

    //concrete method to display details
    public void displayDetails(){
        System.out.println("Name of the employee is: "+ name);
        System.out.println("Id of the employee is: "+ employeeId);
        System.out.println("Base salary of the employee is: "+ baseSalary);
        System.out.println("Total Salary: $" + calculateSalary());
    }

}
