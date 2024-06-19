package Week8;

public class Encapsulation {
    public static void main(String[] args) {

        laptop l1 = new laptop();
        l1.brand = "Apple";
        l1.name = "Apple M1";
        l1.setRam(8);
        l1.price = 150000;
        l1.info();
        //
        l1.upgrade(2,128);
        l1.inflation(20000);

    
    }
    
}

// Encapsulation bundle/group similar properties
// and function in a class

class laptop {
    // Encapsulation/class contains attributes/properties
    String brand;
    public String name;
    // 2. Encapsulation can contain data-hiding
    // can be done using the access modifier private
    private int ram; 
    private int storage;
    double price; 
    // And functions 
    void info(){
        System.out.println("Brand: " + this.brand +  "\nName: " + this.name + "\nStorage: " + storage + "\nPrice: " + price);
    }

    // 3.Encapsulation maintains better control read-only or write only
    // using getter and setter 
    void setRam(int ram){    // write only 
        this.ram = ram;
    }

    int getRam(){            // read only
        return this.ram;
    }

    // Make setter and getter for storage
    // Make 2 object of Laptop 
    // Output from object of Laptop 
    // Name: Apple M1 
    // Brand: Apple 
    // Ram : 8GB
    // Price: 150000
    // Make a function upgrade that takes ram and storage
    // And add to the current ram and storage
    // Make a function inflation that takes number
    // And increase the price with given number

    void setStorage(int storage){
        this.storage = storage;
    }

    int getStorage(){
        return this.storage;
    }
    
    void upgrade(int ram, int storage){
        this.ram = this.ram + ram;
        this.storage = this.storage + ram;
        System.out.println("Upgraded ram: " + this.ram);

    }
    void inflation(double money){
        this.price = this.price + money;
        System.out.println("Inflated price: " + this.price);
    }




}