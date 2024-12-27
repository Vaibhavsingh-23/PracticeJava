import java.sql.*;

class Q11 {
    public static void main(String args[]) throws Exception {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mca", "root", "vaibhav12@")) {
            if (con != null) {
                System.out.println("Connected to the database");
            } else {
                System.out.println("Invalid username/password");
            }

            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            String createTableSQL = "CREATE TABLE IF NOT EXISTS EmployeeTable11 ("
                    + "employee_id INT NOT NULL AUTO_INCREMENT, "
                    + "employee_name VARCHAR(225), "
                    + "employee_city VARCHAR(225), "
                    + "salary DOUBLE, "
                    + "date_of_joining DATE, "
                    + "PRIMARY KEY (employee_id))";
            stmt.executeUpdate(createTableSQL);
            System.out.println("Created EmployeeTable in the database");


            String insertValuesSQL = "INSERT INTO EmployeeTable11 (employee_name, employee_city, salary, date_of_joining) "
                    + "VALUES ('Vaibhav', 'Noida', 50000, '2022-01-10'),"
                    + "('Mayank', 'Prayagraj', 55000, '2021-02-03'),"
                    + "('Anubhav', 'Jalalpur', 48000, '2021-03-02'),"
                    + "('Gaurav', 'Patti', 60000, '2022-01-25'),"
                    + "('Arpit', 'Noida', 52000, '2022-01-30')";
            stmt.executeUpdate(insertValuesSQL);
            System.out.println("Inserted values into EmployeeTable");

            
            ResultSet rs = stmt.executeQuery("SELECT * FROM EmployeeTable11");
            if (rs.first()) {
                System.out.println("employee_id | employee_name | employee_city | salary | date_of_joining");
                System.out.println("-------------------------------------------------------------");

                // Print the first record
                printRow(rs);

                // Move to the last record
                if (rs.last()) {
                    System.out.println("\nLast Record:");
                    printRow(rs);
                }

                // Move to the previous record (one step before the last record)
                if (rs.previous()) {
                    System.out.println("\nPrevious Record:");
                    printRow(rs);
                }

                // Move to a specific record using absolute position
                if (rs.absolute(2)) {
                    System.out.println("\nRecord at Absolute Position 2:");
                    printRow(rs);
                }

                // Move relative to the current position (1 step forward)
                if (rs.relative(1)) {
                    System.out.println("\nRelative +1 from current position:");
                    printRow(rs);
                }

                // Move relative to the current position (2 steps back)
                if (rs.relative(-2)) {
                    System.out.println("\nRelative -2 from current position:");
                    printRow(rs);
                }
            } else {
                System.out.println("No records found in EmployeeTable.");
            }
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
        }
    }

    private static void printRow(ResultSet rs) throws SQLException {
        System.out.println(rs.getInt("employee_id") + " | " +
                rs.getString("employee_name") + " | " +
                rs.getString("employee_city") + " | " +
                rs.getDouble("salary") + " | " +
                rs.getDate("date_of_joining"));
    }
}
