package _2_AdvanceJava.JDBC_Connection_CRUD._01_StatementDemos.Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DML3_Update {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/hr";
        String username = "root";
        String password = "root";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, username, password);

            PreparedStatement preparedStatement = con.prepareStatement("?, ?, ?");

            String Query = "UPDATE employees SET email = 'Vaish@123' WHERE employee_id = 6";
            System.out.println("row successfully updated");


            preparedStatement.executeUpdate(Query);

            con.close();
            preparedStatement.close();


        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
