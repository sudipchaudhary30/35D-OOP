package week7;

public class ConstructionClass {
    public static void main(String[] args) {
        ConExample con1 = new ConExample();
        System.out.println("After object creation");
        parameterizedConstructor pc1 = new parameterizedConstructor(10);
        System.out.println("From object: "  + pc1.length);

        FruitBasket fc1 = new FruitBasket(12, 18, 9);
     
        System.out.println("Total Count: "+ fc1.totalCount() );


        FruitBasket fc2 = new FruitBasket(12, 18, 9);
     
        System.out.println("Total Count: "+ fc2.totalCount() );
        
    }

    
}

//Task
//make a class FruitBasket
//Make private attribute, appleCount, cherryCount, grapeCount
// make Constructor and set all attributr
// make a function that returns total count of fruits
// make 2 objects
// print the total counts of all object


class FruitBasket{
private int appleCount;
private int cherryCount;
private int grapeCount;

FruitBasket(int appleCount, int cherryCount, int grapeCount){
    this.appleCount =appleCount;
    this.cherryCount = cherryCount;
    this.grapeCount = grapeCount;

}

public int totalCount(){
int Count = appleCount + cherryCount + grapeCount;
return Count;

}

}


class ConExample{
    ConExample(){
        System.out.println("The is non parameterized constructir");
    }
}

class parameterizedConstructor{
    int length;
    parameterizedConstructor(int lenght){
        this.length = lenght;
        System.out.println(this.length);
    }
}
