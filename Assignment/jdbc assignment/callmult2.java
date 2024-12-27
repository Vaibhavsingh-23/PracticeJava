import java.sql.*;

public class callmult2{
    public static void main(String[] args) {
        String makeProcedure = "CREATE PROCEDURE Multiply(IN num1 INT, IN num2 INT, OUT PRODUCT INT) "+
                                "BEGIN"+
                                " SET PRODUCT = num1*num2;" + 
                                "END";
        try(Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/mca","root","vaibhav12@")){
            Statement s = c.createStatement();
            s.execute(makeProcedure);
            CallableStatement cs = c.prepareCall("{CALL Multiply(?,?,?)}");
            int num1 = 2;
            int num2 = 3;
            
            cs.setInt(1,num1);
            cs.setInt(2,num2);
            cs.registerOutParameter(3, Types.INTEGER);
            cs.execute();
            int product = cs.getInt(3);
            System.out.println(product);

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}