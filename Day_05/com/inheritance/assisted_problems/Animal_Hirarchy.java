
/*Animal Hierarchy
Description: Create a hierarchy where Animal is the superclass, and Dog, Cat, and Bird are subclasses.
 Each subclass has a unique behavior.
Tasks:
Define a superclass Animal with attributes name and age, and a method makeSound().
Define subclasses Dog, Cat, and Bird, each with a unique implementation of makeSound().
Goal: Learn basic inheritance, method overriding, and polymorphism with simple classes.
*/
package com.inheritance.assisted_problems; 
import java.lang.Override;
class Animal{
    private String name;
    private int age; 
    //constructer to initialize
    Animal(String name, int age){
        this.name = name; 
        this.age = age;
    } 

    //getting animal information
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }


    //method to show the sound of animal
    public void makeSound(){
        System.out.println("Animal "+ name + " is sleeping zzzzzzzzzzzzzzz");
    }

}

class Dog extends Animal{
    Dog(String name, int age){
        //to call the parent class constructer
        super(name, age); 
    }

    //method to show the sound of animal
    @Override
    public void makeSound(){
        System.out.println("Animal "+ getName() + " is Barking........");
    }

}

class Cat extends Animal{
    Cat(String name, int age){
        //to call the parent class constructer
        super(name, age); 
    }

    //method to show the sound of animal
    @Override
    public void makeSound(){
        System.out.println("Animal "+ getName() + " is mewwwwwing........");
    }

}

class Bird extends Animal{
    Bird(String name, int age){
        //to call the parent class constructer
        super(name, age); 
    }

    //method to show the sound of animal
    @Override
    public void makeSound(){
        System.out.println("Animal "+ getName() + " is chirps...........");
    }

}
public class Animal_Hirarchy{
    public static void main(String[] args) {
        //Specific behavior
        Animal animal = new Animal("Generic Animal", 5);
        animal.makeSound();

       
        Dog dog = new Dog("Tommy",5);
        // Inherited from Animal
        dog.makeSound();
       
        Cat cat = new Cat("Kitty",3);
        // Inherited from Animal
        cat.makeSound(); 

        Bird bird = new Bird("Mitthu",1);
        // Inherited from Animal
        bird.makeSound(); 

    }
}