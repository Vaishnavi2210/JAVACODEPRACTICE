package _1_coreJava._17_collection_Framework._3_Set_Interface.HashSet_Class;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class Demo_CustomObjectS {
    public static void main(String[] args) {
        class  Products{
            int id;
            String name;
            double price;

            public Products(int id, String name, double price){
                this.id = id;
                this.name=name;
                this.price=price;
            }

            public Products(){

            }

            @Override
            public String toString() {
                return "Products{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        ", price=" + price +
                        '}';
            }
        }

        Products product1 = new Products(1, "Laptop", 50000);
        Products product2 = new Products(2, "mobile", 24000);
        Products product3 = new Products(3, "Camera", 35000);
        Products product4 = new Products(4, "Projector", 40000);

        Set<Products> product = new HashSet<>();
        product.add(product1);
        product.add(product2);
        product.add(product3);
        product.add(product4);

        //02. enhanced for loop
        System.out.println("02. enhanced for loop");
        for (Products products : product){
            System.out.println(products);
        }

        //03. java8 forEach method
        System.out.println("03. java8 forEach method");
        //Consumer<product> consumer = x -> System.out.println(x);
        Consumer<Products> consumer = System.out::println;
        // products.forEach(consumer);
        product.forEach(System.out::println);

        // 04. iterator
        System.out.println("iterator");
        Iterator<Products> iterator = product.iterator();
        while ((iterator.hasNext())){
            System.out.println(iterator.next());
        }
    }
}
