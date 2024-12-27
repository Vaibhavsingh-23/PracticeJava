import java.sql.*;
import javax.sql.rowset.*;
import javax.sql.rowset.spi.*;
import java.io.*;

public class Qxvi {
    static Console console = System.console();
    static String answer;
    static boolean quit = false;

    public static void main(String[] args) {
        if (console == null) {
            System.out.println("No console available");
            return;
        }

        String url = "jdbc:mysql://localhost:3306/jdbc";
        String username = "root";
        String password = "1234";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc", "root", "vaibhav12@")) {
            conn.setAutoCommit(false);

            String sql = "SELECT * FROM student1";
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sql);

            // Create a RowSetFactory and CachedRowSet
            RowSetFactory factory = RowSetProvider.newFactory();
            CachedRowSet rowset = factory.createCachedRowSet();
            rowset.setTableName("Student1");
            rowset.populate(result);

            while (!quit) {
                if (!readStudent(rowset)) continue;
                updateStudent(rowset);
                deleteStudent(rowset);
                insertStudent(rowset);
                saveChanges(rowset, conn);
                askToQuit();
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }

    static void readStudentInfo(String position, CachedRowSet rowset) throws SQLException {
        String name = rowset.getString("name");
        String email = rowset.getString("email");
        String major = rowset.getString("major");
        String studentInfo = "%s: %s - %s - %s\n";
        System.out.format(studentInfo, position, name, email, major);
    }

    static boolean readStudent(CachedRowSet rowset) throws SQLException {
        int row = Integer.parseInt(console.readLine("Enter student number: "));
        if (rowset.absolute(row)) {
            readStudentInfo("Student at row " + row, rowset);
            return true;
        } else {
            System.out.println("There's no student at row " + row);
            return false;
        }
    }

    static void updateStudent(CachedRowSet rowset) throws SQLException {
        answer = console.readLine("Do you want to update this student (Y/N)?: ");
        if (answer.equalsIgnoreCase("Y")) {
            String name = console.readLine("\tUpdate name: ");
            String email = console.readLine("\tUpdate email: ");
            String major = console.readLine("\tUpdate major: ");
            if (!name.equals("")) rowset.updateString("name", name);
            if (!email.equals("")) rowset.updateString("email", email);
            if (!major.equals("")) rowset.updateString("major", major);
            rowset.updateRow();
            System.out.println("The student has been updated.");
        }
    }

    static void deleteStudent(CachedRowSet rowset) throws SQLException {
        answer = console.readLine("Do you want to delete this student(Y/N)?:");
        if (answer.equalsIgnoreCase("Y")) {
            rowset.deleteRow();
            System.out.println("The student has been removed.");
        }
    }

    static void insertStudent(CachedRowSet rowset) throws SQLException {
        answer = console.readLine("Do you want to insert a new student (Y/N)?: ");
        if (answer.equalsIgnoreCase("Y")) {
            String name = console.readLine("\tEnter name: ");
            String email = console.readLine("\tEnter email: ");
            String major = console.readLine("\tEnter major: ");
            rowset.moveToInsertRow();
            rowset.updateNull("student_id");
            rowset.updateString("name", name);
            rowset.updateString("email", email);
            rowset.updateString("major", major);
            rowset.insertRow();
            rowset.moveToCurrentRow();
            System.out.println("The student has been added.");
        }
    }

    static void saveChanges(CachedRowSet rowset, Connection conn) {
        answer = console.readLine("Do you want to save changes (Y/N)?: ");
        if (answer.equalsIgnoreCase("Y")) {
            try {
                rowset.acceptChanges(conn);
            }  catch (SQLException ex) {
                System.out.println("Error in database commit: " + ex);
            }
        }
    }

    static void askToQuit() {
        answer = console.readLine("Do you want to quit (Y/N)?: ");
        quit = answer.equalsIgnoreCase("Y");
    }
}