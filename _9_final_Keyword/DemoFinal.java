package _9_final_Keyword;

public class DemoFinal {
    public static void main(String[] args){
     /*  final is a keyword that can be used with variables, methods and classes.
       final means complete and abstract means incomplete
       We cannot use final and abstract together.
     */

        class A{
            final int x;
            final int y;
           final static int z;
            /*{
                x=10;
                y=20;
            } */
           static {
               z = 20;
           }
           A(int x, int y){
               this.x = x;
               this.y = y;
           }
        }
     A a1 = new A(1,2);

       //  a1.x = 200;  //CTE --> instance variables are final
       // a1.y = 300;   //CTE --> instance variables are final
      //  A.z = 500;    //CTE --> static variables is final

    }
}
