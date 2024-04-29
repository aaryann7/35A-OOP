package Week1;

public class Variable {
    /* Instance variable needs object to access 
     * Value is not shared 
     */
    int instanceVariable = 10;
    /* Static variable does not need to access
    * Value is shared among objects
    */
    static int staticVariable = 100;
    

    public static void main(String[] args) {
    /* Primitive Data Type
     * Already defined in Programming language (JAVA)
     */
    byte byteValue = 100;
    /* The following cannot be done again
      * byte byteValue = 100;
      */
    byteValue = 10; 
    short shortValue = 200;
    int intValue = -199;
    long longValue = 10000;
    float floatValue = 2.15f;
    double doubleValue = -90.223;
    char charValue = 'l';
    boolean booleanValue = false;

    /* Non Primitive DataType
     * Not defined by Programming language except (String)
     * Combination of primitive data type
     */

     String stringValue = "This is a string value";
     int[] intArray = new int[5];
     Variable variableObject = new Variable(); 

     /* Use instance variable with Variable object */
     System.out.println(variableObject.instanceVariable);

     /*Use static variable with Class itself */
     System.out.println(Variable.staticVariable);

     /* Implicit casting, smaller data type to larger */
     int newIntValue = 10;
     double convertedInt = newIntValue;

     /* Explicit casting larger data type to smaller */
     double newDoubleValue = 290.99;
     int convertedDoubleValue = (int) newDoubleValue;

    
    }


}
