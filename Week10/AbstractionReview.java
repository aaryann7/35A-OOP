package Week10;

// Find the bug 
public class AbstractionReview {
    public static void main(String[] args) {
        // Computer c = new Computer();  // abstrct class cannot be a function
        circle c = new circle();
        c.calculateArea();
        c.calculatePerimeter();

        rectangle r = new rectangle();
        r.calculateArea();
        r.calculatePerimeter();



    }
    
}

abstract class Computer{
    abstract void on();
    abstract void off();
    // String changePasword(String message){
    //     System.out.println("Change");
    // }
}
class Mac extends Computer{
    @Override
    void on(){
        // return "On";
    }

    @Override
    void off(){
        // logic
    }
}
/*
You are building a shape hierarchy for a drawing application. Design an abstract class named "Shape" with the following abstract methods:

calculateArea(): 
This method should calculate and return the area of the shape.

calculatePerimeter(): 
This method should calculate and return the perimeter of the shape.

Implement the abstract class and provide concrete implementations for
 the abstract methods. Create subclasses for different shapes such as "Circle,"
  "Rectangle," and "Triangle." 
  Each subclass should provide specific implementations for 
  calculating the area and perimeter of that shape. 
  Create instances of each shape class and demonstrate 
  how you can calculate their respective areas and perimeters.
*/

abstract class Shape{
    abstract void calculateArea();
    abstract void calculatePerimeter();
    
    

}

class circle extends Shape{
    double pi = 3.14f;
    double radius = 10;
    @Override
    void calculateArea(){
        double area = pi*radius*radius;
        System.out.println(area);
    }

    void calculatePerimeter(){
        double perimeter = 2*pi*radius;
        System.out.println(perimeter);
    }
}




class rectangle extends Shape{
    int length = 10;
    int breadth = 20;
    @Override
    void calculateArea(){
        int area = length*breadth;
        System.out.println(area);
    }
    void calculatePerimeter(){
        int perimeter = 2*(length+breadth);
        System.out.println(perimeter);
    }
}


class triangle extends Shape{
    int length = 10;
    int breadth = 20;
    @Override
    void calculateArea(){
        int area = length*breadth;
        System.out.println(area);
    }
    void calculatePerimeter(){
        int perimeter = 2*(length+breadth);
        System.out.println(perimeter);
    }
}


