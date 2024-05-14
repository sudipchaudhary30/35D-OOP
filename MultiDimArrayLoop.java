public class MultiDimArrayLoop {
    public static void main(String[] args) {
        /* Creating an array with [4][2] */
        int[][] arr = new int [4] [2];
        arr[0][0]= 10;
        arr[0][1]= 20;
        arr[1][0]= -10;
        arr[1][1]= -20;
        arr[2][0]= 100;
        arr[2][1]= 200;
        arr[3][0]= -100;
        arr[3][1]= -200;

        /* Visual representation
         * [
         * [10,20],
         * [-10, -20],
         * [100, 200],
         * [-100, -200]
         * ]
         */


         /* Loop outer array */
         int outerLength = arr.length; // -> 4
         for(int outer = 0; outer < outerLength; outer ++){
            System.out.println("array in index " + outer);
            //System.out.println(arr[outer][0]);
            //System.out.println(arr[outer][1]);
            int innerArerayLength = arr[outer].length; 
            for(int inner = 0; inner < innerArerayLength; inner ++){
                System.out.println(arr[outer][inner]); // inner loops from 0,1
            }
         }



         /* Make an array of string names 
          * [
            ["Sanskriti", "Nikita", "Anji"], ->0
            ["Miraj", "Niraj", "Oskar"],  -> 1 
         ]
         */

         /* loop each names
          * Take 2 on the same loop, the on which array is Oskar in
          Answer should be 1
          */

          String[][] names = new String[2][3];
          names [0][0] = "Sanskriti";
          names [0][1] = "Nikita";
          names [0][2] = "Oskar";

          names [1][0] = "Miraj";
          names [1][1] = "Niraj";
          names [1][2] = "Oskar";

          int outlen = names.length;

          for(int out =0; out< outerLength; out++ ){
            System.out.println("names in array " + outlen);
            int innerlength = names[out].length;
            for(int inner = 0; inner< innerlength; inner ++){
                System.out.println(names[out][inner]);
                if(names[out][inner] == "Oskar"){
                    System.out.println("Oskar is in " + out + " Array");
                }
            }

          }

         
    }



}
