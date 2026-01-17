package _1_controlStatements;

import java.util.Scanner;

public class Online_Movie_Ticket_Booking_system {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int availableSeats = 20;
        double ticketPrice = 200;

        System.out.print("Enter your age : ");
        int age = input.nextInt();

        if( age < 18) {
            System.out.println("You are not eligible to book tickets.");
            return;
        }

        System.out.print("Enter no. of seats to book : ");
         int seatRequired = input.nextInt();

         if(seatRequired > availableSeats) {
             System.out.println("Sorry! Seats are not availble.");
             return;
         }

         double totalPrice = ticketPrice * seatRequired;
         double discount = 0;

            if(age > 60){
                discount = totalPrice * 0.30;  // 30%

            }else{
                 discount = 200 * 0.20;  //20%
            }

            double finalPrice = totalPrice - discount;

            availableSeats = availableSeats - seatRequired;


        System.out.println("Tickets booked successfully!");
        System.out.println("Discount Applied: ₹" + discount);
        System.out.println("Final Price: ₹" + finalPrice);
        System.out.println("Remaining Seats: " + availableSeats);

    }
}
