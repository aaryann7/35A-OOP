package Week4;

public class PrefixPostfix {
    public static void main(String[] args) {
        /* Prefix operator */
        int prefixValue = 10;
        System.out.println("Prefix value updates the value in this line" + ++prefixValue);
        System.out.println("It remains the same in next line" + prefixValue);

        /* PostFix operator */
        int postFixValue = 20;
        System.out.println("Postfix value updates the value in next line" + postFixValue++);
        System.out.println("The value changes in this line" + postFixValue);

    }
    
}
