package Interview_Programs.practice;

public class Reverse_each_word_in_a_sentence {
    public static void main(String[] args) {

        String str = "Good Morning India";

       String[] words = str.split(" ");
       String result = "";

       for (String word : words){
           String rev = "";

           for (int i = 0; i < word.length(); i++){
               rev = word.charAt(i) + rev;
           }
           result = result +  rev + " ";
       }

        System.out.println(result.trim());


       // Using String Builder

        String[] wordss = str.split(" ");
        StringBuilder results = new StringBuilder();

        for (String worde : wordss){
            StringBuilder sb = new StringBuilder(worde);
            results.append(sb.reverse().append(" "));
        }

        System.out.println(results.toString().trim());

    }
}