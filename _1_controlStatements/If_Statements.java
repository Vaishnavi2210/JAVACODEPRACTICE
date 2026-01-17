package _1_controlStatements;

import java.util.Scanner;

public class If_Statements {
    public static void main(String[] args) {

        // In if all things are print condition check and another also
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age :");
        int age = sc.nextInt();

        if (age < 18)
            System.out.println("You are Child");
        if ( age >= 18 && age < 40)
            System.out.println("You are Young");
        if ( age >= 40)
            System.out.println("You are Old");


        System.out.println("Enter your Name : ");
        String name = sc.nextLine();
       if(name.length() < 3){
           System.out.println("Name should have at least 3 characters");
       }

       System.out.println("Your name is :" + name);


       System.out.println("Enter your password : ");
       String password = sc.nextLine();
       if(password.length() < 6){
           System.out.println("Password should have at least 6 characters");
       }



    }
}
