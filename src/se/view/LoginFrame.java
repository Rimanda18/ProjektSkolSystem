
package se.view;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import se.skola.MyConnection;

/**
 * 
 * @author Danny
 */
public class LoginFrame extends javax.swing.JFrame {

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public LoginFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
public void login(String status, String title){

        String username = usernameField.getText();
        String password = String.valueOf(passwordField.getPassword());
        if(!username.equals("") && !password.equals("")){
            try {
                                         
            String exist = "select Username,Password from "+status+" where Username = ? and Password = ?;";
            PreparedStatement check ;
            check = MyConnection.getConnection().prepareStatement(exist);
            check.setString(1, username);
            check.setString(2, password);
            ResultSet rs = check.executeQuery();
           
            if (rs.next()){
                
                this.setVisible(false);
                
                switch (title){
                    
                    case "Student":
                    String userStudent = usernameField.getText();
                    String userPassword = passwordField.getText();
                    StudentFrame sf = new StudentFrame(userStudent, password);
                    this.setVisible(false);
                    sf.setVisible(true);
                    break;
                    
                    case "Lärare":
                    String userTeacher = usernameField.getText();
                    TeacherFrame tf = new TeacherFrame(userTeacher);
                    tf.setVisible(true);
                    this.setVisible(false);
                    break;
                    
                    case "Admin":
                    AdminFrame af = new AdminFrame(); 
                    this.setVisible(false);
                    af.setVisible(true); 
                    break;
                    
                    case "Personal":
                    StaffFrame ssf = new StaffFrame();
                    this.setVisible(false);
                    ssf.setVisible(true);
                    break;
                    
                }
            }
            else if (!rs.next()){
            
            jlblMessage.setText("<html>Användaren och lösenordet är icke registrerade!</html>");
            } 
            }catch (SQLException e) {
                System.out.println(e.getMessage() + " login");
            }
        }
            else //{JOptionPane.showMessageDialog(null, "You have left unfilled fields!"); }
        {   
            jlblMessage.setText("<html>Du har inte fyllt i alla fält!</html>");}
    }

    public String adminConfirmed(){
        
        String sql = "select Entry from admin where Username = '"+usernameField.getText()+"';";
        String entry = "false";
        try{
        PreparedStatement ps ;
        ResultSet rs ;
        ps = MyConnection.getConnection().prepareStatement(sql);
        rs = ps.executeQuery();
        
        if (rs.next()){
        entry = rs.getString("Entry");
        
        }
        
        }catch(Exception e){
        System.out.println(e.toString() + "adminConfirmer");
        }
        return entry;
    }
    
     public String getPassword(String user) {
        String exist = "select Password from "+user+" where Email ='"+txtForgottenPassword.getText()+"';";
        PreparedStatement check ;
        String pass = "";
        try{
        check = MyConnection.getConnection().prepareStatement(exist);
        
        
        ResultSet rs = check.executeQuery();
        if (rs.next()){
        pass = rs.getString("Password");
       
        } 
        }catch(Exception e){
        System.out.println(e.toString() + " getPassword");
        }
        return pass;
            }
     
