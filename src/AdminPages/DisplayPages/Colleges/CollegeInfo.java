/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminPages.DisplayPages.Colleges;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author lenovo
 */
public class CollegeInfo {
    static final String JDBC_driver="oracle.jdbc.driver.OracleDriver";
	static final String DB_URL="jdbc:oracle:thin:@localhost:1521:XE";
	static final String user="gaurav";
	static final String pass="gaurav";
	
	
	static Connection con;
	static Statement stmt;

    public CollegeInfo() throws ClassNotFoundException, SQLException
    {
    	 Class.forName(JDBC_driver);
         con=null;stmt=null;
         con=DriverManager.getConnection(DB_URL,user,pass);
         stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    }

    void print() throws ClassNotFoundException{
        CollegeLabelCreator lc= new CollegeLabelCreator();
        lc.create();
		/*try
		{
			String sql="select * from college_info";
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next()){
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			}
                        rs.last();
                        System.out.println("totalrows:"+rs.getRow());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}*/
	}
    ///*
    /*
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		CollegeInfo ji= new CollegeInfo();
		ji.print();
    }
    //*/
}
