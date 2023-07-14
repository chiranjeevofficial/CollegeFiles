import java.sql.*;

public class Program_11 {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "admin@2023");
            createTable(con);
            insertData(con, 1, "Narayan", 5000);
            updateData(con, 1, "Laxmi Narayan", 6000);
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void createTable(Connection con) throws SQLException {
        String createTableQuery = "CREATE TABLE employees (id INT PRIMARY KEY, name VARCHAR(100), salary DOUBLE)";
        PreparedStatement stmt = con.prepareStatement(createTableQuery);
        stmt.execute();
        System.out.println("Table created successfully");
    }

    private static void insertData(Connection con, int id, String name, double salary) throws SQLException {
        String query = "INSERT INTO employees (id, name, salary) VALUES (?, ?, ?)";
        PreparedStatement stmt = con.prepareStatement(query);
        stmt.setInt(1, id);
        stmt.setString(2, name);
        stmt.setDouble(3, salary);
        stmt.executeUpdate();
        System.out.println("Data inserted successfully");
    }

    private static void updateData(Connection con, int id, String name, double salary) throws SQLException {
        String query = "UPDATE employees SET name = ?, salary = ? WHERE id = ?";
        PreparedStatement stmt = con.prepareStatement(query);
        stmt.setString(1, name);
        stmt.setDouble(2, salary);
        stmt.setInt(3, id);
        stmt.executeUpdate();
        System.out.println("Data updated successfully");
    }
}
