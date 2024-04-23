package Week3;

public class IfElseStatement{

    public static void main(String[] args) {
        /* Simple if example */
        if(true){
            System.out.println("True Statement");

        }
        /* If takes an expression with boolean value */
        int num1 = 10, num2 = 20;
        if(num1 > num2){
            System.out.println("Greater");

        } else{
            System.out.println("Lesser");
        }
    }
}