package _14_string_class;

public class Demo1UpperCase {
    public static void main(String[] args) {

        char[] array = {'a', 'b', 'c', 'd'};
        //good morning
        for(int index = 0; index < array.length; index++){
            if(array[index]>= 'a' && array[index]<='z'){
                array[index] = (char)(array[index]-32);
            }
        }
        for(char ch:array){
            System.out.println(ch);
        }
    }
}
