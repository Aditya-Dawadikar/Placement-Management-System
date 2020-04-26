<<<<<<< HEAD
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
>>>>>>> b1fc7aa3115213bfc693210ceeffd59cb9753d3b
package AdminPages.DisplayPages.Students;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

<<<<<<< HEAD
public class StudentInfo {
 static final String JDBC_DRIVER="oracle.jdbc.driver.OracleDriver";
=======
/**
 *
 * @author lenovo
 */
public class StudentInfo {
 static final String JDBC_driver="oracle.jdbc.driver.OracleDriver";
>>>>>>> b1fc7aa3115213bfc693210ceeffd59cb9753d3b
	static final String DB_URL="jdbc:oracle:thin:@localhost:1521:XE";
	static final String user="chandler";
	static final String pass="chandler";
	
	
	static Connection con;
	static Statement stmt;

    public StudentInfo() throws ClassNotFoundException, SQLException
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

<<<<<<< HEAD
    public void print() throws SQLException{
		
            String sql="select * from Student_personal_info";
            ResultSet rs=stmt.executeQuery(sql);
            while(rs.next()){
		System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
            }
            rs.last();
            System.out.println("totalrows:"+rs.getRow());
	}
   
=======
    public void print(){
		try
		{
			String sql="select * from Student_personal_info";
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next()){
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
                        rs.last();
                        System.out.println("totalrows:"+rs.getRow());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
    /*
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		StudentInfo ji= new StudentInfo();
		ji.print();
    }
    */   
>>>>>>> b1fc7aa3115213bfc693210ceeffd59cb9753d3b
}
