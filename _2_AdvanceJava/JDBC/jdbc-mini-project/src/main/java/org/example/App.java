package org.example;

import com.itShaala.controller.ProductController;
import com.itShaala.model.Product;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main( String[] args ) {

        Scanner sc = new Scanner(System.in);
       // System.out.println("Enter Product id, name, price : ");
       // int productId = sc.nextInt();
     //   String productName = sc.next();
     //   int productPrice = sc.nextInt();

        Product product = new Product();
       // product.setId(productId);
       // product.setName(productName);
       // product.setPrice(productPrice);

        ProductController productController = new ProductController();
        //  productController.add(product);
        //  productController.update(product);
        //  productController.delete(productId);
        //System.out.println(productController.getById(3));

      List<Product> productList = productController.getAll();
      productList.forEach(System.out::println);



    }
}
