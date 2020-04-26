/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminPages.DisplayPages.Companies;

<<<<<<< HEAD
=======
import AdminPages.DisplayPages.Jobs.JobLabelCreator;
>>>>>>> b1fc7aa3115213bfc693210ceeffd59cb9753d3b
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author lenovo
 */
public class CompanyInfo {
<<<<<<< HEAD
    static final String JDBC_DRIVER="oracle.jdbc.driver.OracleDriver";
=======
    static final String JDBC_driver="oracle.jdbc.driver.OracleDriver";
>>>>>>> b1fc7aa3115213bfc693210ceeffd59cb9753d3b
	static final String DB_URL="jdbc:oracle:thin:@localhost:1521:XE";
	static final String user="chandler";
	static final String pass="chandler";
	
	
	static Connection con;
	static Statement stmt;

    public CompanyInfo() throws ClassNotFoundException, SQLException
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
        
        CompanyLabelCreator lc= new CompanyLabelCreator();
<<<<<<< HEAD
        CompanyLabelCreator.create();
    }
=======
        lc.create();
    }
        /*
		try
		{
			String sql="select * from Company_info";
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next()){
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
			}
                        rs.last();
                        System.out.println("totalrows:"+rs.getRow());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}*/
    /*
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		CompanyInfo ji= new CompanyInfo();
		ji.print();
    }
    */
>>>>>>> b1fc7aa3115213bfc693210ceeffd59cb9753d3b
}
