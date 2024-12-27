import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Qxv {

    public static void main(String[] args) {
        String filePath = "B:\\sjsankar.jpg"; // Corrected file path

        try {
            // Corrected IP address for localhost
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mca1", "root", "vaibhav12@");

            String sql = "INSERT INTO person (first_name, last_name, photo) values (?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, "Subrahmanyam");
            statement.setString(2, "Jaishankar");
            InputStream inputStream = new FileInputStream(new File(filePath));

            statement.setBlob(3, inputStream);

            int row = statement.executeUpdate();
            if (row > 0) {
                System.out.println("A contact was inserted with photo image.");
            }

            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
