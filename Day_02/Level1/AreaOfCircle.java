/*Write a Circle class with a radius attribute. 
Use constructor chaining to initialize radius with default and user-provided values.*/
class Circle{
	private double radius;  
	
	double areaOfCircle;
	double circumference;
    //default value  
    Circle(){
        this(1.0);
    }
	//constructor to save the value
	Circle(double radius){
		this.radius = radius;
	}  

    
	//getting or returningthe radius
	public double getRadius() {
        return radius;
    }
    //set the radius value
    public void setRadius(double radius) {
        this.radius = radius;
    }
    //Calculating area of circle
	void calculateAOC(){
		areaOfCircle= Math.PI* Math.pow(radius, 2);
	}

	//calculating the circumference of ciecle
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

        Circle c1 = new Circle(); 
        c1.displayResult(); 

        //setting radius value explicitely
        c1.setRadius(10); 

        //getting current radius
        System.out.println(c1.getRadius());

        //display result
        c1.displayResult();

	}
}