package _5_oops.inheritance;

public class Heirachical_Inheritance {
         // Multiple child classes inherit a single parent class.
    public static void main(String[] args) {
        class Animal {
            public void eat() {
                System.out.println("Animal eat");
            }
        }

        class Dog extends Animal {
            public void bark() {
                System.out.println("Dog barking");
            }
        }

        class Cat extends Animal {
            public void meow() {
                System.out.println("Cat meowing");
            }
        }

        class Cow extends Animal {
            public void giveMilk() {
                System.out.println("Cow gives milk");
            }
        }

        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        Cat cat = new Cat();
        cat.eat();
        cat.meow();

        Cow cow = new Cow();
        cat.eat();
        cow.giveMilk();

    }
}