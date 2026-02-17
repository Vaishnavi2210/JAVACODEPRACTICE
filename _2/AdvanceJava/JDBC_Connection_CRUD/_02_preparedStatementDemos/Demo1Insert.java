package _2.AdvanceJava.JDBC_Connection_CRUD._02_preparedStatementDemos;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo1Insert {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/store", "root", "root");

        // User input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the product id");
        int productId = sc.nextInt();

        System.out.println("Enter Product Name : ");
        String productName = sc.next();

        System.out.println("Enter Product Price : ");
        int productPrice = sc.nextInt();

        String Query = "INSERT INTO product(id, name, price) VALUES(?, ?, ?)";
        PreparedStatement preparedStatement = con.prepareStatement(Query);

        preparedStatement.executeUpdate();
        System.out.println("row inserted successfully");

        preparedStatement.setInt(1,productId );
        preparedStatement.setString(2, productName );
        preparedStatement.setInt(3, productPrice);

        con.close();
        preparedStatement.close();

    }
}
