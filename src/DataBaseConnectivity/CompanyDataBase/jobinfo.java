package DataBaseConnectivity.CompanyDataBase;

<<<<<<< HEAD
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
>>>>>>> b1fc7aa3115213bfc693210ceeffd59cb9753d3b
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
<<<<<<< HEAD

public class jobinfo {
    static final String JDBC_DRIVER="oracle.jdbc.driver.OracleDriver";
    static final String DB_URL="jdbc:oracle:thin:@localhost:1521:XE";
    static final String user="chandler";
    static final String pass="chandler";
=======
/**
 *
 * @author Lenovo
 */
public class jobinfo {
    static final String JDBC_driver="oracle.jdbc.driver.OracleDriver";
    static final String DB_URL="jdbc:oracle:thin:@localhost:1521:XE";
    static final String user="gaurav";
    static final String pass="gaurav";
>>>>>>> b1fc7aa3115213bfc693210ceeffd59cb9753d3b
    
    Connection con;
    Statement stmt;
    
    public jobinfo() throws ClassNotFoundException, SQLException{
<<<<<<< HEAD
        Class.forName(JDBC_DRIVER);
=======
        Class.forName(JDBC_driver);
>>>>>>> b1fc7aa3115213bfc693210ceeffd59cb9753d3b
        con=null;stmt=null;
        con=DriverManager.getConnection(DB_URL,user,pass);
        stmt=con.createStatement();
    }
    
    public void insert(String compname,String jtitle,String jcity,String jdate,
                       String jdesc,String jskills,String jtype)throws SQLException,ClassNotFoundException
    {
        stmt.execute("insert into add_job values('"+compname+"','"+jtitle+"','"+jcity+"','"+jdate+"','"+jdesc+"','"+jskills+"','"+jtype+"')");
        stmt.execute("commit");
    }
}
    
    

