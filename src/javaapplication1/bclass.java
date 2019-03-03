/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author Adarsh
 */
public class bclass implements ActionListener {
    public  String timings;
    public String uid;
    public String did;
    public String cid;
    public String date; 
    
String str;
    public bclass(String s,String uid,String did,String cid,String date) {
        this.str=s;
        this.uid=uid;
        this.did=did;
        this.cid=cid;
        this.date=date;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       
        timings=ae.getActionCommand();
        confirm cf=new confirm(uid,timings,did,cid,date);
        
        java.awt.Window win[]=java.awt.Window.getWindows();
        for(int i=0;i<win.length;i++) {
            win[i].dispose();
        }
        cf.setVisible(true);
    }
    
}

