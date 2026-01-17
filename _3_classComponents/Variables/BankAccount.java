package _3_classComponents.Variables;

public class BankAccount {

    //instance Variable
    int customerId;
    int accountNumber;
    String accountHolderName;
    double balance;

    //static Variable
    static String bankName = "SBI";

    void deposit(double amount){
        //double amount ---> local Variable

        balance += amount;
    }

    void withdraw(double amount){
        balance -= amount;
    }

    // Zero param constructor
    BankAccount(){

    }

    // parameterized constructor
    public BankAccount(int customerId, int accountNumber, String accountHolderName, double salary){
        this.customerId = customerId;
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        balance = salary;
    }

    // instance block
    {
        System.out.println(" instance block");
    }

    // static block
    static{
        System.out.println("static block");
    }

    // Nested class
    class A {

        static class B {

        }
    }
}
