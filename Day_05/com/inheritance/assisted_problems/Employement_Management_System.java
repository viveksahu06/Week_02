// Employee Management System
// Description: Create an Employee hierarchy for different employee types such as Manager, Developer, and Intern.
// Tasks:
// Define a base class Employee with attributes like name, id, and salary, and a method displayDetails().
// Define subclasses Manager, Developer, and Intern with unique attributes for each, like teamSize for Manager 
//and programmingLanguage for Developer.
// Goal: Practice inheritance by creating subclasses with specific attributes and overriding superclass methods.

package com.inheritance.assisted_problems; 
//super class
class Employee{
    private String name; 
    private int id; 
    private double salary;
    //constructer to initialize
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    } 

    //getting the employee data
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public double getSalary() {
        return salary;
    }


    //Displaying the information of employee
    public void displayDetails(){
        System.out.println("------------------------------------------");
        System.out.println("-------Details of the Employees is-------");
        System.out.println("Employee Name is : "+ name);
        System.out.println("Employee id is : "+ id);
        System.out.println("Employee salary is : "+ salary);
        System.out.println("------------------------------------------");

    }
    
} 
//sub class inherits the parent employee class
class Manager extends Employee{
    int teamSize; 
    //constructer to initialize
    Manager(String name, int id, double salary, int teamSize){
        //for parent class constructer
        super(name , id , salary); 
        this.teamSize = teamSize;
    }
    //overriding parent class method
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Employee Position: Manager");
        System.out.println("Manager Team Size: " + teamSize);
        System.out.println("------------------------------------------");
        System.out.println();

    }
}

//sub class inherits the parent employee class
class Developer extends Employee{
    String programmingLanguage; 
    //constructer to initialize
    Developer(String name, int id, double salary, String programmingLanguage){
        //for parent class constructer
        super(name , id , salary); 
        this.programmingLanguage = programmingLanguage;
    }
    //overriding parent class method
    @Override
    public void displayDetails(){
        super.displayDetails();
        
        System.out.println("Employee Position: Developer");
        System.out.println("Programming Language: " + programmingLanguage);
        System.out.println("------------------------------------------");
        System.out.println();

    }
}

class Intern extends Employee{
    int internshipDuration;
     //constructer to initialize
    Intern(String name, int id, double salary, int internshipDuration){
        //for parent class constructer
        super(name , id , salary); 
        this.internshipDuration = internshipDuration;
    }
    //overriding parent class method
    @Override
    public void displayDetails(){
        super.displayDetails(); 
        System.out.println("Employee Position: Intern");
        System.out.println("Internship duration in days: " + internshipDuration);
        System.out.println("------------------------------------------");
        System.out.println();

    }
}


public class Employement_Management_System{
    public static void main(String[] args) {
        Manager manager = new Manager("Suraj", 101, 80000, 5);
        Developer developer = new Developer("Vivek", 501, 60000, "Java");
        Intern intern = new Intern("Pratham", 1001, 15000, 6);

        // Displaying details of each employee
        System.out.println("Manager Details:");
        manager.displayDetails();

        System.out.println("Developer Details:");
        developer.displayDetails();

        System.out.println("Intern Details:");
        intern.displayDetails();
    }
}