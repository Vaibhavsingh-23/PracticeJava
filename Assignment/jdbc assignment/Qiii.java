import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

class Qiii {
    public static void main(String args[]) {
        // Connect using DriverManager with hardcoded credentials
        try (Connection con = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/mca", "root", "vaibhav12@")) {
            if (con != null)
                System.out.println("Connected to database using DriverManager class");
            else
                System.out.println("Invalid username or password");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Connect using properties file
        try (InputStream input = Qiii.class.getClassLoader().getResourceAsStream("db.properties")) {
            Properties prop = new Properties();
            if (input == null) {
                System.out.println("Unable to find db.properties");
                return;
            }
            prop.load(input);
            String url = prop.getProperty("db.url");
            String username = prop.getProperty("db.username");
            String password = prop.getProperty("db.password");
            try (Connection connection = DriverManager.getConnection(url, username, password)) {
                System.out.println("Connected to database using properties file");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        // Connect using environment variables
        String url = System.getenv("DB_URL");
        String username = System.getenv("DB_USERNAME");
        String password = System.getenv("DB_PASSWORD");
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connected to database using environment variables");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
