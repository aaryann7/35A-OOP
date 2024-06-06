package Week6;

public class ArrayClass {
    public static void main(String[] args) {
        /* Array declaration */
        int[] myFirstArray;
        myFirstArray = new int[2]; // 2 represent size
        /* Array delclaration and memory allocation */
        int[] mySecondArray = new int[3];
        /* Array delclaration, memory allocation and initialization */
        int[] myThirdArray = {10, 20, 30, 40, 50};
        /* .length is used to see the size/value count of array */
        int myThirdArrayLength = myThirdArray.length;
        System.out.println("Third array has " + myThirdArrayLength);


        int[] arrayExample = new int[5];
        arrayExample[0] = 10;
        arrayExample[1] = 20;
        System.out.println(arrayExample[0]);
        /* Note that index cannot be more than last index
         * For eg: arrayExample[100] will throw error/exception
         */


         /* Make an array myFifthArray with length 4
          * Add the value like [-40, -50, -60, -70]
          * Print each  element of myFifthArray
          * Note: Just use index not loop to perform
          */

          int[] myFifthArray = {-40, -50, -60, -70};
          System.out.println(myFifthArray[0]);
          System.out.println(myFifthArray[1]);
          System.out.println(myFifthArray[2]);
          System.out.println(myFifthArray[3]);


          /* Now print the value adding -100 to each
           * Output should be 
           * -140, 150, -160, -170 */

        // myFifthArray[0] = -40 + -100;
        // myFifthArray[1] = -50 + -100;
        // myFifthArray[2] = -60 + -100;
        // myFifthArray[3] = -70 +-100;
        // System.out.println(myFifthArray[0]);
        // System.out.println(myFifthArray[1]);
        // System.out.println(myFifthArray[2]);
        // System.out.println(myFifthArray[3]);

        System.out.println(myFifthArray[0] + -100);
        System.out.println(myFifthArray[1] + -100);
        System.out.println(myFifthArray[2] + -100);
        System.out.println(myFifthArray[3] + -100);



    

    }
    
    
}
