package week6;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] data = {10, 20, 30, 40, 50};
        int arrayLength = data.length;
        /* first approach */
        for(int index = 0; index < arrayLength; index++){
            System.out.println("Index" +  index + " Value " + data[index]);
        }
        System.out.println("Using length - 1");
        /* Second approach */
        for(int index = 0; index <= arrayLength - 1; index ++){
            System.out.println("Index " + index + " Value" + data[index]);
        }

        // data[100]; this will crash, no index accessible
        /* Task
         Make an array of length 10
         * Add the value as 10, 20, 30 , 40, 50, 60, 70, 80,90, 100
         * Make another array with the same length 10
         * Add the value of first array in negative onto second array
         * use loop on first array to complete this
         * second array should be -10, -20, -30, -40, -50, -60, -70, -80, -90, -100
         * print the second array
         */

         int[] firstarray = {10, 20, 30 , 40, 50, 60, 70, 80, 90, 100 };
         int[] secondarray = new int [10];
         for(int i=0; i<firstarray.length; i++){
            secondarray[i] = -firstarray[i];
            System.out.println(secondarray[i]);

         }


         /* task
          * print the second array in deserting
          should be: -100, -90, -80, -70, -60, -50, -40, -30, -20, -10
          note: start loop from (length - 1 )to 0
          */


          for(int i=secondarray.length-1; i>=0; i-- ){
            System.out.println(secondarray[i]);
          }



         


    
    
        }



    
}
