package _5_oops.abstraction;

public class Demo5 {
    public static void main(String[] args) {

        interface PaymentService {
            void validate();

            void process();
        }

        class CreditPayment implements PaymentService {


            @Override
            public void validate() {
                System.out.println("payment validated successfully");
            }

            @Override
            public void process() {
                System.out.println("payment processed successfully");
            }
        }

        PaymentService paymentService = new CreditPayment();
        paymentService.validate();
        paymentService.process();
    }
}
