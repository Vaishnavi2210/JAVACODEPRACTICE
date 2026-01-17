package _1_controlStatements;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name : ");
        String name = sc.nextLine();
        if(name.equals("Vaishnavi Nerkar")){
            System.out.println("Enter Password : ");

        }else {
            System.out.println("name is wrong");
        }

        System.out.println("Enter your password : ");
        String password = sc.nextLine();
        if(password.length() < 6 ){
            System.out.println("Password should have at least 6 characters ");

        }else{
            System.out.println("Your password is Wrong");
        }

        if(name.equals("Vaishnavi Nerkar") && password.equals("Vaish@123")){
            System.out.println("Login Successful");
        }else{
            System.out.println("Login Failed");
        }





    }
}
