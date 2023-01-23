/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package railreservationsystem;

import java.io.FileNotFoundException;
import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Hazrul Idham
 */
public class LoginForm extends javax.swing.JFrame {
    
    
    private String userInput;
    private String userPass;
    private boolean access=false;
    private String Email;
    private String Password;
    private String Name;
    private String IcNum;
    private String Gender;
    private String Contact;
    private String status;
    private String CurrEmail;
    private String CurrPassword;
    private String CurrName;
    private String CurrIcNum;
    private String CurrGender;
    private String CurrContact;
    private String Currstatus;
   
    

    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
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

        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTextInputEmail = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jTextinputPassword = new javax.swing.JTextField();
        jButtonLogin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 204, 255));

        jPanel1.setBackground(new java.awt.Color(196, 221, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 29, 110));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 226, 197));
        jLabel1.setText("LOGIN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(433, 433, 433))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 998, -1));

        jTextInputEmail.setBackground(new java.awt.Color(254, 226, 197));
        jTextInputEmail.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jTextInputEmail.setBorder(null);
        jTextInputEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextInputEmailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 47, Short.MAX_VALUE)
                .addComponent(jTextInputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextInputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 192, -1, -1));

        jTextinputPassword.setBackground(new java.awt.Color(254, 226, 197));
        jTextinputPassword.setBorder(null);
        jTextinputPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextinputPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 51, Short.MAX_VALUE)
                .addComponent(jTextinputPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextinputPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 287, -1, -1));

        jButtonLogin.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButtonLogin.setForeground(new java.awt.Color(0, 29, 110));
        jButtonLogin.setText("Login");
        jButtonLogin.setBorder(null);
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 351, 122, 32));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 29, 110));
        jLabel3.setText("E-Mail");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 157, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 29, 110));
        jLabel4.setText("Password");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 254, -1, -1));

        jButton1.setBackground(new java.awt.Color(196, 221, 255));
        jButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 29, 110));
        jButton1.setText("Forget Password?");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 389, -1, -1));

        jPanel5.setBackground(new java.awt.Color(0, 29, 110));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 1000, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
       // TO store input from user to variable
        
        userInput = jTextInputEmail.getText();
        userPass=jTextinputPassword.getText();
        if(userInput.equals("") && userPass.equals("")){
            JOptionPane.showMessageDialog(null,"You must enter proper Email and Password!");
        }
        else{
            getAuthent();
             //JOptionPane.showMessageDialog(null,access);
             if(access==true){
                 JOptionPane.showMessageDialog(null,"Successfully login!");
                 //create txt file for acc details
                 setCustomerdata();
                 
                 
             }
             else{
                 JOptionPane.showMessageDialog(null,"Wrong email or password!");
             }
             
        }
    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jTextInputEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextInputEmailActionPerformed
        
    }//GEN-LAST:event_jTextInputEmailActionPerformed

    private void jTextinputPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextinputPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextinputPasswordActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ForgetPassword fp = new ForgetPassword();
        fp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    //method to check the boolean value
    public void getAuthent(){
        //open file reader
        
        FileReader fr;
        try {
            fr = new FileReader("user.txt");
            
            Scanner in = new Scanner(fr);
            
            StringTokenizer st;
            String input,delims=";";
            
            while(in.hasNextLine()){
                input=in.nextLine();
                st = new StringTokenizer(input,delims);
                
                while(st.hasMoreTokens()){
                Email=st.nextToken();
                Password=st.nextToken();
                Name=st.nextToken();
                IcNum=st.nextToken();
                Gender=st.nextToken();
                Contact=st.nextToken();
                status=st.nextToken();
                
                }
               /* to check whether variable has the correct data 
                JOptionPane.showMessageDialog(null,Password);*/
                
                if(userInput.equals(Email)&& userPass.equals(Password)){
                    access = true;
                    CurrEmail=Email;
                    CurrPassword=Password;
                    CurrName=Name;
                    CurrIcNum=IcNum;
                    CurrGender=Gender;
                    CurrContact=Contact;
                    Currstatus=status;
                    
                    
                }
                
            }
            in.close();
           
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public void setCustomerdata(){
    
        try {
                //open Filewriter
                //use true to active append mode to filewriter
                FileWriter inFile = new FileWriter("currentuser.txt");
                PrintWriter outFile = new PrintWriter(inFile);
                
                outFile.print(CurrEmail+";");
                outFile.print(CurrPassword+";");
                outFile.print(CurrName+";");
                outFile.print(CurrIcNum+";");
                outFile.print(CurrGender+";");
                outFile.print(CurrContact+";");
                outFile.println(Currstatus+";");
                //outFile.println();
                
              
                
                outFile.close();
                
                
                
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(RegisterationForm.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(RegisterationForm.class.getName()).log(Level.SEVERE, null, ex);
            }
    
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //LoginForm myLogin = new LoginForm();
               
                new LoginForm().setVisible(true);
                //myLogin.setExtendedState(myLogin.getExtendedState() | myLogin.MAXIMIZED_BOTH);
             
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextInputEmail;
    private javax.swing.JTextField jTextinputPassword;
    // End of variables declaration//GEN-END:variables

    
public LoginForm(String email, String pass, String name,String ic,String Gender,String phone,String stat){
    this.CurrEmail=email;
    this.CurrPassword=pass;
    this.CurrName=name;
    this.CurrIcNum=ic;
    this.CurrGender=Gender;
    this.CurrContact=phone;
    this.Currstatus=stat;
    JOptionPane.showMessageDialog(null,this.CurrGender);
   
}
}
