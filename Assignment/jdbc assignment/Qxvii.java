import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Qxvii {

    public static void main(String[] args) {
        String imageFilePath = "B:\\sjsankar.jpg";
        String videoFilePath = "B:\\sjaisankar.mp4";

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mca1", "root", "vaibhav12@");

            String sql = "INSERT INTO person (first_name, last_name, photo, video) values (?, ?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, "Subrahmanyam");
            statement.setString(2, "Jaishankar");

            InputStream imageInputStream = new FileInputStream(new File(imageFilePath));
            statement.setBlob(3, imageInputStream);

            InputStream videoInputStream = new FileInputStream(new File(videoFilePath));
            statement.setBlob(4, videoInputStream);

            int row = statement.executeUpdate();
            if (row > 0) {
                System.out.println("A contact was inserted with photo and video.");
            }

            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}