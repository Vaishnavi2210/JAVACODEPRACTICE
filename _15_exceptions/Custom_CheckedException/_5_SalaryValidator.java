package _15_exceptions.Custom_CheckedException;

import java.util.Scanner;

/*
       Requirement
          Create InvalidSalaryException
          If salary < 10,000 → throw exception
          Else → print “Salary accepted”
    */
public class _5_SalaryValidator {

    public static void salaryChecker(double salary) throws InvalidSalaryException {

        if(salary < 10000){
            throw new InvalidSalaryException(" Salary not accepted ");
        }
        System.out.println(" Salary accepted ");

    }

       public static void main(String[] args) {

           Scanner sc = new Scanner(System.in);
           System.out.println("Enter a Salary :");
           double salary = sc.nextDouble();

           try{
               salaryChecker(salary);
           } catch (InvalidSalaryException e) {
               System.out.println(e.getMessage());
           } finally {
               System.out.println("salary verification completed");
           }

       }
}

// Flow of Program
/*
    User input
 → salaryChecker()
 → if condition fail
 → exception object create
 → super(message) saves message  -> to Exception class
 → exception thrown
 → catch block runs
 → e.getMessage() prints message -> which is saved in Exception
 → finally block executes

// Control Flow
main()
 ↓
try block start
 ↓
salaryChecker()
 ↓
exception thrown
 ↓
try breaks
 ↓
catch executes
 ↓
finally executes
 ↓
program continues

 */