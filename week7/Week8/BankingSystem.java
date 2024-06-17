package week7.Week8;

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount(10021, "Sudip Chaudhary", 1000);
        System.out.println(ba.getAccountBalance());
        ba.deposit(100);
        System.out.println(ba.getAccountBalance());
        ba.withdraw(15);
        System.out.println(ba.getAccountBalance());
        ba.withdraw(100);
        System.out.println();
        
    }
    

}

// You are building a banking application that has a BankAccount class.
//  Implement the BankAccount class with encapsulation principles in mind. 
//  Include private instance variables for the account number, account holder name, and account balance.
//   Provide public methods to allow clients to deposit and withdraw funds, as well as access the account balance. 
//   Ensure that the account balance cannot be accessed or modified directly.
// Ensure that user cannot withdraw balance if it can go to negativa
// note make contructor to fill the attribute on account opening
// Make getter for account number and account holder name
// Make afunction displayCurrent balance to display current balance

class BankAccount{
    private int accountNumber;
    private String accountHolderName;
    private double accountBalance;
    BankAccount(int accountNumber, String accountHolderName, double accountBalance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance= accountBalance;
    }
    public void deposit(double money){
        this.accountBalance += money;
    }
    public void withdraw(double money){
        if(this.accountBalance - money < 0){
            System.out.println("Not enough Balance");

        }else{
            this.accountBalance -=money;

        }
    }
    public double getAccountBalance(){
        return this.accountBalance;
    }
}


    
