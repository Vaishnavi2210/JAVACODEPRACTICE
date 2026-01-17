package Interview_Programs;

public class Sum_of_digits {

    public int Solution(int n){

        int sum = 0;

        // Handle 0 explicitly
        if(n == 0) return 0;

        while(n != 0){
            int digit = n % 10;

            // make sure digit is positive
            if(digit < 0) digit = -digit;

            sum += digit;
            n = n/10;
        }
       return  sum;
    }
    public static void main(String[] args) {

        Sum_of_digits obj = new Sum_of_digits();

        System.out.println(obj.Solution(12345));
    }
}
