package Week11;

public class PolymorphismTask {
    public static void main(String[] args) {
        Geometry g1 = new Geometry();
        System.out.println("Area of circle " + g1.calculateArea(10));
        System.out.println("Area of rectangle " + g1.calculateArea(10, 20));
        System.out.println("Area of triangle " + g1.calculateArea(30, 40, true));
    }
    
}


// You are building a geometry application. 
// Create a class called "Geometry" with the following overloaded methods:

// a) double calculateArea(double radius) - 
// This method should calculate and return the area of a circle with the given radius.

// b) double calculateArea(double length, double width) - 
// This method should calculate and return the area of a rectangle with the given length and width.

// c) double calculateArea(double base, double height, boolean type) - 
// This method should calculate and return the area of a triangle with 
// the given base and height. 

class Geometry{
    double pi;
    double length;
    double width;
    double base;
    double height;


    double calculateArea(double radius){
        return pi*radius*radius;
    }

    double calculateArea(double length, double width){
        return length*width;
    }
    
    double calculateArea(double base, double height, boolean type){
        return 1/2*base*height;
    }
}