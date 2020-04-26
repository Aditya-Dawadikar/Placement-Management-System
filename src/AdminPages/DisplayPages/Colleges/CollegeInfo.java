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
    static final String JDBC_DRIVER="oracle.jdbc.driver.OracleDriver";
	static final String DB_URL="jdbc:oracle:thin:@localhost:1521:XE";
	static final String user="chandler";
	static final String pass="chandler";
	
	
	static Connection con;
	static Statement stmt;

    public CollegeInfo() throws ClassNotFoundException, SQLException
    {
    	 Class.forName(JDBC_DRIVER);
         con=null;stmt=null;
         con=DriverManager.getConnection(DB_URL,user,pass);
         stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    }

    void print() throws ClassNotFoundException{
        CollegeLabelCreator lc= new CollegeLabelCreator();
        CollegeLabelCreator.create();
    }    
}
