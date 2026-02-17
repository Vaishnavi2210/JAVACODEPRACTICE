package _2.AdvanceJava.JDBC_Connection_CRUD._01_StatementDemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo3DropTable {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/store";
        String username = "root";
        String password = "root";

        Connection con = DriverManager.getConnection(url, username, password);
        Statement statement = con.createStatement();

        statement.execute("drop table product");
        System.out.println("table deleted sucessfully");

        con.close();
        statement.close();
    }
}
