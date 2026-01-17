package _5_oops.abstraction;

abstract class Payment {

        double amount;

        public void generateReceipt() {
            System.out.println("receipt generated successfully");
        }

        public abstract void validate();

        public abstract void processPayment();
}
