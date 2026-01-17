package _2_pattern_code;

public class Demo6 {
    public static void main(String[] args) {
        /*




         */

        for(int i = 1; i <=5; i++){
            for(int j =1; j <= 5; j++){

                if(j == 1){
                    System.out.print("*");
                } else if(j == 3){
                    System.out.print("#");
                } else if(j == 5){
                    System.out.print("$");
                } else {
                    System.out.print(i);
                }
            }
            System.out.println();
        }












    }
}
