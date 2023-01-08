


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package railreservationsystem;
import javax.swing.JOptionPane;
/**
 *
 * @author alifs
 */
 







public class PaymentPage extends javax.swing.JFrame {

    
    public String paymentType;
    /**
     * Creates new form PaymentPage
     */
    public PaymentPage() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        OnlineBankButton = new java.awt.Button();
        CreditButton = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTextPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextPane1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextPane1.setText("ORDER/PAYMENT");
        jScrollPane1.setViewportView(jTextPane1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 630, 40);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(0, 30, 640, 0);

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel6.add(jPanel7);

        label1.setText("Payment Options");
        jPanel6.add(label1);

        getContentPane().add(jPanel6);
        jPanel6.setBounds(0, 260, 630, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Type", "Origin", "Destination", "Quantity", "Fare"
            }
        ));
        jScrollPane4.setViewportView(jTable1);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(0, 40, 630, 220);

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        OnlineBankButton.setLabel("Online Banking");
        OnlineBankButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnlineBankButtonActionPerformed(evt);
            }
        });
        jPanel1.add(OnlineBankButton);

        CreditButton.setLabel("Credit Card");
        CreditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreditButtonActionPerformed(evt);
            }
        });
        jPanel1.add(CreditButton);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 290, 630, 140);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OnlineBankButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnlineBankButtonActionPerformed
        // TODO add your handling code here:
        
        
        String P = "Online Bank";
        paymentType = payType(P);
        JOptionPane.showMessageDialog(null,"Online Payment Successfull");
        
        
    }//GEN-LAST:event_OnlineBankButtonActionPerformed

    private void CreditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreditButtonActionPerformed
        JOptionPane.showMessageDialog(null,"Credit Payment Successfull");
        String P = "Credit Card";
        paymentType = payType(P);
    }//GEN-LAST:event_CreditButtonActionPerformed

    public String payType(String pay){
        String p="";
        if(pay.equalsIgnoreCase("Online Bank")){
            p= "Payment: Online Bank";
        }
        else if(pay.equalsIgnoreCase("Credit Card")){
            p= "Payment: Credit Card";
        }
        return p;
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
            java.util.logging.Logger.getLogger(PaymentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaymentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaymentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaymentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaymentPage().setVisible(true);
            }
        }); 
    }
        
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button CreditButton;
    private java.awt.Button OnlineBankButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextPane jTextPane1;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}



