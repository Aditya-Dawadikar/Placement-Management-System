package DataBaseConnectivity.StudentDataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentPersonalInfo {
    static final String JDBC_DRIVER="oracle.jdbc.driver.OracleDriver";
    static final String DB_URL="jdbc:oracle:thin:@localhost:1521:XE";
    static final String user="chandler";
    static final String pass="chandler";
    
    Connection con;
    Statement stmt;
    PreparedStatement pstmtt;
    ResultSet rs=null;
    public StudentPersonalInfo() throws ClassNotFoundException, SQLException{
        Class.forName(JDBC_DRIVER);
        con=null;stmt=null;pstmtt=null;
        con=DriverManager.getConnection(DB_URL,user,pass);
        stmt=con.createStatement();
    }
    public void insert(String name,String email,String phone,String dob) throws SQLException,ClassNotFoundException{
        stmt.execute("Insert into student_personal_info values('"+name+"','"+email+"','"+phone+"','"+dob+"')");
        stmt.execute("commit");
    }
    
    public void update(String sname,String semail,String sphone,String sdob) throws SQLException,ClassNotFoundException{
        stmt.executeQuery("update student_personal_info set email='"+semail+"',phone='"+sphone+"', dob='"+sdob+"' where name='"+sname+"' ");
        stmt.execute("commit");
    }

    public String[] fetch(String accname) {
        String[] result = new String[3];
        //String addpass=null;
        String sql="select * from student_personal_info where name='"+accname+"'";
         try{
        pstmtt=con.prepareStatement(sql);
        rs=pstmtt.executeQuery();
        if(rs.next())
        {
        result[0]=rs.getString("email");                    //retrieve email from student database
        result[1]=rs.getString("phone");
        result[2]=rs.getString("dob");
        }
        //return add1;
        }catch(SQLException e){
            System.out.println("record not found");
        }
         return result;
    }
}
