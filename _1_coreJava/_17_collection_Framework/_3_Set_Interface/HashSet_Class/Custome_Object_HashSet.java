package _1_coreJava._17_collection_Framework._3_Set_Interface.HashSet_Class;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Custome_Object_HashSet {

    public static void main(String[] args) {
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

            @Override
            public boolean equals(Object object) {
                if (object == null || getClass() != object.getClass()) return false;
                Product product = (Product) object;
                return id == product.id && Double.compare(price, product.price) == 0 && Objects.equals(name, product.name);
            }

            @Override
            public int hashCode() {
                return Objects.hash(id, name, price);
            }
//            @Override
//            public boolean equals(Object object) {
//                if (this == object) return true;
//                if (object == null || getClass() != object.getClass()) return false;
//                Product product = (Product) object;
//                return id == product.id;
//            }
//
//            @Override
//            public int hashCode() {
//                return Objects.hashCode(id);
//            }
        }
        Product product1 = new Product(11, "laptop", 50000);
        Product product2 = new Product(2, "mobile", 30000);
        Product product3 = new Product(3, "camera", 20000);
        Product product4 = new Product(4, "projector", 50000);
        Product product5 = new Product(4, "projector", 50000);
        Product product6 = new Product(4, "projector", 50000);

        Set<Product> products = new HashSet<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);
        products.add(product6);

        for (Product product : products) {
            System.out.println(product);
        }
        //currently equals method does the reference check

    }
}
