package Interview_Programs.Basic_without_Using_Loop;

public class Print_Even {

       static void print(int n){
           if(n > 100){
               return;
           }

           if(n % 2 == 0){
               System.out.println(n);
           }

           print(n+1);
       }
    public static void main(String[] args) {
           print(1);

    }
}
