package _12_arrays;

public class Array_Of_Names {
    public static void main(String[] args) {

        //Array of Strings
        String[] names = {"Alice", "Bob", "Carl", "David", "Emma"};

        // print names
        for(int i = 0; i < names.length; i++){
            System.out.println("Name at index "+ i + ": " + names[i]);
        }
    }
}
