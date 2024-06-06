package Week5;

public class StaticFunction {

    public static int returnAdd(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }

    public static String vendingMachine(int menu){
        if (menu == 1){
            return "Coke";
        }
        if (menu == 2){
            return "Water";
        }
        if (menu == 3){
            return "Frooti";
        }
        return "Invalid Menu";
    }

    // public static String eligibleTest(int age, String name){

    //     if (age < 0 || age > 200 ){
    //         return "Invalid age";
    //     }
    //     if (age < 10){
    //         return "ineligible";
    //     }
    //         return "eligible";
    //     }


    public static String monthCalculator(int month){

        if (month == 1){
            return "January";
        }
        if (month == 2){
            return "Feburary";
        }
        if (month == 3){
            return "March";
        }
        if (month == 4){
            return "April";
        }
        if (month == 5){
            return "May";
        }
        if (month == 6){
            return "June";
        }
        if (month == 7){
            return "July";
        }
        if (month == 8){
            return "August";
        }
        if (month == 9){
            return "September";
        }
        if (month == 10){
            return "October";
        }
        if (month == 11){
            return "November";
        }
        if (month == 12){
            return "December";
        }
        return "Invalid";
        


    }



    


    
    /* Task 
     * Make a function eligibleTest
     * takes name as String, age as int
     * if the age is less than 0, more than 200 return invalid age
     * if the age is below 10, returns "Hello name, you are ineligible"
     * else return "Congratulations name, you are eligible"
     */


    /* Task 2 
     * Make a funtion monthCalculator
     * takes month as int
     * 1 - January
     * 2 - February 
     * .....
     * 12 - December 
     */

    /* Task 3, Make a function that takes 2 int and return boolean
     * if both are equal or not */



    public static void main(String[] args) {
        /* If the function is static on same class
         * can simply call the identifier */
        int returnValue = returnAdd(10, 20);
        System.out.println("Add is " + returnValue);
        String iGet = vendingMachine(1);
        System.out.println("Vending machine returns " + iGet);
        String iGet2 = vendingMachine(2);
        System.out.println("Vending machine returns " + iGet2);
        String iGet3 = vendingMachine(3);
        System.out.println("Vending machine returns " + iGet3);
        String iGet4 = vendingMachine(4);
        System.out.println("Vending machine returns " + iGet4);



        // String age = eligibleTest(0,"name");
        // System.out.println(age);
        // String age1 = eligibleTest(10,"name");
        // System.out.println("Hello name, you are " + age1);
        // String age2 = eligibleTest(10,"name");
        // System.out.println("Hello name, you are " + age2);



        String mth = monthCalculator(1);
        System.out.println("The month is " + mth);
        String mth2 = monthCalculator(2);
        System.out.println("The month is " + mth2);
        String mth3 = monthCalculator(3);
        System.out.println("The month is " + mth3);
        String mth4 = monthCalculator(4);
        System.out.println("The month is " + mth4);
        String mth5 = monthCalculator(5);
        System.out.println("The month is " + mth5);
        String mth6 = monthCalculator(6);
        System.out.println("The month is " + mth6);
        String mth7 = monthCalculator(7);
        System.out.println("The month is " + mth7);
        String mth8 = monthCalculator(8);
        System.out.println("The month is " + mth8);
        String mth9 = monthCalculator(9);
        System.out.println("The month is " + mth9);
        String mth10 = monthCalculator(10);
        System.out.println("The month is " + mth10);
        String mth11 = monthCalculator(11);
        System.out.println("The month is " + mth11);
        String mth12 = monthCalculator(12);
        System.out.println("The month is " + mth12);
        



        






    }
    
}
