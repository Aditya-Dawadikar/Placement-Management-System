/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminPages.DisplayPages.Companies;

import static AdminPages.DisplayPages.Companies.CompanyInfo.stmt;
import java.awt.BorderLayout;
import java.awt.Color;
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

/**
 *
 * @author lenovo
 */
public class CompanyLabelCreator extends JFrame{

    static CompanyLabelCreator jf;
    JPanel jp;
    
    /*
    public static void main( String args[]) throws ClassNotFoundException{
        LabelCreator.create();
    }*/    
    
    private void prepareUI() throws ClassNotFoundException{
        jp = new JPanel();
        jp.setLayout(null);
        jp.setLayout(new BoxLayout(jp,BoxLayout.Y_AXIS));
        jp.add(new SubPanel());
        jf.pack();
        
        getContentPane().add(jp, BorderLayout.CENTER);
    }    
    
    static void create() throws ClassNotFoundException{
        jf = new CompanyLabelCreator();
        jf.prepareUI();
        jf.pack();
        jf.setVisible(true);
    }
    
    private class SubPanel extends JPanel{
        int n;
        CompanyInfo ji;
        public SubPanel() throws ClassNotFoundException{
            super();
            Border border = BorderFactory.createLineBorder(Color.BLUE, 2);
            try {
                this.ji = new CompanyInfo();
                String sql="select * from company_info";
                ResultSet rs=stmt.executeQuery(sql);
                while(rs.next()){
                    System.out.println(rs.getString(1));
                    String s= new String("company: "+rs.getString(1));
                    JLabel l= new JLabel();
                    l.setText(s);
                    l.setSize(50,50);
                    l.setLocation(10,20);
                    l.setBorder(border);
                    add(l);
                }
            } catch (SQLException ex) {
                Logger.getLogger(CompanyLabelCreator.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }    
}
