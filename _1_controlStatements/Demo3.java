package _1_controlStatements;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Marks :");
        double marks  = sc.nextDouble();

        if(marks >= 90){
            System.out.println("Grade A");
        }
        else if(marks < 90 &&  marks >= 75){
            System.out.println("Grade B");
        }
        else if(marks < 75 &&  marks >= 50){
            System.out.println("Grade C");
        }else if(marks < 50 && marks >= 35){
            System.out.println("Grade D");
        }else{
            System.out.println("Failed");
        }


    }
}
