package Interview_Programs.Basic_without_Using_Loop;

public class PrintWithoutNumbers_1to100 {
    public static void main(String[] args) {
        // can use --> "b".length();
        int one = 'A'/'A';   // 65 / 65 = 1
        int hundread = "bbbbbbbbbb".length() * "bbbbbbbbbb".length();  // 10 * 10 = 100

        for (int i = one; i <= hundread; i++){
            System.out.println(i);     // 1 to 100
        }
    }
}
