import java.sql.*;
class Qvii{
public static void main(String[] args){
try (Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mca1", "root", "vaibhav12@")) {
            if (con != null) {
                System.out.println("Connected to the database");
            } else {
                System.out.println("Invalid username/password");
            }


String sql = "CREATE TABLE EmployeeTable2 (" +
             "empid INT PRIMARY KEY, " +
             "name VARCHAR(50), " +
             "salary INT(10), " +
             "date_of_journey DATE, " +
             "city VARCHAR(50) " +
             ");";

PreparedStatement pstmt = con.prepareStatement(sql);
pstmt.executeUpdate();
System.out.println("Table created");
} 
catch(SQLException e){}
}
}