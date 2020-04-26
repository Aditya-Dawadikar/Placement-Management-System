package AdminPages.DisplayPages.Colleges;

import static AdminPages.DisplayPages.Colleges.CollegeInfo.stmt;
import java.awt.BorderLayout;
import java.awt.Color;
<<<<<<< HEAD
import java.awt.Component;
=======
>>>>>>> b1fc7aa3115213bfc693210ceeffd59cb9753d3b
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;



public class CollegeLabelCreator extends JFrame{
    static CollegeLabelCreator jf;
    JPanel jp;
    
     private void prepareUI() throws ClassNotFoundException{
        jp = new JPanel();
        jp.setLayout(null);
        jp.setLayout(new BoxLayout(jp,BoxLayout.Y_AXIS));
        jp.add(new SubPanel());
        jf.pack();
        
        getContentPane().add(jp, BorderLayout.CENTER);
    }    
    
    static void create() throws ClassNotFoundException{
        jf = new CollegeLabelCreator();
        jf.prepareUI();
        jf.pack();
        jf.setVisible(true);
    }
    
    private class SubPanel extends JPanel{
        int n;
        CollegeInfo ji;
        public SubPanel() throws ClassNotFoundException{
            super();
            Border border = BorderFactory.createLineBorder(Color.BLUE, 2);
            try {
                this.ji = new CollegeInfo();
                String sql="select * from college_info";
                ResultSet rs=stmt.executeQuery(sql);
                while(rs.next()){
                    System.out.println(rs.getString(1));
                    String s= new String("college: "+rs.getString(1));
                    JLabel l= new JLabel();
                    l.setText(s);
                    l.setSize(50,50);
                    l.setLocation(10,20);
                    l.setBorder(border);
                    add(l);
                }
            } catch (SQLException ex) {
                Logger.getLogger(CollegeLabelCreator.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
