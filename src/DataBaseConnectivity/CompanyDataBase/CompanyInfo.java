/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBaseConnectivity.CompanyDataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author lenovo
 */
public class CompanyInfo {
    static final String JDBC_driver="oracle.jdbc.driver.OracleDriver";
    static final String DB_URL="jdbc:oracle:thin:@localhost:1521:XE";
    static final String user="chandler";
    static final String pass="chandler";
    
    Connection con;
    Statement stmt;
    
    public CompanyInfo() throws ClassNotFoundException, SQLException{
        Class.forName(JDBC_driver);
        con=null;stmt=null;
        con=DriverManager.getConnection(DB_URL,user,pass);
        stmt=con.createStatement();
    }
    public void insert(String name,String website,String email,String phone,String desc) throws SQLException,ClassNotFoundException{
        stmt.execute("Insert into company_info values('"+name+"','"+website+"','"+email+"','"+phone+"','"+desc+"')");
        stmt.execute("commit");
    }
    
    public void update(String name,String website,String email,String phone,String desc) throws SQLException,ClassNotFoundException{
        stmt.executeQuery("update website,email,phone,description from Company_info where name='"+name+"'");
        stmt.execute("commit");
    }

    public void fetch() {
         try{
        stmt.executeQuery("select * from company_info");
        }catch(SQLException e){
            System.out.println("record not found");
        }
    }
}
