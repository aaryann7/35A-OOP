package Week6;

public class ArrayLoop {
    public static void main(String[] args){
        int[] arrayExample = { 20, 40, 60, 80, 100, 120 };
        // First we need length of array 
        int arrayExampleLength = arrayExample.length; // -> 6
        /* for ascending loop 0 - (length -1) -> 0 - 5 */
        for(int index = 0; index < arrayExampleLength; index ++ ){
            int value = arrayExample[index];
            System.out.println("Index " + index + " Value " + value);
        }
        /* Can put condition as index <= arrayExampleLength - 1 */

        /* For descending loop from ( length - 1 ) to 0 decrement 
         * 5 - 0 */
        System.out.println("Decrement/Reversed Loop");
        for(int index = arrayExampleLength - 1; index >= 0; index --){
            int value = arrayExample[index];
            System.out.println("Index " + index + " Value " + value);
        }

        /* Task 1
         * make an array arrayOne with sixe 4
         * with value {-10, -20, -30, -40}
         * loop the array and print the positive
         * Output:
         * 10
         * 20
         * 30
         * 40
        */


        int[] arrayOne = {-10, -20, -30, -40};
        for(int index1 = 0; index1 < arrayOne.length; index1 ++ ){
            System.out.println(arrayOne[index1] * -1);

        }


        /* String */

        String[] names = {"Ram", "Shyam", "John", "Doe"};
        String finder = "John";
        /* Loop the names and find the index of finder - "John"
         * Print the index if found and break the loop
         */

         for(int index2 = 0; index2 < names.length; index2 ++){
            String val1 = names[index2];
            if( val1 == finder){
                System.out.println("The index of finder John is " + index2);
                break;
            }
         }



         /* Homework
          * Make a function that takes array of String and String as input
          * If array has any element that equals to input 
          * If element match return index else return -1 is no match is found 
          * Function name: arrayFinder
          * Eg: arrayFinder(names, finder)
           */


        


    }
    
}
