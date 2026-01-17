package _3_classComponents.Constructor;

public class Demo15_this {

    public static void main(String[] args) {
        class BankAccount{
            int accountNumber;
            String accountHolderName;

            double balance;

            //zero param
            BankAccount() {
            }

            public void deposit(int amount) {
                //  balance = balance + amount;
                this.balance = this.balance + amount;
            }
        }

        BankAccount ref = new BankAccount();
        ref.accountNumber = 123;
        ref.accountHolderName = "Bhushan";
        ref.deposit(10000);
        System.out.println("Account Number = " + ref.accountNumber);
        System.out.println("Account HolderName = " + ref.accountHolderName);
        System.out.println("Account Balance = " + ref.balance);



        }


}

