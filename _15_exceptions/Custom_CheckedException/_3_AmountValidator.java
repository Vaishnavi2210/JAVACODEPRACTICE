package _15_exceptions.Custom_CheckedException;

import java.util.Scanner;

public class _3_AmountValidator {

    public static void amountChecker(double amount) throws InvalidAmountException{
        if(amount <= 0){
            throw new InvalidAmountException(" Insufficient Balanced ");
        }
        System.out.println(" Sufficient Balanced ");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount : ");
        double amount = sc.nextDouble();

        try{
            amountChecker(amount);
        }catch(InvalidAmountException e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println(" Balanced Checked successuflly ");
        }
    }
}
