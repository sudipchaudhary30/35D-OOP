package week4;
import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        
    int num1 = 0;
    while(num1 < 0){
        System.out.println("While cheeks condition first");


    }

    /*Do while checks condition after first iteration
     * 
     */

     do{
        System.out.println("Do while checks condition after");

     }while(num1<0);
     /* This means do while loop runs at leasr once */




     /*Task
      * Use a while loop to
      ask users for an int value
      if the user input positive value
      promt users to input negative value
      loop until the user input negatiive in value
      */
      System.out.println("Enter a integer:");
      Scanner scan = new Scanner(System.in);
      int value = scan.nextInt();
      while(value >0){
        System.out.println("Input negative value");
        value = scan.nextInt();
      
      }
      System.out.println("The negative value is " + value);
      scan.close();
    }
}
