/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package railreservationsystem;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Intel i5
 */
public class TicketRecord extends javax.swing.JFrame {

    private String Code;
    private String Date;
    private String Origin;
    private String Destination;
    private String Depature;
    private String Arrival;
    private String Duration;
    private String Seat;
    private String Category;
    private String Status;
    private String Price;
    private String PayType;
    /**
     * Creates new form TicketRecord
     */
    public TicketRecord() {
        initComponents();
        //setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        ReadRecord();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        RecordTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        recOrigin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        recDestination = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        recArrival = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        recDuration = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        recSeat = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        recCategory = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        recStatus = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        recPrice = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Back_Menu = new javax.swing.JButton();
        recCode = new javax.swing.JTextField();
        recDate = new javax.swing.JTextField();
        recPayType = new javax.swing.JTextField();
        recDepature = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel12.setText("Date");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        RecordTable.setBackground(new java.awt.Color(255, 255, 204));
        RecordTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Train Code", "Date", "Origin", "Destination", "Depature", "Arrival", "Duration", "Seat","Category", "Status","Price","Payment"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        RecordTable.setGridColor(new java.awt.Color(196, 221, 255));
        RecordTable.setOpaque(false);
        RecordTable.setSelectionBackground(new java.awt.Color(196, 221, 255));
        RecordTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RecordTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(RecordTable);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setText("Origin");

        recOrigin.setEditable(false);
        recOrigin.setBackground(new java.awt.Color(255, 255, 204));
        recOrigin.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        recOrigin.setForeground(new java.awt.Color(0, 29, 110));
        recOrigin.setDisabledTextColor(new java.awt.Color(0, 29, 110));
        recOrigin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recOriginActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setText("Destination");

        recDestination.setBackground(new java.awt.Color(255, 255, 204));
        recDestination.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        recDestination.setForeground(new java.awt.Color(0, 29, 110));
        recDestination.setDisabledTextColor(new java.awt.Color(0, 29, 110));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel3.setText("Arrival");

        recArrival.setBackground(new java.awt.Color(255, 255, 204));
        recArrival.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        recArrival.setForeground(new java.awt.Color(0, 29, 110));
        recArrival.setDisabledTextColor(new java.awt.Color(0, 29, 110));
        recArrival.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recArrivalActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel4.setText("Duration");

        recDuration.setBackground(new java.awt.Color(255, 255, 204));
        recDuration.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        recDuration.setForeground(new java.awt.Color(0, 29, 110));
        recDuration.setDisabledTextColor(new java.awt.Color(0, 29, 110));
        recDuration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recDurationActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel5.setText("Seat");

        recSeat.setBackground(new java.awt.Color(255, 255, 204));
        recSeat.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        recSeat.setForeground(new java.awt.Color(0, 29, 110));
        recSeat.setDisabledTextColor(new java.awt.Color(0, 29, 110));
        recSeat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recSeatActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel6.setText("Category");

        recCategory.setBackground(new java.awt.Color(255, 255, 204));
        recCategory.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        recCategory.setForeground(new java.awt.Color(0, 29, 110));
        recCategory.setDisabledTextColor(new java.awt.Color(0, 29, 110));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel7.setText("Status ");

        recStatus.setBackground(new java.awt.Color(255, 255, 204));
        recStatus.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        recStatus.setForeground(new java.awt.Color(0, 29, 110));
        recStatus.setDisabledTextColor(new java.awt.Color(0, 29, 110));
        recStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recStatusActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel8.setText("Price");

        recPrice.setBackground(new java.awt.Color(255, 255, 204));
        recPrice.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        recPrice.setForeground(new java.awt.Color(0, 29, 110));
        recPrice.setDisabledTextColor(new java.awt.Color(0, 29, 110));
        recPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recPriceActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 29, 110));

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 30)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(254, 226, 197));
        jLabel9.setText("Ticket History");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon&Pics/logo1.png"))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(254, 226, 197));
        jLabel16.setText("X");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(254, 226, 197));
        jLabel17.setText("-");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel15)
                .addGap(301, 301, 301)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(32, 32, 32)
                .addComponent(jLabel16)
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel15)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(jLabel17)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 29, 110));

        Back_Menu.setBackground(new java.awt.Color(254, 226, 197));
        Back_Menu.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Back_Menu.setForeground(new java.awt.Color(0, 29, 110));
        Back_Menu.setText("Back to Menu");
        Back_Menu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Back_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_MenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Back_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(Back_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        recCode.setBackground(new java.awt.Color(255, 255, 204));
        recCode.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        recCode.setForeground(new java.awt.Color(0, 29, 110));
        recCode.setDisabledTextColor(new java.awt.Color(0, 29, 110));
        recCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recCodeActionPerformed(evt);
            }
        });

        recDate.setBackground(new java.awt.Color(255, 255, 204));
        recDate.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        recDate.setForeground(new java.awt.Color(0, 29, 110));
        recDate.setDisabledTextColor(new java.awt.Color(0, 29, 110));
        recDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recDateActionPerformed(evt);
            }
        });

        recPayType.setBackground(new java.awt.Color(255, 255, 204));
        recPayType.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        recPayType.setForeground(new java.awt.Color(0, 29, 110));
        recPayType.setDisabledTextColor(new java.awt.Color(0, 29, 110));
        recPayType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recPayTypeActionPerformed(evt);
            }
        });

        recDepature.setBackground(new java.awt.Color(255, 255, 204));
        recDepature.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        recDepature.setForeground(new java.awt.Color(0, 29, 110));
        recDepature.setDisabledTextColor(new java.awt.Color(0, 29, 110));
        recDepature.setDoubleBuffered(true);
        recDepature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recDepatureActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel10.setText("Train Code");

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel11.setText("Date");

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel13.setText("Depature");

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel14.setText("Payment Type");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(196, 221, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1081, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 625, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(recDepature, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(122, 122, 122))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(recCode, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(52, 52, 52)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(recOrigin, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(recDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(recCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(recPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(52, 52, 52)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(recSeat, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(recDate)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(recDestination)
                            .addComponent(recArrival)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(recStatus)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(recPayType))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(recCode, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(recDate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(recOrigin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(recDestination, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(recDepature, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(recArrival, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(recSeat, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(recDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(recCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(recStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(recPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(recPayType, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(56, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(69, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void RecordTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RecordTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel mode=(DefaultTableModel)RecordTable.getModel();
        
        int selectedRow=RecordTable.getSelectedRow();
        
        String Code = mode.getValueAt(selectedRow, 0).toString();
        String Date = mode.getValueAt(selectedRow, 1).toString();
        String Origin = mode.getValueAt(selectedRow, 2).toString();
        String Destination = mode.getValueAt(selectedRow, 3).toString();
        String Depature = mode.getValueAt(selectedRow, 4).toString();
        String Arrival = mode.getValueAt(selectedRow, 5).toString();
        String Duration = mode.getValueAt(selectedRow, 6).toString();
        String Seat = mode.getValueAt(selectedRow, 7).toString();
        String Category = mode.getValueAt(selectedRow, 8).toString();
        String Status = mode.getValueAt(selectedRow, 9).toString();
        String Price = mode.getValueAt(selectedRow, 10).toString();
        String PayType = mode.getValueAt(selectedRow, 11).toString();
        
        
        recCode.setText(Code);
        recDate.setText(Date);
        recOrigin.setText(Origin);
        recDestination.setText(Destination);
        recDepature.setText(Depature);
        recArrival.setText(Arrival);
        recDuration.setText(Duration);
        recSeat.setText(Seat);
        recCategory.setText(Category);
        recStatus.setText(Status);
        recPrice.setText(Price);
        recPayType.setText(PayType);
    }//GEN-LAST:event_RecordTableMouseClicked

    private void recOriginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recOriginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recOriginActionPerformed

    private void recDurationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recDurationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recDurationActionPerformed

    private void recStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recStatusActionPerformed

    private void recPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recPriceActionPerformed

    private void Back_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_MenuActionPerformed
        new MainMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Back_MenuActionPerformed

    private void recCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recCodeActionPerformed

    private void recDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recDateActionPerformed

    private void recPayTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recPayTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recPayTypeActionPerformed

    private void recDepatureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recDepatureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recDepatureActionPerformed

    private void recArrivalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recArrivalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recArrivalActionPerformed

    private void recSeatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recSeatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recSeatActionPerformed

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        // TODO add your handling code here:
        this.setState(1);
    }//GEN-LAST:event_jLabel17MouseClicked

    private void ReadRecord(){
        try{
            
            //String inFile="Details.txt";
            FileReader rf = new FileReader("Details.txt");
            Scanner sc = new Scanner(rf);
            DefaultTableModel moder=(DefaultTableModel)RecordTable.getModel();

            StringTokenizer tk;
            String input,delims=";";

            while(sc.hasNextLine()){//rt4teyy
                input = sc.nextLine();    
                tk = new StringTokenizer(input,delims);

                String code = tk.nextToken();
                String date = tk.nextToken();
                String origin = tk.nextToken();
                String destination = tk.nextToken();
                String depature = tk.nextToken();
                String arrival = tk.nextToken();
                String duration = tk.nextToken();
                String seat = tk.nextToken();
                String category = tk.nextToken();
                String status = tk.nextToken();
                String price = tk.nextToken();
                String paytype = tk.nextToken();
                

                Object[] rec = {code, date, origin, destination, depature, arrival, duration, seat, category, status, price, paytype};

                moder.addRow(rec);
            }
            sc.close();
            rf.close();
            
        }catch(Exception ex){
            System.out.println(ex);
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
            java.util.logging.Logger.getLogger(TicketRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicketRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicketRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicketRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicketRecord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_Menu;
    private javax.swing.JTable RecordTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField recArrival;
    private javax.swing.JTextField recCategory;
    private javax.swing.JTextField recCode;
    private javax.swing.JTextField recDate;
    private javax.swing.JTextField recDepature;
    private javax.swing.JTextField recDestination;
    private javax.swing.JTextField recDuration;
    private javax.swing.JTextField recOrigin;
    private javax.swing.JTextField recPayType;
    private javax.swing.JTextField recPrice;
    private javax.swing.JTextField recSeat;
    private javax.swing.JTextField recStatus;
    // End of variables declaration//GEN-END:variables
}
