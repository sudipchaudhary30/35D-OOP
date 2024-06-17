package week7.Week8;

public class Encapsulation {
public static void main(String[] args) {
    Laptop laptop1 = new Laptop();
    laptop1.setName("Apple M1");
    System.out.println(laptop1.getName());
    laptop1.setBrand("Apple");
    System.out.println(laptop1.getBrand());
    laptop1.setPrice(100000);
    System.out.println(laptop1.getPrice());
    laptop1.setYear(2023);
    System.out.println(laptop1.getYear());
}    
}

// bundle similar properties and function into class
class Laptop{
    private String name;
    private String brand;
    private double price;
    private int year;

    // make read-only access using getter
    public String getName(){
        return this.name;
    }
    // Make write only access using setter

    public void setName(String name){

        this.name = name;
    }

    // Task make getter and setter for all attributes
    // make 2 object of laptop
    // Output:
    //Name: Apple M1
    //Brand: Apple
    // price: 100000
    // Year: 2023

    public String getBrand(){
        return this.brand;
        
        }
        public void setBrand(String brand){
            this.brand = brand;
    }

    public double getPrice(){
        return this.price;
        
        }
        public void setPrice(double price){
            this.price = price;
    }

    public int getYear(){
        return this.year;
        
        }
        public void setYear(int year){
            this.year = year;
    }

    

}
