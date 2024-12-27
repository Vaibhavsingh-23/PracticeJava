import java.sql.*;
class Q8{
public static void main(String[] args){
try (Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mca", "root", "vaibhav12@")) {
            if (con != null) {
                System.out.println("Connected to the database");
            } else {
                System.out.println("Invalid username/password");
            }

String sql = "CREATE TABLE employees24 (" +
             "empid INT PRIMARY KEY, " +
             "name VARCHAR(50), " +
             "salary INT(10), " +
             "date_of_journey DATE, " +
             "city VARCHAR(50) " +
             ");";

PreparedStatement pstmt = con.prepareStatement(sql);
pstmt.executeUpdate();
System.out.println("table created");


String insertSql = "INSERT INTO employees24 (empid,name, salary, date_of_journey, city) VALUES (?,?, ?, ?, ?)";
           pstmt = con.prepareStatement(insertSql);

            for (int i = 1; i <= 10; i++) {
		 pstmt.setInt(1, i); // Setting empid
                pstmt.setString(2, "Employee " + i);
                pstmt.setInt(3, 50000 + i * 1000);
                pstmt.setDate(4, java.sql.Date.valueOf("2023-11-23")); 
                pstmt.setString(5, "City " + i);
                pstmt.executeUpdate();
            }
            System.out.println("10 records inserted successfully.");

            String selectSql = "SELECT * FROM employees24";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(selectSql);
            System.out.println("ID | Name       | Salary | Date of Journey | City");
            while (rs.next()) {
                System.out.println(rs.getInt("empid") + " | " 
                                   + rs.getString("name") + " | " 
                                   + rs.getInt("salary") + " | " 
                                   + rs.getDate("date_of_journey") + " | " 
                                   + rs.getString("city"));
            }
            rs.close();
            stmt.close();
            pstmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}







