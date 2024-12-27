import java.sql.*;

class Qxiii {
    public static void main(String[] args) {
        String createProcedureSQL =
            "CREATE PROCEDURE NEW_EMPLOYEE(first char(100), last char(100), " +
            "birthday_input date) "
            + "BEGIN "
            + "INSERT INTO employee(first_name,last_name) VALUES (first,last); "
            + "SET @id=(SELECT LAST_INSERT_ID()); "
            + "INSERT INTO BIRTHDAY(emp_id,birthday) VALUES (@id,birthday_input); "
            + "END";

        try (Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mca1", "root", "vaibhav12@")) {
            Statement stmt = con.createStatement();
            // Drop procedure if it exists
            System.out.println("Dropping existing procedure...");
            stmt.execute("DROP PROCEDURE IF EXISTS NEW_EMPLOYEE");
            System.out.println("Creating procedure...");
            stmt.execute(createProcedureSQL);
            System.out.println("Procedure created successfully");

            // Call the procedure
            String call = "{CALL NEW_EMPLOYEE(?,?,?)}";
            CallableStatement ctmt = con.prepareCall(call);
            ctmt.setString(1, "Vaibhav");
            ctmt.setString(2, "Singh");
            ctmt.setString(3, "2000-12-07");
            System.out.println("Calling procedure...");
            int rowsAffected = ctmt.executeUpdate(); // Use executeUpdate for data manipulation
            System.out.println("Rows affected: " + rowsAffected);
        } catch (SQLException e) {
            System.out.println("SQL Exception occurred:");
            e.printStackTrace();
        }
    }
}
