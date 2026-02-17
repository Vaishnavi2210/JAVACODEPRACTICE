package _1_coreJava._15_exceptions;

public class Demo1 {
    public static void main(String[] args) {



    try {

       System.out.println(10 / 0);

        String str = null;

        System.out.println(str.length());

    }

 //catch (ArithmeticException arithmeticException) {

  //      System.out.println("invalid denominator");

  //  }

//catch (NullPointerException exception){
  //  System.out.println("String is Empty");
//}

    catch (ArithmeticException | NullPointerException exception){
        System.out.println("Exception Occurs");
    }

catch (Exception exception) {

        System.out.println("generic handler");

    }
}
}