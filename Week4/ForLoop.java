package Week4;

public class ForLoop {
    public static void main(String[] args) {
        for(int index = 0; index < 4; index ++){
        System.out.println("Looping " + index);
        }

        for(int index = 10; index >=0; index --){
            System.out.println("Looping Decrement " + index);
        }

        /* Nested Loop
         * Loop inside loop
         */

        for(int outer = 0; outer < 2; outer ++){
            for(int inner = 2; inner >= 0; inner --){
                System.out.println("Inner " + inner);
            }
            System.out.println("Outer " + outer);
        }
        
    


    
    }
    

}
