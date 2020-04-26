package DataBaseConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connector {
    static final String JDBC_DRIVER="oracle.jdbc.driver.OracleDriver";
    static final String DB_URL="jdbc:oracle:thin:@localhost:1521:XE";
    static final String user="chandler";
    static final String pass="chandler";
    
    Connection con;
    Statement stmt;
    
    Connector() throws ClassNotFoundException, SQLException{
        Class.forName(JDBC_DRIVER);
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
}
