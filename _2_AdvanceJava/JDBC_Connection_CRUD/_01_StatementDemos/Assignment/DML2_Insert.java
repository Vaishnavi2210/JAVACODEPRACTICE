package _2_AdvanceJava.JDBC_Connection_CRUD._01_StatementDemos.Assignment;

import java.sql.*;

public class DML2_Insert {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/hr";
        String username = "root";
        String password = "root";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username, password);
            Statement statement = con.createStatement();

            // insert Statement
            String sql = "INSERT INTO employees(first_name, last_name, email) " +
                    "VALUES ('Vaishnavi', 'Nerkar', 'vnerkar22@gmail.com'), " +
                    "('Gayatri', 'Nerkar', 'gayunerkar19@gmail.com')," +
                    "('Jay', 'Nerkar', 'jaynerkar28@gmail.com')";

            int rows =  statement.executeUpdate(sql);

            System.out.println(rows + " row(s) inserted.");

            // To print all employees from hr database
            ResultSet resultSet = statement.executeQuery("select * FROM employees");

            while (resultSet.next()){
                System.out.println(
                        resultSet.getInt("employee_id")+ "\t"+
                        resultSet.getString("first_name")+ "\t"+
                        resultSet.getString("last_name")+ "\t"+
                        resultSet.getString("email")
                );
            }

            resultSet.close();
            statement.close();
            con.close();

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
