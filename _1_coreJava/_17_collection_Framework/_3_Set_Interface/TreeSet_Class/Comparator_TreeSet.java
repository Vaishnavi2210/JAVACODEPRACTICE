package _1_coreJava._17_collection_Framework._3_Set_Interface.TreeSet_Class;

import java.util.Set;
import java.util.TreeSet;

public class Comparator_TreeSet {
    public static void main(String[] args) {

        class Products{
            int id;
            String name;
            double price;

            public Products() {
            }

            public Products(int id, String name, double price){
                this.id = id;
                this.name = name;
                this.price = price;
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

          Set<Products> tSet = new TreeSet<>((p1, p2) -> Double.compare(p1.price, p2.price));
        //Set<Products> tSet = new TreeSet<>((p1, p2) -> Integer.compare(p1.id, p2.id));
        // Set<Products> tSet = new TreeSet<>((p1, p2) -> p1.name.compareTo(p2.name) );


        tSet.add(new Products(1, "Laptop", 65000));
        tSet.add(new Products(2, "Mobile", 21000));
        tSet.add(new Products(3, "Camera", 35000));

        for (Products p : tSet ){
            System.out.println(p);
        }

    }
}
