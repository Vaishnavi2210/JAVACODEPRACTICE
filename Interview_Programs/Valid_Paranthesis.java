 package Interview_Programs;

import java.util.Stack;

public class Valid_Paranthesis {
    public static boolean checkParenthesis(String s){
        Stack<Character> stack = new Stack<>();
        for(char ch :  s.toCharArray()){
            if(ch == '(' ){
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
               }
            }
            return stack.isEmpty();
        }

    public static void main(String[] args) {

        // Stack<String>  stack = new Stack<>();

        System.out.println(checkParenthesis("()())"));
        System.out.println(checkParenthesis("(())"));




    }
}
