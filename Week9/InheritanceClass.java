package Week9;

public class InheritanceClass {
    public static void main(String[] args) {
        ChildClass cc = new ChildClass();
        cc.lastname = "Wayne";
        cc.firstname = "Bruce";
        cc.address = "LA";
        cc.savings = 100000;
        cc.initials();
        cc.info();
        

        GrandChildClass gc = new GrandChildClass();
        gc.firstname = "Clark";
        gc.middlename = "middle";
        gc.lastname = "Kent";
        gc.initials();
        gc.detail();

        BrotherClass bc = new BrotherClass();
        bc.lastname = "Wayne";
        bc.location = "Beverly Hills";
        bc.intro();
        
    }
    
}

class ParentClass{
    String lastname;
    private int salary; 
    // the inherited class can use any properties except for private
    // as previously studied private is only class based  
    public String address;
    protected int savings; 
    void initials(){
        System.out.println("Lastname: " + lastname);
    }
    
}

// extends keywords is used to inherit other class
// single level contains one parent and one child 
class ChildClass extends ParentClass{
    String firstname;
    void info(){
        System.out.println("Name: " + firstname + " " + lastname);
    }
}

// multilevel childclass has another child class
// GrandChild inherits every attribure build on top of ChildClass
// meaning GrandChild also inherits ParentClass


class GrandChildClass extends ChildClass{
    String middlename;
    void detail(){
        System.out.println("Name: " + firstname + " " + middlename + " " + lastname);
    }
}

// Tree 
// One class has multiple subclass

class BrotherClass extends ParentClass{
    String location;
    void intro(){
        System.out.println(location + " " + lastname);
    }
}