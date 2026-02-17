package Interview_Programs.practice;

public class Print_1_to_100_withou_using_loop {

    static void print(int n){

        if(n > 100){
            return;
        }

        System.out.println(n);
        print(n + 1);
    }

    public static void main(String[] args) {
        print(1);
    }
}
