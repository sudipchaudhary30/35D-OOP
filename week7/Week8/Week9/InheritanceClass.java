package week7.Week8.Week9;

public class InheritanceClass {
    public static void main(String[] args) {
        ChildClass cc = new ChildClass();
        cc.lastname = "Babu";
        cc.firstname = "Ram";
        cc.info();
        cc.greet();
        GrandChild gc = new GrandChild();
        gc.firstname = "John";
        gc.middlename = "Foo";
        gc.lastname = "Deo";
        gc.info();
        gc.call();
        UncleClass uc = new UncleClass();
        uc.job = "CEO";
        uc.lastname = "Hari";
        uc.info();
        uc.detail();
    Labrador lb = new Labrador();
    lb.lifespan = 15;
    lb.legs  = 4;
    lb.diet = "Meat";
    lb.speak();
    lb.fur();
    lb.barks();
    lb.age();



    }
}

class ParentClass {
    String lastname;
    private int salary;
    protected String address;

    void info() {
        System.out.println("Lastname: " + lastname);
    }
}

// extends keyword used to create a child class

class ChildClass extends ParentClass {

    String firstname;

    void greet() {
        System.out.println("Firstname:" + firstname + " Lastname: " + lastname);
    }
}

// multi level

class GrandChild extends ChildClass {
    String middlename;

    void call() {
        System.out.println(firstname + " " + middlename + " " + lastname);
    }
}

// Tree

class UncleClass extends ParentClass {
    String job;

    void detail() {
        System.out.println(job + " " + lastname);
    }
}


// task

class animal{
    int lifespan;
    void speak(){
        System.out.println("Rijen Rejen");
    }
}

class mammal extends animal{
    int legs;
    void fur(){
        System.out.println("Rejen is very furry");
    }
}

class dog extends mammal{
    String diet;
    void barks(){
        System.out.println("Rejen barks loud");
    }
}

class GermanShepad extends dog{
    

}

class Labrador extends dog{
    void age(){
        System.out.println("Dog lives " + lifespan + " years in total");
    }

}





class Reptile extends animal{
    int eggs;
    void shed(){
        System.out.println("He layed " + eggs + "eggs");

    }
}
