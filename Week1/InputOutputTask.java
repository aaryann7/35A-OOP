package Week1;

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
        

        scan.close();
    }
    
}
