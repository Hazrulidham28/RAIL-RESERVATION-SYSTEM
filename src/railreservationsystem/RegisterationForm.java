
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
        jLabel3 = new javax.swing.JLabel();
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
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(196, 221, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusCycleRoot(false);
        setForeground(java.awt.Color.white);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextEmail.setBackground(new java.awt.Color(254, 226, 197));
        jTextEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextEmailActionPerformed(evt);
            }
        });
        getContentPane().add(jTextEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 270, 30));

        jTextName.setBackground(new java.awt.Color(254, 226, 197));
        jTextName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNameActionPerformed(evt);
            }
        });
        getContentPane().add(jTextName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 270, 30));

        jTextIc.setBackground(new java.awt.Color(254, 226, 197));
        jTextIc.setForeground(new java.awt.Color(255, 255, 255));
        jTextIc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIcActionPerformed(evt);
            }
        });
        getContentPane().add(jTextIc, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 270, 30));

        jTextGender.setBackground(new java.awt.Color(254, 226, 197));
        jTextGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextGenderActionPerformed(evt);
            }
        });
        getContentPane().add(jTextGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, 270, 30));

        jTextContact.setBackground(new java.awt.Color(254, 226, 197));
        getContentPane().add(jTextContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 270, 30));

        jLabelEmail.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(0, 29, 110));
        jLabelEmail.setText("Email");
        getContentPane().add(jLabelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 90, 30));

        jLabelPass.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabelPass.setForeground(new java.awt.Color(0, 29, 110));
        jLabelPass.setText("Password");
        getContentPane().add(jLabelPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 100, 20));

        jLabelName.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabelName.setForeground(new java.awt.Color(0, 29, 110));
        jLabelName.setText("Name");
        getContentPane().add(jLabelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 90, 20));

        jLabelIc.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabelIc.setForeground(new java.awt.Color(0, 29, 110));
        jLabelIc.setText("Identity Card Number");
        getContentPane().add(jLabelIc, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 190, 20));

        jLabelGender.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabelGender.setForeground(new java.awt.Color(0, 29, 110));
        jLabelGender.setText("Gender");
        getContentPane().add(jLabelGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 90, 20));

        jLabelContact.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabelContact.setForeground(new java.awt.Color(0, 29, 110));
        jLabelContact.setText("Contact Number");
        getContentPane().add(jLabelContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 140, 20));

        jButtonSubmit.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButtonSubmit.setForeground(new java.awt.Color(0, 29, 110));
        jButtonSubmit.setText("REGISTER");
        jButtonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubmitActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 430, 130, 40));

        jPassword.setBackground(new java.awt.Color(254, 226, 197));
        jPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 270, 30));

        jButtonClear.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButtonClear.setForeground(new java.awt.Color(0, 29, 110));
        jButtonClear.setText("CLEAR");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 430, 130, 40));

        buttonGroup1.add(jRadioStudent);
        jRadioStudent.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jRadioStudent.setForeground(new java.awt.Color(0, 29, 110));
        jRadioStudent.setText("Student");
        jRadioStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioStudentActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, 120, 30));

        buttonGroup1.add(jRadioOKU);
        jRadioOKU.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jRadioOKU.setForeground(new java.awt.Color(0, 29, 110));
        jRadioOKU.setText("OKU");
        jRadioOKU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioOKUActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioOKU, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, 100, 30));

        buttonGroup1.add(jRadioSenior);
        jRadioSenior.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jRadioSenior.setForeground(new java.awt.Color(0, 29, 110));
        jRadioSenior.setText("Senior Citizen");
        getContentPane().add(jRadioSenior, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 350, 150, 30));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 29, 110));
        jLabel2.setText("Status");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 90, 20));

        jPanel1.setBackground(new java.awt.Color(0, 29, 110));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon&Pics/logo1.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 226, 197));
        jLabel1.setText("REGISTERATION");

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(254, 226, 197));
        jLabel5.setText("X");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(254, 226, 197));
        jLabel6.setText("-");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel4)
                .addGap(263, 263, 263)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 266, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 80));

        jPanel2.setBackground(new java.awt.Color(196, 221, 255));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 480));

        jPanel3.setBackground(new java.awt.Color(0, 29, 110));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 1000, 100));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioOKUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioOKUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioOKUActionPerformed

    private void jRadioStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioStudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioStudentActionPerformed

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

    private void jPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordActionPerformed

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

    private void jTextGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextGenderActionPerformed

    private void jTextIcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIcActionPerformed

    private void jTextNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNameActionPerformed

    private void jTextEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextEmailActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        System.exit(0);
        
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        this.setState(1);
        
    }//GEN-LAST:event_jLabel6MouseClicked

    
    
    
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelContact;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelGender;
    private javax.swing.JLabel jLabelIc;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelPass;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jPassword;
    private javax.swing.JRadioButton jRadioOKU;
    private javax.swing.JRadioButton jRadioSenior;
    private javax.swing.JRadioButton jRadioStudent;
    private javax.swing.JTextField jTextContact;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextGender;
    private javax.swing.JTextField jTextIc;
    public static javax.swing.JTextField jTextName;
    // End of variables declaration//GEN-END:variables
}
