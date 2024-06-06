package Week4;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        /* While takes condition/boolean expression in () */
        int count = 0;
        while(count <= 5){
            System.out.println("While iteration "+ count);
            ++ count;
        }

        /* Use while when you do not know the number of iteration 
         * For eg: Use while to ask user for specific number until
         * the condition is satisfied
         */

         Scanner scan = new Scanner(System.in);
         System.out.println("Please enter a number");
         int intInput = scan.nextInt();
         while(intInput < 0 || intInput > 100){
            System.out.println("Please enter number between 0-100");
            intInput = scan.nextInt();
         }  

         System.out.println("Condition 0-100 number " + intInput);
         scan.close();

        
    }
    
}
