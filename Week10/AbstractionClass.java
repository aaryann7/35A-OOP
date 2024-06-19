package Week10;

public class AbstractionClass {
    public static void main(String[] args) {
        Nokia n1 = new Nokia();
        n1.call();
        n1.message(); 
        n1.samasung();
        n1.apple();
    }
    
}
// to make abstract class keyword "abstract" before class
abstract class SmartPhone{
    // abstract class may or may not have abstract functions
    // to make abstract function add "abstract" before return type
    // abstract function do not have a body
    abstract void call();
    abstract void message();
    // abstract String delivery(String text);
    abstract void samasung();
    abstract void apple();
}

class Nokia extends SmartPhone{
    // if we extend abstract class, we must override every
    // abstract function in child class
    @Override
    void call(){
        System.out.println("Nokia Calling");
    }
    @Override
    void message(){
        System.out.println("Nokia Message");
    }
    @Override
    void apple(){
        System.out.println("Apple");

}
@Override
    void samasung(){
        System.out.println("Samsung");
    }
//     Override function have the same return type and parameters
//     @Override
//     String delivery(String text){
//         System.out.println("Text delivered: " + text);
//         return "Text Delivered";
//    }

// make class Samsung and Apple that extends Smartphone 
// make object of Nokia, Samsung and Apple 
// call the function message and delivery 
// - each with have their own implementation

class Samsung extends SmartPhone{
    @Override
    void call(){
        System.out.println("Nokia Calling");
    }
    @Override
    void message(){
        System.out.println("Nokia Message");
    }
    @Override
    void samasung(){
        System.out.println("Samsung");
    }
    @Override
    void apple(){
        System.out.println("Apple");
}
}

class Apple extends SmartPhone{
    @Override
    void call(){
        System.out.println("Nokia Calling");
    }
    @Override
    void message(){
        System.out.println("Nokia Message");
    }
    @Override
    void samasung(){
        System.out.println("Samsung");
    }
    @Override
    void apple(){
        System.out.println("Apple");
}

}

}
