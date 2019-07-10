/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author acer
 */
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.*;
import com.itextpdf.*;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;
import java.io.File;
import java.net.ConnectException;
import org.apache.commons.io.FilenameUtils;

import com.sun.star.lang.XEventListener;
import org.slf4j.*;

import com.artofsolving.jodconverter.*;
import com.artofsolving.jodconverter.DocumentConverter;
import com.artofsolving.jodconverter.openoffice.connection.OpenOfficeConnection;
import com.artofsolving.jodconverter.openoffice.connection.SocketOpenOfficeConnection;
import com.artofsolving.jodconverter.openoffice.converter.OpenOfficeDocumentConverter;
import org.artofsolving.jodconverter.OfficeDocumentConverter;
import org.artofsolving.jodconverter.office.DefaultOfficeManagerConfiguration;
import org.artofsolving.jodconverter.office.OfficeManager;

import com.aspose.words.*;
import com.aspose.words.Document;
import java.util.logging.Level;


public class Inventory extends javax.swing.JFrame {

    /**
     * Creates new form Inventory
     */
    public Inventory() {
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
        jButtonEntrar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldSenha = new javax.swing.JTextField();
        jTextFieldLogin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Project_Inventory");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonEntrar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonEntrar.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButtonEntrar.setText("ENTRAR");
        jButtonEntrar.setBorder(null);
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 230, 20));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton1.setText("REGISTRAR");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 230, 31));

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jButton5.setText("SAIR");
        jButton5.setBorder(null);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 316, 32));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Yu Gothic Medium", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("Senha");
        jLabel2.setMaximumSize(new java.awt.Dimension(821, 59));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 120, 46));

        jTextFieldSenha.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(204, 204, 204)));
        jPanel1.add(jTextFieldSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 150, -1));

        jTextFieldLogin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(204, 204, 204)));
        jPanel1.add(jTextFieldLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 150, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Yu Gothic Medium", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("ReadIT!");
        jLabel3.setMaximumSize(new java.awt.Dimension(821, 59));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 120, 46));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Yu Gothic Medium", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("Login");
        jLabel4.setMaximumSize(new java.awt.Dimension(821, 59));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 120, 46));

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Registrar a= new Registrar();
        a.setVisible(true);
        this.dispose();
        //a.setDefaultCloseOperation(Registrar.DISPOSE_ON_CLOSE);           
    }//GEN-LAST:event_jButton1ActionPerformed

    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt){   
         
       /*Teste a = new Teste();
        a.setVisible(true);
        this.dispose();*/
        
        
        /*try{
        PdfReader reader = new PdfReader("file:///C:/Users/Arison%20Raik/Documents/wendell.pdf");

        PdfDocument pdfDoc = new PdfDocument(new PdfReader("file:///C:/Users/Arison%20Raik/Downloads/Resultado_LAB.%20DNA%20CENTER_9277059747708.pdf"));
        int test = pdfDoc.getNumberOfPages();
        JOptionPane.showMessageDialog(null, test);
        }
        catch(IOException a){}*/
        
        
        try {
            InputStream stream = new FileInputStream("C:\\Users\\Arison Raik\\Documents\\Parte.docx");
            Document doc = new Document(stream);
            stream.close();
            doc.save("teste.pdf");
            JOptionPane.showMessageDialog(null,"Feito!");
            //jTextFieldLogin.setText("teste.pdf");
            //doc.save("‪‪C:\\Users\\Arison Raik\\Documents\\testeteste.docx");
            //JOptionPane.showMessageDialog(null,"Feito!");
        }
        catch (Exception ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            File f = new File("teste.pdf");
            if(f != null){
                f.delete();
                f = null;
            }
        }
        
        /*
        OpenOfficeConnection connection = null;
    try {
      File inputFile = new File("‪C:\\Users\\Arison Raik\\Documents\\Parte.docx");
      File outputFile = new File("‪C:\\Users\\Arison Raik\\Documents\\Parte.pdf");

      // connect to an OpenOffice.org instance running on port 8100
      // run in shell: soffice -headless -accept="socket,host=127.0.0.1,port=8100;urp;" -nofirststartwizard
      // See: http://www.artofsolving.com/
      connection = new SocketOpenOfficeConnection("192.168.0.1", 8100);
      connection.connect();

      // convert
      DocumentConverter converter = new OpenOfficeDocumentConverter(connection);
      converter.convert(inputFile, outputFile);
        
        JOptionPane.showMessageDialog(null,"Feito!");
// close the connection
        connection.disconnect();
        }
        catch(IOException a){}*/
    }

    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed
        String connectionUrl = "jdbc:sqlserver://localhost:1433;" +  
            "databaseName=ReadIT;user=arison;password=123;";
        try {
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(connectionUrl);
            Statement stmt = con.createStatement();
            String login = jTextFieldLogin.getText();
            String senha = jTextFieldSenha.getText();
            String sql = "SELECT login, senha FROM registro WHERE login = '" + login + "' AND senha = '" + senha + "'";
            ResultSet rs = stmt.executeQuery(sql);
            int count = 0;
            while(rs.next()){
                count = count+1;
            }
            if(count == 1){
                Menu a= new Menu();
                a.setVisible(true);
                Biblioteca.RetornoLogin = login;
                Ler.RetornoLogin = login;
                this.dispose();
            }
            else
            {
                    JOptionPane.showMessageDialog(null, "Login ouy senha invalido.", "ERRO!", JOptionPane.ERROR_MESSAGE);
            }
            } catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
            }
    }//GEN-LAST:event_jButtonEntrarActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
 
       int exit=JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?");
       if(exit==0){
            JOptionPane.showMessageDialog(null, "Tenha um bom dia!");
        System.exit(0);
    }//GEN-LAST:event_jButton5ActionPerformed
    }/*
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
*/
      
       
    
    /*
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Inventory().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldLogin;
    private javax.swing.JTextField jTextFieldSenha;
    // End of variables declaration//GEN-END:variables
}
