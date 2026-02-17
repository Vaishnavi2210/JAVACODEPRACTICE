package _2_AdvanceJava.JDBC_Connection_CRUD._01_StatementDemos;

import java.sql.*;

import static java.lang.Class.forName;

public class Demo1_Select {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        /*
        01. add the connector[Driver] jar to the project
        02. load and register the Driver with DriverManager
                - this is done automatically in java 8
            - explicitly
            Class.forName("driver-path");

        03. Get the connection from DriverManager by passing url, username, password
        04. Create teh Statement type object using Connection
        05. execute the query using statement reference
        06. use the result
        07. close the connection

        * */

        // 1️⃣ Add JDBC Driver -> download mysql-connector-java/8.0.11  jar from MVN Repository
        //                    -> add that file in intellije -> ProjectStructure+ libraries + add

        //2️⃣ Load Driver Class
       Class.forName("com.mysql.cj.jdbc.Driver");

       // 3️⃣ Create Connection
       String url = "jdbc:mysql://localhost:3306/hr";
       String username = "root";
       String password = "root";

        Connection connection = DriverManager.getConnection(url, username, password);

        //4️⃣ Create Statement / PreparedStatement
         Statement statement = connection.createStatement();


        // 5️⃣ Execute Query
         ResultSet resultSet = statement.executeQuery("select * from employees");


        // 6️⃣ Process ResultSet
        while(resultSet.next()){
            System.out.println(
                    resultSet.getInt("employee_id")+ "\t" +
                    resultSet.getString("first_name") + "\t"+
                    resultSet.getString("last_name")+ "\t"+
                    resultSet.getString("email")
            );
        }

        // 7. Close Resources
          resultSet.close();
          statement.close();
          connection.close();
    }
}
