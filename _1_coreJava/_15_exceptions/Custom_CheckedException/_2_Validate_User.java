package _1_coreJava._15_exceptions.Custom_CheckedException;

import java.util.Scanner;

public class _2_Validate_User {

    public static void usernameChecker(String username) throws InvalidUserException {
         if(username == null || username.trim().isEmpty()){    // trim() - to check and space deleted  and isEmpty() checkEmpty
             throw new InvalidUserException(" Username can not be empty ");
         }

    }

    public static void passwordChecker(String password) throws InvalidUserException{
        if(password == null || password.length() < 8){
            throw  new NullPointerException("Password must be atleast 8 characters");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Username : ");
        String username = sc.next();

        System.out.print("Enter Password : ");
        String password = sc.next();

        try{
            usernameChecker(username);
            passwordChecker(password);
            System.out.println("Login Successfully");

        }
        catch(InvalidUserException e){
            System.out.println(e.getMessage());
        }

        finally {
            System.out.println("Validation Completed");
        }
    }
}
