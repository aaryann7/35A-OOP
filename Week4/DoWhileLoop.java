package Week4;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args){
        /* While loop checks the expression at first */
        int num1 = 0;
        while(num1 < 0 ){
            System.out.println("This will not execute");
        }

        /* Do while loop checks the expression after running a loop 
         * Which means do while loop runs at least once
         */

         do{
            System.out.println("This will execute");
         }while(num1 < 0);

         /* Although the expresison is the same the do while will execute 
          * at least once
          */

        int doCount = 0;
        do{
           System.out.println("DO COUNT " + doCount);
           doCount ++;
        }while(doCount <= 5);




          /* Task
           * Ask user for number until the number provided is negative
           * you can use while or do while to complete this
          */

          Scanner scan = new Scanner(System.in);
          System.out.println("Enter a negative number: ");


          int num2 = scan.nextInt();
          while(num2 > 0){
            System.out.println("Enter a negative number");
            num2 = scan.nextInt();
          }
          
          
          do{
              System.out.println("Enter a negative number:");
              num2 = scan.nextInt();
            }while(num2 > 0);
            
            scan.close();
         


           


    } 
}
