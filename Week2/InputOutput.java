package Week2;

public class InputOutput {
    
    public static void main(String[] args) {
        /* User output */
        System.out.println("The sentence will have line break");
        /* System.out.print */
        System.out.println("This will not have break");
        System.out.println("This line will continue. \n");
        /* String formatting using System.out.printf 
         * %s String. %d Integral, %f floating point. %b boolean
         * This will also not break line
         */

         System.out.printf("Hello %s, good morning", "world");
         System.out.printf("The number is %d", 10 );
         /* can use multiple formatter */
         System.out.printf("\nThe floating %f and boolean %b", 10,3f, false);
         


    }
}
