package _1_controlStatements;

import java.util.Scanner;

public class If_Else_Statement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age : ");
        int age = sc.nextInt();

        if (age > 18) //false
        {
            System.out.println("You are eligible for voting");
        } else {
            System.out.println("You are not eligible for voting");
        }
      /*
        System.out.println("Enter your Name : ");
        String name = sc.nextLine();
        if(name.length() < 3)
            System.out.println("Name should have at least 3 characters");
        else
        System.out.println("Your name is :" + name);
       */
      /*
        System.out.println("Enter your password : ");
        String password = sc.nextLine();
        if(password.length() < 6)
            System.out.println("Password should have at least 6 characters");
        else
        System.out.println("Your password is :" + password);

    */
    }
}
