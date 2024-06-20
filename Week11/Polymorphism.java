package Week11;

public class Polymorphism {
    public static void main(String[] args) {
    
    Shape s1 = new Shape();
    s1.makeShape();
    Oval o1 = new Oval();
    o1.makeShape();

    Student st1 = new Student();
    st1.information();
    st1.information(19.5);
    st1.information("XYZ","ABC");
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

// 2. Polymorphism with method overloading 
// Making the same function with difference in parameters

class Student{
    void information(){
        System.out.println("Student information without params");
    }
    void information(int age){
        System.out.println("Student's age is 0" + age);
    }
    void information(String firstName, String lastName){
        System.out.println(firstName + " " + lastName);
    }

    // method overloading only see difference in parameter
    // not in return type
    // meaning i cannot make another function: float information()

    String information(double age){
        return("Student age as double is " + age);
    }

}


// Parameter difference can be, change if data type and number of parameter
// Note: function with same params but different variable name is not allowed 
// EG: void information (int a) is not allowed in the above class


