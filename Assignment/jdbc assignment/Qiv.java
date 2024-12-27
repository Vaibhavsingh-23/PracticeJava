import java.sql.*;

class Qiv{
    public static void main(String args[]) throws Exception {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mca1", "root", "vaibhav12@")) {
            if (con != null) {
                System.out.println("Connected to the database");
            } else {
                System.out.println("Invalid username/password");
            }

            Statement stmt = con.createStatement();

            String createTableSQL = "CREATE TABLE IF NOT EXISTS EmployeeTable ("
                    + "employee_id INT NOT NULL AUTO_INCREMENT, "
                    + "employee_name VARCHAR(225), "
                    + "employee_city VARCHAR(225), "
                    + "salary DOUBLE, "
                    + "date_of_joining DATE, "
                    + "PRIMARY KEY (employee_id))";
            stmt.executeUpdate(createTableSQL);
            System.out.println("Created EmployeeTable in the database");

 } catch (SQLException e) {      
	      System.out.println("SQL Exception: " + e.getMessage());
        }
    }
}
