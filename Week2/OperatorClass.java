package Week2;

public class OperatorClass {
    public static void main(String[] args) {
        /* Arthematic operators */
        int a = 10, b = 10;
        int sum = a + b; // here the  "+" is an arthematic operators
        System.out.println("Addition for a+b is " + sum);
        System.out.println("Difference for a-b is " + (a-b));
        System.out.println("Multiplication for axb is " + (a*b));
        System.out.println("Division for a/b is " + (a/b));
        System.out.println("Modulo for a and b is " + (a%2));

        /* Assignment Operators */
        int aNumber1;
        aNumber1 = 10;
        /* or  declare and design */
        int aNumber2 = 20;
        /* assign with another variable */
        int aNumber3 = aNumber1;
        System.out.println("Assignment with += " + (aNumber1+=10));
        aNumber2 -= 30; // same as aNumber2 = aNumber2 -30;
        System.out.println("Assignment with -= " + aNumber2);

        /* relational Operators */
        int rNumber1 = 10, rNumber2 = 20;
        System.out.println("Is rNumber1 equals to rNumber2? " + (rNumber1 == rNumber2));
        System.out.println("rNumber1 grater  than rNumber2" + (rNumber1> rNumber2)); 
        System.out.println("rNumber1 less than or equal to rNumber?" + (rNumber1<=rNumber2));
        System.out.println("rNumber not equal to rNumber2?" + (rNumber1!=rNumber2));

        /* Logical Operators */

        int lNumber1 = 10, lNumber2 = 12;
        boolean lExpression1 = lNumber1 == lNumber2;
        boolean lExpression2 = lNumber1 <= lNumber2;
        System.out.println("And operator uses &&" + (lExpression1 && lExpression2));
        System.out.println("Or operator uses || " + (lExpression1 || lExpression2));
        System.out.println("Not operator uses ! " + !lExpression1);


        /* Unary Operator */
        int uNumber1 = 10;
        uNumber1++; // meaning uNumber1 = uNumber1 = 1;
        System.out.println("Unary for increament is ++ " + uNumber1);
        uNumber1--;
        System.out.println("Unary for decrement is -- " + uNumber1);

        /* Ternary Operator */

        int tNumber1 = 10, tNumber2 = 10;
        boolean tExpression = tNumber1 == tNumber2;


        /*
         * One lipne if else, see the given example in if else
         * String output;
         * if(tExpression == true){
         * output = "True statement";
         * }else{
         * output = "false statement";
         * }
         */

         String output = tExpression ? "True Statement" : "False Statement";
         /*
          * Here we can assign a string a string out with one expression
          if expression is true it will return the value after the "?"
          if the expression is false it will return the value after the ":"
          */
          int numberOutput = tNumber1 < tNumber2 ? 10 : 20;
          System.out.println(output);
          System.out.println(numberOutput);


          /* Task 1
           * make a variable and check if the variable is great or equal to 18
           */



           int number = 60;
           System.out.println(number >= 18);

           /*Task 2
            * Write a program to print simple intrest from variables
            * Make 3 variable for amount, time and rate and save the calculation into a variable
            *Formula;
            *si = amount  * time * rate/100;
          */

          float amount = 1000, time = 2, rate =12;
          float si = (amount*time*rate)/100;
          System.out.println(si);


          /* Task 3
           * WAP to print the area and perimeter of rectangle
           * a= l * b
           * p = 2 (l + b)
           */

           int length = 50, breadth = 40;
           int area = length*breadth;
           int perimeter = 2*(length + breadth);
           System.out.println(area);
           System.out.println(perimeter);





           /* Task 4
            * Complete the task 1 using ternary operators
            */

            int tNum1 = 10, tNum2 = 18;
            boolean jExpression= tNum1 >= tNum2;
            String outcome = jExpression? "greater or equal": "lesser";
            System.out.println(outcome);
    
        }


    }
    

