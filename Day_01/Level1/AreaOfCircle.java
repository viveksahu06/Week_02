/*Program to Compute Area of a Circle
Problem Statement: Write a program to create a Circle class with 
an attribute radius. Add methods to calculate and display the area and circumference
 of the circle.
*/  
class Circle{
	double radius;  
	
	double areaOfCircle;
	double circumference;
	//constructor to save the value
	Circle(double radius){
		this.radius = radius;
	}  
	
	//Calculating area of circle
	void calculateAOC(){
		areaOfCircle= Math.PI* Math.pow(radius, 2);
	} 
	
	void circumferenceOfCircle(){
		circumference=2*Math.PI*radius;
	}
	
	//Display Result
	void displayResult(){ 
		calculateAOC();
		System.out.println("Area of the circle is: "+ areaOfCircle);
		circumferenceOfCircle();
		System.out.println("Circumfrence of the circle is: "+ circumference);
	}
}
public class AreaOfCircle{ 
	public static void main(String []args){
		Circle c =new Circle( 2.3); 
		c.displayResult();
	}
}