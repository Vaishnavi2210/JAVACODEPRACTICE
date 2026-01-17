package _3_classComponents.Constructor;

public class Demo18 {
    public static void main(String[] args) {
        class Product {
            int id;
            String name;

            //zero param
            Product() {

            }

            //parameterized constructor
            Product(int i, String n) {
                id=i;
                name=n;
            }
        }

        Product product = new Product(1, "Laptop");
        System.out.println("Product ID =" + product.id);
        System.out.println("Product Name =" + product.name);
    }
}
