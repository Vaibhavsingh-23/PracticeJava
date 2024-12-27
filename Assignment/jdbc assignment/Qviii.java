import java.sql.*;
import java.sql.Date;

class Qviii {
    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mca1", "root", "vaibhav12@")) {
            if (con != null) {
                System.out.println("Connected to database");
            } else {
                System.out.println("Invalid username/password");
            }
            
           
     String sql = "INSERT INTO EmployeeTable2 (empid, name, salary, date_of_journey, city) VALUES (?, ?, ?, ?, ?)";
     PreparedStatement pstmt = con.prepareStatement(sql);
            
     int[] id = {11, 12, 13, 14, 15};
      String[] name = {"vaibhav", "Mayank", "Gaurav", "Anubhav", "Arpit"};
      int[] salary = {11111, 22222, 33333, 44444, 55555};
     Date dateOfJourney = Date.valueOf("2023-12-11"); 
            
            for (int i = 0; i < id.length; i++) {
                pstmt.setInt(1, id[i]);
                pstmt.setString(2, name[i]);
                pstmt.setInt(3, salary[i]);
                pstmt.setDate(4, dateOfJourney);
                pstmt.setString(5, "Noida");

                pstmt.executeUpdate();
            }

            System.out.println("Data inserted successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}