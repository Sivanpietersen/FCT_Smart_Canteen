/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AdminPannel;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Anojan
 */
public class adminAdd extends javax.swing.JFrame {

    /**
     * Creates new form UserAdd
     */
    public adminAdd() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        rest = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnup = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        Search = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Admin Registration Form");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 10, 440, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 721, 10));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setText("Admin ID ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 109, 193, 34));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setText("Admin Name ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 158, 193, 34));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel4.setText("Admin Email");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 207, 193, 34));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel5.setText("Admin Phone");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 256, 193, 34));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel6.setText("Admin Type");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 305, 193, 34));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel7.setText("Admin Password");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 354, 193, 34));

        jTextField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), new java.awt.Color(255, 255, 0), null));
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 112, 395, 34));

        jTextField2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), new java.awt.Color(255, 255, 0), null));
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 161, 395, 34));

        jTextField3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), new java.awt.Color(255, 255, 0), null));
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 210, 395, 34));

        jTextField4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), new java.awt.Color(255, 255, 0), null));
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField4KeyPressed(evt);
            }
        });
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 259, 395, 34));

        jTextField5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), new java.awt.Color(255, 255, 0), null));
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField5KeyPressed(evt);
            }
        });
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 308, 395, 34));

        jTextField6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), new java.awt.Color(255, 255, 0), null));
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField6KeyPressed(evt);
            }
        });
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 357, 395, 34));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 255, 0));
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anojan\\Desktop\\SmartCanteen\\src\\Icons\\Go-back-icon.png")); // NOI18N
        jButton1.setText("Back");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setBorderPainted(false);
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, 40));

        rest.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rest.setForeground(new java.awt.Color(0, 0, 51));
        rest.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anojan\\Desktop\\SmartCanteen\\src\\Icons\\Reset.png")); // NOI18N
        rest.setText("Reset");
        rest.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(153, 0, 0), null, null));
        rest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restActionPerformed(evt);
            }
        });
        jPanel1.add(rest, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 190, 90, 50));

        btndelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btndelete.setForeground(new java.awt.Color(204, 0, 0));
        btndelete.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anojan\\Desktop\\SmartCanteen\\src\\Icons\\delete.png")); // NOI18N
        btndelete.setText("Delete");
        btndelete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(153, 0, 0), null, null));
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 330, 90, 50));

        btnup.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnup.setForeground(new java.awt.Color(0, 153, 0));
        btnup.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anojan\\Desktop\\SmartCanteen\\src\\Icons\\login.png")); // NOI18N
        btnup.setText("Update");
        btnup.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(153, 0, 0), null, null));
        btnup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupActionPerformed(evt);
            }
        });
        jPanel1.add(btnup, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 260, 90, 50));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Admin ID", "Admin Name", "Admin Email", "Admin Phone", "Admin Type", "Admin Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, 830, 190));

        jFormattedTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jFormattedTextField1KeyPressed(evt);
            }
        });
        jPanel1.add(jFormattedTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 430, 150, 30));

        Search.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anojan\\Desktop\\SmartCanteen\\src\\Icons\\search.png")); // NOI18N
        Search.setText("Search");
        jPanel1.add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 430, 90, 30));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 51, 255));
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anojan\\Desktop\\SmartCanteen\\src\\Icons\\save.png")); // NOI18N
        jButton2.setText("Save");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(153, 0, 0), null, null));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 130, 90, 50));

        jButton3.setBackground(new java.awt.Color(255, 255, 204));
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anojan\\Desktop\\SmartCanteen\\src\\Icons\\Dj-View-icon (1).png")); // NOI18N
        jButton3.setText("Show Details");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 670, -1, -1));

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(204, 0, 0));
        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anojan\\Desktop\\SmartCanteen\\src\\Icons\\close Jframe.png")); // NOI18N
        jButton4.setText("Exit");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.setBorderPainted(false);
        jButton4.setFocusPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, 60, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -2, 950, 710));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
  
    public void save(){
             String sql = "INSERT INTO admin(AdminID, adminName,Email, phone, admin_Catagary,adPassword) Value(?,?,?,?,?,?);";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/fct_smcanteen","root","");
           PreparedStatement pst = conn.prepareStatement(sql);
           
           pst.setString(1, jTextField1.getText());
           pst.setString(2, jTextField2.getText());
           pst.setString(3, jTextField3.getText());
           pst.setString(4, jTextField4.getText());
           pst.setString(5, jTextField5.getText());
           pst.setString(6, jTextField6.getText());
           pst.execute();
           
           JOptionPane.showConfirmDialog(this, "Admin ID: " + jTextField1.getText() + ",Details Successfully Save in The Database");
           ref();
           rease();
          
        }catch(Exception ex){
                    JOptionPane.showMessageDialog(this, "Error while"+"\n"+ex );
                     
            }
    
    }
    
    public void rease(){
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField1.requestFocus();
    
    }
    
       public void ref(){
    
    try {
            DefaultTableModel mod=(DefaultTableModel)jTable1.getModel();
            mod.setRowCount(0);
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fct_smcanteen","root","");
            Statement st=con.createStatement();
            String queSel = "SELECT * FROM admin;";
            ResultSet rs=st.executeQuery(queSel);
            
            while(rs.next()){
                String d1=rs.getString("AdminID"); 
                String d2=rs.getString("adminName");
                String d3=rs.getString("Email"); 
                String d4=rs.getString("Phone");
                String d5=rs.getString("admin_Catagary"); 
                String d6=rs.getString("adPassword"); 
                                                                                                                     
                mod.addRow(new Object[]{d1,d2,d3,d4,d5,d6}); }
                        
    }catch(Exception RefErr){
                
                JOptionPane.showMessageDialog(this,"Error while TableLoad...."+"\n"+RefErr);
            
            }
    
    }
       public void update() {
    String sql = "UPDATE admin SET adminName=?, Email=?, phone=?, admin_Catagary=?, adPassword=? WHERE AdminID=?";
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/fct_smcanteen", "root", "");
        PreparedStatement pst = conn.prepareStatement(sql);

        pst.setString(1, jTextField2.getText()); 
        pst.setString(2, jTextField3.getText()); 
        pst.setString(3, jTextField4.getText()); 
        pst.setString(4, jTextField5.getText()); 
        pst.setString(5, jTextField6.getText()); 
        pst.setString(6, jTextField1.getText()); 

        int rowsAffected = pst.executeUpdate();

        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(this, "Admin ID: " + jTextField1.getText() + " Details Successfully Updated in The Database");
            ref();
            rease();
        } else {
            JOptionPane.showMessageDialog(this, "No records were updated for Admin ID: " + jTextField1.getText());
        }
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Error while updating: \n" + ex);
    }
}

    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 setVisible(false);
        new AdminDasboard().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void restActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restActionPerformed
        rease();
    }//GEN-LAST:event_restActionPerformed

    private void jFormattedTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextField1KeyPressed
        DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        String Search = jFormattedTextField1.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(table);
        jTable1.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(Search));
    }//GEN-LAST:event_jFormattedTextField1KeyPressed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
               try{
             Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fct_smcanteen","root","");
            
                int row=jTable1.getSelectedRow();
                String id=(jTable1.getModel().getValueAt(row, 0).toString()); 
                String queGetData="SELECT * FROM admin WHERE AdminID  = '" +id +"';";
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery(queGetData);
                
                if(rs.next()){
                            
                        jTextField1.setText(rs.getString("AdminID"));  
                        jTextField2.setText(rs.getString("adminName"));                          
                        jTextField3.setText(rs.getString("Email"));  
                        jTextField4.setText(rs.getString("Phone")); 
                        jTextField5.setText(rs.getString("admin_Catagary")); 
                        jTextField6.setText(rs.getString("adPassword")); 
                        
                            }
                rest.setEnabled(true);
                btndelete.setEnabled(true); 
                btndelete.setEnabled(true); 
                jTextField1.setEditable(true);
                jButton2.setEnabled(true);
        } catch(Exception Err)
        {
        JOptionPane.showMessageDialog(this,"Error while Mouse Click on Table..."+"\n"+Err);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
                int key = evt.getKeyCode();
        
        if(key ==10)
        {
        jTextField2.requestFocus();
        
        }
          
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
                int key = evt.getKeyCode();
        
        if(key ==10)
        {
        jTextField3.requestFocus();
        
        }
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed
                 int key = evt.getKeyCode();
        
        if(key ==10)
        {
        jTextField4.requestFocus();
        
        }
    }//GEN-LAST:event_jTextField3KeyPressed

    private void jTextField4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyPressed
                 int key = evt.getKeyCode();
        
        if(key ==10)
        {
        jTextField5.requestFocus();
        
        }
    }//GEN-LAST:event_jTextField4KeyPressed

    private void jTextField5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyPressed
                int key = evt.getKeyCode();
        
        if(key ==10)
        {
        jTextField6.requestFocus();
        
        }
    }//GEN-LAST:event_jTextField5KeyPressed

    private void jTextField6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyPressed
                 int key = evt.getKeyCode();
        
        if(key ==10)
        {
        save();
        }
    }//GEN-LAST:event_jTextField6KeyPressed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
                String ID = jTextField1.getText();
        try{
             Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fct_smcanteen","root","");
            String sql = "DELETE FROM `admin` WHERE AdminID = '"+ ID +"'";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this,"You have SuccessFully DELETED, AdminID "+ ID +" Form The Database!!!",
                    "DELETE SUCCESS!",JOptionPane.INFORMATION_MESSAGE);
            
            rease();
             ref();
                                     
        }catch(Exception Drr)
        {
        JOptionPane.showConfirmDialog(this,"Error While Delete....."+"\n"+Drr);
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        save();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ref();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int a=  JOptionPane.showConfirmDialog(null,"Do You Really Want to Exit","Select",JOptionPane.YES_NO_OPTION);
   
   if (a==0)
   {
        System.exit(0);
   }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupActionPerformed
        update();
    }//GEN-LAST:event_btnupActionPerformed

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
            java.util.logging.Logger.getLogger(adminAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Search;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnup;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JButton rest;
    // End of variables declaration//GEN-END:variables
}
