package _15_exceptions.Custom_CheckedException;

import java.util.Scanner;

public class _1_AgeValidator {

    public static void ageChecker(int age) throws InvalidAgeException {
        if(age < 18){
            throw new InvalidAgeException("Not eligible to vote");
        }
        System.out.println("Eligible to vote");
}

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter you age : ");
    int age = sc.nextInt();

    try{
       ageChecker(age);
    }
    catch(InvalidAgeException e){
        System.out.println(e.getMessage());
    } finally {
        System.out.println("Age verification completed");
    }
}
}
