package week4;

public class ForLoop {
    public static void main(String[] args) {
        /* Use for loop when condition is fixed */
        for (int index = 0; index < 5; index++) {
            System.out.println("Loop running " + index);
        }
        /* Decrement loop */
        for (int index = 10; index >= 0; index--) {
            System.out.println("Loop running" + index);
        }
        /* Make the loop table for this */

        // initialize index = index 10
        // condition = index >= 0
        // modify = index --
        /*
         * index counter condition statement modidy
         * 10 10>=0 Print(10) 10-- = 10-1 =9
         * 9 9>=0 Print(9) 9-- = 9-1 =8
         * 8 8>=0 Print(8) 8-- = 8-1 =7
         * 7 7>=0 Print(7) 7-- = 7-1 =6
         * 6 6>=0 Print(6) 6-- = 6-1 =5
         * 5 5>=0 Print(5) 5-- = 5-1 =4
         * 4 4>=0 Print(4) 4-- = 4-1 =3
         * 3 3>=0 Print(3) 3-- = 3-1 =2
         * 2 2>=0 Print(2) 2-- = 2-1 =1
         * 1 1>=0 Print(1) 1-- = 1-1 =0
         * 0 0>=0 Print(0) 0-- = 0-1 =1
         * -1 -1>=0(false(Ends))
         */

        /*
         * Task
         * Make a multiplication table of 2
         * print like the following
         * 2 x 1 = 2
         * 2 x 2 = 4
         * .
         * .
         * 2 x 10 = 20
         * Note: initialization 1
         * condition <=10 or < 11
         * Incriment ++
         */

        for (int index = 1; index <= 10; index++) {
            System.out.println("2 x " + index + " = " + index * 2);

        }
        /* Nested loop */
        for (int outer = 0; outer < 3; outer++) {
            for (int inner = 2; inner >= 0; inner --) {
                System.out.println("Inner" + inner);

            }
            System.out.println("Outer" + outer);
        }

        /* Task use nested loop to do the following
         * Make multiplication table from 1 - 10 
         * eg:
         * Multiplication of 1
         * 1 x 1 = 1
         * 1 x 2 = 2
         * .
         * 1 x 10 = 10
         * .. Multiplication of 10
         * 10 x 1 = 10
         * 10 x 2 = 20
         * .
         * 10 x 10 = 100
         */


         for (int outer = 1; outer <=10; outer++) {
            for (int inner = 1; inner <= 10; inner ++) {
                System.out.println(outer+ " x " +inner+ " = " +outer*inner);

            }
        }


    }

}
