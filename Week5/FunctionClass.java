package Week5;

public class FunctionClass {
        /* Function should be created in class scope
         * meaning either top or bottom of main */
        void printSomething(){
            System.out.println("This function prints");
        }
        /* void is considered a data type that returns nothing */
        int returnInt(){
            int data = 10;
            return data;
        }

        double returnDouble(){
            double value = 10.2;
            return value;

        }

        
        /* Make a function that returns double value of 10.2
         * make variable to store the value and print it
         */
        public static void main(String[] args){
            /* To call a normal function should make object 
            * Note: Just remember the system for now */
            FunctionClass fc = new FunctionClass();
            fc.printSomething();
            /* Can be used multiple times */
            fc.printSomething();

            
            int functionReturnInt = fc.returnInt();
            System.out.println("Function returns " + functionReturnInt);

            double functionReturnDouble = fc.returnDouble();
            System.out.println("Function returns " + functionReturnDouble);

        }
    
}
