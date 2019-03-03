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
public class lclass implements ActionListener {
    String timings;
    String lid;
    String uid;
    String testname;
    String dates;
    public lclass(String s,String lid ,String uid,String testname,String dates) {
        this.timings=s;
        this.lid=lid;
        this.uid=uid;
        this.testname=testname;
        this.dates=dates;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       
       
        confirmlab cf=new confirmlab(timings,lid,uid,testname,dates);
        
        java.awt.Window win[]=java.awt.Window.getWindows();
        for(int i=0;i<win.length;i++) {
            win[i].dispose();
        }
        cf.setVisible(true);
    }
}
