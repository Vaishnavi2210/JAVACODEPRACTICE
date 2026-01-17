package _1_controlStatements;

import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double balance = 10000d;
        System.out.print("Enter your amount for withdrawal :");
        int amount = input.nextInt();

        if (amount > 0) {
            if (amount <= balance) {
                if (amount % 100 == 0 || amount % 500 == 0) {
                    balance -= amount;
                    System.out.println("Withdraw Successful " + balance);
                } else {
                    System.out.println("Enter amount in multiple of 100");
                }}else
                {
                    System.out.println("Insufficient Balance " + balance);
                }
            } else {
                System.out.println("Invalid Input");
            }
        }
    }

