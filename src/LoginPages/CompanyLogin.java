package LoginPages;

import Dashboard.CompanyDashBoard;
<<<<<<< HEAD
=======
import Dashboard.StudentDashBoard;
>>>>>>> b1fc7aa3115213bfc693210ceeffd59cb9753d3b
import DataBaseConnectivity.CompanyDataBase.CompanyLoginInfo;
import RegisterPages.RegisterCompany;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CompanyLogin extends javax.swing.JFrame {


    public CompanyLogin() {
        initComponents();
        setVisible(true);
    }

<<<<<<< HEAD
    int flag=0;
=======
>>>>>>> b1fc7aa3115213bfc693210ceeffd59cb9753d3b
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        buttonlogin = new javax.swing.JButton();
        buttoncancel = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        labelusername = new javax.swing.JLabel();
        labelpassword = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        signup = new javax.swing.JButton();
        statuslabel = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonlogin.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        buttonlogin.setText("LOGIN");
        buttonlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonloginActionPerformed(evt);
            }
        });
        getContentPane().add(buttonlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 90, -1));

        buttoncancel.setBackground(new java.awt.Color(255, 0, 0));
        buttoncancel.setText("X");
        buttoncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttoncancelActionPerformed(evt);
            }
        });
        getContentPane().add(buttoncancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(215, 193, 195));

        labelusername.setText("USERNAME");

        labelpassword.setText("PASSWORD");

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel4.setText("COMPANY LOGIN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelpassword)
                    .addComponent(labelusername))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(username, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(password))
                .addContainerGap(75, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelusername)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelpassword)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 41, -1, -1));

        signup.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        signup.setText("SIGNUP");
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });
        getContentPane().add(signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 90, -1));

        statuslabel.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(statuslabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 91, 20));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void buttonloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonloginActionPerformed
        // TODO add your handling code here:
        String user= new String(username.getText());
        String pass= new String(password.getPassword());
        
        try {
            CompanyLoginInfo log= new CompanyLoginInfo();
<<<<<<< HEAD
            flag= log.loginAttempt(user,pass);
=======
            int flag= log.loginAttempt(user,pass);
>>>>>>> b1fc7aa3115213bfc693210ceeffd59cb9753d3b
            
            if(flag==1){
                System.out.println("Login successful");
                new CompanyDashBoard(user).setVisible(true);
                dispose();
            }else{
                statuslabel.setText("LOGIN FAILED");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CompanyLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_buttonloginActionPerformed

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupActionPerformed
        // TODO add your handling code here:
        new RegisterCompany();
    }//GEN-LAST:event_signupActionPerformed

    private void buttoncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttoncancelActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_buttoncancelActionPerformed
<<<<<<< HEAD
/*
    public int getStatus(){
        return flag;
    }
*/
=======

    /*public  static void main(String args[]){
        CompanyLogin c=new CompanyLogin();
    }*/
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(CompanyLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(CompanyLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(CompanyLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(CompanyLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new CompanyLogin().setVisible(true);
//            }
//        });
//    }
>>>>>>> b1fc7aa3115213bfc693210ceeffd59cb9753d3b

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttoncancel;
    private javax.swing.JButton buttonlogin;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelpassword;
    private javax.swing.JLabel labelusername;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton signup;
    private javax.swing.JLabel statuslabel;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
