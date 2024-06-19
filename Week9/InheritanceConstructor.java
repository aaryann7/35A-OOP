package Week9;

public class InheritanceConstructor {
    public static void main(String[] args) {
        Polo p = new Polo();
        p.colorDifference("Red");
        // If constructor is overloaded, pass the corresponding params
        Shirt shirt1 = new Shirt(); // non param constructor  
        Shirt shirt12 = new Shirt(10); // constructor that takes int
        
        Pant p1 = new Pant("Red ","new");
    
        HalfPant p2 = new HalfPant();
        p2.design("Brown ");

        Car c1 = new Car();
        c1.display("Mercedes","Black");
        

    
    }
    
}

class Shirt{
    String color = "White";
    Shirt(){
        System.out.println("Parent Default");
    }

    // Constructor Over loading 
    // Same Constructor/Function with different logic/params

    Shirt(String color){     // super() line 41
        this.color = color ;
    }
    Shirt(int price){
        System.out.println("Price " + price);
    }
    Shirt(String color, int price){
        System.out.println("Color and price " + color + " " + price);
    }
}

class Polo extends Shirt{
    String color = "Black";
    Polo(){
        // The default constructor is run in first execution 
        // super() i.e. Shirt() is ran automatically here
        super("Brown");
        System.out.println("Child Default");
    }

    void colorDifference(String color) {
        System.out.println("Parameter color " + color);
        System.out.println("Class color " + this.color);
        System.out.println("Parent color " + super.color);
}

}

// Task 
// Make a class Pant
// Add two attribute color and texture
// Make constructor of Pant that takes color and texture
// Make a class HalfPant that extends Pant 
// Make a attribute color and add default String White
// Make a non param constructor of HalfPant and
// call the Parameterized consructor of parent Pant with "Black" and "Wool"
// make a function design() in HalfPant that takes String color 
// change the parent color to currnet color of halfpant
// change the current color of halfpant to provided parameter


class Pant{
    String color;
    String texture;

    Pant(String color, String texture){
        this.color = color;
        this.texture = texture;

    }

}

class HalfPant extends Pant{
    String color = "White";

    HalfPant(){
        super("Black ","Wool");
    }

    void design(String color){
        super.color = this.color;
        this.color = color;

    }

}

/*

1. Write a Java program to create a class called Vehicle with a method called drive().
Create a subclass called Car with method display() method to print details of the Car.

 */

/* 6.Let's examine the Java program given.
It involves multiple classes that depict different book types,
including Book, FictionBook, NonFictionBook, and TechnicalBook.
The Book class features a constructor and a method called displayDetails().
This method is responsible for outputting the title and author of a book.
The remaining classes inherit both the constructor 
and methods of the Book class as they extend it.
*/ 

class Vehicle{
    String type;

    void drive(){
        System.out.println("Driving");
    }
   
}


class Car extends Vehicle{
    String brand;
    String color;
    void display(String brand, String color){
        System.out.println(brand +" " + color);
    }

}

class Book{
    
    displayDetails(){

    }
}


