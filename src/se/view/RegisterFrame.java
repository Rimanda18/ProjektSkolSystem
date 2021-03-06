
package se.view;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import se.skola.MyConnection;
import se.skola.TheDate;

/**
 *
 * @author rimazivkovic 
 */
public class RegisterFrame extends javax.swing.JFrame {

    TheDate dt = new TheDate();
    private String dateTime;
    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public RegisterFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.dateTime = dt.showDate();
        dateLabel.setText(dateTime);
    }
 public void checkAndInsert(String status){
        String firstname = firstnameField.getText();
        String lastname = lastnameField.getText();
        String username = usernameField.getText();
        String  email = emailField.getText();
        String password = String.valueOf(passwordField.getPassword());
        
        String query ;
        PreparedStatement ps;
     
         if(!firstname.equals("") && !lastname.equals("") && !username.equals("") && !email.equals("") && !password.equals("")){
                                     try {
                                         
            String exist = "select Username,Email from "+status+" where Username = ? or Email = ?;";
            PreparedStatement check ;
            check = MyConnection.getConnection().prepareStatement(exist);
            check.setString(1, username);
            check.setString(2, email);
            ResultSet rs = check.executeQuery();
            
            if (rs.next()){
              jlblMessage.setText("<html>Användare finns redan registrerad!</html>");
            }
            
            else if (nameValidator(firstname)){
            jlblMessage.setText("<html>Endast bokstäver är tillåtna på förnamn!</html>");
            }
            else if (nameValidator(lastname)){
            jlblMessage.setText("<html>Endast bokstäver är tillåtna på efternamn!</html>");
            }
            
            else if (alphanumericValidator(username)){
                jlblMessage.setText("<html>Endast bokstäver och siffror är tillåtna på användarnamn!</html>");
            }
            
            else if (emailValidator(email)){
                jlblMessage.setText("<html>Du har angivit felaktig postadress!</html>");
            }
          
              else if (passwordValidator(password)){
                passwordNotifier(password);
            }
            
            else{
                  jlblMessage.setText(null);
                int confirm = JOptionPane.showConfirmDialog(this, 
                    "Är du säker på att du vill registrera användare?", 
                    "Register", JOptionPane.YES_NO_OPTION);
                if (confirm == 0){
            query =  "INSERT INTO "+status+"(`Firstname`, `Lastname`, `Username`, `Email`, `Password`) VALUES (?,?,?,?,?);"; 
            ps = MyConnection.getConnection().prepareStatement(query);
           
            ps.setString(1, firstname);
            ps.setString(2, lastname);
            ps.setString(3, username);
            ps.setString(4, email);
            ps.setString(5, password);
            
            ps.execute();
            jlblMessage.setText(null);
            
            JOptionPane.showMessageDialog(this, "Användare har registrerats!",
                    "Register", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            
            }catch (SQLException e) {
                System.out.println(e.getMessage() + " I'm here");
            }
        }
                
                else {jlblMessage.setText("Fyll i tomma fält!"); }
    }
 
 public void checkAndInsertAdmin(String status){
        String firstname = firstnameField.getText();
        String lastname = lastnameField.getText();
        String username = usernameField.getText();
        String  email = emailField.getText();
        String password = String.valueOf(passwordField.getPassword());
        String entry = "false";
        
        String query ;
        PreparedStatement ps;
     
         if(!firstname.equals("") && !lastname.equals("") && !username.equals("") && !email.equals("") && !password.equals("")){
                                     try {
                                         
            String exist = "select Username,Email from "+status+" where Username = ? or Email = ?;";
            PreparedStatement check ;
            check = MyConnection.getConnection().prepareStatement(exist);
            check.setString(1, username);
            check.setString(2, email);
            ResultSet rs = check.executeQuery();
            
            if (rs.next()){
              jlblMessage.setText("<html>Användare finns redan registrerad!</html>");
            }
            
             else if (nameValidator(firstname)){
            jlblMessage.setText("<html>Endast bokstäver är tillåtna på förnamn!</html>");
            }
            else if (nameValidator(lastname)){
            jlblMessage.setText("<html>Endast bokstäver är tillåtna på efternamn!</html>");
            }
            
            else if (alphanumericValidator(username)){
                jlblMessage.setText("<html>Endast bokstäver och siffror är tillåtna på användarnamn!</html>");
            }
            
            else if (emailValidator(email)){
                jlblMessage.setText("<html>Du har angivit felaktig postadress!</html>");
            }
          
              else if (passwordValidator(password)){
                passwordNotifier(password);
            }
            
            else{
                jlblMessage.setText(null);
                int confirm = JOptionPane.showConfirmDialog(this, 
                    "Är du säker på att du vill registrera användare?", 
                    "Register", JOptionPane.YES_NO_OPTION);
                if (confirm == 0){
            query =  "INSERT INTO "+status+"(`Firstname`, `Lastname`, `Username`, `Email`, `Password`, `Entry`) VALUES (?,?,?,?,?,?);"; 
            ps = MyConnection.getConnection().prepareStatement(query);
           
            ps.setString(1, firstname);
            ps.setString(2, lastname);
            ps.setString(3, username);
            ps.setString(4, email);
            ps.setString(5, password);
            ps.setString(6, entry);
            ps.execute();
            jlblMessage.setText(null);
            
            JOptionPane.showMessageDialog(this, "Användare har registrerats!",
                    "Register", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            
            }catch (SQLException e) {
                System.out.println(e.getMessage() + " checkAndInsert");
            }
        }
                
                else {jlblMessage.setText("Fyll i tomma fält!"); }
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        registerButton = new javax.swing.JButton();
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        firstnameField = new javax.swing.JTextField();
        lastnameField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        jlblMessage = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registrering");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jComboBox1.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student", "Lärare", "Admin", "Personal" }));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel3.setText("Jag är: ");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel4.setText("Användarnamn: ");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel7.setText("Lösenord: ");

        registerButton.setBackground(new java.awt.Color(204, 204, 204));
        registerButton.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        registerButton.setText("Registrera");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        usernameField.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N

        passwordField.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel2.setText("Förnamn:");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel5.setText("Efternamn: ");

        firstnameField.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N

        lastnameField.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel6.setText("Email:");

        emailField.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel9.setText("Klicka här för att logga in");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        dateLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(153, 153, 153));

        jlblMessage.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jlblMessage.setForeground(new java.awt.Color(255, 0, 0));

        cancelButton.setBackground(new java.awt.Color(204, 204, 204));
        cancelButton.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        cancelButton.setText("Avbryt");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passwordField)
                            .addComponent(emailField)
                            .addComponent(lastnameField)
                            .addComponent(firstnameField)
                            .addComponent(usernameField)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jlblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(cancelButton)
                        .addGap(35, 35, 35)
                        .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(93, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(157, 157, 157))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(182, 182, 182))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cancelButton, registerButton});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(firstnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cancelButton, registerButton});

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        String title = jComboBox1.getSelectedItem().toString();
            if(null != title)switch (title) {
            case "Student":
                checkAndInsert("Student");
                  break; 
            case "Lärare":
                checkAndInsert("Teacher");
                break;
            case "Admin":
                checkAndInsertAdmin("Admin");
                break;
            case"Personal":
                checkAndInsert("Staff");
                break;
            default:
                JOptionPane.showMessageDialog(this, "Fel har uppstått!");
                break;
        }
    }//GEN-LAST:event_registerButtonActionPerformed
    
    public boolean alphanumericValidator(String input){
        String regex = "^[a-zA-Z0-9]+$";
 
        Pattern pattern = Pattern.compile(regex);
          Matcher matcher = pattern.matcher(input);
          
        return !matcher.matches();
    }
    public boolean emailValidator(String input){
       // String regex = "^(.+)@(.+)$";
       String regex= "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
        Pattern pattern = Pattern.compile(regex);
          Matcher matcher = pattern.matcher(input);
          
        return !matcher.matches();
    }
    public boolean passwordValidator(String input){
      //  String regex = "^(.+)@(.+)$";
      String regex= "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
         Pattern pattern = Pattern.compile(regex);
         Matcher matcher = pattern.matcher(input);
         return !matcher.matches();
    }
    public void passwordNotifier(String password){
        
        if (!Pattern.compile("(?=.*[a-z])").matcher(password).find() ){
             jlblMessage.setText("<html>Lösenordet skall innehålla minst en småbokstav!</html>");
        }
        if (!Pattern.compile("(?=.*[0-9])").matcher(password).find() ){
            jlblMessage.setText("<html>Lösenordet skall innehålla minst en siffra!</html>");
        }
        if (!Pattern.compile("(?=.*[A-Z])").matcher(password).find()){
            jlblMessage.setText("<html>Lösenordet skall innehålla minst en storbokstav!</html>");

        }
        if (!Pattern.compile("(?=.*[@#$%^&+=])").matcher(password).find()){
            jlblMessage.setText("<html>Lösenordet skall innehålla minst ett specialtecken!</html>");

        }
        if (!Pattern.compile("(?=\\S+$)").matcher(password).find()){
            jlblMessage.setText("<html>Mellanrum är ej tillåtna!</html>");

        }
        
        if (!Pattern.compile(".{8,}").matcher(password).find()){
            jlblMessage.setText("<html>Lösenordet skall vara minst 8 tecken lång</html>");
        }
    }
    public boolean nameValidator(String input){
       // String regex = "^(.+)@(.+)$";
       String regex= "^[a-zA-Z\\\\s]+";
        Pattern pattern = Pattern.compile(regex);
          Matcher matcher = pattern.matcher(input);
          
        return !matcher.matches();
    }
    
    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed

    private void lastnameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameFieldActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        this.setVisible(false);
        LoginFrame lf = new LoginFrame();
        lf.setVisible(true);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.setVisible(false);
        StartFrame st = new StartFrame();
        st.setVisible(true);
    }//GEN-LAST:event_cancelButtonActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JTextField emailField;
    private javax.swing.JTextField firstnameField;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jlblMessage;
    private javax.swing.JTextField lastnameField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JButton registerButton;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
