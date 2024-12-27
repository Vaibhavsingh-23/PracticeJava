import java.sql.*;
class Q1{
public static void main(String args[]) throws Exception {
try(Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mca","root","vaibhav12@")){
if(con!=null){
System.out.println("Connected to the database");
}
else
{
System.out.println("Invalid user name/password");
}

}

catch (SQLException e) {
System.out.println("SQL Exception: " + e.getMessage()); 
}
}
}