package _3_classComponents.Constructor;

public class Demo17_this {
    public static void main(String[] args) {
        class Product {
            int id;
            String name;

            //zero param
            Product() {

            }

            //parameterized constructor
            Product(int id, String name) {
               /* //local variable to local
                id = id;
                name= name;*/

                //assign local variable value to instance variable
                this.id = id;
                this.name = name;
            }
        }

        Product product = new Product(1, "Laptop");
        System.out.println("Product ID =" + product.id);
        System.out.println("Product Name =" + product.name);
    }
}
