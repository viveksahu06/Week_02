//Employee Management System
//Description: Build an employee management system with the following requirements:
//Use an abstract class Employee with fields like employeeId, name, and baseSalary.
//Provide an abstract method calculateSalary() and a concrete method displayDetails().
//Create two subclasses: FullTimeEmployee and PartTimeEmployee, implementing calculateSalary() based on work hours or fixed salary.
//Use encapsulation to restrict direct access to fields and provide getter and setter methods.
//Create an interface Department with methods like assignDepartment() and getDepartmentDetails().
//Ensure polymorphism by processing a list of employees and displaying their details using the Employee reference.

package com.oops.practice_problems.employeemanagement;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        //Adding employee to the list
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(1,"Vivek Kumar Sahu",25000,12000);
        fullTimeEmployee.assignDepartment("Automation Lab");
        employees.add(fullTimeEmployee);

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(101,"Suraj Patel",15000,4,500);
        partTimeEmployee.assignDepartment("Architect");
        employees.add(partTimeEmployee);

        PartTimeEmployee partTimeEmployee2 = new PartTimeEmployee(102,"Pratham Raj",15000,4,500);
        partTimeEmployee.assignDepartment("Developer");
        employees.add(partTimeEmployee2);
        //Displaying the details of the employee

        for(Employee employee : employees){
            employee.displayDetails();

            if(employee instanceof Department){
                System.out.println(((Department)employee).getDepartmentDetails());
            }

            System.out.println("*************************************");
        }
    }
}
