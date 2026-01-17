package _1_controlStatements;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Income : ");
        double income = sc.nextDouble();

        if(income > 1000000){
            double tax = income * 0.15;
            System.out.println("You need to pay 15% tax is : "+ tax);
        }else if(income < 1000000  && income >= 700000 ){
            double tax = income * 0.10;
            System.out.println("You need to pay 10% tax is : "+ tax);
        }else if(income < 700000 && income >= 400000 ){
            double tax = income * 0.5;
            System.out.println("You need to pay 5% tax is : "+ tax);
        }else {
            System.out.println("You not need to pay any tax :  No Tax ");
        }

    }
}
