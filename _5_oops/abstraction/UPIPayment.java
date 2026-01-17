package _5_oops.abstraction;

 class UPIPayment extends Payment {
    public void validate() {
        System.out.println("UPI validated");
    }

    public void processPayment() {
        System.out.println("UPI processed");
    }

}
