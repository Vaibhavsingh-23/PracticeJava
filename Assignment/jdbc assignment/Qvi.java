import java.sql.*;

class Qvi {
    public static void main(String args[]) throws Exception {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mca1", "root", "vaibhav12@")) {
            if (con != null) {
                System.out.println("Connected to the database");
            } else {
                System.out.println("Invalid username/password");
            }

            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery("SELECT * FROM employeetable");
            if (rs.first()) {
                System.out.println("employee_id | employee_name | employee_city | salary | date_of_joining");
                System.out.println("-------------------------------------------------------------");
                do {
                  System.out.println(rs.getInt("employee_id") + "	"+rs.getString("employee_name") + "	"+ rs.getString("employee_city") +   "   	"+ rs.getDouble("salary") +"	"+rs.getDate("date_of_joining"));
                } while (rs.next());
            } else {
                System.out.println("No records found in EmployeeTable.");
            }
        } catch (SQLException e) {            System.out.println("SQL Exception: " + e.getMessage());
        }
    }
}
