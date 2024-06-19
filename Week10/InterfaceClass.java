package Week10;

public class InterfaceClass {
    public static void main(String[] args) {
        Cow c1 = new Cow();
        c1.eat();
        c1.travel();

        Wolf w1 = new Wolf();
        w1.eat();
        w1.travel();

        BullDog b1 = new BullDog();
        b1.pet();
        b1.legs();
    }
    
}

// to make interface, use "interface" in replacement of class
 
interface animalDo{
    public void eat();
    public void travel();
}

// to use interface in another class use "implements" keyword

class Cow implements animalDo{
    // all the function of interface is automatically abstract 
    // so Override all the function 
    @Override
    public void eat(){
        System.out.println("Cow eats grass");
    }
    @Override
    public void travel(){
        System.out.println("Cow travels on 4 legs");
    }
}

class Wolf implements animalDo{
    @Override
    public void eat(){
        System.out.println("Wolf eats meat");
    }
    @Override
    public void travel(){
        System.out.println("Wolf travels on 4 legs");
    }
}

// extend "interface"

interface MammalDo extends animalDo{
    public int legs();
}

interface DogDo extends MammalDo{
    public String bark();
}
interface DomesticAnimal{
    public void pet();
}

// If implementing interface with is being nested/extended to another interface
// Override all the funtion being passed down
// A class can only extend one class but implements multiple interfaces

class BullDog implements DogDo, DomesticAnimal{
    @Override
    public void pet(){
        System.out.println("Petting");
    }
    @Override
    public int legs(){
        return 4;
    }
    @Override
    public void eat(){
    }
    @Override
    public void travel(){
    }
    @Override
    public String bark(){
        return "Woof";
    }
}

/*
 * Task 
 * Make a interface Media 
 * make the following functions 
 * void play()
 * void pause()
 * void next()
 * void previous()
 * String nowPlaying()
 * 
 * Make an interface DigitalMedia extending Media
 * make the following functions
 * double size()
 * double remaining(double current)
 * 
 * Make an interface OnlineAsset
 * make the following functions
 * void download()
 *
 * Make a class Spotify and implement DigitalMedia and OnlineAsset
 * Make a class AppleMusic and implement DigitalMedia and OnlineAsset
 */


interface Media{
    public void play();
    public void pause();
    public void next();
    public void previous();
    public String nowPlaying();
 }

interface DigitalMedia extends Media{
    public double size();
    public double remaining(double current);
}

interface OnlineAsset{
   public  void download();
}

class Spotify implements DigitalMedia,OnlineAsset{
    @Override
    public void download(){

    }
    @Override
    public void play(){

    }
    @Override
    public void pause(){

    }
    @Override
    public void next(){

    }
    @Override
    public void previous(){

    }
    @Override
    public String nowPlaying(){
        return "";

    }
    @Override
    public double size(){
        return 4;

    }
    @Override
    public double remaining(double current){
        return 4;
    }
}