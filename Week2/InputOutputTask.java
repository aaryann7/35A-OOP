package Week2;

import java.util.Scanner;

public class InputOutputTask {
    public static void main(String[] args) {
        
        /* Task 1
         * Make Scanner object variable called scan1
         * Prompt the following Input
         * What is your name? save as string in name var
         * Over 18? save as boolean in  status var
         * How many siblings? Save as int in sibling var
         */

        
        Scanner scan = new Scanner(System.in);
        

        System.out.println("What is your name?");
        String name = scan.nextLine();
        System.out.println("Over 18?");
        Boolean status = scan.nextBoolean();
        System.out.println("How many siblings?");
        int sibling = scan.nextInt();

        System.out.printf("Hello %s\n", name);
        System.out.printf("Status? %b\n", status );
        System.out.printf("You have %d siblings", sibling);
        
        
        
        System.out.println("What is your name?");
        String v = scan.nextLine();
        System.out.printf("Hello %s", v);



        /* 1. Write a program to check whether a person can cast a vote or not. The condition is you must be over 18 years old to vote. */


        int age_needed = 18;
        System.err.println("Enter your age:");
        int age = scan.nextInt();
        String output = age > age_needed ? "You can vote" : "You cannot vote";
        System.out.println(output);

       

        
  
        

        scan.close();
    }
    
}
