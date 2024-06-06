package Week7;

public class FirstOop {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Bruce";
        p1.age = 21;
        p1.address = "Los Angeles";
        p1.gender = 'M';

        p1.greet();

        Person p2 = new Person();
        p2.name = "Anne";
        p2.age = 20;
        p2.address = "Las Vegas";
        p2.gender = 'F';

        p2.greet();

        Square s1 = new Square();
        s1.side = 10;

        // double s1Area = s1.area();
        // System.out.println(s1Area);

        System.out.println(s1.area());

        Rectangle r1 = new Rectangle();
        r1.length = 10;
        r1.breadth = 20;

        System.out.println("Area of rectangle is " + r1.area());
        System.out.println("Perimeter of rectangle is " + r1.perimeter());
        
        r1.info();

        

        Car c1 = new Car();
        c1.name = "Carrera";
        c1.brand = "Porsche";
        c1.color = "Black";
        c1.year = 2023;


        Car c2 = new Car();
        c2.name = "Cullinan";
        c2.brand = "Rolls Royce";
        c2.color = "Black";
        c2.year = 2021;


        Car c3 = new Car();
        c3.name = "AMG";
        c3.brand = "Mercedes";
        c3.color = "Red";
        c3.year = 2024;

        System.out.println(c1.expiry());
        System.out.println(c2.expiry());
        System.out.println(c3.expiry());

        c1.start();

        c1.modify("Red");
        c3.modify("Black");

        c2.stop();
        c3.stop();

        c1.detail();
        c2.detail();
        c3.detail();


      

 
    }
    
}

// Task create a class Rectangle
// Add attribute length and breadth 
// Make a function that returns area
// Make a function that returns perimeter
// Make a function info, that prints length and breadth of rectangle
// Make an object of Rectangle and print area, perimeter and info




class Rectangle{
    double length;
    double breadth;

    double area(){
        return length*breadth;
    }

    double perimeter(){
        return 2*(length + breadth);
    }

    void info(){
        System.out.println("Length " + length);
        System.out.println("Breadth " + breadth);
        
    }
}


    //add attribute name, brand, color, year
    // make a function expiry, that adds 100 to year and return the date 
    // make a function modify that takes String and change the color of class
    // make a function start() --> print(name is starting)
    // make a function stop() --> print(name, year is stopping)
    // make a function detail() --> print(name, brand, color and year)
    // Make 3 objects of car
    // Fill all attribute of 3
    // print expiry of all car objects
    // start the first object car 
    // modify 1st and 3rd object 
    // stop the 2nd and 3rd object car
    // run detail in all objects
    
class Car{
    String name, brand, color;
    int year;

    int expiry(){
        return year + 100;
    }

    void modify(String c){
        color = c;   
    }
    
    void start(){
        System.out.println(name + " is starting");
    
    }

    void stop(){
        System.out.println(name +" " + year + " is stopping");
    }

    void detail(){
        System.out.println(name +" "+  brand + " " +  color + " " +  year);
    }




}



class Square{
    double side;

    double area(){
        return side*side;
    }
}

class Person{
    String name;
    int age;
    String address;
    char gender;

    void greet(){
        System.out.println("Name " + name + " Age " + age);
    }
    void sleep(){
        System.out.println("Person is sleeping");
    }

}
