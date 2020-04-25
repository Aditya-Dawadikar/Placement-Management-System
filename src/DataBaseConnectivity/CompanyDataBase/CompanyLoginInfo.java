/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBaseConnectivity.CompanyDataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author lenovo
 */
public class CompanyLoginInfo {
    static final String JDBC_driver="oracle.jdbc.driver.OracleDriver";
    static final String DB_URL="jdbc:oracle:thin:@localhost:1521:XE";
    static final String user="gaurav";
    static final String pass="gaurav";
    
    Connection con;
    Statement stmt;
    
    PreparedStatement pstmtt;
    ResultSet rs=null;
    
    public CompanyLoginInfo() throws ClassNotFoundException, SQLException{
        Class.forName(JDBC_driver);
        con=null;stmt=null;pstmtt=null;
        con=DriverManager.getConnection(DB_URL,user,pass);
        stmt=con.createStatement();
    }

    public void insert(String name,String username,String password) throws SQLException,ClassNotFoundException{
        stmt.execute("Insert into Company_login_info values('"+name+"','"+username+"','"+password+"')");
        stmt.execute("commit");
    }
    
    public void update(String name,String username,String password) throws SQLException,ClassNotFoundException{
        stmt.executeQuery("update  username,password from Company_login_info where name='"+name+"'");
        stmt.execute("commit");
    }

    public String[] fetch(String accuser) {
        String[] result = new String[2];
        //String addpass=null;
        String sql="select * from company_login_info where username='"+accuser+"'";
         try{
        pstmtt=con.prepareStatement(sql);
        rs=pstmtt.executeQuery();
        if(rs.next())
        {
        result[0]=rs.getString("password");
        result[1]=rs.getString("name");
        }
        //return add1;
        }catch(SQLException e){
            System.out.println("record not found");
        }
         return result;
    }
    
    public int loginAttempt(String user,String password) throws SQLException{
        ResultSet rs=stmt.executeQuery("Select username,password from Company_login_info where username='"+user+"'");
        rs.next();
        if(password.equals(rs.getString("password"))){
            return 1;
        }else{
            return 0;
        }
    }
}
