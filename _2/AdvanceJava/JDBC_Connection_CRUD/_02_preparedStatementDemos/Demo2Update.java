package _2.AdvanceJava.JDBC_Connection_CRUD._02_preparedStatementDemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo2Update {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/store",
                                                         "root", "root");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the product id");
        int productId = scanner.nextInt();

        System.out.println("Enter the product name");
        String productName = scanner.next();

        System.out.println("Enter the product price");
        int productPrice = scanner.nextInt();

        String sqlQuery = "update product set name=?, price=? where id=?";
        PreparedStatement preparedStatement = con.prepareStatement(sqlQuery);

        preparedStatement.setString(1, productName);
        preparedStatement.setInt(2, productPrice);
        preparedStatement.setInt(3, productId);

        preparedStatement.executeUpdate();
        System.out.println("row updated successfully");

        con.close();
        preparedStatement.close();


    }
}
