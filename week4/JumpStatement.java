package week4;

public class JumpStatement {
    public static void main(String[] args) {
        // /* break and continue are jump statement in java */
        // /* break will terminate the loop */
        // for (int index = 0; index < 5; index++) {
        //     if (index == 3) {
        //         break; // this line will break the loop scope
        //     }
        //     System.out.println("Index " + index);
        // }
        // /* can be used in any loop */
        // int count = 0;
        // while (count <= 10) {
        //     if (count == 1) {
        //         break;
        //     }
        //     System.out.println("Count " + count);
        //     count++;
        // }
        // /* count statement will skip the loop */
        // for (int index = 0; index < 5; index++) {
        //     if (index == 3) {
        //         continue;
        //     }
        //     System.out.println("Continue index" + index);
        // }
        // /*
        //  * task WAP to run for loop from -5 to 5
        //  * break the loop if the index is positive
        //  */

        for (int num = -5; num <6; num++) {
            if (num >= 0) {
                break;
            }
            System.out.println(" num " + num);

        }

        // /*
        //  * Task 2
        //  * Loop from 1 - 20 using any loop
        //  * Only print the value if it is even
        //  * Use continue to do this task
        //  */

        for (int num = 1; num<= 20; num ++){
            if(num%2 !=0){
                continue;
            }
            System.out.println("num " + num);
        }

        

    }

}
