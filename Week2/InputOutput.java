package Week2;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        /* System.out.println
         * 'sout'
         */
        System.out.println("This line breaks");

        /* System.out.print */
        System.out.print("This will not break");
        System.out.print("This will continue\n");

        /* System.out.printf()
         * %s string, %d integer, %f floating point, %b boolean
         */
        System.out.printf("Hello %s, Good Morning\n", "World");
        System.out.printf("This is a num %d\n", 10);

        /* Multi format */
        System.out.printf("Both float %f and %b", 10.3f, false);

        Scanner scan = new Scanner(System.in);

        System.out.println("The following takes sentence");
        String stringInput = scan.nextLine();
        System.out.println("The following takes int");
        int intinput = scan.nextInt();
        System.out.println("The following takes boolean");
        boolean boolInput = scan.nextBoolean();
        scan.close();

        /* Parse Method */

        String intString = "16";
        int parseInt = Integer.parseInt (intString);
        System.out.println(parseInt);

    }
    
}
