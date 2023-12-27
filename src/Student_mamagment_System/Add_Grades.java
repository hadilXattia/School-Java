
package Student_mamagment_System;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Add_Grades extends javax.swing.JFrame {


    public Add_Grades() {
        initComponents();
        display();
        display2();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jTextFieldStudent = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextFieldClass = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        f1 = new javax.swing.JTextField();
        f2 = new javax.swing.JTextField();
        f3 = new javax.swing.JTextField();
        f4 = new javax.swing.JTextField();
        f5 = new javax.swing.JTextField();
        Field6 = new javax.swing.JTextField();
        Field2 = new javax.swing.JTextField();
        Field3 = new javax.swing.JTextField();
        Field4 = new javax.swing.JTextField();
        Field9 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(243, 242, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldStudent.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jTextFieldStudent.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jTextFieldStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldStudentActionPerformed(evt);
            }
        });
        jTextFieldStudent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldStudentKeyReleased(evt);
            }
        });
        jPanel6.add(jTextFieldStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 160, 40));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel7.setText("Student ID");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 150, 40));

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, -1, 40));

        jPanel10.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(27, 75, 101));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Add grades");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 340, 60));

        jButton2.setBackground(new java.awt.Color(27, 75, 101));
        jButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(243, 242, 255));
        jButton2.setText("Add");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 690, 110, 40));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        jLabel3.setText("Semester ");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 160, 50));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S1", "S2", "S3", "S4", "S5", "S6", "S7", "S8" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel6.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 80, 30));

        jButton1.setBackground(new java.awt.Color(243, 242, 255));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Student_mamagment_System/pic/close_1.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 10, 30, 30));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        jLabel4.setText("Semester ");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 160, 50));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(243, 242, 255));
        jTable1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTable1.setSelectionBackground(new java.awt.Color(243, 242, 255));
        jScrollPane1.setViewportView(jTable1);

        jPanel6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, 540, -1));

        jTextFieldClass.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jTextFieldClass.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jTextFieldClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldClassActionPerformed(evt);
            }
        });
        jTextFieldClass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldClassKeyReleased(evt);
            }
        });
        jPanel6.add(jTextFieldClass, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 120, 160, 40));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel9.setText("Class");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 120, 150, 40));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(27, 75, 101));
        jLabel1.setText("Grades ");
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 200, 40));

        f1.setEditable(false);
        f1.setBackground(new java.awt.Color(243, 242, 255));
        f1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        f1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        f1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f1ActionPerformed(evt);
            }
        });
        jPanel6.add(f1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 220, 40));

        f2.setEditable(false);
        f2.setBackground(new java.awt.Color(243, 242, 255));
        f2.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        f2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        f2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f2ActionPerformed(evt);
            }
        });
        jPanel6.add(f2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 220, 40));

        f3.setEditable(false);
        f3.setBackground(new java.awt.Color(243, 242, 255));
        f3.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        f3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        f3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f3ActionPerformed(evt);
            }
        });
        jPanel6.add(f3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 220, 40));

        f4.setEditable(false);
        f4.setBackground(new java.awt.Color(243, 242, 255));
        f4.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        f4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        f4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f4ActionPerformed(evt);
            }
        });
        jPanel6.add(f4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 220, 40));

        f5.setEditable(false);
        f5.setBackground(new java.awt.Color(243, 242, 255));
        f5.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        f5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        f5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f5ActionPerformed(evt);
            }
        });
        jPanel6.add(f5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 220, 40));

        Field6.setBackground(new java.awt.Color(243, 242, 255));
        Field6.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        Field6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        Field6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Field6ActionPerformed(evt);
            }
        });
        Field6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Field6KeyReleased(evt);
            }
        });
        jPanel6.add(Field6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 220, 40));

        Field2.setBackground(new java.awt.Color(243, 242, 255));
        Field2.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        Field2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        Field2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Field2ActionPerformed(evt);
            }
        });
        jPanel6.add(Field2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 220, 40));

        Field3.setBackground(new java.awt.Color(243, 242, 255));
        Field3.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        Field3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        Field3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Field3ActionPerformed(evt);
            }
        });
        jPanel6.add(Field3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, 220, 40));

        Field4.setBackground(new java.awt.Color(243, 242, 255));
        Field4.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        Field4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        Field4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Field4ActionPerformed(evt);
            }
        });
        jPanel6.add(Field4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, 220, 40));

        Field9.setBackground(new java.awt.Color(243, 242, 255));
        Field9.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        Field9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        Field9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Field9ActionPerformed(evt);
            }
        });
        jPanel6.add(Field9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 520, 220, 40));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(27, 75, 101));
        jLabel2.setText("COURSE NAME ");
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 200, 40));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 850));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     String Roll = jTextFieldStudent.getText();
     String GradeA = Field6.getText();
     String GradeB = Field2.getText();
     String GradeC = Field3.getText();
     String GradeD = Field4.getText();
     String GradeE = Field9.getText();
     insert(Roll,GradeA,GradeB,GradeC,GradeD,GradeE);
    }
    public void insert(String Roll_Number,String GradeA ,String GradeB ,String GradeC ,String GradeD ,String GradeE){
        
        try{
        
        java.sql.Connection conn=  connection.connect();
        PreparedStatement ps=null ;
        
        String sql = "INSERT INTO Grades(Roll_Number,GradeA,GradeB,GradeC,GradeD,GradeE) VALUES(?,?,?,?,?,?)";  
        ps = conn.prepareStatement(sql);
        ps.setString(1,Roll_Number );
        ps.setString(2, GradeA);
        ps.setString(3, GradeB);
        ps.setString(4, GradeC);
        ps.setString(5, GradeD);
        ps.setString(6, GradeE);

        ps.execute();
        ps.close();
        conn.close();
        
        JOptionPane.showMessageDialog(null, "Grades been added");
        }
        catch(SQLException e){
            System.out.println(e.toString()); 
        } 
 
                
            
        
       
        
    
    }//GEN-LAST:event_jButton2ActionPerformed
