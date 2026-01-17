package _5_oops.inheritance;

public class Multilevel_Inheritance {
    // A class inherits another class which itself inherits a parent class.
    public static void main(String[] args) {

        class Animal {
            public void eat() {
                System.out.println("Animal is eating");
            }
        }

        class Dog extends Animal {
            public void bark() {
                System.out.println("Dog is Barking");
            }
        }

        class Puppy extends Dog{
            public void play() {
                System.out.println("Puppy is playing");
            }
        }

        Puppy puppy = new Puppy();
        puppy.eat();
        puppy.bark();
        puppy.play();
    }
}
