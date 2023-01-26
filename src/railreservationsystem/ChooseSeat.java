/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package railreservationsystem;

import static java.awt.Color.red;
import static java.awt.Color.yellow;
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
    String email;
    String password;
    String name;
    String icNum;
    String Gender;
    String Contact;
    DecimalFormat dc = new DecimalFormat("RM 0.00");
    
    String va1;
    String va2;
    String va3;
    String vb1;
    String vb2;
    String vb3;
    
    
    
    /**
     * Creates new form ChooseSeat
     */
    public ChooseSeat() {
        initComponents();
        FileReader fr;
        readStatus();
       
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
             
             va1=st1.nextToken();
             va2=st1.nextToken();
             va3=st1.nextToken();
             vb1=st1.nextToken();
             vb2=st1.nextToken();
             vb3=st1.nextToken();
             
             if(va1.equals("0"))
                a1.setVisible(false);
             else
                a1.setVisible(true);
             
             if(va2.equals("0"))
                a2.setVisible(false);
             else
                a2.setVisible(true);
             
             if(va3.equals("0"))
                 a3.setVisible(false);
             else
                 a3.setVisible(true);
             
             if(vb1.equals("0"))
                 b1.setVisible(false);
             else
                 b1.setVisible(true);
             
             if(vb2.equals("0"))
                 b2.setVisible(false);
             else
                 b2.setVisible(true);
             
             if(vb3.equals("0"))
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
                
             va1=st1.nextToken();
             va2=st1.nextToken();
             va3=st1.nextToken();
             vb1=st1.nextToken();
             vb2=st1.nextToken();
             vb3=st1.nextToken();
             
             if(va1.equals("0"))
                 a1.setVisible(false);
             else
                 a1.setVisible(true);
             
             if(va2.equals("0"))
                 a2.setVisible(false);
             else
                 a2.setVisible(true);
             
             if(va3.equals("0"))
                 a3.setVisible(false);
             else
                 a3.setVisible(true);
             
             if(vb1.equals("0"))
                 b1.setVisible(false);
             else
                 b1.setVisible(true);
             
             if(vb2.equals("0"))
                 b2.setVisible(false);
             else
                 b2.setVisible(true);
             
             if(vb3.equals("0"))
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
                
             va1=st1.nextToken();
             va2=st1.nextToken();
             va3=st1.nextToken();
             vb1=st1.nextToken();
             vb2=st1.nextToken();
             vb3=st1.nextToken();
             
             if(va1.equals("0"))
                 a1.setVisible(false);
             else
                 a1.setVisible(true);
             
             if(va2.equals("0"))
                 a2.setVisible(false);
             else
                 a2.setVisible(true);
             
             if(va3.equals("0"))
                 a3.setVisible(false);
             else
                 a3.setVisible(true);
             
             if(vb1.equals("0"))
                 b1.setVisible(false);
             else
                 b1.setVisible(true);
             
             if(vb2.equals("0"))
                 b2.setVisible(false);
             else
                 b2.setVisible(true);
             
             if(vb3.equals("0"))
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
                
             va1=st1.nextToken();
             va2=st1.nextToken();
             va3=st1.nextToken();
             vb1=st1.nextToken();
             vb2=st1.nextToken();
             vb3=st1.nextToken();
             
             if(va1.equals("0"))
                 a1.setVisible(false);
             else
                 a1.setVisible(true);
             
             if(va2.equals("0"))
                 a2.setVisible(false);
             else
                 a2.setVisible(true);
             
             if(va3.equals("0"))
                 a3.setVisible(false);
             else
                 a3.setVisible(true);
             
             if(vb1.equals("0"))
                 b1.setVisible(false);
             else
                 b1.setVisible(true);
             
             if(vb2.equals("0"))
                 b2.setVisible(false);
             else
                 b2.setVisible(true);
             
             if(vb3.equals("0"))
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
                
             va1=st1.nextToken();
             va2=st1.nextToken();
             va3=st1.nextToken();
             vb1=st1.nextToken();
             vb2=st1.nextToken();
             vb3=st1.nextToken();
             
             if(va1.equals("0"))
                 a1.setVisible(false);
             else
                 a1.setVisible(true);
             
             if(va2.equals("0"))
                 a2.setVisible(false);
             else
                 a2.setVisible(true);
             
             if(va3.equals("0"))
                 a3.setVisible(false);
             else
                 a3.setVisible(true);
             
             if(vb1.equals("0"))
                 b1.setVisible(false);
             else
                 b1.setVisible(true);
             
             if(vb2.equals("0"))
                 b2.setVisible(false);
             else
                 b2.setVisible(true);
             
             if(vb3.equals("0"))
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
    
    public void readStatus(){
        try {
            FileReader readSchedule = new FileReader("currentuser.txt");
            BufferedReader br = new BufferedReader(readSchedule);
            
            String input;
            while((input = br.readLine() ) != null)
                {
                    StringTokenizer st = new StringTokenizer (input,";");
                    
                    email = st.nextToken();
                    password = st.nextToken();
                    name = st.nextToken();
                    icNum = st.nextToken();
                    Gender = st.nextToken();
                    Contact = st.nextToken();
                    userStatus = st.nextToken();
                    
                    jStatus.setText(userStatus);
                }
                readSchedule.close();
        }
        catch(Exception ex){
            System.out.println(ex);}
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
        jChooseSeat1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        a1 = new javax.swing.JButton();
        a2 = new javax.swing.JButton();
        a3 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        jChooseSeat = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        chooseCategory = new javax.swing.JComboBox<>();
        Proceed = new javax.swing.JButton();
        jStatus = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel4.setText("Enter Category");

        jChooseSeat1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jChooseSeat1.setOpaque(true);
        jChooseSeat1.setPreferredSize(new java.awt.Dimension(117, 22));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 29, 110));
        jLabel5.setText("Seat");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 29, 110));
        jPanel1.setForeground(new java.awt.Color(0, 29, 110));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 226, 197));
        jLabel1.setText("SEATING PAGE");

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(254, 226, 197));
        jLabel6.setText("X");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(254, 226, 197));
        jLabel7.setText("-");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(371, 371, 371)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(326, 326, 326)
                .addComponent(jLabel7)
                .addGap(28, 28, 28)
                .addComponent(jLabel6)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, -1));

        jPanel5.setBackground(new java.awt.Color(127, 181, 255));
        jPanel5.setMaximumSize(new java.awt.Dimension(1000, 565));
        jPanel5.setPreferredSize(new java.awt.Dimension(1000, 565));

        jPanel2.setBackground(new java.awt.Color(254, 226, 197));

        a1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        a1.setForeground(new java.awt.Color(0, 29, 110));
        a1.setText("A1");
        a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a1ActionPerformed(evt);
            }
        });

        a2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        a2.setForeground(new java.awt.Color(0, 29, 110));
        a2.setText("A2");
        a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a2ActionPerformed(evt);
            }
        });

        a3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        a3.setForeground(new java.awt.Color(0, 29, 110));
        a3.setText("A3");
        a3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a3ActionPerformed(evt);
            }
        });

        b1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        b1.setForeground(new java.awt.Color(0, 29, 110));
        b1.setText("B1");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        b2.setForeground(new java.awt.Color(0, 29, 110));
        b2.setText("B2");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        b3.setForeground(new java.awt.Color(0, 29, 110));
        b3.setText("B3");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(74, 74, 74)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(a3, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(b3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        jChooseSeat.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jChooseSeat.setOpaque(true);
        jChooseSeat.setPreferredSize(new java.awt.Dimension(117, 22));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 29, 110));
        jLabel2.setText("Seat");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 29, 110));
        jLabel3.setText("Category");

        chooseCategory.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        chooseCategory.setForeground(new java.awt.Color(0, 29, 110));
        chooseCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Category", "Platinum", "Gold" }));
        chooseCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseCategoryActionPerformed(evt);
            }
        });

        Proceed.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        Proceed.setForeground(new java.awt.Color(0, 29, 110));
        Proceed.setText("Proceed");
        Proceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProceedActionPerformed(evt);
            }
        });

        jStatus.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jStatus.setOpaque(true);
        jStatus.setPreferredSize(new java.awt.Dimension(117, 22));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 29, 110));
        jLabel8.setText("Status");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(152, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8))
                .addGap(29, 29, 29)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(chooseCategory, 0, 156, Short.MAX_VALUE)
                    .addComponent(jChooseSeat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(140, 140, 140)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(Proceed, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                        .addComponent(Proceed, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jChooseSeat, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chooseCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(51, 51, 51))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1000, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProceedActionPerformed
        // TODO add your handling code here:
        userCategory = (String) chooseCategory.getSelectedItem();
        
        if(userCategory.equals("Platinum")){
            latestPrice = p;
        }
        else if(userCategory.equals("Gold")){
            latestPrice = g;
        }
        try {
            FileReader readSchedule = new FileReader("currentuser.txt");
            BufferedReader br = new BufferedReader(readSchedule);
            
            String input;
            while((input = br.readLine() ) != null)
                {
                    StringTokenizer st = new StringTokenizer (input,";");
                    
                    email = st.nextToken();
                    password = st.nextToken();
                    name = st.nextToken();
                    icNum = st.nextToken();
                    Gender = st.nextToken();
                    Contact = st.nextToken();
                    userStatus = st.nextToken();
                    
                }
                readSchedule.close();
        }
        catch(Exception ex){
            System.out.println(ex);}
        
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
        if(code.equals("T1"))
        {
            try{
            PrintWriter outFile = new PrintWriter("available1.txt");
            
            outFile.print(va1+";");
            outFile.print(va2+";");
            outFile.print(va3+";");
            outFile.print(vb1+";");
            outFile.print(vb2+";");
            outFile.print(vb3+";");

            outFile.close();
            }
            catch(Exception ex){
            System.out.println(ex);
            }
        }
        
        else if(code.equals("T2"))
        {
            try{
            PrintWriter outFile = new PrintWriter("available2.txt");
            
            outFile.print(va1+";");
            outFile.print(va2+";");
            outFile.print(va3+";");
            outFile.print(vb1+";");
            outFile.print(vb2+";");
            outFile.print(vb3+";");

            outFile.close();
            }
            catch(Exception ex){
            System.out.println(ex);
            }
        }
        
        else if(code.equals("T3"))
        {
            try{
            PrintWriter outFile = new PrintWriter("available3.txt");
            
            outFile.print(va1+";");
            outFile.print(va2+";");
            outFile.print(va3+";");
            outFile.print(vb1+";");
            outFile.print(vb2+";");
            outFile.print(vb3+";");

            outFile.close();
            }
            catch(Exception ex){
            System.out.println(ex);
            }
        }
        
        else if(code.equals("T4"))
        {
            try{
            PrintWriter outFile = new PrintWriter("available4.txt");
            
            outFile.print(va1+";");
            outFile.print(va2+";");
            outFile.print(va3+";");
            outFile.print(vb1+";");
            outFile.print(vb2+";");
            outFile.print(vb3+";");

            outFile.close();
            }
            catch(Exception ex){
            System.out.println(ex);
            }
        }
        
        else if(code.equals("T5"))
        {
            try{
            PrintWriter outFile = new PrintWriter("available5.txt");
            
            outFile.print(va1+";");
            outFile.print(va2+";");
            outFile.print(va3+";");
            outFile.print(vb1+";");
            outFile.print(vb2+";");
            outFile.print(vb3+";");

            outFile.close();
            }
            catch(Exception ex){
            System.out.println(ex);
            }
        }
        
        
        JOptionPane.showMessageDialog(null, "Seat has been selected");
        new TicketDetails().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ProceedActionPerformed

    private void a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a2ActionPerformed
        jChooseSeat.setText("A2"); 
        userSeat = "A2"; 
        va2 = "0";
    }//GEN-LAST:event_a2ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        jChooseSeat.setText("B1");
        userSeat = "B1"; 
        vb1 = "0";
    }//GEN-LAST:event_b1ActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        this.setState(1);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void chooseCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chooseCategoryActionPerformed

    private void a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a1ActionPerformed
        jChooseSeat.setText("A1");
        userSeat = "A1"; 
        va1 = "0";
    }//GEN-LAST:event_a1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        jChooseSeat.setText("B2");
        userSeat = "B2"; 
        vb2 = "0";
    }//GEN-LAST:event_b2ActionPerformed

    private void a3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a3ActionPerformed
        jChooseSeat.setText("A3");
        userSeat = "A3"; 
        va3 = "0";
    }//GEN-LAST:event_a3ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        jChooseSeat.setText("B3");
        userSeat = "B3";
        vb3 = "0";
    }//GEN-LAST:event_b3ActionPerformed
   
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
    private static javax.swing.JButton a1;
    private javax.swing.JButton a2;
    private javax.swing.JButton a3;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JComboBox<String> chooseCategory;
    private javax.swing.JLabel jChooseSeat;
    private javax.swing.JLabel jChooseSeat1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel jStatus;
    // End of variables declaration//GEN-END:variables
}
