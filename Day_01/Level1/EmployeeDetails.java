/*
Program to Display Employee Details
Problem Statement: Write a program to create an Employee class with 
attributes name, id, and salary. Add a method to display the details.
*/ 
class EmployeeDetail{
	String empName; 
	int empId;  
	//String empDesignation; 
	double empSalary; 
	
	//constructor to save details of employee
	EmployeeDetail(int empId, String empName, double empSalary){
		this.empId = empId; 
		this.empName= empName; 
		//this.empDesignation = empDesignation; 
		this.empSalary = empSalary;
	}
	
	//method to display the details of employee
	void displayEmployeeDetail(){
		 System.out.println("Employee Id: "+empId+", Name: " + empName +", Salary: " + empSalary);
	}	
} 

public class EmployeeDetails{
	public static void main(String [] args){
		//making obj of classs with values
		EmployeeDetail employee = new EmployeeDetail( 101, "Vivek Sahu" , 24560.80); 
		
		//printing the details of emoloyee 
		employee.displayEmployeeDetail();
	}
}
