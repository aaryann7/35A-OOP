package Week8;

public class BankingSystem {
    public static void main(String[] args) {

        BankAccount b1 = new BankAccount(10000,"Bruce",1000000);
        System.out.println(b1.getBalance());
        b1.deposit(10);
        System.out.println(b1.getBalance());
        b1.withdraw(10000);
        System.out.println(b1.getBalance());
        b1.withdraw(10000000);

        
        
    }

}
    
// You are building a banking application that has a BankAccount class. 
// Implement the BankAccount class with encapsulation principles in mind. 
// Include private instance variables for the
// account number, account holder name, and account balance. 
// Provide public methods to allow clients to deposit and withdraw funds, 
// as well as access the account balance. 
// Ensure that the account balance cannot be accessed or modified directly.
// Ensure that user cannot withdraw balance if it can go to negative
// Note make constructor to fill the attribute on account opening
// Make getter for account number and account holder name

class BankAccount{
    private int account_number;
    private String account_holder_name;
    private double account_balance;

    BankAccount(int account_number, String account_holder_name, double account_balance){
        this.account_number = account_number;
        this.account_holder_name = account_holder_name;
        this.account_balance = account_balance;
    }

    void getAccount_Number(int account_number){
        this.account_number = account_number;
    }
    void getAccount_Holder_Name(String account_holder_name){
        this.account_holder_name = account_holder_name;
    }


    public void deposit(double money){
        this.account_balance = this.account_balance + money;
    }

    public void withdraw(double money){
        if(account_balance - money < 0){
            System.out.println("Invalid");
        }else{
            System.out.println("Withdrawn");
        }
    }

    public double getBalance(){
        return this.account_balance;
    }

    public String getAccount_Holder_Name(){
        return this.account_holder_name;
    }

}