public void check() {
    Connection conn = connection.connect();
    PreparedStatement ps = null;
    ResultSet rs = null;

    try {
        // Change the SQL query to select based on class and semester
        String sql = "SELECT * FROM Student WHERE Class = ? AND Semester = ?";

        try {
            ps = conn.prepareStatement(sql);

            // Change to get class and semester from input fields
            ps.setString(1, jTextFieldStudent.getText());
            ps.setString(2, (String) jComboBox1.getSelectedItem());

            rs = ps.executeQuery();

            if (rs.next()) {
                // Student found, you can perform further actions here
                // For example, call the display method to show the data
                display();
            } else {
                JOptionPane.showMessageDialog(null, "No students found for the given class and semester");
                // Clear the JTable if no students are found
                jTable1.setModel(new DefaultTableModel());
            }

        } catch (SQLException ex) {
            Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            // Close resources in a finally block to ensure they are closed even if an exception occurs
            if (ps != null) {
                ps.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    } catch (SQLException ex) {
        Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
    }
}

 public void check2(){
        Connection conn= connection.connect();
        PreparedStatement ps=null;
        ResultSet rs=null;
        try {
               String sql="SELECT * From Student Where Roll_Number=?;";
               try {
                   ps=conn.prepareStatement(sql);
                   ps.setString(1, jTextFieldStudent.getText());
                    rs=ps.executeQuery();
                   if(rs.next()){
                      
                    }
                   else{
                        JOptionPane.showMessageDialog(null, "Roll Number Not Found");
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

    private void jTextFieldStudentKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldStudentKeyReleased
        
    }//GEN-LAST:event_jTextFieldStudentKeyReleased

    private void jTextFieldStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldStudentActionPerformed
   check2();
    }//GEN-LAST:event_jTextFieldStudentActionPerformed
    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
     check();
     display2();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    
    
    
    
    
                                   

    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
          Add_Grades SR;
                   SR = new  Add_Grades();
                   SR.setVisible(false);
                        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldClassActionPerformed
       check();
    }//GEN-LAST:event_jTextFieldClassActionPerformed

    private void jTextFieldClassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldClassKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldClassKeyReleased

    private void f1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f1ActionPerformed

    private void f2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f2ActionPerformed

    private void f3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f3ActionPerformed

    }//GEN-LAST:event_f3ActionPerformed

    private void f4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f4ActionPerformed

    private void f5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f5ActionPerformed

    private void Field6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Field6ActionPerformed

    private void Field6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Field6KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Field6KeyReleased

    private void Field2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Field2ActionPerformed

    private void Field3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Field3ActionPerformed

    private void Field4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Field4ActionPerformed

    private void Field9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Field9ActionPerformed

public void display() {
    java.sql.Connection conn = connection.connect();
    PreparedStatement ps = null;
    ResultSet rs = null;

    try {
        String studentClass = jTextFieldClass.getText();
        String semester = (String) jComboBox1.getSelectedItem();

        String sql = "SELECT * FROM Student WHERE Class = ? AND Semester = ?";
        ps = conn.prepareStatement(sql);
        ps.setString(1, studentClass);
        ps.setString(2, semester);
        rs = ps.executeQuery();

        // Create a DefaultTableModel with column names
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Roll_Number");
        model.addColumn("Username");
        model.addColumn("Class");
        model.addColumn("Semester");

        // Populate the table model with data
        while (rs.next()) {
            String studentID = rs.getString("Roll_Number");
            String user = rs.getString("Username");
            String sClass = rs.getString("Class");
            String sem = rs.getString("Semester");

            Object[] row = {studentID, user, sClass, sem};
            model.addRow(row);
        }

        // Set the model for your JTable
        jTable1.setModel(model);

    } catch (SQLException ex) {
        Logger.getLogger(Add_Grades.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
        // Close resources in a finally block to ensure they are closed
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Add_Grades.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
  public void display2(){

        java.sql.Connection conn= connection.connect();
        PreparedStatement ps=null;
        ResultSet rs=null;
        try{
            String S = (String)jComboBox1.getSelectedItem();
            System.out.println(S);
            String sql = "select * from Course where Semester = ?";
            ps=conn.prepareStatement(sql);
            ps.setString(1,S );
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
                String C5= rs.getString("CourseE");
                f5.setText(C5);
                System.out.println(C1);
               
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(Add_Grades.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(Add_Grades.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Add_Grades.class.getName()).log(Level.SEVERE, null, ex);
        }
    }



   
   
   
   
   
   
   
   
    

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
            java.util.logging.Logger.getLogger(Add_Grades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Grades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Grades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Grades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Grades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Field2;
    private javax.swing.JTextField Field3;
    private javax.swing.JTextField Field4;
    private javax.swing.JTextField Field6;
    private javax.swing.JTextField Field9;
    private javax.swing.JTextField f1;
    private javax.swing.JTextField f2;
    private javax.swing.JTextField f3;
    private javax.swing.JTextField f4;
    private javax.swing.JTextField f5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldClass;
    private javax.swing.JTextField jTextFieldStudent;
    // End of variables declaration//GEN-END:variables



}
