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
public class CompanyInfo {
    static final String JDBC_driver="oracle.jdbc.driver.OracleDriver";
    static final String DB_URL="jdbc:oracle:thin:@localhost:1521:XE";
    static final String user="gaurav";
    static final String pass="gaurav";
    
    Connection con;
    Statement stmt;
    PreparedStatement pstmtt;
    ResultSet rs=null;
    
    public CompanyInfo() throws ClassNotFoundException, SQLException{
        Class.forName(JDBC_driver);
        con=null;stmt=null;pstmtt=null;
        con=DriverManager.getConnection(DB_URL,user,pass);
        stmt=con.createStatement();
    }
    public void insert(String name,String website,String email,String phone,String desc) throws SQLException,ClassNotFoundException{
        stmt.execute("Insert into company_info values('"+name+"','"+website+"','"+email+"','"+phone+"','"+desc+"')");
        stmt.execute("commit");
    }
    
    public void update(String sname,String swebsite,String semail,String sphone,String desc) throws SQLException,ClassNotFoundException{
        stmt.executeQuery("update company_info set website='"+swebsite+"', email='"+semail+"',phone='"+sphone+"',description='"+desc+"' where name='"+sname+"' ");
        stmt.execute("commit");
    }

    public String[] fetch(String compname) {
        String[] result = new String[4];
        //String addpass=null;
        String sql="select * from company_info where name='"+compname+"'";
         try{
        pstmtt=con.prepareStatement(sql);
        rs=pstmtt.executeQuery();
        if(rs.next())
        {
        result[0]=rs.getString("website");
        result[1]=rs.getString("email");
        result[2]=rs.getString("phone");
        result[3]=rs.getString("description");
        }
        //return add1;
        }catch(SQLException e){
            System.out.println("record not found");
        }
         return result;
    }
}
