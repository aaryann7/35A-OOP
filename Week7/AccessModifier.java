package Week7;

public class AccessModifier {
    public static void main(String[] args) {
        HumanBeing human = new HumanBeing();
        human.name = "Bruce";
        // human.phNumber = "123";  // private cannot be used outside class
        human.age = 21;
        human.showName();
        // human.showPh(); // private cannot be used outside class
        human.showAge();
        human.func();

        human.setPhNumber("123"); // setter

        // String humanNumber = human.getPhNumber();
        // System.out.println(humanNumber);
        System.out.println(human.getPhNumber()); // getter


        Phone p1 = new Phone();
        p1.model_no = 123;
        p1.brand_name = "Phone";


        Phone p2 = new Phone();
        p2.model_no = 456;
        p2.brand_name = "Phone2";

        p1.setSerial_number(1);
        System.out.println(p1.getSerial_number());
        p2.setSerial_number(2);
        System.out.println(p2.getSerial_number());

        p1.deviceinfo();
        p2.deviceinfo();

        



    }
   
    
}

// Task
// Make a class Phone
// make 2 private attributes, imei_no, serial_number
// make 2 public attributes, model_no, brand_name
// make setter and getter for imei_no
// make both setter and getter for serial_number
// make a function device_info() --> print(model_no, imei_no and serial_number)
// make 2 object of Phone, set all the attribute
// use getter to print serial_number of both obj



class Phone{
    private String imei_no;
    private int serial_number;
    public int model_no;
    public String brand_name;

    void setSerial_number(int s){
        serial_number = s;
    }

    int getSerial_number(){
        return serial_number;
    }

    void deviceinfo(){
        System.out.println(model_no + " " + imei_no + " " + serial_number);
    }


}


class HumanBeing{
    String name; //automatically default, used within package/folder
    private String phNumber; // can only be used in this class scope aka HumanBeing
    public int age; // can be used anywhere
    //setter --> start "set" and continue with variable name
    void setPhNumber(String p){
        phNumber = p;
    }

    //getter --> start with "get" and continue with variable name
    String getPhNumber(){
        return phNumber;
    }

    // same is applied in function 
    void showName(){
        System.out.println(name);
    }
    private void showPh(){
        System.out.println(phNumber);
    }
    public void showAge(){
        System.out.println(age);
    }
    void func(){
        System.out.println(phNumber); // private can only be accessed  within the class 
        showPh(); // same goes to private function 
    }
}