       public void sendPassword(String to,String msg){
    
        Properties props = new Properties();    
          props.put("mail.smtp.host", "smtp.gmail.com");    
          props.put("mail.smtp.socketFactory.port", "465");    
          props.put("mail.smtp.socketFactory.class",    
                    "javax.net.ssl.SSLSocketFactory");    
          props.put("mail.smtp.auth", "true");    
          props.put("mail.smtp.port", "465");    
          //get Session   
          Session session = Session.getDefaultInstance(props,    
           new javax.mail.Authenticator() {    
           protected PasswordAuthentication getPasswordAuthentication() {    
           return new PasswordAuthentication("newtonskola1@gmail.com","newtonskola.newtonskola");  
           }    
          });    
          //compose message    
          try {    
           MimeMessage message = new MimeMessage(session);    
           message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));    
           message.setSubject("Lösenordet återhämtat");    
           message.setText("Ditt lösenord är: "+msg + "\nHa en trevlig dag\nNewton Skola");    
           //send message  
           Transport.send(message);    
          } catch (MessagingException e) {throw new RuntimeException(e);} 
        
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
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        usernameField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        returnButton = new javax.swing.JButton();
        jlblMessage = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtForgottenPassword = new javax.swing.JTextField();
        jbtnSend = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Inloggning");

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
                .addComponent(jLabel1)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jComboBox1.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student", "Lärare", "Admin", "Personal" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel3.setText("Jag är: ");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel4.setText("Användarnamn:");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel7.setText("Lösenord:");

        loginButton.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        loginButton.setText("Logga in");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        usernameField.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel5.setText("Klicka här för att registrera ny användare");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        passwordField.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N

        returnButton.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        returnButton.setText("Avbryt");
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        jlblMessage.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jlblMessage.setForeground(new java.awt.Color(255, 0, 51));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setText("Skicka det till din mail");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("Glömt lösenordet?");

        txtForgottenPassword.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N

        jbtnSend.setText("Skicka");
        jbtnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtForgottenPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(jbtnSend))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jlblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(loginButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(returnButton))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4))
                                    .addGap(43, 43, 43)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(usernameField)
                                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel5)))
                .addContainerGap(104, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {loginButton, returnButton});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(loginButton, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                        .addComponent(returnButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jlblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtForgottenPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {loginButton, returnButton});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        this.setVisible(false);
        RegisterFrame rg = new RegisterFrame();
        rg.setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
          String title = jComboBox1.getSelectedItem().toString();
          
             switch (title){
                 case "Student":
                     
                 login("Student", title);
                 break;
                 case "Lärare":
                 login("Teacher", title);
                 break;
                 case "Admin":
                     if (adminConfirmed().equals("true")){
                 login("Admin", title);}
                     else {
                     jlblMessage.setText("Tillträdet är ej beviljat");
                     }
                 break;
                 case "Personal":
                 login("Staff", title);
                 break;
             }
    }//GEN-LAST:event_loginButtonActionPerformed
 
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        this.setVisible(false);
        StartFrame sf = new StartFrame();
        sf.setVisible(true);
    }//GEN-LAST:event_returnButtonActionPerformed

    private void jbtnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSendActionPerformed
        // TODO add your handling code here:
        String title = jComboBox1.getSelectedItem().toString();

        switch (title){
            case "Student":
            String password = getPassword("Student");
            if (!password.equals("")){
                sendPassword(txtForgottenPassword.getText(),password);
                jlblMessage.setText("<html>Lösenordet har skickats</html>");
                txtForgottenPassword.setText("");}
            else {
                jlblMessage.setText("<html>Denna postadress är icke registrerad!</html>");
            }
            break;
            case "Lärare":
            password = getPassword("Teacher");
            if (!password.equals("")){
                sendPassword(txtForgottenPassword.getText(),password);
                jlblMessage.setText("<html>Lösenordet har skickats</html>");
                txtForgottenPassword.setText("");}
            else {
                jlblMessage.setText("<html>Denna postadress är icke registrerad!</html>");
            }
            break;
            case "Admin":
            password = getPassword("Admin");
            if (!password.equals("")){
                sendPassword(txtForgottenPassword.getText(),password);
                jlblMessage.setText("<html>Lösenordet har skickats</html>");
                txtForgottenPassword.setText("");}
            else {
                jlblMessage.setText("<html>Denna postadress är icke registrerad!</html>");
            }
            break;
            case "Personal":
            password = getPassword("Staff");
            if (!password.equals("")){
                sendPassword(txtForgottenPassword.getText(),password);
                jlblMessage.setText("<html>Lösenordet har skickats</html>");
                txtForgottenPassword.setText("");}
            else {
                jlblMessage.setText("<html>Denna postadress är icke registrerad!</html>");
            }
            break;
        }

    }//GEN-LAST:event_jbtnSendActionPerformed

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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new LoginFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbtnSend;
    private javax.swing.JLabel jlblMessage;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JButton returnButton;
    public static javax.swing.JTextField txtForgottenPassword;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
