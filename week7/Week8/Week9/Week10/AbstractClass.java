package week7.Week8.Week9.Week10;

public class AbstractClass {
    public static void main(String[] args){
        // Create an object of Samsung
        Samsung samsungPhone = new Samsung();
        samsungPhone.call();
        samsungPhone.message();
        samsungPhone.text("Hello from Samsung");

        // Create an object of Apple
        Apple applePhone = new Apple();
        applePhone.call();
        applePhone.message();
        applePhone.text("Hello from Apple");
    }
}

// to make abstract class, use abstract keyword before "class"
// if a class is abstract, it cannot be make an object of

abstract class SmartPhone {
    // abstract function do not have a body
    // abstract class may not contain abstract function
    // if there is at least one abstract function, class have to be abstract

    abstract public void call();
    abstract public void message();
    abstract public boolean text(String text);
    public void delivery(){
        System.out.println("Delivery in progress");
    }
}

// to use abstract class it has to be extended into sub/child class
class Samsung extends SmartPhone {
    // When abstract class is extended
    // all the abstract function must be overridden/implemented
    @Override
    public void call(){
        System.out.println("Samsung Calling");
    }

    @Override
    public void message(){
        System.out.println("Samsung message");
    }

    @Override
    public boolean text(String text){
        System.out.println("Samsung text: " + text);
        return true;
    }
}

// Task create a class Apple that extends SmartPhone
// override the functions
// Make an object of Samsung and Apple
// and call the function

class Apple extends SmartPhone {
    @Override
    public void call(){
        System.out.println("Apple Calling");
    }

    @Override
    public void message(){
        System.out.println("Apple message");
    }

    @Override
    public boolean text(String text){
        System.out.println("Apple text: " + text);
        return true;
    }
}
