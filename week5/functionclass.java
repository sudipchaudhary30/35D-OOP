package week5;

public class functionclass {
    /* Write a function inside a class */
    void printSomething(){
        System.out.println("This function prints");
    }
    /* In the function void means nothing/null */

    /* With return type as int */
    int returnInteger(){
        int returnThis = 1;
        return returnThis;
    }

    /* with return and params */
    boolean returnString(int num1,int num2){
        boolean check = num1 == num2;
        return check;
    }
    public static void main(String[] args) {
        /* To use a function you need to make object */
        /* Note: just remember the syntax for now */
        functionclass fc = new functionclass();
        fc.printSomething();
        /*You can call this function anytine in need */

        fc.printSomething();
        /* If a function has a return type other than void we can save it */
        int callIntFunction = fc.returnInteger();
        System.out.println("Function with return Int" + callIntFunction);
        
    }

    public static int arrayFinder(String[] arr, String find) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'arrayFinder'");
    }
    
}
