/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBaseConnectivity.StudentDataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author lenovo
 */

public class StudentPersonalInfo {
    static final String JDBC_driver="oracle.jdbc.driver.OracleDriver";
    static final String DB_URL="jdbc:oracle:thin:@localhost:1521:XE";
    static final String user="chandler";
    static final String pass="chandler";
    
    Connection con;
    Statement stmt;
    
    public StudentPersonalInfo() throws ClassNotFoundException, SQLException{
        Class.forName(JDBC_driver);
        con=null;stmt=null;
        con=DriverManager.getConnection(DB_URL,user,pass);
        stmt=con.createStatement();
    }
    public void insert(String name,String email,String phone,String dob) throws SQLException,ClassNotFoundException{
        stmt.execute("Insert into student_personal_info values('"+name+"','"+email+"','"+phone+"','"+dob+"')");
        stmt.execute("commit");
    }
    
    public void update(String name,String email,String phone,String dob) throws SQLException,ClassNotFoundException{
        stmt.executeQuery("update email,phone,dob from student_personal_info where name='"+name+"'");
        stmt.execute("commit");
    }

    public void fetch() {
         try{
        stmt.executeQuery("select * from student_personal_info");
        }catch(SQLException e){
            System.out.println("record not found");
        }
    }
}

