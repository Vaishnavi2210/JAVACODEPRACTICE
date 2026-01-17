package _5_oops.polymorphism;

public class Demo4 {
    public static void main(String[] args) {

        class NotificationService {

            public void notifyUser() {
                System.out.println("notifying the user with email");

            }
        }

        class NotificationServiceImpl extends NotificationService {

            //method overriding
            @Override
            public void notifyUser() {
                super.notifyUser(); //calling parent class method
                System.out.println("notifying the user with whatsApp");
            }


            void display() {
                System.out.println("Child class method");
            }
        }

        // Parent parent = new child();
        NotificationService notificationService = new NotificationServiceImpl();
        notificationService.notifyUser();

        //notificationService.display();//method present only in Child--> CTE
    }
}
