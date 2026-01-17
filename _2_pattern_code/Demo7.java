package _2_pattern_code;

public class Demo7 {
    public static void main(String[] args) {
        /*
            * 2 # 2 $
            * 3 # 3 $
            * 4 # 4 $
            * 5 # 5 $
            * 6 # 6 $
         */

        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5; j++){
                if(j==1){
                    System.out.print("*");
                } else if(j==3){
                    System.out.print("#");
                } else if(j==5){
                    System.out.print("$");
                }else {
                    System.out.print(i + 1);
                }
            }
            System.out.println();
        }
    }
}
