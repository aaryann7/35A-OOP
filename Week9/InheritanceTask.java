package Week9;

 class InheritanceTask {
     static void main(String[] args) {
        Labrador l1 = new Labrador();
        l1.name = "Animal 1";
        l1.speak();
        l1.legs = 4;
        l1.fur();
        l1.diet = "Meat";
        l1.bark();
        l1.color = "Black";
        l1.size();
        
        
        
    }
    
}

class Animal { 
     String name;
     void speak(){
        System.out.println(name + " \nSpeak");
    }
}

class Mammal extends Animal {
     int legs;
     void fur(){
        System.out.println(legs + " \nFur");
    }
}

class Dog extends Mammal {
    String diet;
    void bark(){
        System.out.println(diet + "\nBark");

    }
}

class Labrador extends Dog{
    String color;
    void size(){
        System.out.println(color + "\nBig");

    }
}

class  GermanShepherd extends Dog{
    String breed;
    void spotted(){
        System.out.println("Yes");
    }

}

class Cat extends Mammal {
    void meow() {
        System.out.println("Meow");

    }
}

class Reptile extends Animal {
     int eggs;
     void shed(){
        System.out.println("shed");

    }
}

class Amphibian extends Reptile{
    int gills;
    void breathe(){
        System.out.println("Breathe");
    }
}





