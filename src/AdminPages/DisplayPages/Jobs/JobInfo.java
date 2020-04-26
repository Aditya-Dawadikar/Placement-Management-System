package AdminPages.DisplayPages.Jobs;

import java.sql.*;

public class JobInfo {
<<<<<<< HEAD
	static final String JDBC_DRIVER="oracle.jdbc.driver.OracleDriver";
	static final String DB_URL="jdbc:oracle:thin:@localhost:1521:XE";
	static final String user="chandler";
	static final String pass="chandler";
=======
	static final String JDBC_driver="oracle.jdbc.driver.OracleDriver";
	static final String DB_URL="jdbc:oracle:thin:@localhost:1521:XE";
	static final String user="gaurav";
	static final String pass="gaurav";
>>>>>>> b1fc7aa3115213bfc693210ceeffd59cb9753d3b
	
	
	static Connection con;
	static Statement stmt;

    public JobInfo() throws ClassNotFoundException, SQLException
    {
<<<<<<< HEAD
    	 Class.forName(JDBC_DRIVER);
=======
    	 Class.forName(JDBC_driver);
>>>>>>> b1fc7aa3115213bfc693210ceeffd59cb9753d3b
         con=null;stmt=null;
         con=DriverManager.getConnection(DB_URL,user,pass);
         stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    }

    public void print() throws ClassNotFoundException{
        
        JobLabelCreator lc= new JobLabelCreator();
<<<<<<< HEAD
        JobLabelCreator.create();
    }
    
=======
        lc.create();
		/*try
		{
			String sql="select * from add_job";
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next()){
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7));
                        }
                        rs.last();
                        System.out.println("totalrows:"+rs.getRow());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}*/
	}
    /*
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		JobInfo ji= new JobInfo();
		ji.print();
    }
    */
>>>>>>> b1fc7aa3115213bfc693210ceeffd59cb9753d3b
}


