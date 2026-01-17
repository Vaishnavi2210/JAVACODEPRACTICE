package _5_oops.polymorphism;

public class MethodOverlodaing {


    public int add(int a, int b){
        return a+b;
    }

    public int add(int a, int b, int c){
        return a+b+c;
    }

    public int add(float a, float b, int c, int d){
        return (int) (a+b+c+d);
    }
    public void add(int ... numbers) {   // ... elipsis operator (varargs) we call assign no. of values
        int total = 0;                   // we cannot assign different type value bcoz internally uses array and array is homogeneous.
        for (int n : numbers) {
            total += n;
        }
        System.out.println(total);
    }

    //Only one ellipsis allowed
      // void test(int... a, int... b) ❌


   // Ellipsis must be last parameter
   // void test(int a, String... b) ✅
    // void test(String... b, int a) ❌

   // Method overloading me ambiguity ho sakti hai
    // void show(int... a)
    // void show(int[] a)   // ❌ conflict

    public static void main(String[] args) {
        MethodOverlodaing m = new MethodOverlodaing();

     System.out.println(m.add(10, 20));
     System.out.println(m.add(10, 20, 30));
     System.out.println(m.add(10.0F, 12.3f, 5, 10));
     m.add(10, 20, 30, 40, 50, 60, 70, 80);

    }
}


