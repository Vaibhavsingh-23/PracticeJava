import java.sql.*;

class Qix {
    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mca1", "root", "vaibhav12@")) {
            if (con != null) {
                System.out.println("Connected to database");

                String sql = "SELECT empid, name, salary, date_of_journey, city FROM EmployeeTable2";
                PreparedStatement pstmt = con.prepareStatement(sql);
                ResultSet rs = pstmt.executeQuery();

                System.out.println("Employee Data:");
                System.out.println("ID	Name	Salary	Date of Journey	City");
                while (rs.next()) {
                    int empId = rs.getInt("empid");
                    String name = rs.getString("name");
                    int salary = rs.getInt("salary");
                    Date dateOfJourney = rs.getDate("date_of_journey");
                    String city = rs.getString("city");

                    System.out.println(empId + "	" + name + "		" + salary + "		" + dateOfJourney + "	" + city);
                }

                rs.close();
                pstmt.close();
            } else {
                System.out.println("Invalid username/password");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
