/*Program to Handle Mobile Phone Details
Problem Statement: Create a MobilePhone class with attributes brand, model, and price. 
Add a method to display all the details of the phone. The MobilePhone class uses attributes 
to store the phone's characteristics. The method is used to retrieve and display this 
information for each object.
*/
class MobilePhone{
    String brand; 
    String model; 
    double price; 

    //Storing the details of mobile 
    MobilePhone(String brand, String model, double price){
        this.brand= brand; 
        this.model= model; 
        this.price= price; 
    }

    //Display the mobile details
    void display(){
        System.out.println("Brand name of mobile is: "+ brand+ ", Model number is: "+ model + ", price of the mobile is: "+price);
    }
}
public class MobilePhoneDetails{
    public static void main(String []args){
        MobilePhone mp =new MobilePhone("realme", "1x5434584cv", 25000);
        mp.display();
    }
}