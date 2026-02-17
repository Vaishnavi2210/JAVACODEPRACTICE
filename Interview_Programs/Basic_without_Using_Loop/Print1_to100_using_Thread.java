package Interview_Programs.Basic_without_Using_Loop;

public class Print1_to100_using_Thread {
    static int n = 1;

    public static void main(String[] args) {

        new Thread(() -> {
            while (n <= 100) {
                System.out.println(n++);
            }
        }).start();
    }
}
