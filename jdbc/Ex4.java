import java.sql.*;
class Ex4{
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
String sql ="CREATE TABLE University"+
		"(id INTEGER not NULL,"+
		"first_name VARCHAR(225),"+
		"city_name VARCHAR(225),"+
		"age INTEGER,"+
		"PRIMARY KEY(id))";

	stmt.executeUpdate(sql);
	System.out.println("Created table in given database");

}
catch(SQLException e){}
}}