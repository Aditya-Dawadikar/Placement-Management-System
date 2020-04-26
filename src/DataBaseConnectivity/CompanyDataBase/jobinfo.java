package DataBaseConnectivity.CompanyDataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jobinfo {
    static final String JDBC_DRIVER="oracle.jdbc.driver.OracleDriver";
    static final String DB_URL="jdbc:oracle:thin:@localhost:1521:XE";
    static final String user="chandler";
    static final String pass="chandler";
    
    Connection con;
    Statement stmt;
    
    public jobinfo() throws ClassNotFoundException, SQLException{
        Class.forName(JDBC_DRIVER);
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
    
    

