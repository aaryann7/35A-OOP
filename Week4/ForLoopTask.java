package Week4;

public class ForLoopTask {
    public static void main(String[] args) {
        /* Use for loop to make multiplication table of 2 */
        int val1 = 2;
        for (int index = 1; index <= 10; index ++) {
            System.out.println(val1 + "x" + index + "=" + val1 * index);
        }

        /* Make a multiplication table like the example
         * Multiplication of 1 
         * 1 x 1 = 1
         * 1 x 2 = 2
         * ...
         * 1 x 10 = 10
         * ...
         * Multiplication of 5 
         * 5 x 1 = 5
         * 5 x 2 = 10
         * ...
         * 5 x 10 = 50
         */


        for(int outer = 1; outer <= 5; outer ++){
            System.out.println("Multiplication of " + outer);
            for(int inner = 1; inner <=10; inner ++){
                System.out.println(outer + "x" + inner + "=" + outer * inner);
            }

        }

        
    }

}
