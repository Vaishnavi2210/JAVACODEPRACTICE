package Interview_Programs.practice;

import java.util.Scanner;

public class Check_whether_a_number_is_prime {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
    int n = sc.nextInt();

    boolean isPrime = true;

        for(int i = 2; i <= n/2;  i++){
            if (n % i == 0){
                isPrime = false;
                break;
            }
        System.out.println(isPrime ? "Prime No." : "Not a prime No.");
    }



    }
}
