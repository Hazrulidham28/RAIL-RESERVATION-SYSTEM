/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package railreservationsystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Hazrul Idham
 */
public class AccDetails extends javax.swing.JFrame {
    
    private String Email;
    private String Password;
    private String Name;
    private String IcNum;
    private String Gender;
    private String Contact;
    private String status;
    private String InputEmail;
    private String newPass;
    private String currmail;
    private String currpass;
    private String currname;
    private String curric;
    private String currgender;
    private String currcontact;
    private String currstat; 
    

    /**
     * Creates new form AccDetails
     */
    public AccDetails() {
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextIc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jRadioButtonmale = new javax.swing.JRadioButton();
        jRadioButtonFemale = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jButtonsubmit = new javax.swing.JButton();
        jButtonLoad = new javax.swing.JButton();
        jPasswordold = new javax.swing.JTextField();
        jPasswordnew = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 29, 110));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 226, 197));
        jLabel1.setText("Account Details");

        jPanel2.setBackground(new java.awt.Color(196, 221, 255));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 29, 110));
        jLabel2.setText("Name");

        jTextName.setBackground(new java.awt.Color(254, 226, 197));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 29, 110));
        jLabel3.setText("MyKad No");

        jTextIc.setBackground(new java.awt.Color(254, 226, 197));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 29, 110));
        jLabel4.setText("Password");

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 29, 110));
        jLabel5.setText("Email");

        jTextEmail.setBackground(new java.awt.Color(254, 226, 197));
        jTextEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextEmailActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 29, 110));
        jLabel6.setText("Gender");

        buttonGroup2.add(jRadioButtonmale);
        jRadioButtonmale.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jRadioButtonmale.setForeground(new java.awt.Color(0, 29, 110));
        jRadioButtonmale.setText("Male");
        jRadioButtonmale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonmaleActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButtonFemale);
        jRadioButtonFemale.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jRadioButtonFemale.setForeground(new java.awt.Color(0, 29, 110));
        jRadioButtonFemale.setText("Female");
        jRadioButtonFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonFemaleActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 29, 110));
        jLabel7.setText("New Password");

        jButtonsubmit.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButtonsubmit.setForeground(new java.awt.Color(0, 29, 110));
        jButtonsubmit.setText("Submit");
        jButtonsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsubmitActionPerformed(evt);
            }
        });

        jButtonLoad.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButtonLoad.setForeground(new java.awt.Color(0, 29, 110));
        jButtonLoad.setText("Load");
        jButtonLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoadActionPerformed(evt);
            }
        });

        jPasswordold.setBackground(new java.awt.Color(254, 226, 197));
        jPasswordold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordoldActionPerformed(evt);
            }
        });

        jPasswordnew.setBackground(new java.awt.Color(254, 226, 197));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextIc, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextName, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordold, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jRadioButtonmale)
                            .addGap(18, 18, 18)
                            .addComponent(jRadioButtonFemale)
                            .addContainerGap(255, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jButtonLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jPasswordnew, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)
                                .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonmale)
                    .addComponent(jRadioButtonFemale)
                    .addComponent(jTextIc, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordold, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordnew, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(169, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(363, 363, 363))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonmaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonmaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonmaleActionPerformed

    private void jTextEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextEmailActionPerformed

    private void jRadioButtonFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonFemaleActionPerformed

    private void jButtonsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsubmitActionPerformed
        newPass=jPasswordnew.getText();
        
        //update latest data to user.txt
        UpdateAcc();
        JOptionPane.showMessageDialog(null,"Succesfully update changes!");
        //update latest data to currentuser.txt
        //create obj from class login form
        JOptionPane.showMessageDialog(null,currgender);
        LoginForm lg = new LoginForm(currmail,currpass,currname,curric,currgender,currcontact,currstat);
       //update new customer data into currentuser.txt
        lg.setCustomerdata();
        
     
       
    }//GEN-LAST:event_jButtonsubmitActionPerformed

    private void jButtonLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoadActionPerformed
        // TODO add your handling code here:
        readUserData();
        if(Gender.equals("male")){
            jRadioButtonmale.setSelected(true);
        }
        else{
            jRadioButtonFemale.setSelected(true);
        }
        
        
        jTextName.setText(Name);
        jTextIc.setText(IcNum);
        jTextEmail.setText(Email);
        jPasswordold.setText(Password);
        
       
    }//GEN-LAST:event_jButtonLoadActionPerformed

    private void jPasswordoldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordoldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordoldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      //  AccDetails Ad = new AccDetails();
        
        
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
            java.util.logging.Logger.getLogger(AccDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccDetails().setVisible(true);
                
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JButton jButtonLoad;
    private javax.swing.JButton jButtonsubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jPasswordnew;
    private javax.swing.JTextField jPasswordold;
    private javax.swing.JRadioButton jRadioButtonFemale;
    private javax.swing.JRadioButton jRadioButtonmale;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextIc;
    private javax.swing.JTextField jTextName;
    // End of variables declaration//GEN-END:variables

 public void readUserData(){
        //open file reader
        
        FileReader fr;
        try {
            fr = new FileReader("currentuser.txt");
            
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
               
                
                
            }
            in.close();
           InputEmail=Email;
           
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
 
 public void UpdateAcc() {
     
        
        FileReader fr;
        FileWriter fw;
        PrintWriter pr;
        try{
            fr=new FileReader("user.txt");
            fw= new FileWriter("temp.txt");
            pr = new PrintWriter(fw);
            
           Scanner in = new Scanner(fr);
           
           StringTokenizer st;
            String input,delims=";";
            //
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
                //if email that user input is equals like in file, it will replace new password into temp file
                if(InputEmail.equals(Email)){
                pr.print(Email+";");
                pr.print(newPass+";");
                pr.print(Name+";");
                pr.print(IcNum+";");
                pr.print(Gender+";");
                pr.print(Contact+";");
                pr.println(status+";");
                currmail=Email;currpass=newPass;currname=Name;curric=IcNum;currgender=Gender;currcontact=Contact;currstat=status; 
                }
                //if email that user input is not equal, it will copy to temp file
                else{
                pr.print(Email+";");
                pr.print(Password+";");
                pr.print(Name+";");
                pr.print(IcNum+";");
                pr.print(Gender+";");
                pr.print(Contact+";");
                pr.println(status+";");
                }
            }
           
            in.close();
            pr.close();
           //to delete user.txt that has old data
           File oldfile = new File("user.txt");
           oldfile.delete();
           
           //rename temp.txt that has the latest data to user.txt
           File newfile =new File("temp.txt");
           newfile.renameTo(new File("user.txt"));
           
          // JOptionPane.showMessageDialog(null,"Succesfully update data!");
           
           
        
        }catch (FileNotFoundException ex) {
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ForgetPassword.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    
    //
    
    }


}
