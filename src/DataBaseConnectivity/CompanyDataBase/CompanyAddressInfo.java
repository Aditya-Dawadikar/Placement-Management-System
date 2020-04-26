package DataBaseConnectivity.CompanyDataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CompanyAddressInfo {
static final String JDBC_DRIVER="oracle.jdbc.driver.OracleDriver";
    static final String DB_URL="jdbc:oracle:thin:@localhost:1521:XE";
    static final String user="chandler";
    static final String pass="chandler";
    
    Connection con;
    Statement stmt;
    
    PreparedStatement pstmtt;
    ResultSet rs=null;
    public CompanyAddressInfo() throws ClassNotFoundException, SQLException{
        Class.forName(JDBC_DRIVER);
        con=null;stmt=null;pstmtt=null;
        con=DriverManager.getConnection(DB_URL,user,pass);
        stmt=con.createStatement();
    }
    public void insert(String name,String country,String state,String city,String address) throws SQLException,ClassNotFoundException{
        stmt.execute("Insert into company_address_info values('"+name+"','"+country+"','"+state+"','"+city+"','"+address+"')");
        stmt.execute("commit");
    }
    
    public void update(String sname,String scountry,String sstate,String scity,String saddress) throws SQLException,ClassNotFoundException{
        stmt.executeQuery("update company_address_info set country='"+scountry+"',state='"+sstate+"',city='"+scity+"',address='"+saddress+"' where name='"+sname+"'");
        stmt.execute("commit");
    }

   public String[] fetch(String compname) {
        String[] result = new String[4];
        //String addpass=null;
        String sql="select * from student_address_info where name='"+compname+"'";
         try{
        pstmtt=con.prepareStatement(sql);
        rs=pstmtt.executeQuery();
        if(rs.next())
        {
        result[0]=rs.getString("country");
        result[1]=rs.getString("state");
        result[2]=rs.getString("city");
        result[3]=rs.getString("address");
        }
        //return add1;
        }catch(SQLException e){
            System.out.println("record not found");
        }
         return result;
    }
}
