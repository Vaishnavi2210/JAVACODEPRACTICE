package _1_controlStatements;

import java.util.Scanner;

public class If_ElseIf_else_Statements {

    public static void main(String[] args) {

        String name = "Vaishnavi Nerkar";
        String Password = "Vaish@123";

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name2 = sc.nextLine();
        System.out.print("Enter your password: ");
        String password2 = sc.nextLine();

        if(name2.length() < 3){
            System.out.println("Name should grater than 3 characters");
        }else if(name2.equals(name)){
            System.out.println("Username Correct ");
        }else{
            System.out.println("forget username");
        }

        if(password2.length() < 6){
            System.out.println("Password should grater than 6 characters");

        }else if(password2.equals(Password)){
            System.out.println(" Password Correct");
        }else{
            System.out.println("Forget Password ");
        }

        if(name2.equals(name) && password2.equals(Password)){
            System.out.println("Login Successfully");
        }else{
            System.out.println("Login Failed");
        }
    }
}
