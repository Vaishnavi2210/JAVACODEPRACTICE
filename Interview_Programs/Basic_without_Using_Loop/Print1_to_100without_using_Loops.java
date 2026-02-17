package Interview_Programs.Basic_without_Using_Loop;
   // Its Recursion Program
public class Print1_to_100without_using_Loops {
    // Write a Program to print 1 to 100 without using for-loop
    static void print(int n){
       if(n > 100){                       // What happens if you remove base condition?
           return;                        // ➡ StackOverflowError
       }
        System.out.println(n);
       print(n + 1);
    }

    public static void main(String[] args) {
        print(1);

    }
}
