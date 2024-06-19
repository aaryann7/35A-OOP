package Week11;

public class Polymorphism {
    public static void main(String[] args) {
    
    Shape s1 = new Shape();
    s1.makeShape();
    Oval o1 = new Oval();
    o1.makeShape();
    }
      
}

// Polymorphism, same function different behaviour 

class Shape{
    void makeShape(){
        System.out.println("Making shape");
    }

}

// 1. Polymorphism with method overriding 
// Making the same function of parent in child 
// with different behaviour/logic

class Oval extends Shape{
    @Override
    void makeShape(){
        System.out.println("Making Oval");
    }
    // to override the function should be same 
}

// Note: Method overriding can only be done using inheritence