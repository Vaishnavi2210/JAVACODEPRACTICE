package _2.AdvanceJava.JDBC_Connection_CRUD._01_StatementDemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo6Delete {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/store", "root", "root");

        Statement statement = con.createStatement();

        statement.executeUpdate("DELETE FROM product WHERE id = 4");
        System.out.println("deleted row successfully");
        con.close();
        statement.close();

    }
}
