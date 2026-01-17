package _3_classComponents.Variables;

import java.util.Scanner;

public class Demo3 {

        public static void main(String[] args) {
            System.out.println("Accessing the static variables");
                                                 // different classname
            System.out.println("Bank name = " + BankAccount.bankName);
                                               // classname.static variable
            Scanner scanner = new Scanner(System.in);//LRV
            System.out.println("Enter the Bank name");
            String bankName = scanner.nextLine();
                                            // same classname
             System.out.println("Bank name = " + bankName);

        }

}
