package week5;

public class StaticFunction {
    /* in the following public and static is options */
    public static int addTwoNumber(int a, int b) {
        int Sum = a + b;
        return Sum;

    }
    public static String vendingMachine(int menu) {
        if (menu == 1){
            return "Coke";

        }
        if (menu == 2){
            return "Water";

        }
        if(menu == 3){
            return "Frooti";

        }
        return "Nothing";
        
    }

public static boolean checkEven(int a){
    if(a%2 == 0){
    return true;
    }else{
        return false;
    }
}  
public static String checkEligiblity(int age, String name){
    if (age<18){
        return "Sorry " + name + " , You are not eligible";


    }
    else{
        return "Congratulation "+ name + " you are eligible";
    }
}
public static double makeMultiply(double num1, double num2){
    return num1 *num2;

}


    public static void main(String[] args) {
        // If a function is static no need to make object
        // if the function is static in same class you can simple call the method
        int sumReturn = addTwoNumber(10, 30);
        System.out.println("The sum is " + sumReturn);

        String frooti = vendingMachine(3);
        System.out.println("Frooti check " + frooti);




        /*Task make a function checkEven
         * that takes one int
         * that returns a boolean
         * if the int is even return true else false
         * 
         */

         
        boolean evennum = checkEven(12);
         System.out.println(evennum);

         /* Task 2
          * make a function checkEligible
          *that takes ine int age, one string name
          if the age is < 18
          return String "Sorry name, you are not eligible"
          else return "Congratulation name, you are eligible"
        
          */

          String years = checkEligiblity(15, "frooti");
        System.out.println("years");

          /* Task 3
           * make a function makeMultiply
           * that takes 2 double
           * return a double with the multiplication of two
           */
          
        double multi = makeMultiply(1, 5);
        System.out.println(multi);



        
            
        }
    }

