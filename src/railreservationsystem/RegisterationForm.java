
package railreservationsystem;

import javax.swing.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hazrul Idham
 */
public class RegisterationForm extends javax.swing.JFrame {
    
    public String Name;
    public String Email;
    public String IcNum;
    public String Gender;
    public String Contact;
    public String Password;
    private boolean passData=true;
    public String status;
    
    
   
    

    /**
     * Creates new form RegisterationForm
     */
    public RegisterationForm() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jTextEmail = new javax.swing.JTextField();
        jTextName = new javax.swing.JTextField();
        jTextIc = new javax.swing.JTextField();
        jTextGender = new javax.swing.JTextField();
        jTextContact = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jLabelPass = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jLabelIc = new javax.swing.JLabel();
        jLabelGender = new javax.swing.JLabel();
        jLabelContact = new javax.swing.JLabel();
        jButtonSubmit = new javax.swing.JButton();
        jPassword = new javax.swing.JTextField();
        jButtonClear = new javax.swing.JButton();
        jRadioStudent = new javax.swing.JRadioButton();
        jRadioOKU = new javax.swing.JRadioButton();
        jRadioSenior = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(java.awt.Color.white);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Registeration ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, -1, -1));

        jTextEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextEmailActionPerformed(evt);
            }
        });
        getContentPane().add(jTextEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, 270, 30));
        getContentPane().add(jTextName, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, 270, 30));

        jTextIc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIcActionPerformed(evt);
            }
        });
        getContentPane().add(jTextIc, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, 270, 30));

        jTextGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextGenderActionPerformed(evt);
            }
        });
        getContentPane().add(jTextGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 320, 270, 30));
        getContentPane().add(jTextContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, 270, 30));

        jLabelEmail.setText("Email");
        getContentPane().add(jLabelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 60, 80, 10));

        jLabelPass.setText("Password");
        getContentPane().add(jLabelPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, 100, 10));

        jLabelName.setText("Name");
        getContentPane().add(jLabelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, 90, 10));

        jLabelIc.setText("Identity Card Number");
        getContentPane().add(jLabelIc, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 170, 10));

        jLabelGender.setText("Gender");
        getContentPane().add(jLabelGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 300, 90, 10));

        jLabelContact.setText("Contact Number");
        getContentPane().add(jLabelContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 360, 140, 10));

        jButtonSubmit.setText("REGISTER");
        jButtonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubmitActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 630, 130, 40));

        jPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 270, 30));

        jButtonClear.setText("CLEAR");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 630, 130, 40));

        buttonGroup1.add(jRadioStudent);
        jRadioStudent.setText("Student");
        jRadioStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioStudentActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 450, 120, 30));

        buttonGroup1.add(jRadioOKU);
        jRadioOKU.setText("OKU");
        jRadioOKU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioOKUActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioOKU, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 480, 100, 30));

        buttonGroup1.add(jRadioSenior);
        jRadioSenior.setText("Senior Citizen");
        getContentPane().add(jRadioSenior, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 510, 150, 30));

        jLabel2.setText("Status");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 420, 90, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextIcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIcActionPerformed

    private void jTextGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextGenderActionPerformed

    private void jButtonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubmitActionPerformed
        // to receive input from text dialog and input to variable;
        Email = jTextEmail.getText();
        Password =jPassword.getText();
        Name = jTextName.getText();
        IcNum = jTextIc.getText();
        Gender = jTextGender.getText();
        Contact = jTextContact.getText();
        if(jRadioStudent.isSelected()){
            status="Student";
        }
        else if(jRadioOKU.isSelected()){
            status="OKU";
        }
        else{
            status="Senior Citizen";
        }
        
        //This if else state is to give prompt message if user not give any value and will return false value
        if(Email.equals("")){
            JOptionPane.showMessageDialog(null,"Email is Mandatory!");
            passData=false;
            
        }
        if(Password.equals("")){
            JOptionPane.showMessageDialog(null,"Password is Mandatory!");
            passData=false;
            
        }
        if(Name.equals("")){
            JOptionPane.showMessageDialog(null,"Name is Mandatory!");
            passData=false;
            
        }
        if(IcNum.equals("")){
            JOptionPane.showMessageDialog(null,"Identitiy Card Number is Mandatory!");
            
        }
        if(Gender.equals("")){
            JOptionPane.showMessageDialog(null,"Gender is Mandatory!");
            passData=false;
            
        }
        if(Contact.equals("")){
            JOptionPane.showMessageDialog(null,"Contact is Mandatory!");
            passData=false;
            
        }
        //to save user data into user.txt
    //this if else statement used to makesure the data in varianle is not null
    if(passData==true){
        
            try {
                //open Filewriter
                //use true to active append mode to filewriter
                FileWriter inFile = new FileWriter("user.txt",true);
                PrintWriter outFile = new PrintWriter(inFile);
                
                outFile.print(Email+";");
                outFile.print(Password+";");
                outFile.print(Name+";");
                outFile.print(IcNum+";");
                outFile.print(Gender+";");
                outFile.print(Contact+";");
                outFile.println(status+";");
                //outFile.println();
                
                //testvv
                
                outFile.close();
                
                JOptionPane.showMessageDialog(null,"Successfully saved!");
                
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(RegisterationForm.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(RegisterationForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    else{
        JOptionPane.showMessageDialog(null,"Error!,cannot write into txt file!");
    }
        LoginForm login = new LoginForm();
        login.setVisible(true);
        this.dispose();
        
        //
        
    }//GEN-LAST:event_jButtonSubmitActionPerformed

    private void jTextEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextEmailActionPerformed

    private void jPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        // TODO add your handling code here:
        jTextEmail.setText("");
        jPassword.setText("");
        jTextName.setText("");
        jTextIc.setText("");
        jTextGender.setText("");
        jTextContact.setText("");
        JOptionPane.showMessageDialog(null,"Successfully cleared!");
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jRadioStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioStudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioStudentActionPerformed

    private void jRadioOKUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioOKUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioOKUActionPerformed

    
    
    
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
            java.util.logging.Logger.getLogger(RegisterationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterationForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelContact;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelGender;
    private javax.swing.JLabel jLabelIc;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelPass;
    private javax.swing.JTextField jPassword;
    private javax.swing.JRadioButton jRadioOKU;
    private javax.swing.JRadioButton jRadioSenior;
    private javax.swing.JRadioButton jRadioStudent;
    private javax.swing.JTextField jTextContact;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextGender;
    private javax.swing.JTextField jTextIc;
    private javax.swing.JTextField jTextName;
    // End of variables declaration//GEN-END:variables
}
