package _5_oops.polymorphism;

public class MethodOverriding {

    public static void main(String[] args) {

        class Animal {

            int age;
            String name;

            public void eat() {
                System.out.println("I am an eating");
            }

            public void sleep() {
                System.out.println("I am a sleeping");
            }

        }

        class Dog extends Animal {

            public void eat(){
                super.eat();   // parent class ka eat()
                System.out.println(" running ");
            }
            public void sound(){
                System.out.println(" sound bark ");

            }
        }

        Dog dog = new Dog();    // dog object
        dog.eat();
       // System.out.println(dog.age);

        System.out.println("______________________________________");

        Animal animal = new Animal();  // Animal Object
        animal.eat();
        animal.sleep();

        System.out.println("______________________________________");

        Animal a = new Dog();
        a.eat();                  //   Dog ka eat() → Runtime Polymorphism
        // dog1.sound();             //    CTE
        System.out.println(a.name); // Animal ka variable

    }
}