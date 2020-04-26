package AdminPages.DisplayPages.Students;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentInfo {
 static final String JDBC_DRIVER="oracle.jdbc.driver.OracleDriver";
	static final String DB_URL="jdbc:oracle:thin:@localhost:1521:XE";
	static final String user="chandler";
	static final String pass="chandler";
	
	
	static Connection con;
	static Statement stmt;

    public StudentInfo() throws ClassNotFoundException, SQLException
    {
    	 Class.forName(JDBC_DRIVER);
         con=null;stmt=null;
         con=DriverManager.getConnection(DB_URL,user,pass);
         stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    }

    public void print() throws SQLException{
		
            String sql="select * from Student_personal_info";
            ResultSet rs=stmt.executeQuery(sql);
            while(rs.next()){
		System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
            }
            rs.last();
            System.out.println("totalrows:"+rs.getRow());
	}
   
}
