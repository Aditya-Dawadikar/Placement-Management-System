
package DataBaseConnectivity.StudentDataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentAddressInfo {
    static final String JDBC_driver="oracle.jdbc.driver.OracleDriver";
    static final String DB_URL="jdbc:oracle:thin:@localhost:1521:XE";
    static final String user="chandler";
    static final String pass="chandler";
    
    Connection con;
    Statement stmt;
    
    public StudentAddressInfo() throws ClassNotFoundException, SQLException{
        Class.forName(JDBC_driver);
        con=null;stmt=null;
        con=DriverManager.getConnection(DB_URL,user,pass);
        stmt=con.createStatement();
    }
    public void insert(String name,String country,String state,String city,String address) throws SQLException,ClassNotFoundException{
        stmt.execute("Insert into student_address_info values('"+name+"','"+country+"','"+state+"','"+city+"','"+address+"')");
        stmt.execute("commit");
    }
    
    public void update(String name,String country,String state,String city,String address) throws SQLException,ClassNotFoundException{
        stmt.executeQuery("update  country,state,city,address from student_address_info where name='"+name+"'");
        stmt.execute("commit");
    }

    public void fetch(){
         try{
        stmt.executeQuery("select * from student_address_info");
        }catch(SQLException e){
            System.out.println("record not found");
        }
    }
}