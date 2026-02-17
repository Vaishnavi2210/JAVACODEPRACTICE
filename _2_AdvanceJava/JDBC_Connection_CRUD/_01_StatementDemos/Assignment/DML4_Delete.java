package _2_AdvanceJava.JDBC_Connection_CRUD._01_StatementDemos.Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DML4_Delete {
    public static void main(String[] args) {

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr", "root", "root");

            PreparedStatement preparedStatement = con.prepareStatement("?, ?, ?");

            String Query = "DELETE FROM employees WHERE employee_id = 9";
            preparedStatement.executeUpdate(Query);

            System.out.println("row deleted successfully");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
