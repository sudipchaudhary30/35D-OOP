package week7.Week8.Week9;

public class InheritanceConstructor {
    public static void main(String[] args) {
        Tshirt ts1 = new Tshirt();
        ts1.nameDifference("New");
        Tshirt ts2 = new Tshirt("My Shirt");
        

    }

}

class Shirt {
    String name = "Parent Shirt"; // super.name
    String type;

    Shirt() {
        System.out.println("Parent Constructor");
    }

    Shirt(String name) {
        this.name = name;
        System.out.println("Parent Constroctor with String Params");

    }
}

class Tshirt extends Shirt {
    String name = "Class Shirt";

    Tshirt() {
        // defult parent constructor is called automatically
        // super() or shirt ()
        super("Parent name");
        System.out.println("Child Constructor");

    }
    // Overloading
    // Same name function with different logic/ paramiters

    Tshirt(String name) {
        this.name = name;
        System.out.println("Constructor with String params");
    }

    Tshirt(int number) {

    }

    void nameDifference(String nmae) {
        System.out.println("Param name " + name);
        System.out.println("Class name " + this.name);
        System.out.println("Parent name " + super.name);
    }
}

// Make a class pant
// Make 2 attribute, texture and color
// make a class HalfPant that extends Pant
// Make 1 attribute color
// Make a constructor of pant that takes texture and color
// Make a non-Param constructor for half pant, and call
// Parent Parametrized Constructor, "Wool" and "Red"
// Make a function in Halfpant called changePant
// Takes color as params, and set the current color of pant to halfpant'
// And change the new color to halfpant

class pant {
    String Texture;
    String Color;

    pant(String Texture, String Color) {
        this.Texture = Texture;
        this.Color = Color;

    }
}

class halfPant extends pant {
    String color;

    halfPant() {
        super("Wool", "Red");
    }

    void changePant(String Color) {
        super.Color = this.Color;
        this.Color = Color;
    }
}

// 1. Write a Java program to create a class called Vehicle with a method called
// drive(). Create a subclass called Car with method display() method to print
// details of the Car.

// 6. Let's examine the Java program given. It involves multiple classes that
// depict different book types, including Book, FictionBook, NonFictionBook, and
// TechnicalBook. The Book class features a constructor and a method called
// displayDetails(). This method is responsible for outputting the title and
// author of a book. The remaining classes inherit both the constructor and
// methods of the Book class as they extend it.


class Vehicle{
   void drive(){

    }
}

class Car extends Vehicle{
   void display(){
        System.out.println("Color: " + color );
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

}
