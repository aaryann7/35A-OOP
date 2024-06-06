package Week6;

public class MutiDimArrayLoop {
    public static void main(String[] args) {
        int[][] arrayTwo = new int[3][2];
        arrayTwo[0][0] = 10;
        arrayTwo[0][1] = -10;
        arrayTwo[1][0] = 20;
        arrayTwo[1][1] = -20;
        arrayTwo[2][0] = 30;
        arrayTwo[2][1] = -30;

        /* Visual 
         * [
         *   [10,-10],
         *   [20,-20],
         *   [30,-30]
         * ]
         */

         // first get the length 
         int arrayTwoLength = arrayTwo.length;
         for(int outer = 0; outer < arrayTwoLength; outer ++){
            int innerLength = arrayTwo[outer].length;
            System.out.println("Access array of " + outer);
            for(int inner = 0; inner < innerLength; inner ++){
                System.out.println(arrayTwo[outer][inner]);

            }
         }


         /* Make the following array named
          * [

               ["","",""]
               ["","",""]
               ["","",""]
          ]

          Find on which indexed array in
          Output
          2
          */
        


        //   String[][] names = new String [3][3];
        //   names[0]


           
    
}

}
