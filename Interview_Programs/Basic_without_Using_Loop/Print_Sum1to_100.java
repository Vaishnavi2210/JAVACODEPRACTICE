package Interview_Programs.Basic_without_Using_Loop;

public class Print_Sum1to_100 {

    static int sum(int n){
        if(n == 0){
            return 0;
        }

        return n + sum(n - 1);
    }
    public static void main(String[] args) {
        System.out.println(sum(100));
    }
}
