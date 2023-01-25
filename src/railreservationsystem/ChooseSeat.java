/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package railreservationsystem;

import java.io.FileNotFoundException;
import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

/**
 *
 * @author Intel i5
 */
public class ChooseSeat extends javax.swing.JFrame {

    private String code;
    private String date;
    private String origin;
    private String destination;
    private String depature;
    private String arrival;
    private String duration;
    private double p;
    private double g;
    private String userSeat;
    private String userCategory;
    private String userStatus;
    private double latestPrice;
    DecimalFormat dc = new DecimalFormat("RM 0.00");
    
    
    
    /**
     * Creates new form ChooseSeat
     */
    public ChooseSeat() {
        initComponents();
        FileReader fr;
       
       try {
            fr = new FileReader("CurrentSchedules.txt");
            
            Scanner in = new Scanner(fr);
            
            StringTokenizer st;
            String input,delims=";";
            
            while(in.hasNextLine()){
                input=in.nextLine();
                st = new StringTokenizer(input,delims);
                
                while(st.hasMoreTokens()){
                    code=st.nextToken();
                    date=st.nextToken();
                    origin=st.nextToken();
                    destination=st.nextToken();
                    depature=st.nextToken();
                    arrival=st.nextToken();
                    duration=st.nextToken();
                    String fareP=st.nextToken();
                    p = Double.parseDouble(fareP);
                    String fareG=st.nextToken();
                    g =Double.parseDouble(fareG);
                    
                    in.close();
                    fr.close();
                }  
            }
        }
        catch(Exception ex){
            System.out.println(ex);}
    
        if(code.equals("T1")){
            FileReader fr1;
        try {
            fr1 = new FileReader("available1.txt");
            
            Scanner in1 = new Scanner(fr1);
            
            StringTokenizer st1;
            String input,delims=";";
            
            while(in1.hasNextLine()){
                input=in1.nextLine();
                st1 = new StringTokenizer(input,delims);
                
             String va1=st1.nextToken();
             String va2=st1.nextToken();
             String va3=st1.nextToken();
             String vb1=st1.nextToken();
             String vb2=st1.nextToken();
             String vb3=st1.nextToken();
             
             if(va1.equals("1"))
                 a1.setVisible(false);
             else
                 a1.setVisible(true);
             
             if(va2.equals("1"))
                 a2.setVisible(false);
             else
                 a2.setVisible(true);
             
             if(va3.equals("1"))
                 a3.setVisible(false);
             else
                 a3.setVisible(true);
             
             if(vb1.equals("1"))
                 b1.setVisible(false);
             else
                 b1.setVisible(true);
             
             if(vb2.equals("1"))
                 b2.setVisible(false);
             else
                 b2.setVisible(true);
             
             if(vb3.equals("1"))
                 b3.setVisible(false);
             else
                 b3.setVisible(true);
                 
             in1.close();
             fr1.close();
        }
            
    }
        catch(Exception ex){
            System.out.println(ex);}
        }
    
        if(code.equals("T2")){
            FileReader fr1;
        try {
            fr1 = new FileReader("available2.txt");
            
            Scanner in1 = new Scanner(fr1);
            
            StringTokenizer st1;
            String input,delims=";";
            
            while(in1.hasNextLine()){
                input=in1.nextLine();
                st1 = new StringTokenizer(input,delims);
                
             String va1=st1.nextToken();
             String va2=st1.nextToken();
             String va3=st1.nextToken();
             String vb1=st1.nextToken();
             String vb2=st1.nextToken();
             String vb3=st1.nextToken();
             
             if(va1.equals("1"))
                 a1.setVisible(false);
             else
                 a1.setVisible(true);
             
             if(va2.equals("1"))
                 a2.setVisible(false);
             else
                 a2.setVisible(true);
             
             if(va3.equals("1"))
                 a3.setVisible(false);
             else
                 a3.setVisible(true);
             
             if(vb1.equals("1"))
                 b1.setVisible(false);
             else
                 b1.setVisible(true);
             
             if(vb2.equals("1"))
                 b2.setVisible(false);
             else
                 b2.setVisible(true);
             
             if(vb3.equals("1"))
                 b3.setVisible(false);
             else
                 b3.setVisible(true);
                 
             in1.close();
             fr1.close();
        }
            
    }
        catch(Exception ex){
            System.out.println(ex);}
        }
        
        if(code.equals("T3")){
            FileReader fr1;
        try {
            fr1 = new FileReader("available3.txt");
            
            Scanner in1 = new Scanner(fr1);
            
            StringTokenizer st1;
            String input,delims=";";
            
            while(in1.hasNextLine()){
                input=in1.nextLine();
                st1 = new StringTokenizer(input,delims);
                
             String va1=st1.nextToken();
             String va2=st1.nextToken();
             String va3=st1.nextToken();
             String vb1=st1.nextToken();
             String vb2=st1.nextToken();
             String vb3=st1.nextToken();
             
             if(va1.equals("1"))
                 a1.setVisible(false);
             else
                 a1.setVisible(true);
             
             if(va2.equals("1"))
                 a2.setVisible(false);
             else
                 a2.setVisible(true);
             
             if(va3.equals("1"))
                 a3.setVisible(false);
             else
                 a3.setVisible(true);
             
             if(vb1.equals("1"))
                 b1.setVisible(false);
             else
                 b1.setVisible(true);
             
             if(vb2.equals("1"))
                 b2.setVisible(false);
             else
                 b2.setVisible(true);
             
             if(vb3.equals("1"))
                 b3.setVisible(false);
             else
                 b3.setVisible(true);
                 
             in1.close();
             fr1.close();
        }
            
    }
        catch(Exception ex){
            System.out.println(ex);}
        }
        
        if(code.equals("T4")){
            FileReader fr1;
        try {
            fr1 = new FileReader("available4.txt");
            
            Scanner in1 = new Scanner(fr1);
            
            StringTokenizer st1;
            String input,delims=";";
            
            while(in1.hasNextLine()){
                input=in1.nextLine();
                st1 = new StringTokenizer(input,delims);
                
             String va1=st1.nextToken();
             String va2=st1.nextToken();
             String va3=st1.nextToken();
             String vb1=st1.nextToken();
             String vb2=st1.nextToken();
             String vb3=st1.nextToken();
             
             if(va1.equals("1"))
                 a1.setVisible(false);
             else
                 a1.setVisible(true);
             
             if(va2.equals("1"))
                 a2.setVisible(false);
             else
                 a2.setVisible(true);
             
             if(va3.equals("1"))
                 a3.setVisible(false);
             else
                 a3.setVisible(true);
             
             if(vb1.equals("1"))
                 b1.setVisible(false);
             else
                 b1.setVisible(true);
             
             if(vb2.equals("1"))
                 b2.setVisible(false);
             else
                 b2.setVisible(true);
             
             if(vb3.equals("1"))
                 b3.setVisible(false);
             else
                 b3.setVisible(true);
                 
             in1.close();
             fr1.close();
        }
            
    }
        catch(Exception ex){
            System.out.println(ex);}
        }
        
        if(code.equals("T5")){
            FileReader fr1;
        try {
            fr1 = new FileReader("available5.txt");
            
            Scanner in1 = new Scanner(fr1);
            
            StringTokenizer st1;
            String input,delims=";";
            
            while(in1.hasNextLine()){
                input=in1.nextLine();
                st1 = new StringTokenizer(input,delims);
                
             String va1=st1.nextToken();
             String va2=st1.nextToken();
             String va3=st1.nextToken();
             String vb1=st1.nextToken();
             String vb2=st1.nextToken();
             String vb3=st1.nextToken();
             
             if(va1.equals("1"))
                 a1.setVisible(false);
             else
                 a1.setVisible(true);
             
             if(va2.equals("1"))
                 a2.setVisible(false);
             else
                 a2.setVisible(true);
             
             if(va3.equals("1"))
                 a3.setVisible(false);
             else
                 a3.setVisible(true);
             
             if(vb1.equals("1"))
                 b1.setVisible(false);
             else
                 b1.setVisible(true);
             
             if(vb2.equals("1"))
                 b2.setVisible(false);
             else
                 b2.setVisible(true);
             
             if(vb3.equals("1"))
                 b3.setVisible(false);
             else
                 b3.setVisible(true);
                 
             in1.close();
             fr1.close();
        }
            
    }
        catch(Exception ex){
            System.out.println(ex);}
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

        jLabel4 = new javax.swing.JLabel();
        chooseSeat = new javax.swing.JTextField();
        Proceed = new javax.swing.JButton();
        chooseCategory = new javax.swing.JComboBox<>();
        chooseStatus = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        a1 = new javax.swing.JButton();
        a2 = new javax.swing.JButton();
        a3 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel4.setText("Enter Category");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chooseSeat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseSeatActionPerformed(evt);
            }
        });
        getContentPane().add(chooseSeat, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 148, 129, 36));

        Proceed.setText("Proceed");
        Proceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProceedActionPerformed(evt);
            }
        });
        getContentPane().add(Proceed, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 434, 162, 56));

        chooseCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Category", "Platinum", "Gold" }));
        getContentPane().add(chooseCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 249, 129, 36));

        chooseStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Status", "Student", "OKU", "Senior Citizen" }));
        chooseStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseStatusActionPerformed(evt);
            }
        });
        getContentPane().add(chooseStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 341, 129, 36));

        jPanel1.setBackground(new java.awt.Color(0, 29, 110));
        jPanel1.setForeground(new java.awt.Color(0, 29, 110));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 226, 197));
        jLabel1.setText("SEATING PAGE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1562, -1));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setText("Enter Seat");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 101, 129, 41));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel3.setText("Enter Category");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 202, 129, 41));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel5.setText("Enter Category");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 308, 129, -1));

        jPanel2.setBackground(new java.awt.Color(254, 226, 197));

        a1.setText("A1");

        a2.setText("A2");
        a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a2ActionPerformed(evt);
            }
        });

        a3.setText("A3");

        b1.setText("B1");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setText("B2");

        b3.setText("B3");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(a3, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(b3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(b2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 197, 410, 240));

        jPanel3.setBackground(new java.awt.Color(0, 29, 110));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 1562, -1));

        jPanel5.setBackground(new java.awt.Color(127, 181, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1560, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1560, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chooseSeatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseSeatActionPerformed
        
    }//GEN-LAST:event_chooseSeatActionPerformed

    private void ProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProceedActionPerformed
        // TODO add your handling code here:
        userSeat = chooseSeat.getText();
        userCategory = (String) chooseCategory.getSelectedItem();
        userStatus = (String) chooseStatus.getSelectedItem();
        
        if(userCategory.equals("Platinum")){
            latestPrice = p;
        }
        else if(userCategory.equals("Gold")){
            latestPrice = g;
        }
        
        if(userStatus.equals("Student")){
            latestPrice = latestPrice*0.95;
        }
        else if(userStatus.equals("OKU")){
            latestPrice = latestPrice*0.9;
        }
        else if(userStatus.equals("Senior Citizen")){
            latestPrice = latestPrice*0.85;
        }
        
        try{
            FileWriter inFile = new FileWriter("UserSeat.txt");
            PrintWriter outFile = new PrintWriter(inFile);
            
            outFile.print(code+";");
            outFile.print(userSeat+";");
            outFile.print(userCategory+";");
            outFile.print(dc.format(latestPrice)+";");
            
            inFile.close();
            outFile.close();
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        
        JOptionPane.showMessageDialog(null, "Seat has been selected");
        new TicketDetails().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ProceedActionPerformed

    private void a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a2ActionPerformed

    private void chooseStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chooseStatusActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b1ActionPerformed
   
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
            java.util.logging.Logger.getLogger(ChooseSeat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChooseSeat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChooseSeat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChooseSeat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChooseSeat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Proceed;
    private javax.swing.JButton a1;
    private javax.swing.JButton a2;
    private javax.swing.JButton a3;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JComboBox<String> chooseCategory;
    private javax.swing.JTextField chooseSeat;
    private javax.swing.JComboBox<String> chooseStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
