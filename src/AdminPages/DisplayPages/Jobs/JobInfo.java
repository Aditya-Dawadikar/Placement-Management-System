package AdminPages.DisplayPages.Jobs;

import java.sql.*;

public class JobInfo {
	static final String JDBC_DRIVER="oracle.jdbc.driver.OracleDriver";
	static final String DB_URL="jdbc:oracle:thin:@localhost:1521:XE";
	static final String user="chandler";
	static final String pass="chandler";
	
	
	static Connection con;
	static Statement stmt;

    public JobInfo() throws ClassNotFoundException, SQLException
    {
    	 Class.forName(JDBC_DRIVER);
         con=null;stmt=null;
         con=DriverManager.getConnection(DB_URL,user,pass);
         stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    }

    public void print() throws ClassNotFoundException{
        
        JobLabelCreator lc= new JobLabelCreator();
        JobLabelCreator.create();
    }
    
}


