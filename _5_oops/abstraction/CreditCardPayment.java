package _5_oops.abstraction;

 class CreditCardPayment extends Payment{

    public void validate() {
        System.out.println("Credit Card validated");
    }

    public void processPayment() {
        System.out.println("Credit Card Payment processed");
    }
}
