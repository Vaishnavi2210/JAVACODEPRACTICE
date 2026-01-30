package _15_exceptions.Custom_CheckedException;

public class InvalidAgeException extends Exception {

    //Create InvalidAgeException and throw it if age < 18.

    public InvalidAgeException(String message) {
        super(message);
    }
}


