import java.sql.*;
class Ex{
	public static void main(String args[]) throws Exception {
		try(Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mca","root","vaibhav12@")){
			if(con!=null){
				System.out.println("Connected to the database");
			}
			else
			{
			System.out.println("Invalid user name/password");
			}

			Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			/*String sql1 ="CREATE TABLE EmpTable(id INTEGER not NULL, first_name VARCHAR(225), city_name VARCHAR(225), age INTEGER)";
			stmt.executeUpdate(sql1);
					
			System.out.println("Created table in given database");

			
			sql1 ="INSERT INTO EmpTable 									VALUES(1,'Vaibhav','Noida',23),(2,'MAyank','Prayagraj',23),(3,'Anubhav','Jalalpur',23),(4,'Gaurav','Patti',23),(5,'Arpit','Noida',23),(6,'Saumya','Noida',23),(7,'Krishna','Noida',23),(8,'Priyanshu','Noida',23),(9,'Vineet','Noida',23),(10,'Ajay','Noida',23)";
			stmt.executeUpdate(sql1);
			System.out.println("values are entered in Created table in given database");*/

			ResultSet rs=stmt.executeQuery("SELECT * FROM EmpTable");
			System.out.println(rs.first());
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			
			while(rs.next()){
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));}
			rs.previous();
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
		}
		catch (SQLException e) {
        	    System.out.println("SQL Exception: " + e.getMessage()); 
        	}

	}
}