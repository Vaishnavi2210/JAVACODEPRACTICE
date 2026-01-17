package _6_interfaces_types;

public class Functional_Interface {
    // Contains only one abstract method - Introduce in java8 to support lambda Expression.
    // Can have multiple default and static methods, but only one abstract method.

    @FunctionalInterface
    interface calculator{
        int add(int a, int b);
    }
}
