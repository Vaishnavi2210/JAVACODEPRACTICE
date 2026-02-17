package Interview_Programs.Basic_without_Using_Loop;

import static Interview_Programs.Basic_without_Using_Loop.Print1_to_100without_using_Loops.print;
// Print 100 to 1 Without Loop
public class Print_100_to_1 {
      // Its Recursion
    static  void  print(int n){
                                             //    What happens if you remove base condition?
            if(n == 0){                      // ➡ StackOverflowError
            return;
        }
        System.out.println(n);
        print(n - 1);
    }
    public static void main(String[] args) {
        print(100);
    }
}
