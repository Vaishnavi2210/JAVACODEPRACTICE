package _2.AdvanceJava.JDBC_Connection_CRUD._01_StatementDemos.Assignment;

import java.sql.*;

public class DQL1_select {
    public static void main(String[] args) {

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr",
                                                         "root",
                                                     "root");

            String sqlQuery = "SELECT employee_id, first_name, last_name, email FROM employees";

            PreparedStatement preparedStatement = con.prepareStatement(sqlQuery);

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("employee_id");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                String email_id = resultSet.getString("email");

                    System.out.println(id + " | " + firstName + " | "+ lastName + " | "+ email_id );

            }

           resultSet.close();
            con.close();
            preparedStatement.close();

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
