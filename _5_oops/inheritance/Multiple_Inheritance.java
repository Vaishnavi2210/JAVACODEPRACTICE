package _5_oops.inheritance;

public class Multiple_Inheritance {

       // Java does not support multiple inheritance with classes due to ambiguity,
        // but supports it using interfaces bcoz it don't have instance members so child class not be confused.

        public static void main(String[] args) {

            interface I1 {
            abstract void read();
        }
        
        interface I2 {
           abstract void show();
           abstract void display();
        }

        interface I3 {
          abstract  void write();
        }

        class A implements I1, I2, I3 {

          public void read(){
                System.out.println("Reading");
          }

          public void show(){
              System.out.println("Showing");
          }

          public void display(){
              System.out.println("Displaying");
          }

          public void write(){
              System.out.println("Writing");

          }
        }

        A a = new A();
        a.read();
        a.show();
        a.display();
        a.write();
    }
}
