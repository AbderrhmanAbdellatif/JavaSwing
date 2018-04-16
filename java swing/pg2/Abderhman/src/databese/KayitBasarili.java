package databese;



import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Destan
 */
public class KayitBasarili extends javax.swing.JFrame {
    ImageIcon resim = new ImageIcon("Yeşilİkon.jpg");
    /**
     * Creates new form KayitBasarili
     */
    public KayitBasarili() {
        initComponents();
        jLabel2.setIcon(resim);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kayıtGerceklesti = new javax.swing.JLabel();
        yonlendirme = new javax.swing.JLabel();
        tesekkuler = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        kayıtGerceklesti.setForeground(new java.awt.Color(255, 51, 51));
        kayıtGerceklesti.setText("Your appointment was made");
        getContentPane().add(kayıtGerceklesti);
        kayıtGerceklesti.setBounds(110, 50, 190, 14);

        yonlendirme.setForeground(new java.awt.Color(0, 51, 51));
        yonlendirme.setText("Yönlendiriliyorsunuz...");
        getContentPane().add(yonlendirme);
        yonlendirme.setBounds(120, 70, 220, 14);

        tesekkuler.setForeground(new java.awt.Color(102, 0, 51));
        tesekkuler.setText("Teşekkür Ederiz...");
        getContentPane().add(tesekkuler);
        tesekkuler.setBounds(220, 120, 130, 14);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 340, 150);

        setSize(new java.awt.Dimension(354, 186));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:7
        try {
            Thread.sleep(1000);
            this.setVisible(false);
            new Hastahane().setVisible(true);
        } catch (InterruptedException ex) {
        }
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(KayitBasarili.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KayitBasarili.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KayitBasarili.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KayitBasarili.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KayitBasarili().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel kayıtGerceklesti;
    private javax.swing.JLabel tesekkuler;
    private javax.swing.JLabel yonlendirme;
    // End of variables declaration//GEN-END:variables
}
