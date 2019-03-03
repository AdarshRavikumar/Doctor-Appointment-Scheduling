/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Adarsh
 */
class MyClass1 implements ActionListener {
        
    String path;
    public MyClass1(String path) {
            
        this.path=path;

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       System.out.println("path is "+path);
       File file = new File(path);

        //first check if Desktop is supported by Platform or not
        if(!Desktop.isDesktopSupported()){
            System.out.println("Desktop is not supported");
            return;
        }

        Desktop desktop = Desktop.getDesktop();
        try {
            if(file.exists()) {
                desktop.open(file);
            }    
        } catch(Exception ex) {}
    }

}




public class drive extends javax.swing.JFrame {

    String dbName ="jdbc:oracle:thin:@HPPRO58:1521:orcl";
        //String driver = "com.mysql.jdbc.Driver";
        String usrNm="system";
        String pswd="adarsh";
    /**
     * Creates new form drive
     */
    String uid;
    File selectedFile;
    public drive( String str) {
        this.uid=str;
        
        initComponents();
        jButton4.setVisible(false);
        Dimension dim= Toolkit.getDefaultToolkit().getScreenSize();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocation(dim.width/2-this.getSize().width/2,dim.height/2-this.getSize().height/2);
          
          try {
            // TODO add your handling code here:
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(drive.class.getName()).log(Level.SEVERE, null, ex);
        }
               Connection con;
        try {
            con = DriverManager.getConnection(dbName, usrNm, pswd);
        } catch (SQLException ex) {
            Logger.getLogger(drive.class.getName()).log(Level.SEVERE, null, ex);
        }
;
        try {
            con = DriverManager.getConnection(dbName, usrNm, pswd);
        } catch (SQLException ex) {
            Logger.getLogger(drive.class.getName()).log(Level.SEVERE, null, ex);
        }
        Login lg = new Login();
        try {
            con=DriverManager.getConnection(dbName, usrNm, pswd);
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select fname from user_det where userid='"+uid+"'");
            rs.next();
            jTextField1.setText(rs.getString("fname"));
            jTextField1.setEditable(false);
        } catch(Exception e){}
        dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        try {
            con = DriverManager.getConnection(dbName, usrNm, pswd);
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from details where id='"+uid+"'");
            rs.next();
            String name=rs.getString("path");
            jButton4.setText(name);
        } catch(Exception e) {}    
        
    }

    private drive() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("My Appointments");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Medical Records");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("My Orders");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Drive");

        jButton4.setText("Add Record");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Profile");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 778, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jButton4.setVisible(false);
       jPanel1.removeAll();
       jPanel1.updateUI();
       try{
            Class.forName("oracle.jdbc.driver.OracleDriver");  
               Connection con = DriverManager.getConnection(dbName, usrNm, pswd);
               
                
                PreparedStatement statement= con.prepareStatement("SELECT userid,doctorid,clinicid,dates,timings from consults where userid in(select userid from consults where userid='"+uid+"') order by dates desc");

                  ResultSet rs=statement.executeQuery();
                 
                  JTable jtable1= new JTable();
                  jtable1.setModel(DbUtils.resultSetToTableModel(rs));
                  jtable1.setPreferredSize(new Dimension(400,300));
                  jtable1.setEnabled(false);
                  jPanel1.add(jtable1);
                  
                  
                  
       }catch(Exception e){}
       
 
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            // TODO add your handling code here:
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(drive.class.getName()).log(Level.SEVERE, null, ex);
        }
               Connection con;
        try {
            con = DriverManager.getConnection(dbName, usrNm, pswd);
        } catch (SQLException ex) {
            Logger.getLogger(drive.class.getName()).log(Level.SEVERE, null, ex);
        }
;
        try {
            con = DriverManager.getConnection(dbName, usrNm, pswd);
        } catch (SQLException ex) {
            Logger.getLogger(drive.class.getName()).log(Level.SEVERE, null, ex);
        }
         JFileChooser fileChooser=new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        int result=fileChooser.showOpenDialog(this);
        if(result==JFileChooser.APPROVE_OPTION){
              selectedFile = fileChooser.getSelectedFile();      
        }
        ImageIcon icon=new ImageIcon("C:\\Users\\Mahe\\Downloads\\test1.jpg");
        JButton bt=new JButton(selectedFile.getAbsolutePath().substring(selectedFile.getAbsolutePath().lastIndexOf("\\")+1));
        bt.setSize(100,50);
        bt.addActionListener(new MyClass1(selectedFile.getAbsolutePath()));
        jPanel1.add(bt);
        bt.setIcon(icon);
        String path=selectedFile.getPath();
          System.out.println(path);
        path=path.replaceAll("\\\\","\\\\");
      
        
           
        try {
            con = DriverManager.getConnection(dbName, usrNm, pswd);
             Statement st;
            st = con.createStatement();
             st.executeUpdate("insert into drive values('"+uid+"','"+path+"')");
        } catch (SQLException ex) {
            Logger.getLogger(drive.class.getName()).log(Level.SEVERE, null, ex);
        }
           
        //} catch(Exception e) {}
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jButton4.setVisible(true);
        jPanel1.removeAll();
        jPanel1.updateUI();
        String dbName ="jdbc:oracle:thin:@HPPRO58:1521:orcl";
        String usrNm="system";
        String pswd="adarsh";
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");  
            Connection con = DriverManager.getConnection(dbName, usrNm, pswd);
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from drive where userid='"+uid+"'");
            while(rs.next()) {
                ImageIcon icon=new ImageIcon("C:\\Users\\Mahe\\Downloads\\test1.jpg");
                String path=rs.getString("path");
                JButton bt=new JButton(path.substring(path.lastIndexOf("\\")+1));
                bt.setSize(20,30);
                bt.addActionListener(new MyClass1(path));
                jPanel1.add(bt);
                bt.setIcon(icon);
            }
        } catch(Exception e){}
    
    
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        user_profiles u=new user_profiles(uid); 
        u.setVisible(true);
        this.dispatchEvent(new WindowEvent(this,WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jButton4.setVisible(false);
       jPanel1.removeAll();
       jPanel1.updateUI();
       try{
            Class.forName("oracle.jdbc.driver.OracleDriver");  
               Connection con = DriverManager.getConnection(dbName, usrNm, pswd);
               
                
                PreparedStatement statement= con.prepareStatement("SELECT * from orderlist where userid='"+uid+"' ");

                  ResultSet rs=statement.executeQuery();
                 
                  JTable jtable1= new JTable();
                  jtable1.setModel(DbUtils.resultSetToTableModel(rs));
                  jtable1.setPreferredSize(new Dimension(400,300));
                  jtable1.setEnabled(false);
                  jPanel1.add(jtable1);
                  
                  
                  
       }catch(Exception e){}
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(drive.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(drive.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(drive.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(drive.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new drive().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}    
