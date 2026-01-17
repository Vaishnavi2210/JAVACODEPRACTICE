package _5_oops.inheritance;

public class Single_Inheritance {
    // One child class inherits one parent class.
    public static void main(String[] args){

        // Single Inheritance
        class Animal {
            void eat() {
                System.out.println("Eating");
            }
        }

        class Dog extends Animal {              // same method child and parent print parent if child object call
            void bark() {
                System.out.println("Barking");
            }
        }

                Dog d = new Dog();
                d.bark();
                d.eat();
    }
}
