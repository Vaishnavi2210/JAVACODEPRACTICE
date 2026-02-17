package _1_coreJava._2_pattern_code;

public class Demo3 {
    public static void main(String args[]) {

        /*

         *
         *  *
         *  *  *
         *  *  *  *
         *  *  *  *  *

         */

         for(int i = 1; i <= 5; i++){
             for(int j = 1; j <= i; j++ ){
                System.out.print("* ");
             }
           System.out.println();
         }
    }
}