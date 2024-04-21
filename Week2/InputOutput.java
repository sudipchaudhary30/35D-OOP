package Week2;
import java.util.Scanner;
/*or
 * import java.util.*;
 */
public class InputOutput {
    
    public static void main(String[] args) {
        /* User output */
        System.out.println("The sentence will have line break");
        /* System.out.print */
        System.out.print("This will not have break");
        System.out.print("This line will continue. \n");
        /* String formatting using System.out.printf 
         * %s String. %d Integral, %f floating point. %b boolean
         * This will also not break line
         */

         System.out.printf("Hello %s, good morning", "world");
         System.out.printf("The number is %d", 10 );
         /* can use multiple formatter */
         System.out.printf("\nThe floating %f and boolean %b", 10.3f, false);

         /*User Input
          * import java.util.Scanner; // copy this line at the top of the code
          */
        //   Scanner scan = new Scanner(System.in);
        //   System.out.println("The following take whole sentence");
        //   String wholeOutput = scan.nextLine();
        //   System.out.println("The input taken is"  + wholeOutput);
        //   System.out.println("The following takes integer");
        //   int intInput = scan.nextInt();
        //   System.out.println("The input taken is " + intInput);
        //   System.out.println("The following takes double");
        //   double doubleInput = scan.nextDouble();
        //   System.out.println("The input take is" + doubleInput);
        //   System.out.println("The following takes boolean");
        //   boolean booleanInput = scan.nextBoolean();
        //   System.out.println("The input is " + booleanInput);
        //   scan.close(); // you must close the scanner once all input is taken

          /*Task
           * Make a new scanner object scan1
           * Promt the following and take input
           * What is your name? save the input to string -> name
           * Are you over 18? save the input to boolean -> status
           * How many sibling? save the input to integer -> sibling
           * Print the following
           * Hello name,
           * Over 18?, status
           * Your have sibling number of sibling
           */



           Scanner scan1 = new Scanner(System.in);
           System.out.println("What is your name?");
           String name = scan1.nextLine();
           System.out.println("Hello " + name);
           System.out.println("Are you over 18?");
           boolean status = scan1.nextBoolean();
           System.out.println("Over 18" +  status);
           System.out.println("How many sibling?");
           int sibling = scan1.nextInt();
           System.out.println("You have " + sibling + " Siblings");
           scan1.close();








    }
}
