<<<<<<< HEAD
package LoginPages;

import Dashboard.MainScreen;

public class Login extends javax.swing.JFrame {

=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginPages;

/**
 *
 * @author lenovo
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
>>>>>>> b1fc7aa3115213bfc693210ceeffd59cb9753d3b
    public Login() {
        initComponents();
        setVisible(true);
    }

<<<<<<< HEAD
    int flag=0;
    
=======
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
>>>>>>> b1fc7aa3115213bfc693210ceeffd59cb9753d3b
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        admin = new javax.swing.JButton();
        student = new javax.swing.JButton();
        company = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
<<<<<<< HEAD
        jButton1 = new javax.swing.JButton();
=======
>>>>>>> b1fc7aa3115213bfc693210ceeffd59cb9753d3b

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(215, 193, 195));
        setUndecorated(true);

        admin.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        admin.setText("ADMIN LOGIN");
        admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminActionPerformed(evt);
            }
        });

        student.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        student.setText("STUDENT LOGIN");
        student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentActionPerformed(evt);
            }
        });

        company.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        company.setText("COMPANY LOGIN");
        company.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companyActionPerformed(evt);
            }
        });

        cancel.setBackground(new java.awt.Color(255, 0, 0));
        cancel.setText("X");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

<<<<<<< HEAD
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

=======
>>>>>>> b1fc7aa3115213bfc693210ceeffd59cb9753d3b
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cancel))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(116, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(admin)
                        .addGap(125, 125, 125))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(company, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(student, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
<<<<<<< HEAD
                        .addGap(110, 110, 110))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(159, 159, 159))))
=======
                        .addGap(110, 110, 110))))
>>>>>>> b1fc7aa3115213bfc693210ceeffd59cb9753d3b
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(cancel)
                .addGap(40, 40, 40)
                .addComponent(admin)
                .addGap(26, 26, 26)
                .addComponent(student)
                .addGap(26, 26, 26)
                .addComponent(company)
<<<<<<< HEAD
                .addGap(33, 33, 33)
                .addComponent(jButton1)
                .addContainerGap(38, Short.MAX_VALUE))
=======
                .addContainerGap(96, Short.MAX_VALUE))
>>>>>>> b1fc7aa3115213bfc693210ceeffd59cb9753d3b
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentActionPerformed
       dispose();                           //to close current window 
       StudentLogin s = new StudentLogin();
<<<<<<< HEAD
       //flag=s.getStatus();
=======
       
>>>>>>> b1fc7aa3115213bfc693210ceeffd59cb9753d3b
    }//GEN-LAST:event_studentActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminActionPerformed
<<<<<<< HEAD
        dispose();//to close current window 
        AdminLogin a= new AdminLogin();
        a.setVisible(true);     //creating new object of admin window & display it to screen 
        //flag=a.getStatus();
=======
        dispose();                             //to close current window 
        new AdminLogin().setVisible(true);     //creating new object of admin 
                                                //window & display it to screen 
>>>>>>> b1fc7aa3115213bfc693210ceeffd59cb9753d3b
    }//GEN-LAST:event_adminActionPerformed

    private void companyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companyActionPerformed
        dispose();                             //to close current window 
<<<<<<< HEAD
        CompanyLogin c=new CompanyLogin();
        c.setVisible(true); 
        //flag=c.getStatus();
    }//GEN-LAST:event_companyActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new MainScreen().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /*public int getStatus(){
        System.out.println("Login status sent: "+flag);
        return flag;
    }*/
=======
        new CompanyLogin().setVisible(true); 
    }//GEN-LAST:event_companyActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
>>>>>>> b1fc7aa3115213bfc693210ceeffd59cb9753d3b

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton admin;
    private javax.swing.JButton cancel;
    private javax.swing.JButton company;
<<<<<<< HEAD
    private javax.swing.JButton jButton1;
=======
>>>>>>> b1fc7aa3115213bfc693210ceeffd59cb9753d3b
    private javax.swing.JButton student;
    // End of variables declaration//GEN-END:variables
}
