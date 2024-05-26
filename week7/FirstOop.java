package week7;

public class FirstOop {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.name = "Ram";
        person1.age = 25;
        person1.gender = 'M';

        System.out.println(person1.name);

        person1.introduction();

        // Task create two object of Person and call introduction function


        Person person2 = new Person();
        person2.name = "Shyam";
        person2.age = 29;
        person2.gender = 'M';

       person2.introduction();

       Person person3 = new Person();
        person3.name = "Narayan";
        person3.age = 22;
        person3.gender = 'M';

        person3.introduction();


        Rectangle rec1 = new Rectangle();
        rec1.length = 10;
        rec1.breadth = 90;
        int areaRec1 = rec1.areaofRectangle();
        System.out.println("Area of rectangle is " + areaRec1);


        /* Creat 3 object of car *
        
        attribute
        -name
        -color
        -year
        
        Function
        -start() => print car name is starting
        - stop() = > print car name of color is stopping
        - expering() => return 100 added to year
        
        
        Create 3 object / car
        stop only 1 car
        print the expiry of last 2 car*/ 


        car car1 = new car();
        car1.Name = "BMW";
        car1.Color ="Red";
        car1.year = 2001;
        car1.Start();
        car1.Stop();

        car car2 = new car();
        car2.Name = "Ferrai";
        car2.Color ="Pink";
        car2.year = 2005;
        car2.Start();
        int exp1 = car2.expiry();
        System.out.println("The expiry date is " + exp1);

        car car3 = new car();
        car3.Name = "Toyota";
        car3.Color ="Sky blue";
        car3.year = 2009;

        car3.Start();

        System.out.println("The expiry date is " + car3.expiry());
        

        /* Task 2
         * Create a class Student
         * attribute
         * - firstname
         * -lastname
         * -studentID
         * -age
         * 
         * function
         * -fullName() => return firstName + lastname
         * - description() => print fullName and studentId
         * -overEighteen() => return boolean of weather student is over 18
         * 
         * make object of your detail
         * print your fullname
         * call description
         * print if you are overEighteen or not 
         */


         Student student1 = new Student();
         student1.firstName = "Sudip";
         student1.lastname = "Chaudhary";
         student1.studentId = "0051";
         student1.age= 20;

         System.out.println(student1.fullName());


         student1.description();

         student1.overEighteen();

        
    }
    
}

class Person{
    String name;
    int age;
    char gender;

    void introduction(){
        System.out.println("Name: " + name+ " Age: " + age);
    }
}



class Rectangle{
    int length;
    int breadth;

    int areaofRectangle(){
        int area = length * breadth;
        return area;
        
    }
}

class car{
    String Name;
    String Color;
    int year;

    void Start(){
        System.out.println(Name + (" is starting"));
        

    }

    void Stop(){
        System.out.println(Name +"of " + Color + " is stopping");
    }

    int expiry(){
        int expirydate = year + 100;
        return expirydate;
    }



}


class Student{
 String firstName;
 String lastname;
 String studentId;
 int age;


 String fullName(){
   String name = firstName + " " + lastname;
   return name;

   
   }
   void description(){
    System.out.println("Your name is " + firstName +" " + lastname + "." + " Your StudentId is " + studentId + ".");
   }

   boolean overEighteen(){
    if(age>=18){
        return true;
    }
    else
    return false;
   }

 }


