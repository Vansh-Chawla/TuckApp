
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Vansh Chawla
 */
public class JFrameLogIn extends javax.swing.JFrame {

    String username; // A variable to store the username entered by the user
    String password; // A variable to store the password entered by the user

    public JFrameLogIn() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        TextFieldUserName = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        jButtonHelp = new javax.swing.JButton();
        jButtonLogIn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUserName.setFont(new java.awt.Font("Britannic Bold", 1, 24)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(153, 153, 255));
        lblUserName.setText("User Name: ");
        getContentPane().add(lblUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 200, 40));

        lblPassword.setFont(new java.awt.Font("Britannic Bold", 1, 24)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(153, 153, 255));
        lblPassword.setText("Password:");
        getContentPane().add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 180, 30));

        TextFieldUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldUserNameActionPerformed(evt);
            }
        });
        getContentPane().add(TextFieldUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 126, -1));

        PasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldActionPerformed(evt);
            }
        });
        getContentPane().add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 126, -1));

        jButtonHelp.setFont(new java.awt.Font("Britannic Bold", 1, 24)); // NOI18N
        jButtonHelp.setText("Help");
        jButtonHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHelpActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonHelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 90, 50));

        jButtonLogIn.setFont(new java.awt.Font("Britannic Bold", 1, 24)); // NOI18N
        jButtonLogIn.setText("Log in");
        jButtonLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogInActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 110, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/My Tuck Shop Logo.JPG"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldUserNameActionPerformed

    }//GEN-LAST:event_TextFieldUserNameActionPerformed

    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldActionPerformed

    }//GEN-LAST:event_PasswordFieldActionPerformed

    private void JButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton1ActionPerformed
       


    }//GEN-LAST:event_JButton1ActionPerformed

    private void JButtonHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonHelpActionPerformed
        
    }//GEN-LAST:event_JButtonHelpActionPerformed

    private void JButtonTillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonTillActionPerformed
       
    }//GEN-LAST:event_JButtonTillActionPerformed

    private void jButtonHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHelpActionPerformed
        if (Desktop.isDesktopSupported()) {
            try {
                File myFile = new File("HELP.pdf"); //Looks for the Help file 
                Desktop.getDesktop().open(myFile); //Opens up the help pdf file

            } catch (IOException ex) {
            }

        }
    }//GEN-LAST:event_jButtonHelpActionPerformed

    private void jButtonLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogInActionPerformed
         boolean logIn = false;
        username = TextFieldUserName.getText(); // Stores the data entered by the user into the variable
        password = PasswordField.getText();// Stores the data entered by the user

        try {
            username = TextFieldUserName.getText(); // Stores the data entered by the user into the variable
            password = PasswordField.getText();// Stores the data entered by the user
            if (TextFieldUserName.getText().isEmpty() || PasswordField.getText().isEmpty()) { // checks to see if either field is empty to validate the data
                JOptionPane.showMessageDialog(null, "Please enter a valid username and password"); // a message is displayed to the user asking for a valid username and password
            } else {
                UserName us = new UserName(username, password); // creates a new variable of the type UserName 
                boolean temp; // a variable to store the result of the check
                temp = (us.check()); // Checks to see if the username and password exists and is correct 
                if (temp == true) { // If the username is found and the password is correct
                    this.hide(); // Sets this jFrame to be invisible
                    JFrameMainMenu p = new JFrameMainMenu(); //Creates a new jFrame, main menu
                    p.show(); // Displays main menu

                } else {
                    JOptionPane.showMessageDialog(null, "The username or password is incorrect"); // A message is dispalyed if the username or password does not match with the text file
                }
            }

        } catch (FileNotFoundException ex) { 
            Logger.getLogger(JFrameLogIn.class.getName()).log(Level.SEVERE, null, ex);

        }
    }//GEN-LAST:event_jButtonLogInActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameLogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JTextField TextFieldUserName;
    private javax.swing.JButton jButtonHelp;
    private javax.swing.JButton jButtonLogIn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUserName;
    // End of variables declaration//GEN-END:variables
}
