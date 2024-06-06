package Week4;

public class JumpStatement {
    public static void main(String[] args) {

        /* Break and continue are jump statement */
        for(int i = 0; i <= 3; i++){

            if (i == 2){
                break;
            }
            System.out.println("Index " + i);

        }
        System.out.println("This will execute after loop ends/break");

        /* Can be used in while */

        int count = 0;
        while(count <= 3){
            if(count == 2){
                break;
            }
            System.out.println("While counter " + count);
            count += 1;
        }

        System.out.println("This will execute after while loop ends/breaks");

        /* Continue will skip the itreation / go to next loop */

        for(int index = 0; index <= 5; index ++){
            if(index == 2){
                continue;
            }
            System.out.println("Continue Loop " + index);
        }

        /* In the above loop when index == 2 the line / statement below it will be skipped */


        /* Task
         * Loop from -5 to 5
         * If the number is positive end the loop
         * Print number 
        */


        
        for(int num = -5; num <= 5; num ++){
            if(num > 0){
                break;
            }
            System.out.println(num);
        }




        /* Task 
         * Loop from 1-20
         * only print the number if the number is even
         * Use continue to complete this
        */


        for(int num1 = -10; num1 <= -1; num1++){
            if(num1 % 2 != 0){
                continue;    
            }
            System.out.println(num1);
                
        }




    
 
    }
    

}
