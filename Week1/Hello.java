package Week1;

public class Hello{
    public static void main(String[] args) {
         /*Write a program that prints Hello World! to the console. Save the program as Hello.java. */
        System.out.println("Hello World");

        /*Extend/Modify the above program to print two additional lines:

This is my first program

I am on module ST4003CEM

System.out.print (not println) and produces the same output. */

System.out.print("This is my first program\n");
System.out.print("I am on model ST4003CEm");
/* Write a program that prints the following output:

A "quoted" String is

'much' better if you learn

the rules of "escape sequences."

Also, "" represents an empty

String. Don't forget: use \"

instead of " !

'' is not the same as " */
System.out.print("A \"quoted\" String is\n \'much\' better if you learn\n the rules of \"escape sequences.\"\n Also, \"\" represents an empty");
System.out.print("String. Don't forget: use\\\"\n insert of \" !\n \" is not the same as \"");


/*4. WAP that prints the following pattern:

*

**

***

****

*/

System.out.print("\n*\n**\n***\n****");

/*5. WAP prints the following pattern:

*********

*********

*********

********* 

*/

System.out.print("\n*********\n*********\n*********\n*********\n");

/*WAP that prints the following output:

A well-formed Java program has a main method with { and } braces.



A System.out.println statement has ( and ) and usually a String that starts and ends with a " character.

(But we type \" instead!)

What is the difference between

a ' and a "?  Or between a " and a \"?



One is what we see when we're typing our program. The other is what appears on the "console." */


System.out.print("A System.out.println statement has ( and ) and usually a String that starts and end with a \" character.\n(But we type \\\" instead!)\nWhat is the difference between\na\' and a\"? Or between a \" and a \\\"?\n");
System.out.print("one is what we see when We're typing our program. The other is what appers on the \"console.\"");
}

}