package Interview_Programs.practice;

public class Print_Fibonacci_series_up_to_N_numbers {
    public static void main(String[] args) {

        int a = 0, b = 1;
        int n = 10;

        for (int i = a; i <= b; i++){
            int c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }

    }
}

