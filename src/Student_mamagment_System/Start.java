/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student_mamagment_System;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Start extends javax.swing.JFrame {

    private JFrame frame;
    Connection conn = connection.connect();
    PreparedStatement ps = null;
    ResultSet rs = null;

    public Start() {
        initComponents();

    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(243, 242, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jRadioButton1.setBackground(new java.awt.Color(243, 242, 255));
        jRadioButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(27, 75, 101));
        jRadioButton1.setText("Teacher");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 400, 140, -1));

        jRadioButton2.setBackground(new java.awt.Color(243, 242, 255));
        jRadioButton2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(27, 75, 101));
        jRadioButton2.setText("Student");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 400, 140, -1));

        jRadioButton3.setBackground(new java.awt.Color(243, 242, 255));
        jRadioButton3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(27, 75, 101));
        jRadioButton3.setText("Admin");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 400, 140, -1));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(27, 75, 101));
        jLabel5.setText("Student manegment system");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 500, 60));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(27, 75, 101));
        jLabel6.setText("Username");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 160, 120, 50));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(27, 75, 101));
        jLabel7.setText("Password:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 260, 120, 50));

        jButton1.setBackground(new java.awt.Color(27, 75, 101));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("LOGIN ");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(243, 242, 255), 1, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 480, 180, 60));

        jTextField2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(243, 242, 255), 1, true));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 200, 340, 40));

        jPasswordField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(243, 242, 255), 1, true));
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 300, 340, 40));

        jButton3.setBackground(new java.awt.Color(243, 242, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Student_mamagment_System/pic/close_1.png"))); // NOI18N
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(243, 242, 255), 1, true));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 10, 40, 30));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Student_mamagment_System/pic/School.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 650, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1224, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed

    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed

    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed

    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed

    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(jRadioButton3.isSelected()){
            try {
                String sql="SELECT * From Admin Where Username=? AND Password=?;";
                try {
                    ps=conn.prepareStatement(sql);
                    ps.setString(1, jTextField2.getText());
                    ps.setString(2, jPasswordField1 .getText());
                    rs=ps.executeQuery();
                    if(rs.next()){
                        JOptionPane.showMessageDialog(null, "Login SuccesFully");
                        AdminPage Admin;
                        Admin = new AdminPage();
                        Admin.setVisible(true);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Incorrect Username or Password");
                    }

                } catch (SQLException ex) {
                    Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
                }
                ps.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(jRadioButton2.isSelected()){
            try {
                String sql="SELECT * From Student Where Username=? AND Password=?;";
                try {
                    ps=conn.prepareStatement(sql);
                    ps.setString(1, jTextField2.getText());
                    ps.setString(2, jPasswordField1 .getText());

                    rs=ps.executeQuery();
                    if(rs.next()){
                        JOptionPane.showMessageDialog(null, "Login SuccesFully");
                        Student Smain;
                        Smain= new Student(jTextField2.getText());
                        Smain.setVisible(true);
                    }
                    else{

                        JOptionPane.showMessageDialog(null, "Incorrect Username or Password");
                    }

                } catch (SQLException ex) {
                    Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
                }
                ps.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(jRadioButton1.isSelected()){
            try {
                String sql="SELECT * From Teacher Where Username=? AND Password=?;";
                try {
                    ps=conn.prepareStatement(sql);
                    ps.setString(1, jTextField2.getText());
                    ps.setString(2, jPasswordField1 .getText());
                    rs=ps.executeQuery();
                    if(rs.next()){
                        JOptionPane.showMessageDialog(null, "Login SuccesFully");
                        Teacher_main Teach;
                        Teach = new Teacher_main();
                        Teach.setVisible(true);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Incorrect Username or Password");
                    }

                } catch (SQLException ex) {
                    Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
                }
                ps.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "No Field selected");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int a=JOptionPane.showConfirmDialog(null,"Do you really want to close the application","Select",JOptionPane.YES_NO_OPTION);
        if (a==0)
            System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Start.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Start.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Start.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Start.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Start().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    private void close() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
