import java.sql.*;
class Ex6{
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
String sql ="INSERT INTO University1 "+
		"VALUES(111,'Vaibhav','Noida',23)";

	stmt.executeUpdate(sql);
	System.out.println("Created table in given database");

}
catch(SQLException e){}
}}