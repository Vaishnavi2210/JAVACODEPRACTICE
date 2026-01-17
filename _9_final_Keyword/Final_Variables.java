package _9_final_Keyword;

public class Final_Variables {
    /*
      If a variable is final, then its value cannot be reassigned.
      final instance variables must be initialized inline or constructor or instance block[only once]
      Static variables must be initialized inline or static block[only once]
     */
    public static void main(String[] args) {

        // final abstract class A{} --- > CTE
        abstract class A{
          //   final abstract void m1(); --> CTE
            abstract void m2();
        }// CTE

        //Variables[IV, SV, LV], methods, class   --> class

        final int variable = 100;
         //  variable = 200;     // reassignment -- CTE as variable is final




        }
    }


