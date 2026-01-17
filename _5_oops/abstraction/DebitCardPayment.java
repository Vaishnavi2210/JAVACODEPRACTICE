package _5_oops.abstraction;

 class DebitCardPayment extends Payment{

    public void validate() {
        System.out.println("Debit Card validated");
    }

    public void processPayment() {
        System.out.println("Debit Card Payment processed");
    }


}
