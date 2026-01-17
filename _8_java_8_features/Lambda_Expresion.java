package _8_java_8_features;

public interface Lambda_Expresion {

    /* To implement the functional interfaces lambda came into the picture. (Interfaces with only one abstract method)
      -  A lambda expression is a short way to write a function(Method) without name.
      -  Before Java8 - we had to write lots of code using anonymous classes.
      - Lambda makes code : Shorter, Cleaner, Easier to read
      - Syntax :  (parameter) -> expression OR (parameter) -> {Statements}
     */

    //Lambdas work with only one functional interface at a time
    interface Test{
        void show();
    }

    // Before java8

        public static void main(String[] args){

            Test t = new Test(){                       // using anonymous class
                public void show(){
                    System.out.println("Hello");
                }
            };
            t.show();
        }


    // After java8
    interface Test2{
        void show();
    }
    class Demo2{

        Test t = () -> System.out.println("Hello");    // Lambda Expression
    }




    }
