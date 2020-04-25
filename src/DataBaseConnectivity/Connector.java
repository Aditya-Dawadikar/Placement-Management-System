/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBaseConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author lenovo
 */
public class Connector {
    static final String JDBC_driver="oracle.jdbc.driver.OracleDriver";
    static final String DB_URL="jdbc:oracle:thin:@localhost:1521:XE";
    static final String user="gaurav";
    static final String pass="gaurav";
    
    Connection con;
    Statement stmt;
    
    Connector() throws ClassNotFoundException, SQLException{
        Class.forName(JDBC_driver);
        con=null;stmt=null;
        con=DriverManager.getConnection(DB_URL,user,pass);
        stmt=con.createStatement();
    }
    /*
    void insert(){
    
    }
    void update(){
    
    }
    void fetch(){
    
    }
    void delete(){
    
    }
    void display(){
    
    }*/
    /*
    
    ***two ways to implement these function
    ***1.Extend class Connector where ever required and override the functions
    ***2.use object of class Connector and write different variations of the same functions
    ***
    ***I would prefer extending the class Connector  
    */
    void insert() throws SQLException{
        stmt.execute("Insert into Student_login_info values('maheshwari','sia','sia')");
        stmt.execute("commit");
    }
    
    void delete()throws SQLException{
        stmt.execute("delete * from tablename where....");
        stmt.execute("commit");
    }
    
    void update() throws SQLException{
        stmt.executeQuery("update * form table name where...");
        stmt.execute("commit");
    }
    
    void fetch() throws SQLException{
        try{
        stmt.executeQuery("select * from tablename where ...");
        }catch(SQLException e){
            //record not found
        }
    }
    
    void display() throws SQLException{
        ResultSet rs=stmt.executeQuery("select * from tablename where ...");
    }
    
    /*public static void main(String args[]) throws ClassNotFoundException, SQLException{
        Connector c=new Connector();
        c.insert();
    }*/
}
