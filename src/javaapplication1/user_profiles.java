/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

/**
 *
 * @author Adarsh
 */
public class user_profiles extends javax.swing.JFrame {
Date dob1;
    public static String myuserid="ada";
    /**
     * Creates new form user_profiles
     */
          String dbName ="jdbc:oracle:thin:@HPPRO58:1521:orcl";
        //String driver = "com.mysql.jdbc.Driver";
        String usrNm="system";
        String pswd="adarsh";
        public String uid;
        
       
    public user_profiles(String str) {
        this.uid=str;
         initComponents();
         Dimension dim= Toolkit.getDefaultToolkit().getScreenSize();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocation(dim.width/2-this.getSize().width/2,dim.height/2-this.getSize().height/2);
          try {
            Class.forName("oracle.jdbc.driver.OracleDriver");  
               Connection con = DriverManager.getConnection(dbName, usrNm, pswd);
                
                 Statement statement = (Statement) con.createStatement();
                 Login lg=new Login();
                 DateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
                 
                 
                  //System.out.println(uid+"success chahiye");
                 // ResultSet rs=statement.executeQuery("SELECT * FROM user_det where userid='"+uid+"'");
                 
                  
                   jComboBox1.addItem("A+");
             jComboBox1.addItem("A-");
              jComboBox1.addItem("O+");
               jComboBox1.addItem("O-");
                jComboBox1.addItem("B+");
                 jComboBox1.addItem("B-");
                  jComboBox1.addItem("AB+");
                   jComboBox1.addItem("AB-");
                  //String uid=rs.getString("userid");
                 // String pd=rs.getString("password");
                 //rs.next();
                  //String fn=rs.getString("fname");
                 // System.out.println(fn);
                  //jTextField1.setText(fn);
                 /* String mn=rs.getString("mname");
                  System.out.println(mn);
                  String ln=rs.getString("lname");
                  String eid=rs.getString("emailid");
                  String db=rs.getString("dob");
                  String bg=rs.getString("blood_group");
                  String hno=rs.getString("house_no");
                  String cty=rs.getString("city");
                  */
                 ResultSet rs=statement.executeQuery("select fname('"+uid+"') as fname from dual ");
                 rs.next();
                  jTextField1.setText(rs.getString("fname"));
                  
                  rs=statement.executeQuery("SELECT mname('"+uid+"') as mname FROM dual");
                  rs.next();
                  jTextField2.setText(rs.getString("mname"));
                  
                   rs=statement.executeQuery("SELECT lname('"+uid+"') as lname FROM dual");
                  rs.next();
                  jTextField3.setText(rs.getString("lname"));
                  
                  rs=statement.executeQuery("SELECT email('"+uid+"') as emailid FROM dual");
                  rs.next();
                  jTextField4.setText(rs.getString("emailid"));
                  
                  rs=statement.executeQuery("SELECT hno('"+uid+"') as houseno FROM dual");
                  rs.next();
                  jTextField6.setText(rs.getString("houseno"));
                  
                   rs=statement.executeQuery("SELECT city('"+uid+"') as city FROM dual");
                  rs.next();
                  jTextField7.setText(rs.getString("city"));
                  
                  rs=statement.executeQuery("select * from user_det where userid='"+uid+"' ");
                  rs.next();
                  jComboBox1.setSelectedItem(rs.getString("blood_group"));
                  String sk1=rs.getString("dob");
                  Date today1 = sdf.parse(sk1);
                  jXDatePicker1.setDate(today1);
                  //System.out.println(today);
                 // System.out.println("user id in user_prof is "+uid);
                                   rs=statement.executeQuery("select phoneno1('"+uid+"') as blahbl from dual");
                                   rs.next();
                                   jTextField5.setText(rs.getString("blahbl"));
                  
                 
                

                  
                      
                      
                                 
            //System.out.println("11");
// get first column returned


        
        
        rs.close();
//rs1.close();
        statement.close();

        con.close();
                

        
               //jTextField1.setText("3");

            
                            
                       
                
        } catch(Exception e) {
          
         System.out.println("Error in u_p"+e);
        }
        
    }                                        

