package Week6;

public class MultiDimArray {
    public static void main(String[] args) {
        /* The number of square bracket determine the dimension */
        // 1 Dim array 
        int[] oneDArray;
        //2 Dim array 
        int[][] twoDArray;
        // 3 Dim array
        int[][][] threeDArray;

        /* Memory allocation */
        twoDArray = new int[2] [3];
        /* The first 2 is the number of array inside twoDArray
         * The second 3 is the numer of value/length of inner array
         * [
         *    [0,0,0],    --> [100,200,0]
         *    [0,0,0]     --> [0,100,-100]
         * ]
         */

         twoDArray[0][0] = 100;
         twoDArray[0][1] = 200;
         twoDArray[1][2] = -100;
         twoDArray[1][1] = 100;

         // access value the same way 
         int arrayValue = twoDArray[0][0];
         System.out.println(twoDArray[0][1]);



         /* Task create the following array
          * [

            [10,20]
            [30,40]
            [50,60]
            [70,80]
            [-10,-20]

            ]

            Print the last array
            Output
            -10
            -20
          */


        int[][] twoDArray1;
        twoDArray1 = new int[5] [2];

        twoDArray1[0][0] = 10;
        twoDArray1[0][1] = 20;
        twoDArray1[1][0] = 30;
        twoDArray1[1][1] = 40;
        twoDArray1[2][0] = 50;
        twoDArray1[2][1] = 60;
        twoDArray1[3][0] = 70;
        twoDArray1[3][1] = 80;
        twoDArray1[4][0] = -10;
        twoDArray1[4][1] = -20;
       
        System.out.println(twoDArray1[4][0]);
        System.out.println(twoDArray1[4][1]);



        // int [][] twoDArrayValue = {
        //     {10,20},
        //     {30,40},
        //     {50,60},
        //     {70,80},
        //     {-10,-20}
        // };

    

    }
    
}
