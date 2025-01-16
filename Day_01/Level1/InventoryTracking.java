/*Program to Track Inventory of Items
Problem Statement: Create an Item class with attributes itemCode, itemName, and price. 
Add a method to display item details and 
calculate the total cost for a given quantity.*/ 

class Inventory{
    String itemCode;
    String itemName; 
    double itemPrice; 

    //constructer to store item detail 
    Inventory(String itemCode, String itemName, double itemPrice){
        this.itemCode= itemCode; 
        this.itemName= itemName; 
        this.itemPrice= itemPrice;
    }
	
	//calculating total cost
	public double calculateTotalCost(int quantity) {
        return itemPrice * quantity;
    }

    //Display the item of the inventory 
    void display(){ 
        System.out.println("Item code is: "+ itemCode + ", Item name is: "+ itemName + ", and price of the item is: "+ itemPrice);
    }

}
public class InventoryTracking{ 
    public static void main(String []args){
        Inventory items= new Inventory("12x1", "Mango", 125.00);

        items.display();
		
		int quantity = 2;
        double totalCost = items.calculateTotalCost(quantity);
        System.out.println("Total Cost for " + quantity + " units: " + totalCost);
    }
}