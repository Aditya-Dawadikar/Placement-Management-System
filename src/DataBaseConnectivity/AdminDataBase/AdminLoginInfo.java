<<<<<<< HEAD
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
>>>>>>> b1fc7aa3115213bfc693210ceeffd59cb9753d3b
package DataBaseConnectivity.AdminDataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

<<<<<<< HEAD
public class AdminLoginInfo {
    static final String JDBC_DRIVER="oracle.jdbc.driver.OracleDriver";
    static final String DB_URL="jdbc:oracle:thin:@localhost:1521:XE";
    static final String user="chandler";
    static final String pass="chandler";
=======
/**
 *
 * @author lenovo
 */
public class AdminLoginInfo {
    static final String JDBC_driver="oracle.jdbc.driver.OracleDriver";
    static final String DB_URL="jdbc:oracle:thin:@localhost:1521:XE";
    static final String user="gaurav";
    static final String pass="gaurav";
>>>>>>> b1fc7aa3115213bfc693210ceeffd59cb9753d3b
    
    Connection con;
    Statement stmt;
    
    public AdminLoginInfo() throws ClassNotFoundException, SQLException{
<<<<<<< HEAD
        Class.forName(JDBC_DRIVER);
=======
        Class.forName(JDBC_driver);
>>>>>>> b1fc7aa3115213bfc693210ceeffd59cb9753d3b
        con=null;stmt=null;
        con=DriverManager.getConnection(DB_URL,user,pass);
        stmt=con.createStatement();
    }

    public void insert(String name,String username,String password) throws SQLException,ClassNotFoundException{
        stmt.execute("Insert into Admin_login_info values('"+name+"','"+username+"','"+password+"')");
        stmt.execute("commit");
    }
    
    public void update(String name,String username,String password) throws SQLException,ClassNotFoundException{
        stmt.executeQuery("update  username,password from Admin_login_info where name='"+name+"'");
        stmt.execute("commit");
    }

    public void fetch(){
         try{
        stmt.executeQuery("select * from Admin_login_info");
        }catch(SQLException e){
            System.out.println("record not found");
        }
    }
    
    public int loginAttempt(String user,String password) throws SQLException{
        ResultSet rs=stmt.executeQuery("Select username,password from admin_login_info where username='"+user+"'");
        rs.next();
        if(password.equals(rs.getString("password"))){
            return 1;
        }else{
            return 0;
        }
    }
}
