import java.sql.*;

class Q12 {
    public static void main(String args[]) throws Exception {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mca", "root", "vaibhav12@")) {
            if (con != null) {
                System.out.println("Connected to the database");
            } else {
                System.out.println("Invalid username/password");
            }

            Statement stmt = con.createStatement();
/*
            // Create the EmployeeTable if it does not exist
            String createTableSQL = "CREATE TABLE IF NOT EXISTS EmployeeTable12 ("
                    + "employee_id INT NOT NULL AUTO_INCREMENT, "
                    + "employee_name VARCHAR(225), "
                    + "employee_city VARCHAR(225), "
                    + "salary DOUBLE, "
                    + "date_of_joining DATE, "
                    + "PRIMARY KEY (employee_id))";
            stmt.executeUpdate(createTableSQL);
            System.out.println("Created EmployeeTable in the database");

            // Insert sample values into the EmployeeTable
            String insertValuesSQL = "INSERT INTO EmployeeTable12 (employee_name, employee_city, salary, date_of_joining) "
                    + "VALUES ('Vaibhav', 'Noida', 50000, '2022-01-10'),"
                    + "('Mayank', 'Prayagraj', 55000, '2021-02-03'),"
                    + "('Anubhav', 'Jalalpur', 48000, '2021-03-02'),"
                    + "('Gaurav', 'Patti', 60000, '2022-01-25'),"
                    + "('Arpit', 'Noida', 52000, '2022-01-30')";
            stmt.executeUpdate(insertValuesSQL);
            System.out.println("Inserted values into EmployeeTable");*/

            // Update the salary of all employees by incrementing it by 50000
            String updateSalarySQL = "UPDATE EmployeeTable12 SET salary = salary + 50000";
            int rowsAffected = stmt.executeUpdate(updateSalarySQL);
            System.out.println("Updated salary for " + rowsAffected + " employees.");

            // Query to fetch and display all records
            ResultSet rs = stmt.executeQuery("SELECT * FROM EmployeeTable12");
            System.out.println("\nemployee_id | employee_name | employee_city | salary | date_of_joining");
            System.out.println("-------------------------------------------------------------");

            while (rs.next()) {
                System.out.println(rs.getInt("employee_id") + " | " +
                                   rs.getString("employee_name") + " | " +
                                   rs.getString("employee_city") + " | " +
                                   rs.getDouble("salary") + " | " +
                                   rs.getDate("date_of_joining"));
            }

        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
        }
    }
}
