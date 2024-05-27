package week7;

public class AccessModifier {
    public static void main(String[] args) {

        AccessExample ae1 = new AccessExample();
       // ae1.intValue = 100; paidaina
        ae1.strValue = "Test";
        ae1.  boolval = true;  
        // ae1.doPrivate();
        ae1.setPrivate();  
        Task t1 = new Task();
        t1.sendData("Test", 10);
        t1.address = "Ktm";
        t1.printdetails();

    }

    
}

class Task{
    //create a private variable for Name, Age
    //create a public variable for Address
    //Make a function to fill data  for Name and Age
    // make a function to print Name, Age and Address


public String address;
private String Name;
private int age;
public String Address;
void sendData(String Name, int age){
    this.Name = Name;
    this.age = age;
    
}
void printdetails(){
    System.out.println("Name: " + Name + " Age: " + age + " Address: " + address);
}


}

class ThsiExample{
    private int length; // "this.length " in thid class represent this length
    private int breadth;
    void fillData(int length, int breadth){
        this.length = length; // this represent current class attribute
        this.breadth = breadth; // breadth without this represent the args/ parameter of function
    
    }
}

class AccessExample{
    private int intValue; // Can olny used inside class scope
    public String strValue;  // can be used anywhere
    boolean boolval;  // automatically defult, can be used only inside a same package / folder
    
    // similarly can be used in function
    private void doPrivate(){
        System.out.println("I can be accessed only i this class");

    }
    public void doPublic(){
        System.out.println("I can be accessed from anywhere");

    }
    void doDefault(){
        System.out.println("I can be accessed from current package/folder");

    }

    // private can be used in class

    void setPrivate(){
        intValue = 100; // private can be accessed here
        doPrivate(); // same goes to private functions
    }
}
