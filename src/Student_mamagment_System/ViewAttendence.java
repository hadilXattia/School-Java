
package Student_mamagment_System;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public  class ViewAttendence extends javax.swing.JFrame {
    private String First_Name;
    private String Roll_Number;
    private String Semester; 
    
public ViewAttendence(){
    
    First_Name =Student.getFirst_Name();
    Roll_Number =Student.getRoll_Number();
    Semester =Student.getSemester();
        initComponents();
        display1();
        display2();
        
    
}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Roll_NO = new javax.swing.JTextField();
        Nmae = new javax.swing.JTextField();
        f3 = new javax.swing.JTextField();
        f1 = new javax.swing.JTextField();
        f2 = new javax.swing.JTextField();
        f4 = new javax.swing.JTextField();
        f5 = new javax.swing.JTextField();
        m5 = new javax.swing.JTextField();
        m4 = new javax.swing.JTextField();
        m3 = new javax.swing.JTextField();
        m2 = new javax.swing.JTextField();
        m1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(243, 242, 255));

        jLabel1.setBackground(new java.awt.Color(243, 242, 255));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(27, 75, 101));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Attendance Report");

        Roll_NO.setEditable(false);
        Roll_NO.setBackground(new java.awt.Color(243, 242, 255));
        Roll_NO.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        Roll_NO.setForeground(new java.awt.Color(27, 75, 101));
        Roll_NO.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        Roll_NO.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Roll_NO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Roll_NOActionPerformed(evt);
            }
        });

        Nmae.setEditable(false);
        Nmae.setBackground(new java.awt.Color(243, 242, 255));
        Nmae.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        Nmae.setForeground(new java.awt.Color(27, 75, 101));
        Nmae.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        Nmae.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Nmae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NmaeActionPerformed(evt);
            }
        });

        f3.setEditable(false);
        f3.setBackground(new java.awt.Color(243, 242, 255));
        f3.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        f3.setForeground(new java.awt.Color(27, 75, 101));
        f3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        f3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        f3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f3ActionPerformed(evt);
            }
        });

        f1.setEditable(false);
        f1.setBackground(new java.awt.Color(243, 242, 255));
        f1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        f1.setForeground(new java.awt.Color(27, 75, 101));
        f1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        f1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        f1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f1ActionPerformed(evt);
            }
        });

        f2.setEditable(false);
        f2.setBackground(new java.awt.Color(243, 242, 255));
        f2.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        f2.setForeground(new java.awt.Color(27, 75, 101));
        f2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        f2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        f2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f2ActionPerformed(evt);
            }
        });

        f4.setEditable(false);
        f4.setBackground(new java.awt.Color(243, 242, 255));
        f4.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        f4.setForeground(new java.awt.Color(27, 75, 101));
        f4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        f4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        f4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f4ActionPerformed(evt);
            }
        });

        f5.setEditable(false);
        f5.setBackground(new java.awt.Color(243, 242, 255));
        f5.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        f5.setForeground(new java.awt.Color(27, 75, 101));
        f5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        f5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        f5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f5ActionPerformed(evt);
            }
        });

        m5.setEditable(false);
        m5.setBackground(new java.awt.Color(243, 242, 255));
        m5.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        m5.setForeground(new java.awt.Color(27, 75, 101));
        m5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        m5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        m5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m5ActionPerformed(evt);
            }
        });

        m4.setEditable(false);
        m4.setBackground(new java.awt.Color(243, 242, 255));
        m4.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        m4.setForeground(new java.awt.Color(27, 75, 101));
        m4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        m4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        m4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m4ActionPerformed(evt);
            }
        });

        m3.setEditable(false);
        m3.setBackground(new java.awt.Color(243, 242, 255));
        m3.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        m3.setForeground(new java.awt.Color(27, 75, 101));
        m3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        m3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        m3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m3ActionPerformed(evt);
            }
        });

        m2.setEditable(false);
        m2.setBackground(new java.awt.Color(243, 242, 255));
        m2.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        m2.setForeground(new java.awt.Color(27, 75, 101));
        m2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        m2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        m2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m2ActionPerformed(evt);
            }
        });

        m1.setEditable(false);
        m1.setBackground(new java.awt.Color(243, 242, 255));
        m1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        m1.setForeground(new java.awt.Color(27, 75, 101));
        m1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        m1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        m1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Student_mamagment_System/pic/close_1.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(f2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(f3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(f4, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(f5, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(f1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nmae, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(92, 92, 92)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(m1, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                .addComponent(m2)
                                .addComponent(m3)
                                .addComponent(m4)
                                .addComponent(m5))
                            .addComponent(Roll_NO, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 68, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(30, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(43, 43, 43)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nmae, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Roll_NO, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(f1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(f2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(f3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(f4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(f5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(m1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(m2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(m3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(m4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(m5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(153, 153, 153))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void f3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f3ActionPerformed

    private void f1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f1ActionPerformed

    private void f2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f2ActionPerformed

    private void f4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f4ActionPerformed

    private void f5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f5ActionPerformed

    private void m5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m5ActionPerformed

    private void m4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m4ActionPerformed

    private void m3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m3ActionPerformed

    private void m2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m2ActionPerformed

    private void m1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m1ActionPerformed

    private void Roll_NOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Roll_NOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Roll_NOActionPerformed

    private void NmaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NmaeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NmaeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ViewAttendence VG;
                   VG = new ViewAttendence();
                   VG.setVisible(false);
                        dispose();
      
    }//GEN-LAST:event_jButton1ActionPerformed
    public void display1(){
        Nmae.setText(First_Name);
        Roll_NO.setText(Roll_Number);
         Connection conn= connection.connect();
         PreparedStatement ps=null;
         ResultSet rs=null;
         try{
            
            String sql = "select * from Course where Semester = ?";
            ps=conn.prepareStatement(sql);
            ps.setString(1,Semester );
            rs=ps.executeQuery();
            if(rs.next()){
                
                
                String C1= rs.getString(2);
                f1.setText(C1);
                String C2= rs.getString(4);
                f2.setText(C2);
                String C3= rs.getString(6);
                f3.setText(C3);
                String C4= rs.getString(8);
                f4.setText(C4);
                String C5= rs.getString(10);
                f5.setText(C5);
                
            }
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Record has Been Updeted new Student");
        }
       finally{
            if(ps != null)
             try{
                 ps.close(); 
             }catch(SQLException e){
                 System.out.println("PreparedStatement close problem");
             }
             if(conn != null)
             try{
                 conn.close();
             }catch(SQLException e){
                 System.out.println("Database Connection close problem");
             }
        }
    }
    public void display2(){
        
         Connection conn= connection.connect();
         PreparedStatement ps=null;
         ResultSet rs=null;
         try{
            
            String sql = "select * from StudentAttendence where Roll_Number = ?";
            ps=conn.prepareStatement(sql);
            ps.setString(1,Roll_Number);
            rs=ps.executeQuery();
            if(rs.next()){
                
                
                String G1= rs.getString(2);
                m1.setText(G1);
                String G2= rs.getString(3);
                m2.setText(G2);
                String G3= rs.getString(4);
                m3.setText(G3);
                String G4= rs.getString(5);
                m4.setText(G4);
                String G5= rs.getString(6);
                m5.setText(G5);
               
            }
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Record has Been Updeted new Student");
        }
       finally{
            if(ps != null)
             try{
                 ps.close(); 
             }catch(SQLException e){
                 System.out.println("PreparedStatement close problem");
             }
             if(conn != null)
             try{
                 conn.close();
             }catch(SQLException e){
                 System.out.println("Database Connection close problem");
             }
        }
    }
   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Nmae;
    private javax.swing.JTextField Roll_NO;
    private javax.swing.JTextField f1;
    private javax.swing.JTextField f2;
    private javax.swing.JTextField f3;
    private javax.swing.JTextField f4;
    private javax.swing.JTextField f5;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField m1;
    private javax.swing.JTextField m2;
    private javax.swing.JTextField m3;
    private javax.swing.JTextField m4;
    private javax.swing.JTextField m5;
    // End of variables declaration//GEN-END:variables
}