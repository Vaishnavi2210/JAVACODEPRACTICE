package com.itShaala.controller;

import com.itShaala.model.Product;
import com.itShaala.service.ProductService;

import java.util.List;

public class ProductController {
    private ProductService productService = new ProductService();

   public void add(Product product) {
       productService.add(product);
   }

    public void update(Product product){
       productService.update(product);
    }

    public void delete(int id){
       productService.delete(id);
    }

    public Product getById(int id){
       return productService.getById(id);
    }

    public List<Product> getAll(){
       return productService.getAll();
    }




}
