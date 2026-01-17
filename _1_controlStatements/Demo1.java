package _1_controlStatements;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        String name = "Vaishnavi Nerkar";

        System.out.println("Length of String : " + name.length());

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name2 = sc.nextLine();

        System.out.println(name.equals(name2));


    }
}