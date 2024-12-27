import java.sql.SQLException;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class Qxviii {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mca1";
        String user = "root";
        String password = "vaibhav12@";

        try (JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet()) {
            rowSet.setUrl(url);
            rowSet.setUsername(user);
            rowSet.setPassword(password);
            rowSet.setCommand("SELECT * FROM student");
            rowSet.execute();

            while (rowSet.next()) {
                int studentId = rowSet.getInt("student_id");
                String name = rowSet.getString("name");
                String email = rowSet.getString("email");
                String major = rowSet.getString("major");
                System.out.printf("Student ID: %d, Name: %s, Email: %s, Major: %s%n", studentId, name, email, major);
            }
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
