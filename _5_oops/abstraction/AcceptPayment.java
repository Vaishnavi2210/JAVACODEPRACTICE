package _5_oops.abstraction;

public class AcceptPayment {
    public static void main(String[] args) {

        Payment payment1 = new CreditCardPayment();
        Payment payment2 = new DebitCardPayment();
        Payment payment3 = new UPIPayment();

        processPayment(payment1);
        processPayment(payment2);
        processPayment(payment3);

    }

    public static void processPayment(Payment payment) {
        payment.validate();
        payment.processPayment();
        payment.generateReceipt();
    }

}
