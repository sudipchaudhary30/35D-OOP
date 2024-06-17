public class JavaArgument {
    public static void main(String[] args) {
        if(args.length < 2) {
            System.out.println("Not enough args");
            return;



        } 
        System.out.println("First args is " + args[0]);
        System.out.println("Second arg is " + args[1]);
        // converts strings into integers/ must pass number in  2nd args
        // int argInt = Integers.paresInt(arg[1]);
    } 
    
}
