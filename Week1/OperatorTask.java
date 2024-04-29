package Week1;

public class OperatorTask {
    public static void main(String[] args) {
         /* Task 1
          * Write a program to print whether a variable is greater or equals to 18
          */

          int v1 = 10;
          String com = v1 >= 18 ? "True" : "False";
          System.out.println(com);
  
  
          /* Task 2
           * Write a program to print simple interest from variables
           * Make 3 variables for amount, time and save the calculator into a variable
           * Formula:
           * si = amount * time *rate / 100;
           */
  
  
          int amount = 10, time = 20;
          float rate = 2.1f;
          float si = (amount*time*rate)/100f;
          System.out.println(si);
  
  
  
          /* Task 3
           * Write a program to print the area and perimeter of rectangle
           * a = l * b
           * p = 2 (l + b)
           */
  
          float l = 2.1f, b = 4.1f;
          float area = l + b;
          float perimeter = 2 * area;
          System.out.println(perimeter);
  
  
          
    }
    
}
