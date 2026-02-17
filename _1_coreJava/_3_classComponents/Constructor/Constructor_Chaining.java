package _1_coreJava._3_classComponents.Constructor;

public class Constructor_Chaining { // within same class

    int x;
    int y;
    boolean c;
    String name;
    char ch;

    // Method
      public  void  add(int x, int y){
          int z = x+y;
      }

      Constructor_Chaining(){
          System.out.println("Default Constructor ");
      }

      Constructor_Chaining(int a){
          this();
          System.out.println("Parameterized Constructor int a :" + a);
      }

      Constructor_Chaining(int a, int b){
          this(a);
          System.out.println("Parameterized Constructor int a, int b : "+ a + ", "+ b);
      }

    public static void main(String[] args) {
        Constructor_Chaining cc = new Constructor_Chaining(10, 20);

        System.out.println(cc.x);   // int - 0
        System.out.println(cc.y);   // int - 0
        System.out.println(cc.c);   // boolean - null
        System.out.println(cc.name);  // String - null
        System.out.println(cc.ch);  //  \u0000 → Unicode null character(invisible)

        // default constructor is provided by JVM isf developer not provide any constructor explicitelly,
        // which is add(present) in byteCode can see(intellije -> view -> show bytecode)
   /*  It looks like :

            public <init>()V
             L0
              LINENUMBER 3 L0
              ALOAD 0
              INVOKESPECIAL java/lang/Object.<init> ()V
              RETURN

    */





    }
}
