package Week2;

public class Variable {
   /* Instance variable 
    * Will need object to access this variable
    Not shared between the object
   */
  int instanceVariable = 100;
  /* Static/Class variable
   * No need of object , can be called from class
   * Shared between the object
   */
  static int staticVariable = 20;

   

    public static void main(String[] args) {
        /* Non Primitive data type */
        /* Declaration */
        byte byteValue;
        /* Initialization */
        byteValue = 100;
        /* Declaration and Initialization */
        short shortvalue = 200;
        /* Multiple declaration */
        int intValue1, intValue2;
        intValue1 = 10000;
        intValue2 = 2000;
        /* Multivle declaration and initialization */
        long longVall = -9000, longVal2 = 9000;
        float floatValue = 90.90f; // the letter 'f' is needed
        double doubleValue = 100.897d; // the letter 'd' is operation
        char charValue = 'c'; // must use siingle quote '
        boolean booleanvalue= false; 
        /* Illegal action below */
        // byte byteValue =100; // we cannot redeclare the variable
        // byteValue = 200; // instead use ressignment
        // boolean bollVal2 = 'false'; // cannot use different type
        // byte byteValue2 = 1000000; // cannot exceed min and max

        /* Non Primitive data type */
        String stringValue = "This is a string value";
        /* Use class */
        String stringValue2 = new String("This string uses class");
        System.out.println(stringValue2);
        /* Object, for this can us the same public class mode */
        Variable variableObject = new Variable();
        /* Use Object from above to access instance variable */
        System.out.println(variableObject.instanceVariable);
        /* use Class to use static variable */
        System.out.println(Variable.staticVariable);

        /* Type casting  */
        int intValueType = 100;
        double intValueConvertToDouble = intValueType;
        /* Automatically cast from low datatype to high datatype */

        /* Explicit casting */
        double doubleValueType = 190.8109;
        int doubleValueConverteToInt = (int) doubleValue;
        /* manually specify data type for eg. (int) */
        /* Note this type cast can be done in primitive data type */

        /* Task
         * Make one double variable called doubleVar1 = 1000.12
         * Explicitly cast the variable into float, floatVar1
         * Explicitly cast the floatVar1 into int, intVar1
         * Make a String variable with "The integer is" 
         * Print the String variable and print the int variable in another
         * 
         */


         double doubleVar1 = 1000.12;
         float floatVar1 = (float) doubleVar1;
         int intVar1 = (int) floatVar1;
         String info = "The integer is";
         System.out.println(info);
         System.out.println(intVar1);




         
    }
}
