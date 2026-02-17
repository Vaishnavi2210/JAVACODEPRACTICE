package _1_coreJava._17_collection_Framework._2_List_Interface._4_Stack_Class;

import java.util.Stack;

public class Paranthesis_Balance {
    /*
    Rule:
          When you see ( → push into stack
          When you see ) → pop from stack
          If stack empty when popping → invalid
          At end stack should be empty
     */

      public static boolean isBalanced(String str){
          Stack<Character> stack = new Stack<>();

           for (char ch : str.toCharArray()){
               if(ch == '(' )
               stack.push(ch);
               else if(ch == ')' )
                   if (stack.isEmpty())
                       return false;
                   else
                    stack.pop();
           }

          return stack.isEmpty();
      }

    public static void main(String[] args) {
        System.out.println(isBalanced("(())"));
        System.out.println(isBalanced("()(("));
        System.out.println(isBalanced(")()}"));

    }





}
