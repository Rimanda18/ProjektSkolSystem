/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.view;

import se.skola.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author rimazivkovic
 */
public class AddNewStudentFrame extends javax.swing.JFrame {

    String query = null;
    Connection con = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
    
    
    /**
     * Creates new form StudentUpdateFrame
     */
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public AddNewStudentFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        con = MyConnection.getConnection(); 
        idField.enable(false);
        
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        pwField = new javax.swing.JTextField();
        mailField = new javax.swing.JTextField();
        fNameField = new javax.swing.JTextField();
        lNameField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        uNameField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        math1A = new javax.swing.JCheckBox();
        math3C = new javax.swing.JCheckBox();
        math2B = new javax.swing.JCheckBox();
        eng1A = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        subjectTextArea = new javax.swing.JTextArea();
        eng2A = new javax.swing.JCheckBox();
        swe1 = new javax.swing.JCheckBox();
        swe2 = new javax.swing.JCheckBox();
        swe3 = new javax.swing.JCheckBox();
        sam2B = new javax.swing.JCheckBox();
        ekAA = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel6.setText("Kurser: ");

        pwField.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N

        mailField.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N

        fNameField.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N

        lNameField.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel7.setText("Lösenord:");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel5.setText("Email: ");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel4.setText("Efternamn:");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel3.setText("Förnamn:");

        uNameField.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        uNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uNameFieldActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel8.setText("Användarnamn:");

