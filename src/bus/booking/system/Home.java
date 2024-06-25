/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bus.booking.system;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Sanidhya Singh
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        
        ImageIcon icon = new ImageIcon(getClass().getResource("/Image/image.jpg"));
        Image show = icon.getImage();
        Image showscl = show.getScaledInstance(img.getWidth(), img.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon sclit = new ImageIcon(showscl);
        img.setIcon(sclit);
        
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        kButton1 = new com.k33ptoo.components.KButton();
        img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Mongolian Baiti", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("The");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 90, 80, 40);

        jLabel5.setFont(new java.awt.Font("Mongolian Baiti", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 153));
        jLabel5.setText("egins");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 180, 120, 40);

        jLabel6.setFont(new java.awt.Font("Ink Free", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 0));
        jLabel6.setText("Step ...............");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 250, 160, 30);

        jLabel7.setFont(new java.awt.Font("Ink Free", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("of  a");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 130, 60, 30);

        jLabel9.setFont(new java.awt.Font("Mongolian Baiti", 1, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("B");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 180, 40, 40);

        jLabel10.setFont(new java.awt.Font("Ink Free", 3, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 0, 153));
        jLabel10.setText("Thousands  miles >>>");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(50, 130, 240, 30);

        jLabel11.setFont(new java.awt.Font("Mongolian Baiti", 1, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 204, 153));
        jLabel11.setText("Journey");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(90, 90, 170, 40);

        jLabel12.setFont(new java.awt.Font("Ink Free", 3, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 51, 51));
        jLabel12.setText("Book your tickets here");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(300, 380, 150, 30);

        jLabel13.setFont(new java.awt.Font("Ink Free", 3, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("with");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(10, 220, 60, 30);

        jLabel3.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 0));
        jLabel3.setText("Rizzo Travels");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(570, 0, 140, 20);

        jLabel14.setFont(new java.awt.Font("Ink Free", 3, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 102, 255));
        jLabel14.setText("a  Single");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(70, 220, 100, 30);

        kButton1.setText("BOOK");
        kButton1.setkBorderRadius(30);
        kButton1.setkEndColor(new java.awt.Color(0, 153, 204));
        kButton1.setkHoverForeGround(new java.awt.Color(242, 242, 242));
        kButton1.setkHoverStartColor(new java.awt.Color(255, 0, 102));
        kButton1.setkStartColor(new java.awt.Color(204, 0, 0));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(kButton1);
        kButton1.setBounds(290, 400, 170, 30);

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/image.jpg"))); // NOI18N
        img.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        getContentPane().add(img);
        img.setBounds(0, 0, 710, 500);

        setSize(new java.awt.Dimension(724, 505));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        Login n=new Login();
        n.show();
        dispose();
    }//GEN-LAST:event_kButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel img;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private com.k33ptoo.components.KButton kButton1;
    // End of variables declaration//GEN-END:variables
}