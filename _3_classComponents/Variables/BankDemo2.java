package _3_classComponents.Variables;

public class BankDemo2 {
    public static void main(String[] args) {

        BankAccount ref = new BankAccount();

        System.out.println("Customer id = " + ref.customerId);
        System.out.println("Account Number = " + ref.accountNumber);
        System.out.println("Account Holder Name " + ref.accountHolderName);
        System.out.println("Balance = " + ref.balance);

        System.out.println("changing the values of instance variable");
        ref.customerId = 101;
        ref.accountNumber = 12345;
        ref.accountHolderName = "Sachin";
        ref.balance = 10000;

        System.out.println("customer id = " + ref.customerId);
        System.out.println("Account Number = " + ref.accountNumber);
        System.out.println("Account Holder Name = " + ref.accountHolderName);
        System.out.println("Balance = " + ref.balance);


    }
}