
package se.view;

import se.skola.MyConnection;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;


/**
 *
 * @author rimazivkovi     
 */
public class StartFrame extends javax.swing.JFrame {

    private Connection con = null;
    private ResultSet rs = null;
    private PreparedStatement ps = null;
    private String query = null;
    private String user;
    private String mail;
    /**
     * Creates new form StartFrame
     */
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public StartFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        con = MyConnection.getConnection();
        this.user = "user";
        this.mail = "info@newton.com";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        iconLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        mailLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        adressLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel = new javax.swing.JPanel();
        educationLabel = new javax.swing.JLabel();
        bPanel = new javax.swing.JPanel();
        shoolInfoLabel = new javax.swing.JLabel();
        cPanel = new javax.swing.JPanel();
        teachersLabel = new javax.swing.JLabel();
        dPanel = new javax.swing.JPanel();
        caregiverLabel = new javax.swing.JLabel();
        ePanel = new javax.swing.JPanel();
        contactLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.lightGray);

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Newton");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        iconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/se/image/girl-3718537_640.jpg"))); // NOI18N

        textArea.setColumns(20);
        textArea.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/se/image/email.png"))); // NOI18N

        mailLabel.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        mailLabel.setText("info@newton.com");
        mailLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mailLabelMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mailLabelMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mailLabelMouseEntered(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/se/image/tel.jpg"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel8.setText("08-556 77 88");

        adressLabel.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        adressLabel.setText("Malmvägen 1, 115 41 Stockholm");
        adressLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adressLabelMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                adressLabelMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adressLabelMouseEntered(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/se/image/pin.jpg.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(iconLabel)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(jLabel7)
                .addGap(305, 305, 305)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(197, 197, 197))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(210, 210, 210)
                .addComponent(mailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(adressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(iconLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adressLabel)
                    .addComponent(mailLabel)
                    .addComponent(jLabel8))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel2.setText("Välkommen till Newton");

        jLabel3.setBackground(new java.awt.Color(255, 102, 0));
        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 0));
        jLabel3.setText("Logga in");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 102, 0));
        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 0));
        jLabel4.setText("Registrera");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        educationLabel.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        educationLabel.setText("Våra utbildningar");
        educationLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                educationLabelMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                educationLabelMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                educationLabelMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(educationLabel)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(educationLabel)
                .addGap(25, 25, 25))
        );

        shoolInfoLabel.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        shoolInfoLabel.setText("Skolinformation");
        shoolInfoLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shoolInfoLabelMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                shoolInfoLabelMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                shoolInfoLabelMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout bPanelLayout = new javax.swing.GroupLayout(bPanel);
        bPanel.setLayout(bPanelLayout);
        bPanelLayout.setHorizontalGroup(
            bPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bPanelLayout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(shoolInfoLabel)
                .addGap(34, 34, 34))
        );
        bPanelLayout.setVerticalGroup(
            bPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(shoolInfoLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        teachersLabel.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        teachersLabel.setText("Våra lärare");
        teachersLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                teachersLabelMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                teachersLabelMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                teachersLabelMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout cPanelLayout = new javax.swing.GroupLayout(cPanel);
        cPanel.setLayout(cPanelLayout);
        cPanelLayout.setHorizontalGroup(
            cPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(teachersLabel)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        cPanelLayout.setVerticalGroup(
            cPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(teachersLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        caregiverLabel.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        caregiverLabel.setText("För vårdnadshavare");
        caregiverLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                caregiverLabelMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                caregiverLabelMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                caregiverLabelMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout dPanelLayout = new javax.swing.GroupLayout(dPanel);
        dPanel.setLayout(dPanelLayout);
        dPanelLayout.setHorizontalGroup(
            dPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dPanelLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(caregiverLabel)
                .addGap(26, 26, 26))
        );
        dPanelLayout.setVerticalGroup(
            dPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(caregiverLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        contactLabel.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        contactLabel.setText("Kontakta oss");
        contactLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contactLabelMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                contactLabelMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                contactLabelMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout ePanelLayout = new javax.swing.GroupLayout(ePanel);
        ePanel.setLayout(ePanelLayout);
        ePanelLayout.setHorizontalGroup(
            ePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ePanelLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(contactLabel)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        ePanelLayout.setVerticalGroup(
            ePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(contactLabel)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void contactLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactLabelMouseClicked
        textArea.setText("                                        \n"
                         + "\n                       Kontakt      \n"
                         + "                                      \n"
                         + "                                      \n"
                         + "               Rektor\n"
                         + "               Namn: Anton Meck\n"
                         + "               Email: Anton@gmail.com\n"
                         + "               Tel: 08-548 99 34 00\n"
                         + "                                      \n"
                         + "                                      \n"
                         + "               Rektor biträde\n"
                         + "               Namn: Ritva Stig\n"
                         + "               Email: Ritva@gmail.com\n"
                         + "               Tel: 08-548 99 34 01\n");
    }//GEN-LAST:event_contactLabelMouseClicked

    private void educationLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_educationLabelMouseEntered
               setColor(jPanel);    
    }//GEN-LAST:event_educationLabelMouseEntered

    private void educationLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_educationLabelMouseExited
        resetColor(jPanel);   
    }//GEN-LAST:event_educationLabelMouseExited

    private void shoolInfoLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shoolInfoLabelMouseEntered
        setColor(bPanel);
    }//GEN-LAST:event_shoolInfoLabelMouseEntered

    private void shoolInfoLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shoolInfoLabelMouseExited
        resetColor(bPanel);
    }//GEN-LAST:event_shoolInfoLabelMouseExited

    private void teachersLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teachersLabelMouseEntered
        setColor(cPanel);
    }//GEN-LAST:event_teachersLabelMouseEntered

    private void teachersLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teachersLabelMouseExited
        resetColor(cPanel);
    }//GEN-LAST:event_teachersLabelMouseExited

    private void caregiverLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caregiverLabelMouseEntered
        setColor(dPanel);
    }//GEN-LAST:event_caregiverLabelMouseEntered

    private void caregiverLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caregiverLabelMouseExited
        resetColor(dPanel);
    }//GEN-LAST:event_caregiverLabelMouseExited

    private void contactLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactLabelMouseEntered
        setColor(ePanel);
    }//GEN-LAST:event_contactLabelMouseEntered

    private void contactLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactLabelMouseExited
        resetColor(ePanel);
    }//GEN-LAST:event_contactLabelMouseExited

    public void setColor(JPanel a){
        a.setBackground(new Color(255,102,0));
    }
    
    public void resetColor(JPanel a1){
        a1.setBackground(Color.lightGray);
    }

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.setVisible(false);
        LoginFrame lf = new LoginFrame();
        lf.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        this.setVisible(false);
        RegisterFrame rf = new RegisterFrame();
        rf.setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void teachersLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teachersLabelMouseClicked
        textArea.setText("");
        query = "SELECT Firstname, Lastname, Email, Coursename FROM Teacher "
                + "INNER JOIN Course ON Teacher.idTeacher = Course.Teacher_idTeacher";
         try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();

            textArea.append("\n                    Våra lärare             " + "\n");
            
            while(rs.next()){    
            String firstname = rs.getString("Firstname");
            String lastname = rs.getString("Lastname");
            String coursename = rs.getNString("Coursename");
            String email = rs.getString("Email");

            textArea.append("\n  " + coursename + ": " + firstname + " "+ lastname  + " " + email +"\n");
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_teachersLabelMouseClicked

    private void educationLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_educationLabelMouseClicked
        textArea.setText("");
        textArea.setText("\n           Våra utbildningar          " + "\n"
                       + "                                             \n"
                       + "Utbildningar vi erbjuder är utformde för     \n"
                       + "att ge stor kunskap samt möjlighet att       \n"
                       + "anpassa sig till framtidens arbetsmarknad.   \n"
                       + "                                             \n"
                       + "Vi erbjuder utbildningar och kurser som kan  \n"
                       + "förändra och förbättra framtidsutsikt.       \n"
                       + "                                             \n"   
                       + "Väl etablerade kurser med fantastiska pedagoger.");
        
    }//GEN-LAST:event_educationLabelMouseClicked

    private void shoolInfoLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shoolInfoLabelMouseClicked
        textArea.setText("");
        textArea.setText("\n            Skolinformation           " + "\n"
                       + "                                             \n"
                       + "Folkhälsomyndigheten rekommenderar att \n"
                       + "undervisningen i gymnasieskolan inte ska \n"
                       + "bedrivas i skolans lokaler. Med tanken på \n"
                       + "att försöka minska risken för (Covid-19) \n"
                       + "har vi just nu alla vår kurser på distans. \n"
                       + "                                           \n"
                       + "Våra pedagoger finns tillgängliga på skoltid\n"
                       + "där man kan kontakta vid behov eller extra stöd.\n"   
                       + "Ni är alltid välkomna att kontakta oss.");
    }//GEN-LAST:event_shoolInfoLabelMouseClicked

    private void caregiverLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caregiverLabelMouseClicked
        textArea.setText("");
        textArea.setText("\n           Vårdnadshavare          " + "\n"
                       + "                                             \n"
                       + "Frånvaroanmälan ska ske före första lektionen   \n"
                       + "och samma dag som eleven inte kan närvara i skolan. \n"
                       + "Det krävs en anmälan varje dag då studerand inte \n"
                       + "kan närvara. Vid eventuella felaktigheter kontakta\n"
                       + "elevens lärare för justering.\n"
                       + "                                           \n"
                       + "Har du möjligen frågor eller funderingar så \n"
                       + "är du välkommen att kontakta oss.\n"   
                       + "    ");
    }//GEN-LAST:event_caregiverLabelMouseClicked

    private void adressLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adressLabelMouseEntered
         adressLabel.setOpaque(true);
         Color c = adressLabel.getBackground(); 
         adressLabel.setBackground(adressLabel.getForeground());
         adressLabel.setForeground(c);
    }//GEN-LAST:event_adressLabelMouseEntered

    private void adressLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adressLabelMouseExited
            adressLabel.setOpaque(false);
            Color c = adressLabel.getBackground();
            adressLabel.setBackground(adressLabel.getForeground());
            adressLabel.setForeground(c);
    }//GEN-LAST:event_adressLabelMouseExited

    private void adressLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adressLabelMouseClicked
        MapFrame map = new MapFrame();
        map.setVisible(true);
    }//GEN-LAST:event_adressLabelMouseClicked

    private void mailLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mailLabelMouseEntered
        mailLabel.setOpaque(true);
        Color c = mailLabel.getBackground();
        mailLabel.setBackground(mailLabel.getForeground());
        mailLabel.setForeground(c);
    }//GEN-LAST:event_mailLabelMouseEntered

    private void mailLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mailLabelMouseExited
        mailLabel.setOpaque(false);
        Color c = mailLabel.getBackground();
        mailLabel.setBackground(mailLabel.getForeground());
        mailLabel.setForeground(c);
    }//GEN-LAST:event_mailLabelMouseExited

    private void mailLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mailLabelMouseClicked
        EmailFrame ef = new EmailFrame();
        ef.setVisible(true);
        ef.getuser(this.user, mail);
    }//GEN-LAST:event_mailLabelMouseClicked

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
            java.util.logging.Logger.getLogger(StartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adressLabel;
    private javax.swing.JPanel bPanel;
    private javax.swing.JPanel cPanel;
    private javax.swing.JLabel caregiverLabel;
    private javax.swing.JLabel contactLabel;
    private javax.swing.JPanel dPanel;
    private javax.swing.JPanel ePanel;
    private javax.swing.JLabel educationLabel;
    private javax.swing.JLabel iconLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mailLabel;
    private javax.swing.JLabel shoolInfoLabel;
    private javax.swing.JLabel teachersLabel;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}