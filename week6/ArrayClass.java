package week6;

public class ArrayClass {
    public static void main (String[] args){
        /* To create an array define datatype followed by [] */
        int[] myFirstArray;
        /* Initializing the array we need new reference */
        myFirstArray = new int[6]; // Here the new int[6] ->6 refers to the size of array
        /* The size of an array can be futher access by length */
        int myFirstArrayLength = myFirstArray.length;
        System.out.println("My First array size is " + myFirstArrayLength);

        /* Using index for arrazy operator */
        myFirstArray[0] = 10;
        myFirstArray[1] = 30;
        myFirstArray[2] = 100;

        /* to print the array use the same index */
        System.out.println("The first element is in 0 index " + myFirstArray[0]);
        /* Can also creat a new int value */
        int secondArrayIndex = myFirstArray[1];
        System.out.println("The second element stored " + secondArrayIndex);

        /* Declaration and Initialization */
        int[] mySecondArray = new int [6];

        /* Declaration, Initialization and value assign */
        int[] myThirdArray = { 10, 20, 30, 0, 100};
        /* or using constructor */

        int[] myFourthArray = new int[]{1,2,3,4};

        /* Task
         * Create a array of int called myFifth array
         * with size of 5
         * insert the value of 10, 20, 30, 40, 50
         * print the value of an array as well as the multiplied by 2
         * Eg:
         * 10 20
         * 20 40 
         * 30 60
         * 40 80
         * 50 100
         */

         int [] myFifthArray = new int[5];
         myFifthArray[0] = 10;
         myFifthArray[1] = 20;
         myFifthArray[2] = 30;
         myFifthArray[3] = 40;
         myFifthArray[4] = 50;

         for(int i =0; i<myFifthArray.length; i++){
            int mul = myFifthArray[i]*2;
            System.out.println("the multiple of "+ myFifthArray[i] + " is " + mul);
         }
         System.out.println();

         int[] sixthArray = {1,2,6,8,7,9};
         for(int i=0; i<sixthArray.length; i++){
            int multi = sixthArray[i]*2;
            System.out.println(sixthArray[i] + " " + multi);
         }
         

    }
}
    
    