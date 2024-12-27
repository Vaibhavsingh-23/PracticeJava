import java.sql.*;
class Q2{
public static void main(String args[]) throws Exception {
try(Connection con1=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mca","root","vaibhav12@");
    Connection con2=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mca1","root","vaibhav12@");
    Connection con3=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mca2","root","vaibhav12@")){

if(con1!=null && con2!=null && con3!=null){
System.out.println("Connected to the all three database");
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