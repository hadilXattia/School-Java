
package Student_mamagment_System;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Add_Student_Record extends javax.swing.JFrame {
  Add_Student_Record(){
  initComponents();
  }                                                                                                                                                                                                                                                                                           
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(243, 242, 255));
        jPanel1.setForeground(new java.awt.Color(243, 242, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1224, 790));
        jPanel1.setMinimumSize(new java.awt.Dimension(1224, 790));
        jPanel1.setPreferredSize(new java.awt.Dimension(1224, 790));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(27, 75, 101));
        jLabel1.setText("Last Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 180, 40));

        jTextField1.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 520, 230, 40));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(27, 75, 101));
        jLabel2.setText("First Name:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 180, 40));

        jTextField2.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        jTextField2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 230, 40));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(27, 75, 101));
        jLabel3.setText("Password:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 170, 30));

        jTextField3.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(51, 51, 51));
        jTextField3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 230, 40));

        jTextField4.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        jTextField4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 230, 40));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(27, 75, 101));
        jLabel4.setText("Username :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 170, 40));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(27, 75, 101));
        jLabel5.setText("Batch No. ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 270, 180, 40));

        jTextField5.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        jTextField5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 330, 230, 40));

        jTextField6.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        jTextField6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 200, 230, 40));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(27, 75, 101));
        jLabel6.setText("Father Name:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 150, 180, 40));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(27, 75, 101));
        jLabel9.setText("Add Student ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 250, 50));

        jButton2.setBackground(new java.awt.Color(27, 75, 101));
        jButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(243, 242, 255));
        jButton2.setText("Add ");
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 630, 200, 50));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(27, 75, 101));
        jLabel7.setText("Semester");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 390, 180, 40));

        jComboBox2.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S1", "S2", "S3", "S4", "S5", "S6", "S7", "S8" }));
        jComboBox2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 440, 230, -1));

        jButton1.setBackground(new java.awt.Color(27, 75, 101));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(243, 242, 255));
        jButton1.setText("Back");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 630, 200, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1224, 790));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void insert(String Username,String Password,String First_Name,String Last_Name,String Father_Name,String Batch_Number,String Semester){
     try{
        initComponents();
        Connection conn= connection.connect();
        PreparedStatement ps=null ;
        //roll number must be auto increment
        String sql = "INSERT INTO Student(Username,Password,First_Name,Last_Name,Father_Name,Batch_Number,Semester) VALUES(?,?,?,?,?,?,?)";  
        ps= conn.prepareStatement(sql);
        ps.setString(1, Username);
        ps.setString(2, Password);
        ps.setString(3, First_Name);
        ps.setString(4, Last_Name);
  
        ps.setString(5, Father_Name);
        ps.setString(6, Batch_Number);
        ps.setString(7, Semester);
        
        ps.execute();
        ps.close();
        conn.close();
        JOptionPane.showMessageDialog(null, "Student added successfully");
        }
        catch(SQLException e){
            System.out.println(e.toString()); 
        }
       
        
    }
    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // Father Name
        
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // batch no.:
        
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        //email
        
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // Password
        
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        //First name
       
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        //last name
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String First_Name = jTextField2.getText();
        String Last_Name = jTextField1.getText();
    
        String Father_Name = jTextField6.getText();
        String Batch = jTextField5.getText();
        String Password= jTextField3.getText();
        String Username= jTextField4.getText();
        String Semester = (String)jComboBox2.getSelectedItem();
        insert(Username,Password,First_Name,Last_Name,Father_Name,Batch,Semester);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
           Add_Student_Record SR;
                   SR = new  Add_Student_Record();
                   SR.setVisible(false);
                        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

 
    public static void main(String[] args) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new Add_Student_Record().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables

    
    
}


