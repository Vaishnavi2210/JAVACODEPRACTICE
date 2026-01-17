package _3_classComponents.Constructor;

public class Demo16_this {
    public static void main(String[] args){

        class Dummy {
            int a = 1;// iv
            static int b = 2; //sv

            void display() {
                int a = 10;//lv
                int b = 20;//lv

                System.out.println("local variable a="+a);//10
                System.out.println("local variable b="+b);//20

                System.out.println("instance variable a="+this.a);
                System.out.println("static variable b="+Dummy.b);
            }
        }
        Dummy ref = new Dummy();
        ref.display();
    }
}

