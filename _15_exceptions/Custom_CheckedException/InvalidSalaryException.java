package _15_exceptions.Custom_CheckedException;

public class InvalidSalaryException extends  Exception {
//super(message) exception ke andar error message store karta hai,
//aur getMessage() usi stored message ko read karke return karta hai.

    public InvalidSalaryException(String message){

        super(message);
    }
}
