package _2.AdvanceJava.JDBC_Connection_CRUD._02_preparedStatementDemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import static _2.AdvanceJava.JDBC_Connection_CRUD._02_preparedStatementDemos.MysqlConstants.*;

public class Demo3Delete {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the product id to be deleted");
        int productId = scanner.nextInt();

        String sqlQuery = "delete from product where id=?";
        PreparedStatement preparedStatement = con.prepareStatement(sqlQuery);
        preparedStatement.setInt(1, productId);

        preparedStatement.executeUpdate();
        System.out.println("row deleted successfully");

        con.close();
        preparedStatement.close();


    }
}
