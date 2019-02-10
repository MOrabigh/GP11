/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import Connectvy.ConnectionClass;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JRViewer;


/**
 *
 * @author algha
 */
public class printreport extends JFrame {
    ConnectionClass connectionClass = new ConnectionClass();
    // we call conneClass  that we make it up
    Connection connection = connectionClass.getConnection();
     PreparedStatement pst = null;
     ResultSet rs =null;
     
     public printreport() throws HeadlessException{
         
     } 
     public void showReport(){
         try{
             
             JasperReport jasperReport = JasperCompileManager.compileReport("C:\\Users\\algha\\Documents\\NetBeansProjects\\GP11\\src\\report.jrxml");
             JasperPrint Jasperprint = JasperFillManager.fillReport(jasperReport, null,connection );
             JRViewer viewer = new JRViewer (Jasperprint);
             viewer.setOpaque(true);
             viewer.setVisible(true);
             
             this.add(viewer);
             this.setSize(900,500);
              this.setVisible(true);
             
             
             
             
         } catch (Exception e){
             JOptionPane.showMessageDialog(rootPane, e.getMessage());
         }
     }
     
    
   
    
}
