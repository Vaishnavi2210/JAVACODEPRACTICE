package _5_oops.inheritance;

public class Hybrid_Inheritance {
  // Hybrid inheritance is a combination of two or more types of inheritance and is achieved using interfaces.
    public static void main(String[] args){

        interface Animal{
            void eat();
        }

        class Dog implements Animal{             // single Inheritance
            public void eat(){
                System.out.println("I am eating");
            }
        }

        interface pet{
            void play();
        }

        interface cute{
            void cutipie();
        }
                                                      // single + Multiple inheritance
        class Puppy extends Dog implements pet,cute{   // Hybrid Inheritance
            public void play(){
                System.out.println("I am playing");
            }

            public void cutipie(){
                System.out.println("cuteness overloaded");
            }
        }

        Puppy p = new Puppy();
        p.eat();
        p.play();
        p.cutipie();

    }
}
