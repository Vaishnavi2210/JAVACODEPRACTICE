package _5_oops.polymorphism;

public class Demo2 {
    public static void main(String[] args) {
      System.out.println("public static void main(String[] args)");
           main((StringBuilder) null);
    }
    public static void main(String args) {
        System.out.println("public static void main(String args)");
    }
    public static void main(StringBuilder args) {
        System.out.println("public static void main(StringBuilder args)");
    }

}
