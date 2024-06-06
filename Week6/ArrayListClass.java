package Week6;

import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String[] args) {
        /* To use ArrayList import at the top from java.util */
        // Cannot make  arraylist of primitive/ use wrapper class
        ArrayList<Integer> intArr = new ArrayList<>();
        // No need to define size/length -> it grows and shrinks accordingly
        intArr.add(10);
        intArr.add(20);
        intArr.add(100);

        // You can also directly print the arrayList
        System.out.println(intArr);
        /* Can also add in index/location */
        intArr.add(1,-100);
        System.out.println(intArr);
        /* to remove use .remove() */
        intArr.remove(2); // the number here means index
        System.out.println(intArr);
        /* To update the data */
        intArr.set(0,-10); // first arg 0 is index, second arg -10 is value
        System.out.println(intArr);
        // To access data use .get(index)
        int firstIndexValue = intArr.get(0); // get value from 0th index 
        System.out.println(firstIndexValue);
        System.out.println(intArr.get(1));


        /* Task 
         * Make the following ArrayList names animals
         * ["Cat", "Dog", "Snake", "Tiger"]
         * Add the "Mouse" in 1 index
         * Remove the "Snake"
         * Replace "Tiger" with "Lion"
         * Replace "Mouse" with "Spider"
         * Note: With every add/remove print the array to know the new index
        */

        ArrayList<String> animals = new ArrayList<>();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Snake");
        animals.add("Tiger");

        System.out.println(animals);    
        
        animals.add(1,"Mouse");
        System.out.println(animals);

        animals.remove(3);
        System.out.println(animals);

        animals.set(3,"Lion");
        System.out.println(animals);

        animals.set(1,"Spider");
        System.out.println(animals);







        
    }
    
}
