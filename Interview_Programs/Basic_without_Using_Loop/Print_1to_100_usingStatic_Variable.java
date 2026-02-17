package Interview_Programs.Basic_without_Using_Loop;

public class Print_1to_100_usingStatic_Variable {
   // Using static variable
    static  int n = 1;

    static void print() {
        if (n <= 100) {
            System.out.println(n);
            n++;
            print();
        }
    }

    public static void main(String[] args) {
        print();
    }

}
