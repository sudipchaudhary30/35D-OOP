import java.util.ArrayList;
public class ArrayListoop {
    public static void main(String[] args) {
        /* Import ArrayList from java.util */
        ArrayList<String> names = new ArrayList<>();

        names.add("Aayam");
        names.add("Adhar");
        names.add("Yausan");
        names.add("Niraj");
        names.add("Ayush");
        names.add("Rijan");

        /* To loop, find the length/ element count, .size() */
        int namesLength = names.size();
        /* Loop same as array */
        for(int index = 0; index < namesLength; index ++){
            // get each element with .get(index)
            String singleName = names.get(index);
            System.out.println("Index: " + index +" value " + singleName);

        }
            /* Using foreeach in java, iterate with element/actual value */
            for(String element: names){
                System.out.println(element);
            }
            /* Task 
             * Make an ArrayList animals
             * ["Cat", "Tige", "Dog", "Elephant"]
             * Make two more ArrayList called , wildAnimal, domesticAnimal
             * Loop the animals
             * if the element/ value is "Cat", "Dog"  add in domesticAnimal
             * If the element/value is "Tiger", "Elephant" add in wildAnimal 
             * Print domesticAnimal, wildAnimal
             * 
             */

             ArrayList<String> animals = new ArrayList<>();
             animals.add("Cat");
             animals.add("Tiger");
             animals.add("Dog");
             animals.add("Elephant");

             ArrayList<String> wildAnimal = new ArrayList<>();
             ArrayList<String> domesticanimal = new ArrayList<>();

             int animallength = animals.size();

             for(int i=0; i<animallength; i++){
                String singleAnimal = animals.get(i);
                if(singleAnimal == "Cat" || singleAnimal == "Dog"){
                    domesticanimal.add(singleAnimal);

                }else{
                    wildAnimal.add(singleAnimal);
                }
             }
             System.out.println(wildAnimal);
             System.out.println(domesticanimal);

             





    }
    
}
