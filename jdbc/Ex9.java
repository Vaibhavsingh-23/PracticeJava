import java.sql.*;
class Ex9{
	public static void main(String args[]) throws Exception {
		try(Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mca","root","vaibhav12@")){
			if(con!=null){
				System.out.println("Connected to the database");
			}
			else
			{
			System.out.println("Invalid user name/password");
			}

			Statement stmt=con.createStatement();
			String sql1 ="CREATE TABLE University4"+
					"(id INTEGER not NULL,"+
					"first_name VARCHAR(225),"+
					"city_name VARCHAR(225),"+
					"age INTEGER,"+
					"PRIMARY KEY(id))";
					stmt.executeUpdate(sql1);
					
					System.out.println("Created table in given database");

			
			sql1 ="INSERT INTO University4 "+
			"VALUES(111,'Vaibhav','Noida',23)";
			stmt.executeUpdate(sql1);
			System.out.println("values are entered in Created table in given database");

			ResultSet rs=stmt.executeQuery("SELECT * FROM University4");
			while(rs.next()){
			System.out.println(rs.getString(1)+" "+rs.getString(2));}
		}
		catch (SQLException e) {
        	    System.out.println("SQL Exception: " + e.getMessage()); 
        	}

	}
}