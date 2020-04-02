
package se.view;

import se.skola.MyConnection;
import se.skola.TheDate;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author rimazivkovic
 */
public class TeacherFrame extends javax.swing.JFrame {
    
    Connection con = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
    String query = null;
    
    private String idStudent;
    String date;
    TheDate dt = new TheDate();
    private int id;
    /**
     * Creates new form TeacherFrame
     */
    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public TeacherFrame() {
        initComponents(); 
        this.setLocationRelativeTo(null); 
        con = MyConnection.getConnection();
    }
    
    public String user;
    public TeacherFrame(String user){
        initComponents();
        con = MyConnection.getConnection();
        this.date = dt.showDate();
        dateLabel.setText(date); 
        this.idStudent = null; 
        idField.enable(false);
        this.user = user;
        
        String idTeacher = "SELECT Teacher.idTeacher from Teacher WHERE Username = '" + this.user + "'";

        try {
                ps = con.prepareStatement(idTeacher);
                rs = ps.executeQuery();

            if (rs.next()) {
                this.id = rs.getInt("Teacher.idTeacher");
                getInfo(id);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TeacherFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        ExitButton = new javax.swing.JButton();
        jbtnAttendence = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        teacherNameLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        AddStudentButton = new javax.swing.JButton();
        emailLabel = new javax.swing.JLabel();
        lastnameLabel = new javax.swing.JLabel();
        namejLabel = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        firstnameField = new javax.swing.JTextField();
        lastnameField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        saveUpdateButton = new javax.swing.JButton();
        idField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        clearButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(255, 102, 0));

        jTable2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Student ID", "Förnamn", "Efternamn", "Email", "kursnamn"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable2);

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Klicka på student informationen för att hantera");

        ExitButton.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        ExitButton.setText("Avsluta");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        jbtnAttendence.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jbtnAttendence.setText("Hantera närvaro");
        jbtnAttendence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAttendenceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnAttendence, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {ExitButton, jbtnAttendence});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnAttendence, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {ExitButton, jbtnAttendence});

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));

        titleLabel.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setText("Lärare");

        dateLabel.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(255, 255, 255));

        teacherNameLabel.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        teacherNameLabel.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(teacherNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(titleLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 821, Short.MAX_VALUE)
                        .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titleLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(teacherNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));

        AddStudentButton.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        AddStudentButton.setText("Lägg till");
        AddStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddStudentButtonActionPerformed(evt);
            }
        });

        emailLabel.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(255, 255, 255));
        emailLabel.setText("Email: ");

        lastnameLabel.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        lastnameLabel.setForeground(new java.awt.Color(255, 255, 255));
        lastnameLabel.setText("Efternamn:");

        namejLabel.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        namejLabel.setForeground(new java.awt.Color(255, 255, 255));
        namejLabel.setText("Förnamn:");

        usernameField.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });

        usernameLabel.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel.setText("Användarnamn:");

        passwordField.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N

        emailField.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N

        firstnameField.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N

        lastnameField.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N

        passwordLabel.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setText("Lösenord:");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Lägg till ny student");

        saveUpdateButton.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        saveUpdateButton.setText("Spara ändring");
        saveUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveUpdateButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID:");

        clearButton.setText("Töm ");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(namejLabel)
                                    .addComponent(emailLabel)
                                    .addComponent(passwordLabel)
                                    .addComponent(usernameLabel)
                                    .addComponent(lastnameLabel))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emailField, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                    .addComponent(firstnameField, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lastnameField)
                                    .addComponent(passwordField)
                                    .addComponent(usernameField, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(clearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(AddStudentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(saveUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(30, 30, 30))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {AddStudentButton, saveUpdateButton});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel3)
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namejLabel)
                    .addComponent(firstnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastnameLabel)
                    .addComponent(lastnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clearButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddStudentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveUpdateButton))
                .addGap(52, 52, 52))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {AddStudentButton, saveUpdateButton});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jPanel2, jPanel4});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void getInfo(int id) {
    
        query = "SELECT idStudent, Student.Firstname, Student.Lastname, Student.Email, Coursename FROM Course \n"
                + "LEFT JOIN Teacher ON Course.Teacher_idTeacher = Teacher.idTeacher\n"
                + "LEFT JOIN Course_has_Student ON Course.idCourse = Course_has_Student.Course_idCourse\n"
                + "LEFT JOIN Student ON Course_has_Student.Student_idStudent = Student.idStudent\n"
                + "WHERE Teacher.idTeacher = " + id;
              
        try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            jTable2.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            Logger.getLogger(TeacherFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldActionPerformed

    private void AddStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddStudentButtonActionPerformed
        String firstname = firstnameField.getText();
        String lastname = lastnameField.getText();
        String username = usernameField.getText();
        String email = emailField.getText();
        String password = passwordField.getText();
        AddNewStudentFrame ad = new AddNewStudentFrame();
        ad.insert(firstname, lastname, username, email, password);
        reset();
        
    }//GEN-LAST:event_AddStudentButtonActionPerformed

    private void saveUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveUpdateButtonActionPerformed
        update();
    }//GEN-LAST:event_saveUpdateButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        reset();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void jbtnAttendenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAttendenceActionPerformed
        // TODO add your handling code here:
        AttendanceFrame af = new AttendanceFrame(user);
        af.setVisible(true);
    }//GEN-LAST:event_jbtnAttendenceActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        this.setVisible(false);
        StartFrame sf = new StartFrame();
        sf.setVisible(true);
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        con = MyConnection.getConnection();
        int selection = jTable2.getSelectedRow();

        String click = jTable2.getModel().getValueAt(selection, 0).toString();
        query = "select * from Student where idStudent = " + click;

        try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();

            if (rs.next()) {

                idField.setText(click);

                String firstname = rs.getString("Firstname");
                firstnameField.setText(firstname);

                String lastname = rs.getString("Lastname");
                lastnameField.setText(lastname);

                String username = rs.getNString("Username");
                usernameField.setText(username);
                usernameField.enable(false);

                String email = rs.getString("Email");
                emailField.setText(email);

                String password = rs.getString("Password");
                passwordField.setText(password);
                passwordField.enable(false);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminFrame.class.getName()).log(Level.SEVERE, null, ex);

        }
    }//GEN-LAST:event_jTable2MouseClicked

    public void update() {

        this.idStudent = idField.getText();

        if(idField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ändring misslyckades!");
            reset();
        } else {
            query = "Update Student set Firstname ='"
                    + firstnameField.getText() + "', Lastname ='" + lastnameField.getText() + "', Username ='"
                    + usernameField.getText() + "', Email ='" + emailField.getText() + "', Password ='"
                    + passwordField.getText() + "' WHERE idStudent = '" + idStudent + "'";

            try {
                ps = con.prepareStatement(query);
                ps.executeUpdate();

                JOptionPane.showMessageDialog(null, "Ändring har sparats!");
                jTable2.removeAll();
                getInfo(id);
                reset();
            } catch (SQLException ex) {
                Logger.getLogger(TeacherFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    private void reset() {
        idField.setText("");
        firstnameField.setText("");
        lastnameField.setText("");
        usernameField.setText("");
        emailField.setText("");
        passwordField.setText("");
        usernameField.enable(true);
        passwordField.enable(true);
        
    }
    
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TeacherFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddStudentButton;
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField firstnameField;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton jbtnAttendence;
    private javax.swing.JTextField lastnameField;
    private javax.swing.JLabel lastnameLabel;
    private javax.swing.JLabel namejLabel;
    private javax.swing.JTextField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton saveUpdateButton;
    public javax.swing.JLabel teacherNameLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
