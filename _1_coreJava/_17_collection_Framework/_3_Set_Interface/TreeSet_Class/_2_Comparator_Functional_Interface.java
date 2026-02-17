package _1_coreJava._17_collection_Framework._3_Set_Interface.TreeSet_Class;

import java.util.*;

public class _2_Comparator_Functional_Interface {
    /*
1️⃣ What is Comparator?
Comparator is a functional interface in Java.
It is used to define custom sorting logic for objects. compare(,) method which accept 2 parameters
A functional interface = an interface with only one abstract method.

2️⃣ Method signature
@FunctionalInterface
public interface Comparator<T> {
    int compare(T o1, T o2);
}

compare(T o1, T o2) → returns:
< 0 → o1 comes before o2
0 → o1 equals o2
> 0 → o1 comes after o2

 */

    public static void main(String[] args) {
        // Sorting integers in reverse order
        List<Integer> list = Arrays.asList(5, 2, 8, 1);

        // Using Comparator with lambda
        Collections.sort(list, (a, b) -> b - a);  //descending order

        System.out.println(list); // [8, 5, 2, 1]


        class Product {
            int id;
            String name;
            double price;

            public Product(int id, String name, double price) {
                this.id = id;
                this.name = name;
                this.price = price;
            }

            public Product() {
            }

            @Override
            public String toString() {
                return "Product{" + "id=" + id + ", name='" + name + '\'' + ", price=" + price + '}';
            }


        }
        Product product1 = new Product(11, "laptop", 50000);
        Product product2 = new Product(2, "mobile", 30000);
        Product product3 = new Product(32, "camera", 20000);
        Product product4 = new Product(4, "projector", 50000);

        Comparator<Product> comparator = (p1, p2) -> p1.id - p2.id;
        Set<Product> products = new TreeSet<>(comparator);
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product4);
        products.add(product4);

        for (Product product : products) {
            System.out.println(product);
        }
    }

}