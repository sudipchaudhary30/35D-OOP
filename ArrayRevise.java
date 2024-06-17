// import java.util.logging.FileHandler;



// public class ArrayRevise {
//   public static int arrayFinder(String[] arr, String find) {
//     for (int i = 0; i < arr.length; i++) {
//       if (arr[i] == find) {
//         return i;

//       }

//     }
//     return -1;

//     //Make a function addToArray
//       //that takes array of int, int value
//       //loop array of int and add the value to each element
//       // returns array of int of new value
//       // Eg, [1, 2, 3, 4], 10
//       //Returns [ 11, 12, 13, 14]

//       public static int[] addToArray(int[] arrr, int value){
//         int[] newArray = new int[arr.length];
//         for(int index = 0; index < arr.length; index ++) {
//           newArray[index] = arrr[index] +value;
//         }
//         return newArray;
//       }

//   }

//   public static void main(String[] args) {
//     /* 3 ways to creat array */
//     int[] arrayOne;
//     arrayOne = new int[2]; // -> [0,0]
//     int[] arrayTwo = new int[2]; // -> [0,0]
//     int[] arrayTwo2 = { 1, 2, 4, 5, 10 }; // -> [1,2,4,5,10]
//     System.out.println(arrayTwo2[3]);
//     arrayTwo[1] = 200;

//     /* Looping an array */
//     int arrayTwoLength = arrayTwo.length;
//     for (int index = 0; index < arrayTwoLength; index++) {
//       System.out.println("Index: " + index + " Value: " + arrayTwo[index]);
//     }
//     /* or loop from 0 <= arrayTwolength - 1 */

//     String[] names = { "Ram", "John", "Shyam", "Doe" };
//     String finder = "Shyam";
//     /* Looop names and find the index of shyam */
//     int Strlength = names.length;
//     for (int index = 0; index < Strlength; index++) {
//       if (names[index] == finder) {

//         System.out.println("Index found " + index);
//         break;
//         /*
//          * Make a function named arrayFinder
//          * that takes array of String and String finder
//          * return the index if found else return -1
//          */

//       }
//       String[] arr = { "Ram", "John", "Shyam" };
//       String find = "Don";
//       int send = arrayFinder(arr, find);

//       System.out.println(send);

      
//     }


//   }

// }
