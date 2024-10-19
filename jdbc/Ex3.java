import java.sql.*;
class Ex3{
public static void main(String args[]){
try(Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mca","root","vaibhav12@")){
if(con!=null){
System.out.println("Connected to the database");
}
else
{
System.out.println("Invalid user name/password");
}


Statement stmt=con.createStatement();
//String sql1="SELECT * FROM student";
ResultSet rs=stmt.executeQuery("SELECT * FROM student");
while(rs.next()){
System.out.println(rs.getString(1)+" "+rs.getString(2));}}

catch(SQLException e){}
}}