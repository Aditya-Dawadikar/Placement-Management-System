/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBaseConnectivity.StudentDataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author lenovo
 */
public class StudentLoginInfo {
static final String JDBC_driver="oracle.jdbc.driver.OracleDriver";
    static final String DB_URL="jdbc:oracle:thin:@localhost:1521:XE";
    static final String user="chandler";
    static final String pass="chandler";
    
    Connection con;
    Statement stmt;
    
    public StudentLoginInfo() throws ClassNotFoundException, SQLException{
        Class.forName(JDBC_driver);
        con=null;stmt=null;
        con=DriverManager.getConnection(DB_URL,user,pass);
        stmt=con.createStatement();
    }

    public void insert(String name,String username,String password) throws SQLException,ClassNotFoundException{
        stmt.execute("Insert into student_login_info values('"+name+"','"+username+"','"+password+"')");
        stmt.execute("commit");
    }
    
    public void update(String name,String username,String password) throws SQLException,ClassNotFoundException{
        stmt.executeQuery("update  username,password from student_login_info where name='"+name+"'");
        stmt.execute("commit");
    }

    public void fetch(){
         try{
        stmt.executeQuery("select * from student_login_info");
        }catch(SQLException e){
            System.out.println("record not found");
        }
    }
    
    public int loginAttempt(String user,String pass) throws SQLException{
        ResultSet rs=stmt.executeQuery("Select username,password from Student_login_info where username='"+user+"'");
        rs.next();
        if(pass.equals(rs.getString("password"))){
            return 1;
        }else{
            return 0;
        }
    }
}

