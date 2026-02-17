package _1_coreJava._17_collection_Framework._3_Set_Interface.TreeSet_Class;

import java.util.Set;
import java.util.TreeSet;

public class Comparable_TreeSet {
    public static void main(String[] args) {

        class Products{
            int id ;
            String name;
            double salary;

            Products(int id, String name, double salary){
                this.id = id;
                this.name=name;
                this.salary=salary;
            }

            Products(){

            }

            public  int compareTo(Products p){
               return this.id = p.id;     // sorting by id
            }

            @Override
            public String toString() {
                return "Products{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        ", salary=" + salary +
                        '}';
            }
        }

        Products product1 = new Products(1, "Laptop", 50000);
        Products product2 = new Products(2, "Mobile", 21000);
        Products product3 = new Products(3, "Camera",  35000);
        Products product4 = new Products(4, "Projector", 40000);

        Set<Products> tSet = new TreeSet<>();
        tSet.add(product1);
        tSet.add(product2);
        tSet.add(product3);
        tSet.add(product4);
        tSet.add(product4);
        tSet.add(product4);
        tSet.add(product4);

        for (Products products : tSet){
            System.out.println(products);
        }

    }
}
