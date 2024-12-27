import java.sql.*;

class Qv {
    public static void main(String args[]) throws Exception {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mca1", "root", "vaibhav12@")) {
            if (con != null) {
                System.out.println("Connected to the database");
            } else {
                System.out.println("Invalid username/password");
            }

            Statement stmt = con.createStatement();
	
		String insertValuesSQL = "INSERT INTO employeetable (employee_name, employee_city, salary, date_of_joining) "
                    + "VALUES ('Vaibhav', 'Noida', 50000, '2122-01-10'),"
                    + "('Mayank', 'Prayagraj', 55000, '2021-02-3'),"
                    + "('Anubhav', 'Jalalpur', 48000, '2021-03-2'),"
                    + "('Gaurav', 'Patti', 60000, '2022-01-25'),"
                    + "('Arpit', 'Noida', 52000, '2022-01-30'),"
		    + "('Dhruv', 'Noida', 52000, '2022-01-30'),"
		    +"('Ram', 'Prayagraj', 55000, '2021-02-3'),"
                    + "('Deekshant', 'Jalalpur', 48000, '2021-03-2'),"
                    + "('Krishna', 'Patti', 60000, '2022-01-25'),"
                    + "('Vineet', 'Noida', 52000, '2022-01-30'),"
		    + "('Baba', 'Noida', 52000, '2022-01-30');";
		  
            stmt.executeUpdate(insertValuesSQL);
            System.out.println("Inserted values into EmployeeTable");

 } catch (SQLException e) {            System.out.println("SQL Exception: " + e.getMessage());
        }
    }
}
