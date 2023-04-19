package BrahmasmiClasses;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectivity {
    public static Connection getConnectionWithMySQL(String databaseName, String username, String password) {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + databaseName, username, password);
            if(con!=null)
                System.out.println("Connection Established");
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return con;
    }
}
