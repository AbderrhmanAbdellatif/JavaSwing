package sosyal.medya;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import static sosyal.medya.user1.postList1;
import static sosyal.medya.user1.postList11;
import static sosyal.medya.user3.postList3;

public class user2 extends javax.swing.JFrame {

    static ArrayList<String> postList2 = new ArrayList<String>();
    static ArrayList<String> postList22 = new ArrayList<String>();

    public user2() {

        initComponents();

    }
    user22 about = new user22();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jBtnAbout = new javax.swing.JButton();
        jBtnBiografy = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jBtnPosts = new javax.swing.JButton();
        jLableAbout3 = new javax.swing.JLabel();
        jLableAbout1 = new javax.swing.JLabel();
        jLableAbout2 = new javax.swing.JLabel();
        jLableAbout4 = new javax.swing.JLabel();
        jLableAbout5 = new javax.swing.JLabel();
        jLabelBiografy1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxtArea2 = new javax.swing.JTextArea();
        jBtnPost = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jBtnLogout2 = new javax.swing.JButton();
        jRadioBtnAli = new javax.swing.JRadioButton();
        jRadioBtnSadullah = new javax.swing.JRadioButton();
        jLabelPost2 = new javax.swing.JLabel();
        jLabelPost22 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 10));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sosyal/medya/samet-kaya2015-02-06-03-31-06pm2015-03-05-02-11-10pm.JPG"))); // NOI18N

        jBtnAbout.setText("About");
        jBtnAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAboutActionPerformed(evt);
            }
        });

        jBtnBiografy.setText("Biografy");
        jBtnBiografy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBiografyActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 51));
        jLabel4.setText("Arş. Gör. Samet KAYA");

        jBtnPosts.setText("Send messages");
        jBtnPosts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPostsActionPerformed(evt);
            }
        });

        jLableAbout3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLableAbout3.setForeground(new java.awt.Color(0, 0, 204));

        jLableAbout1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLableAbout1.setForeground(new java.awt.Color(0, 0, 204));

        jLableAbout2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLableAbout2.setForeground(new java.awt.Color(0, 0, 204));

        jLableAbout4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLableAbout4.setForeground(new java.awt.Color(0, 0, 204));

        jLableAbout5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLableAbout5.setForeground(new java.awt.Color(0, 0, 204));

        jLabelBiografy1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelBiografy1.setForeground(new java.awt.Color(153, 0, 153));

        jTxtArea2.setColumns(20);
        jTxtArea2.setRows(5);
        jScrollPane1.setViewportView(jTxtArea2);

        jBtnPost.setText("Send");
        jBtnPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPostActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Messages");

        jBtnLogout2.setText("Log out");
        jBtnLogout2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLogout2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioBtnAli);
        jRadioBtnAli.setText("Ali");
        jRadioBtnAli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBtnAliActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioBtnSadullah);
        jRadioBtnSadullah.setText("Sadullah");

        jLabelPost2.setText(" ");

        jLabelPost22.setText(" ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Switch to");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sellect profile", "Sadullah", "Samet", "Ali" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setText("Go");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jBtnAbout))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
                                .addComponent(jLableAbout1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLableAbout2, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLableAbout3, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLableAbout5, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLableAbout4, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBtnBiografy)
                        .addGap(287, 287, 287)
                        .addComponent(jBtnPosts))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelBiografy1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBtnPost)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPost2, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPost22, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 542, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioBtnAli)
                            .addComponent(jRadioBtnSadullah)))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jBtnLogout2)
                        .addGap(331, 331, 331)
                        .addComponent(jLabel6)
                        .addGap(24, 24, 24)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(422, 422, 422))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(469, 469, 469))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel2)
                        .addGap(10, 10, 10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel4)
                        .addGap(1, 1, 1)
                        .addComponent(jRadioBtnAli)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioBtnSadullah)
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtnBiografy)
                            .addComponent(jBtnAbout)
                            .addComponent(jBtnPosts))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLableAbout1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelBiografy1)
                                    .addComponent(jLableAbout2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLableAbout3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnPost))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabelPost2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelPost22, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 110, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLableAbout4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLableAbout5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtnLogout2)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton1)
                                .addComponent(jLabel6)))
                        .addContainerGap())))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("Profile 2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(504, 504, 504)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAboutActionPerformed

        jLableAbout1.setText("Isim: " + about.name);
        jLableAbout2.setText("Bölüm: " + about.bolum);
        jLableAbout3.setText("Email: " + about.email);
        jLableAbout4.setText("Fakülte:  " + about.fakulte);
        jLableAbout5.setText("Telefon: " + about.telefon);

    }//GEN-LAST:event_jBtnAboutActionPerformed

    private void jBtnBiografyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBiografyActionPerformed

        jLabelBiografy1.setText(about.biyografy1);


    }//GEN-LAST:event_jBtnBiografyActionPerformed

    private void jBtnPostsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPostsActionPerformed

    }//GEN-LAST:event_jBtnPostsActionPerformed

    private void jBtnPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPostActionPerformed

        if (jRadioBtnSadullah.isSelected()) {

            user1 msj = new user1();
            
            msj.jLabelPost11.setText("Ali : " + postList3.toString());

            postList2.add(jTxtArea2.getText());

            msj.jLabelPost1.setText("Samet : " + postList2.toString());
            msj.setVisible(true);
            this.setVisible(false);

        } else if (jRadioBtnAli.isSelected()) {

            user3 msj = new user3();

            msj.jLabelPost3.setText("Sado : " + postList11.toString());

            postList22.add(jTxtArea2.getText());

            msj.jLabelPost33.setText("Samet : " + postList22.toString());

            msj.setVisible(true);
            this.setVisible(false);

        } else {
            JOptionPane.showMessageDialog(this, "you must chose a preson first");

        }


    }//GEN-LAST:event_jBtnPostActionPerformed

    private void jBtnLogout2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLogout2ActionPerformed

        new login_System().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBtnLogout2ActionPerformed

    private void jRadioBtnAliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioBtnAliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioBtnAliActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jComboBox1.getSelectedItem().equals("Ali")) {
            new user3().setVisible(true);
            this.setVisible(false);

        } else if (jComboBox1.getSelectedItem().equals("Sadullah")) {
            new user1().setVisible(true);
            this.setVisible(false);
        } 
         else if (jComboBox1.getSelectedItem().equals("Samet")){
JOptionPane.showMessageDialog(this, "You are here now!");
        }
         else {
            JOptionPane.showMessageDialog(this, "Please sellect a profile");
        }
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
            java.util.logging.Logger.getLogger(user2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(user2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(user2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(user2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new user2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBtnAbout;
    private javax.swing.JButton jBtnBiografy;
    private javax.swing.JButton jBtnLogout2;
    private javax.swing.JButton jBtnPost;
    private javax.swing.JButton jBtnPosts;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelBiografy1;
    public static javax.swing.JLabel jLabelPost2;
    public static javax.swing.JLabel jLabelPost22;
    private javax.swing.JLabel jLableAbout1;
    private javax.swing.JLabel jLableAbout2;
    private javax.swing.JLabel jLableAbout3;
    private javax.swing.JLabel jLableAbout4;
    private javax.swing.JLabel jLableAbout5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioBtnAli;
    private javax.swing.JRadioButton jRadioBtnSadullah;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTxtArea2;
    // End of variables declaration//GEN-END:variables
}