        math1A.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        math1A.setText("Matematik 1A");
        math1A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                math1AActionPerformed(evt);
            }
        });

        math3C.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        math3C.setText("Matematik 3C");
        math3C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                math3CActionPerformed(evt);
            }
        });

        math2B.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        math2B.setText("Matematik 2B");
        math2B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                math2BActionPerformed(evt);
            }
        });

        eng1A.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        eng1A.setText("Engelska 1A");
        eng1A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eng1AActionPerformed(evt);
            }
        });

        subjectTextArea.setColumns(20);
        subjectTextArea.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        subjectTextArea.setRows(5);
        jScrollPane1.setViewportView(subjectTextArea);

        eng2A.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        eng2A.setText("Engelska 2A");
        eng2A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eng2AActionPerformed(evt);
            }
        });

        swe1.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        swe1.setText("Svenska 1");
        swe1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                swe1ActionPerformed(evt);
            }
        });

        swe2.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        swe2.setText("Svenska 2");
        swe2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                swe2ActionPerformed(evt);
            }
        });

        swe3.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        swe3.setText("Svenska 3");
        swe3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                swe3ActionPerformed(evt);
            }
        });

        sam2B.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        sam2B.setText("Samhäll 2B");
        sam2B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sam2BActionPerformed(evt);
            }
        });

        ekAA.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        ekAA.setText("Ekonomi AA");
        ekAA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekAAActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Valda kurser:");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("Student uppgifter:");

        addButton.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        addButton.setText("Lägg till");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        closeButton.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        closeButton.setText("Stäng");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jButton1.setText("Uppdatera");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel10.setText("ID:");

        idField.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel4))
                                    .addGap(31, 31, 31)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lNameField)
                                        .addComponent(fNameField)
                                        .addComponent(mailField)
                                        .addComponent(pwField)
                                        .addComponent(uNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel2))))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(eng1A, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(math2B, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(math1A, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(math3C, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(eng2A, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(swe2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ekAA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sam2B, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(swe3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(67, 67, 67))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(swe1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {fNameField, jLabel3, jLabel4, jLabel5, jLabel7, jLabel8, lNameField, mailField, pwField, uNameField});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addButton, closeButton, jButton1});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel6)))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(math1A, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(math2B, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(math3C, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eng1A, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eng2A, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(swe1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(swe2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(swe3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sam2B, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ekAA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(90, 90, 90))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel4)
                                            .addComponent(lNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(fNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3))
                                        .addGap(48, 48, 48)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(uNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8))
                                        .addGap(7, 7, 7)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(mailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(pwField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(37, Short.MAX_VALUE))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {fNameField, jLabel3, jLabel4, jLabel5, jLabel7, jLabel8, lNameField, mailField, pwField, uNameField});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {addButton, closeButton, jButton1});

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Student hantering");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(503, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel9)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void uNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uNameFieldActionPerformed

    private void math1AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_math1AActionPerformed
        String idkurs = "1";
        String idstudent = idField.getText();
        if(math1A.isSelected()){
           
           insertKurs(idkurs,idstudent);
        }else{
            
            deleteKurs(idkurs,idstudent);
            }
        getInfoKurs(idstudent);
    }//GEN-LAST:event_math1AActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        String firstname = fNameField.getText();
        String lastname = lNameField.getText();
        String username = uNameField.getText();
        String email = mailField.getText();
        String password = pwField.getText();
        controlData(firstname, lastname, username, email, password);   
    }
    
    public void controlData(String firstname, String lastname, String username, String email, String password){
        if (firstname.equals("")) {
            JOptionPane.showMessageDialog(null, "Skriv in förnamn!");
        } else if (lastname.equals("")) {
            JOptionPane.showMessageDialog(null, "Skriv in efternamn!");
        } else if (username.equals("")) {
            JOptionPane.showMessageDialog(null, "Skriv in användarnamn!");
        } else if (email.equals("")) {
            JOptionPane.showMessageDialog(null, "Skriv in email!");
        } else if (!isValidEmail(email)) {
            JOptionPane.showMessageDialog(null, "Kontrollera Mailadress! ");
        } else if (usernameExists()) {
            JOptionPane.showMessageDialog(null, "Detta användarnmn är redan registrerat");
        } else if (password.equals("")) {
            JOptionPane.showMessageDialog(null, "Skriv in ditt lösenord!");
       
        } else {
            try {
                query = "SELECT Email,Username FROM Student WHERE Email =? and Username=?" ;
                ps = con.prepareStatement(query);
                ps.setString(1, email);
                ps.setString(2, username);
                rs = ps.executeQuery();
                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "Detta email är redan registrerad!");
                } else {
                    insert(firstname, lastname, username, email, password);
                }
            } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, ex.toString());
            }
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        this.setVisible(false);
        reset();
    }//GEN-LAST:event_closeButtonActionPerformed

    private void swe1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_swe1ActionPerformed
        // TODO add your handling code here:
        String idkurs = "4";
        String idstudent = idField.getText();
         if(swe1.isSelected()){
           
           insertKurs(idkurs, idstudent);
        }else{
           deleteKurs(idkurs,idstudent); 
            
            }
         getInfoKurs(idstudent);
    }//GEN-LAST:event_swe1ActionPerformed

    private void math2BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_math2BActionPerformed
        String idkurs = "7";
        String idStudent = idField.getText();
        
        if(math2B.isSelected()){
           
           insertKurs(idkurs, idStudent);
        }else{
            deleteKurs(idkurs, idStudent);
            
            }
        getInfoKurs(idStudent);
    }//GEN-LAST:event_math2BActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        try {
            String idStudent = idField.getText();
            query = "select * from Student where idStudent = '" + idStudent + "'";

            ps = con.prepareStatement(query);
            rs = ps.executeQuery();

            if (rs.next()) {

                String email = rs.getString("Email");
                String userName = rs.getString("Username");

                if (email.equals(mailField.getText()) && userName.equals(uNameField.getText())) {
                    query = "Update Student set Firstname ='"
                            + fNameField.getText() + "', Lastname ='" + lNameField.getText() + "', Username ='"
                            + uNameField.getText() + "', Email ='" + mailField.getText() + "', Password ='"
                            + pwField.getText() + "' WHERE idStudent = '" + idStudent + "'";

                    try {
                        ps = con.prepareStatement(query);
                        ps.executeUpdate();

                        JOptionPane.showMessageDialog(null, "Updatering lyckades!");

                    } catch (SQLException ex) {
                        Logger.getLogger(AddNewStaffFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    update();
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(AddNewAdminFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void math3CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_math3CActionPerformed
        // TODO add your handling code here:
        String idkurs = "8";
        String idstudent = idField.getText();
         if(math3C.isSelected()){
           
           insertKurs(idkurs,idstudent);
        }else{
            
            deleteKurs(idkurs,idstudent);
            }
         getInfoKurs(idstudent);
    }//GEN-LAST:event_math3CActionPerformed

    private void eng1AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eng1AActionPerformed
        // TODO add your handling code here:
        String idkurs = "2";
        String idStudent = idField.getText();
         if(eng1A.isSelected()){
           subjectTextArea.append(eng1A.getText() + "\n");
           insertKurs(idkurs,idStudent);
        }else{
          deleteKurs(idkurs,idStudent);
            }
         getInfoKurs(idStudent);
    }//GEN-LAST:event_eng1AActionPerformed

    private void eng2AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eng2AActionPerformed
        // TODO add your handling code here:
        String idkurs = "3";
        String idStudent = idField.getText();
         if(eng2A.isSelected()){
           
           insertKurs(idkurs,idStudent);
        }else{
            
            deleteKurs(idkurs,idStudent);
            }
         getInfoKurs(idStudent);
    }//GEN-LAST:event_eng2AActionPerformed

    private void swe2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_swe2ActionPerformed
        // TODO add your handling code here:
        String idKurs = "5";
        String idStudent = idField.getText();
         if(swe2.isSelected()){
           
           insertKurs(idKurs,idStudent);
        }else{
            
           deleteKurs(idKurs,idStudent); 
            }
         getInfoKurs(idStudent);
    }//GEN-LAST:event_swe2ActionPerformed

    private void swe3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_swe3ActionPerformed
        // TODO add your handling code here:
        String idKurs = "6";
        String idStudent = idField.getText();

         if(swe3.isSelected()){
                                        
            
             insertKurs(idKurs,idStudent);

        }else{
          deleteKurs(idKurs,idStudent);
            }
         getInfoKurs(idStudent);

    }//GEN-LAST:event_swe3ActionPerformed

    private void sam2BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sam2BActionPerformed
        // TODO add your handling code here:
        String idKurs ="9";
        String idStudent = idField.getText();
         if(sam2B.isSelected()){
           
           insertKurs(idKurs,idStudent);
        }else{
           deleteKurs(idKurs,idStudent); 
            
            }
         getInfoKurs(idStudent);
    }//GEN-LAST:event_sam2BActionPerformed

    private void ekAAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekAAActionPerformed
        // TODO add your handling code here:
        String idKurs = "10";
        String idStudent = idField.getText();
         if(ekAA.isSelected()){
           insertKurs(idKurs,idStudent);
        }else{
            deleteKurs(idKurs,idStudent);
            
            }
         getInfoKurs(idStudent);
    }//GEN-LAST:event_ekAAActionPerformed

    public void update() {

        String idStudent = idField.getText();

        if (isEmpty()) {

            JOptionPane.showMessageDialog(this, "Var god fyll i alla fält");

        } else if (!isValidEmail(mailField.getText())) {
            JOptionPane.showMessageDialog(this, "Email inte godkänd");
        } else if (userExist() || userExist2()) {
            JOptionPane.showMessageDialog(this, "Användaren redan regisrerad");
        } else {

            query = "Update Student set Firstname ='"
                    + fNameField.getText() + "', Lastname ='" + lNameField.getText() + "', Username ='"
                    + uNameField.getText() + "', Email ='" + mailField.getText() + "', Password ='"
                    + pwField.getText() +"' WHERE idStudent = '" + idStudent + "'";

            try {
                ps = con.prepareStatement(query);
                ps.executeUpdate();

                JOptionPane.showMessageDialog(null, "Updatering lyckades!");

            } catch (SQLException ex) {
                Logger.getLogger(AddNewStaffFrame.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
     public int insert(String firstname, String lastname, String username, String email, String password) {
        
        int idStudent = 0;
      
         if (firstname.equals("")) {
             JOptionPane.showMessageDialog(null, "Skriv in förnamn!");
         } else if (lastname.equals("")) {
             JOptionPane.showMessageDialog(null, "Skriv in efternamn!");
         } else if (username.equals("")) {
             JOptionPane.showMessageDialog(null, "Skriv in användarnamn!");
         } else if (email.equals("")) {
             JOptionPane.showMessageDialog(null, "Skriv in email!");
         } else if (password.equals("")) {
             JOptionPane.showMessageDialog(null, "Skriv in lösenord!");
         } else {
             query = "INSERT INTO `Student`(`Firstname`, `Lastname`, `Username`, `Email`, `Password`) VALUES (?,?,?,?,?)";
         }
        
        try {
            ps = con.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, firstname);
            ps.setString(2, lastname);
            ps.setString(3, username);
            ps.setString(4, email);
            ps.setString(5, password);
            
            int update = ps.executeUpdate();
            if (update == 1) {
                rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    idStudent = rs.getInt(1);
                    JOptionPane.showMessageDialog(null, firstname + " " + lastname + " har registrerats");
                }
            }
     
        } catch (SQLException ex) {
            Logger.getLogger(RegisterFrame.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                    fNameField.setText("");
                    lNameField.setText("");
                    uNameField.setText("");
                    mailField.setText("");
                    pwField.setText("");
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return idStudent;
     }
      public Set<String> getInfoKurs(String click) {
        
         Set<String> kursSet = new HashSet<String>();
          
        subjectTextArea.setText("");
        
        query = "SELECT Coursename FROM Course\n" 
                + "LEFT JOIN Course_has_Student ON Course.idCourse = Course_has_Student.Course_idCourse\n" 
               +  "LEFT JOIN Student ON Course_has_Student.Student_idStudent = Student.idStudent\n" 
                + "WHERE Student.idStudent = ? order by Course.Coursename" ;
              
        try {
            ps = con.prepareStatement(query); 
             ps.setString(1, click);
            rs = ps.executeQuery();
            
           
            while(rs.next()){
            
            String kurs = rs.getString("Coursename");
            

            kursSet.add(kurs);
            subjectTextArea.append(kurs + "\n");
            

           }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(TeacherFrame.class.getName()).log(Level.SEVERE, null, ex);
        }return kursSet;
      }
      
      
      

    private void insertKurs(String idkurs, String idStudent){
        
        try{
            
            query = "Insert into course_has_student (course_idCourse, student_idstudent) values(?,?)";
            
            try{
                ps = con.prepareStatement(query);
                ps.setString(1, idkurs);
                ps.setString(2,idStudent);
                ps.executeUpdate();
                
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, ex.toString());
            }
            query = "insert into presence (presence_idStudent, presence_idcourse) values(?,?)";
            ps = con.prepareStatement(query);
            ps.setString(1, idStudent);
            ps.setString(2,idkurs);
            ps.executeUpdate();
            
        }catch(SQLException ex){
            Logger.getLogger(AddNewStudentFrame.class.getName()).log(Level.SEVERE,null, ex);
        }
    }
    
    private void deleteKurs(String idkurs, String idStudent){
        try{
            query = "delete from course_has_student where course_idcourse = ? and student_idstudent = ?" ;
            
            try{
                ps = con.prepareStatement(query);
                ps.setString(1, idkurs);
                ps.setString(2, idStudent);
                ps.executeUpdate();
                
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, ex.toString());
            }
            query = "delete from presence where presence_idStudent = ? and presence_idcourse = ?" ;
            
            ps = con.prepareStatement(query);
            ps.setString(1, idStudent);
            ps.setString(2, idkurs);
            ps.executeUpdate();
        }catch(SQLException ex){
            Logger.getLogger(AddNewStudentFrame.class.getName()).log(Level.SEVERE,null, ex);
    }
    }

    
         private void reset() {

        fNameField.setText("");
        lNameField.setText("");
        uNameField.setText("");
        mailField.setText("");
        pwField.setText("");
        idField.setText("");
        subjectTextArea.setText("");

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
            java.util.logging.Logger.getLogger(AddNewStudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AddNewStudentFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton addButton;
    private javax.swing.JButton closeButton;
    public javax.swing.JCheckBox ekAA;
    public javax.swing.JCheckBox eng1A;
    public javax.swing.JCheckBox eng2A;
    public javax.swing.JTextField fNameField;
    public javax.swing.JTextField idField;
    public javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField lNameField;
    public javax.swing.JTextField mailField;
    public javax.swing.JCheckBox math1A;
    public javax.swing.JCheckBox math2B;
    public javax.swing.JCheckBox math3C;
    public javax.swing.JTextField pwField;
    public javax.swing.JCheckBox sam2B;
    public javax.swing.JTextArea subjectTextArea;
    public javax.swing.JCheckBox swe1;
    public javax.swing.JCheckBox swe2;
    public javax.swing.JCheckBox swe3;
    public javax.swing.JTextField uNameField;
    // End of variables declaration//GEN-END:variables

  

    void setValdaKurser(Set<String> kursSet) {
        math1A.setSelected(kursSet.contains("Matematik 1A"));
        math2B.setSelected(kursSet.contains("Matematik 2B"));
        math3C.setSelected(kursSet.contains("Matematik 3C"));
        eng1A.setSelected(kursSet.contains("Engelska 1A"));
        eng2A.setSelected(kursSet.contains("Engelska 2A"));
        swe1.setSelected(kursSet.contains("Svenska 1"));
        swe2.setSelected(kursSet.contains("Svenska 2"));
        swe3.setSelected(kursSet.contains("Svenska 3"));
        sam2B.setSelected(kursSet.contains("Samhäll B2"));
        ekAA.setSelected(kursSet.contains("Ekonomi AA"));
    }
    public boolean userExist() {

        try {

            String ID = idField.getText();

            query = "select * from Student where idStudent = " + "'" + ID + "'";

            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            String username = null;
            if (rs.next()) {

                 username = rs.getNString("Username");
            }
                query = "SELECT Username FROM Student WHERE Username ='" + uNameField.getText() + "'";
                ps = con.prepareStatement(query);
                rs = ps.executeQuery();
                if (rs.next() && !uNameField.getText().equals(username)) {

                    return true;

                }
            }catch (SQLException ex) {
             Logger.getLogger(AddNewAdminFrame.class.getName()).log(Level.SEVERE, null, ex);
         }
            return false;
        }
    
    public boolean userExist2() {
        try {
            
            String ID = idField.getText();

            query = "select * from Student where idStudent = " + "'" + ID + "'";

            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            String email = null;
            if (rs.next()) {

                 email = rs.getNString("Email");
            }
            
           query = "SELECT Email FROM Student WHERE Student ='" + mailField.getText() + "'";
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            if (rs.next() && !mailField.getText().equals(email)) {
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(AddNewAdminFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public boolean emailExists() throws SQLException {

        query = "SELECT Email FROM Student WHERE Email ='" + mailField.getText() + "'";
        ps = con.prepareStatement(query);
        rs = ps.executeQuery();
        if (rs.next()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean usernameExists() {
        try {
            query = "SELECT Username FROM Student WHERE Username ='" + uNameField.getText() + "'";
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddNewAdminFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean isEmpty() {

        if (idField.getText().isEmpty() || fNameField.getText().isEmpty() || lNameField.getText().isEmpty()
                || uNameField.getText().isEmpty() || mailField.getText().isEmpty() || pwField.getText().isEmpty()) {
            return true;
        }
        return false;
    }

    public boolean isValidEmail(String email) {
        if ((email.contains(".com") || email.contains(".se") || email.contains(".org") || email.contains("@"))) {
            return true;
        }
        return false;
    }
}
