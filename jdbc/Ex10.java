import java.sql.*;
class Ex10{
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
			/*String sql1 ="CREATE TABLE University5(id INTEGER not NULL, first_name VARCHAR(225), city_name VARCHAR(225), age INTEGER)";
					stmt.executeUpdate(sql1);*/
					
					System.out.println("Created table in given database");

			
			/*String sql1 ="INSERT INTO University5 VALUES(1111,'Vaibhav','Noida',23),(1121,'MAyank','Prayagraj',23),(1131,'Anubhav','Jalalpur',23),(1141,'Gaurav','Patti',23)";
			stmt.executeUpdate(sql1);
			System.out.println("values are entered in Created table in given database");*/

			ResultSet rs=stmt.executeQuery("SELECT * FROM University5");
			System.out.println(rs.first());
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			rs.previous();
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			/*while(rs.next()){
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));}*/
		}
		catch (SQLException e) {
        	    System.out.println("SQL Exception: " + e.getMessage()); 
        	}

	}
}