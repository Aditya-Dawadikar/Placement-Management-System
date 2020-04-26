package Dashboard;

import LoginPages.Login;
import RegisterPages.Register;

public class MainScreen extends javax.swing.JFrame {

    public MainScreen() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titlepanel = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Menu = new javax.swing.JMenuBar();
        homemenu = new javax.swing.JMenu();
        aboutmenu = new javax.swing.JMenu();
        companymenu = new javax.swing.JMenu();
        collegemenu = new javax.swing.JMenu();
        registermenu = new javax.swing.JMenu();
        loginmenu = new javax.swing.JMenu();
        contacusmenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titlepanel.setBackground(new java.awt.Color(51, 0, 153));
        titlepanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(51, 0, 153));
        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("CAMPUS RECRUITMENT SYSTEM");
        jTextField1.setAutoscrolls(false);
        jTextField1.setBorder(null);
        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        titlepanel.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, 70));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("A  complete  solution  for  managing  Vacancies , Placements , Colleges  and  Students");
        titlepanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 856, 26));

        getContentPane().add(titlepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 140));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard/tcs.jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, -1, 300));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard/Adobe.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 510, 340));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard/Jobs-Graphic.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 470, 560, 310));

        jLabel5.setBackground(new java.awt.Color(204, 204, 255));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel5.setText("              PLACEMENT DRIVES                                                         JOB OPPORTUNIES                                                          TOP COMPANIES");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 1060, -1));

        jLabel6.setBackground(new java.awt.Color(102, 102, 255));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("    DONT KNOW WHERE ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 160, 260, 60));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 102));
        jLabel7.setText("    TO APPLY FOR JOBS");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 210, 260, 50));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 0, 102));
        jLabel8.setText("    REGISTER");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 270, 260, 80));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 0, 102));
        jLabel9.setText("    HERE");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 350, 260, 80));

        Menu.setMinimumSize(new java.awt.Dimension(66, 60));
        Menu.setPreferredSize(new java.awt.Dimension(66, 60));

        homemenu.setText("       HOME          ");
        Menu.add(homemenu);

        aboutmenu.setText("         ABOUT US              ");
        Menu.add(aboutmenu);

        companymenu.setText("      COMPANIES              ");
        Menu.add(companymenu);

        collegemenu.setText("       COLLEGES                   ");
        Menu.add(collegemenu);

        registermenu.setText("REGISTER                ");
        registermenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registermenuMouseClicked(evt);
            }
        });
        registermenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registermenuActionPerformed(evt);
            }
        });
        Menu.add(registermenu);

        loginmenu.setText("      LOGIN        ");
        loginmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginmenuMouseClicked(evt);
            }
        });
        loginmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginmenuActionPerformed(evt);
            }
        });
        Menu.add(loginmenu);

        contacusmenu.setText("      CONTACT US");
        Menu.add(contacusmenu);

        setJMenuBar(Menu);
        Menu.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void registermenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registermenuActionPerformed
       
    }//GEN-LAST:event_registermenuActionPerformed

    private void loginmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginmenuActionPerformed
      
    }//GEN-LAST:event_loginmenuActionPerformed

    private void registermenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registermenuMouseClicked
       new Register().setVisible(true);
    }//GEN-LAST:event_registermenuMouseClicked

    private void loginmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginmenuMouseClicked
        Login l= new Login();
        l.setVisible(true);
        dispose();
    }//GEN-LAST:event_loginmenuMouseClicked

    /*
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Menu;
    private javax.swing.JMenu aboutmenu;
    private javax.swing.JMenu collegemenu;
    private javax.swing.JMenu companymenu;
    private javax.swing.JMenu contacusmenu;
    private javax.swing.JMenu homemenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JMenu loginmenu;
    private javax.swing.JMenu registermenu;
    private javax.swing.JPanel titlepanel;
    // End of variables declaration//GEN-END:variables
}
