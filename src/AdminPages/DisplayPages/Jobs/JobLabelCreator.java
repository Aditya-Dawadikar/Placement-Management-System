package AdminPages.DisplayPages.Jobs;
import static AdminPages.DisplayPages.Jobs.JobInfo.stmt;
import java.awt.BorderLayout;
import java.awt.Color;
<<<<<<< HEAD
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
=======
>>>>>>> b1fc7aa3115213bfc693210ceeffd59cb9753d3b
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.border.Border;


public class JobLabelCreator extends JFrame {

    static JobLabelCreator jf;
    JPanel jp;
<<<<<<< HEAD
        
=======
    
    /*
    public static void main( String args[]) throws ClassNotFoundException{
        LabelCreator.create();
    }*/    
    
>>>>>>> b1fc7aa3115213bfc693210ceeffd59cb9753d3b
    private void prepareUI() throws ClassNotFoundException{
        jp = new JPanel();
        jp.setLayout(null);
        jp.setLayout(new BoxLayout(jp,BoxLayout.Y_AXIS));
        jp.add(new SubPanel());
        jf.pack();
        
        getContentPane().add(jp, BorderLayout.CENTER);
    }    
    
    static void create() throws ClassNotFoundException{
        jf = new JobLabelCreator();
        jf.prepareUI();
        jf.pack();
        jf.setVisible(true);
    }
    
    private class SubPanel extends JPanel{
        int n;
        JobInfo ji;
        public SubPanel() throws ClassNotFoundException{
            super();
            Border border = BorderFactory.createLineBorder(Color.BLUE, 2);
            try {
                this.ji = new JobInfo();
                String sql="select * from add_job";
                ResultSet rs=stmt.executeQuery(sql);
                while(rs.next()){
                    System.out.println(rs.getString(1));
                    String s= new String("company: "+rs.getString(1)+"Skills: "+rs.getString(6));
                    JLabel l= new JLabel();
<<<<<<< HEAD
                    JButton btn= new JButton();
                    JPanel panel = new JPanel();
                    btn.setText("apply");
                    
=======
>>>>>>> b1fc7aa3115213bfc693210ceeffd59cb9753d3b
                    l.setText(s);
                    l.setSize(50,50);
                    l.setLocation(10,20);
                    l.setBorder(border);
<<<<<<< HEAD
                    
                    btn.addActionListener(new ActionListener(){
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            System.out.println("applied for this company\n");
                            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                        }
                        
                    });
                    
                    panel.add(l);
                    panel.add(btn);
                    add(panel);
=======
                    add(l);
>>>>>>> b1fc7aa3115213bfc693210ceeffd59cb9753d3b
                }
            } catch (SQLException ex) {
                Logger.getLogger(JobLabelCreator.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

