package _9_final_Keyword;

public class Final_Classes {
    // If a class is final, then it cannot be extended.
    public static void main(String[] args) {

        final class Parent{
            final void m1(){
                System.out.println("Parent :: m1");
            }
        }
       //   //class Child extends Parent { }//CTE --> final classes cannot be extended

      /* class Child extends Parent{
            final void m1(){
                System.out.println("Child :: m1");
            }
       }
       */



    }
}
