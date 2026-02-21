package com.itShaala.dao;

import com.itShaala.model.Product;
import com.itShaala.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static constants.MyConstant.*;
public class ProductDao {

    public void add(Product product){

        Connection connection = ConnectionUtil.getConnection();
        try {
            String sqlQuery = "insert into product(id, name, price) values(?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

            preparedStatement.setInt(1, product.getId());
            preparedStatement.setString(2, product.getName());
            preparedStatement.setInt(3, product.getPrice());


            preparedStatement.executeUpdate();

            System.out.println("product added successfully");
        } catch (SQLException e){
            System.out.println(e.getMessage());
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void update(Product product){
        Connection connection = ConnectionUtil.getConnection();

        try{
            String sqlQuery ="Update product set name = ?, price = ? where id = ? ";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setString(1, product.getName());
            preparedStatement.setInt(2, product.getPrice());
            preparedStatement.setInt(3, product.getId());

            preparedStatement.executeUpdate();
            System.out.println("product updated successfully");

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void delete(int id){
        Connection connection = ConnectionUtil.getConnection();

        try{
            String sqlQuery ="delete from product where id = ? ";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setInt(1, id);

            preparedStatement.executeUpdate();
            System.out.println("product deleted successfully");

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public Product getById(int id){
        Connection connection = ConnectionUtil.getConnection();
        Product product = new Product();
        try{
            String sqlQuery ="select * from product where id = ? ";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setInt(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                product.setId(resultSet.getInt("id"));
                product.setName(resultSet.getString("name"));
                product.setPrice(resultSet.getInt("price"));
            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
       return product;
    }

    public List<Product> getAll(){
        List<Product> productList = new ArrayList<>();
        Connection connection = ConnectionUtil.getConnection();

        try{

            String sqlQuery ="select * from product";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                Product product = new Product();

                product.setId(resultSet.getInt("id"));
                product.setName(resultSet.getString("name"));
                product.setPrice(resultSet.getInt("price"));
                productList.add(product);
            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return productList;
    }

}