    private user_profiles() {
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

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Name");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("User Profile");

        jButton1.setText("Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("email-id");

        jLabel4.setText("Phone");

        jLabel5.setText("Blood Group");

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setText("DOB");

        jLabel7.setText("House No.");

        jLabel8.setText("City");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(83, 83, 83)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(jTextField6)
                                                    .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
                                                .addGap(21, 21, 21)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel5)
                                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 318, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
         try {
            Class.forName("oracle.jdbc.driver.OracleDriver");  
               Connection con = DriverManager.getConnection(dbName, usrNm, pswd);
                
                 Statement statement = (Statement) con.createStatement();
                         
                statement.executeUpdate("update user_det set fname='"+jTextField1.getText()+"',mname='"+jTextField2.getText()+"',lname='"+jTextField3.getText()+"',emailid='"+jTextField4.getText()+"',blood_group='"+jComboBox1.getSelectedItem()+"',houseno='"+jTextField6.getText()+"',city='"+jTextField7.getText()+"'where userid='"+uid+"'");
                statement.executeUpdate("update user_phone set phoneno='"+jTextField5.getText()+"' where userid='"+uid+"'");        
                JOptionPane.showMessageDialog(this,"update successful");             
         }catch(Exception e){}
         
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
         final JPopupMenu menu1 = new JPopupMenu("Menu");
         
         JMenuItem item1 = new JMenuItem("My Appointments");
    JMenuItem item2 = new JMenuItem(" My Medical Records");
    JMenuItem item3 = new JMenuItem(" My Orders");
    JMenuItem item5 = new JMenuItem("Logout");
    JMenuItem item6 = new JMenuItem("Book Appointment");
    JMenuItem item7 = new JMenuItem("Book Lab Test");
    JMenuItem item8 = new JMenuItem("Order Medicine");
    
    menu1.add(item6);
    menu1.add(item7);
    menu1.add(item8);
    menu1.add(item1);
    menu1.add(item2);
    menu1.add(item3);
    menu1.add(item5);
    
    user_profiles u=this;
    item6.addActionListener(new ActionListener(){
             @Override
             public void actionPerformed(ActionEvent ae) {
                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
             doctors my;
             my = new doctors(uid);
             my.setVisible(true);
             u.dispatchEvent(new WindowEvent(u,WindowEvent.WINDOW_CLOSING));                        
             }
       
       
   });
    
    item7.addActionListener(new ActionListener(){
             @Override
             public void actionPerformed(ActionEvent ae) {
                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
             lab_test lt = new lab_test(uid);
             lt.setVisible(true);
             u.dispatchEvent(new WindowEvent(u,WindowEvent.WINDOW_CLOSING));                        
             }
       
       
   });
    
    item8.addActionListener(new ActionListener(){
             @Override
             public void actionPerformed(ActionEvent ae) {
                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            searchmedi md=new searchmedi(uid);
             
             md.setVisible(true);
             u.dispatchEvent(new WindowEvent(u,WindowEvent.WINDOW_CLOSING));                        
             }
       
       
   });
    
   item1.addActionListener(new ActionListener(){
             @Override
             public void actionPerformed(ActionEvent ae) {
                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
             drive my;
             my = new drive(uid);
             my.setVisible(true);
                          u.dispatchEvent(new WindowEvent(u,WindowEvent.WINDOW_CLOSING));
             }
       
       
   });
    
    item2.addActionListener(new ActionListener(){
             @Override
             public void actionPerformed(ActionEvent ae) {
                 //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
             drive dr=new drive(uid);
             dr.setVisible(true);
             u.dispatchEvent(new WindowEvent(u,WindowEvent.WINDOW_CLOSING));
             }
        
    });
    item3.addActionListener(new ActionListener(){
             @Override
             public void actionPerformed(ActionEvent ae) {
                 //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
             
             drive dr=new drive(uid);
             dr.setVisible(true);
             u.dispatchEvent(new WindowEvent(u,WindowEvent.WINDOW_CLOSING));
             }
        
    });
    
    
    item5.addActionListener(new ActionListener(){
             @Override
             public void actionPerformed(ActionEvent ae) {
                 //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
             
            home hm= new home();
            hm.setVisible(true);
             u.dispatchEvent(new WindowEvent(u,WindowEvent.WINDOW_CLOSING));
             }
        
    });
    
    
    
       menu1.show(jButton1,jButton1.getWidth()/2, jButton1.getHeight()/2);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(user_profiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(user_profiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(user_profiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(user_profiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new user_profiles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    // End of variables declaration//GEN-END:variables
}
