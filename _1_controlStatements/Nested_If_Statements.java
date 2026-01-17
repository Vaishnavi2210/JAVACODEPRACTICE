package _1_controlStatements;

import java.util.Scanner;

public class Nested_If_Statements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Marks :");
        int marks = input.nextInt();

        if(marks >= 35)
        {
            if(marks >= 75){
                System.out.println("Distinction");
            }else if(marks < 75 && marks >= 60){
                System.out.println("First Class");
            }else{
                System.out.println("Pass");
            }

        }else{
            System.out.println(" Failed ");
        }
    }
}
