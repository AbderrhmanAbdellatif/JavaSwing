package sosyal.medya;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import static sosyal.medya.user1.postList1;
import static sosyal.medya.user1.postList11;
import static sosyal.medya.user2.postList2;

public class user3 extends javax.swing.JFrame {

    static ArrayList<String> postList3 = new ArrayList<String>();
    static ArrayList<String> postList33 = new ArrayList<String>();
    

    public user3() {
        initComponents();

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jLabelBiografy2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxtArea3 = new javax.swing.JTextArea();
        jBtnPost = new javax.swing.JButton();
        postLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jBtnLogout1 = new javax.swing.JButton();
        jRadioBtnSadullah = new javax.swing.JRadioButton();
        jRadioBtnSamet = new javax.swing.JRadioButton();
        jBtnLogout2 = new javax.swing.JButton();
        jLabelPost33 = new javax.swing.JLabel();
        jLabelPost3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 10));
        jPanel1.setPreferredSize(new java.awt.Dimension(1262, 599));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sosyal/medya/anizam-foto2015-03-06-08-03-35am.jpg"))); // NOI18N

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
        jLabel4.setText("Dr. Ali NİZAM");

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

        jLabelBiografy2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelBiografy2.setForeground(new java.awt.Color(153, 0, 153));

        jTxtArea3.setColumns(20);
        jTxtArea3.setRows(5);
        jScrollPane1.setViewportView(jTxtArea3);

        jBtnPost.setText("Send");
        jBtnPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPostActionPerformed(evt);
            }
        });

        postLabel2.setText(" ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Messages");

        jBtnLogout1.setText("Log out");
        jBtnLogout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLogout1ActionPerformed(evt);
            }
        });

        jRadioBtnSadullah.setText("Sadullah");

        jRadioBtnSamet.setText("Samet");
        jRadioBtnSamet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBtnSametActionPerformed(evt);
            }
        });

        jBtnLogout2.setText("Log out");
        jBtnLogout2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLogout2ActionPerformed(evt);
            }
        });

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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jBtnAbout)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLableAbout2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLableAbout1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLableAbout3, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLableAbout4, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLableAbout5, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBtnLogout1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabelBiografy1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                .addComponent(jLabelBiografy2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(jBtnLogout2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(postLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jBtnPost)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jBtnPosts))
                        .addGap(477, 477, 477))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioBtnSadullah)
                            .addComponent(jRadioBtnSamet))
                        .addGap(578, 578, 578))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtnBiografy)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(283, 283, 283)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(24, 24, 24)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(57, 57, 57)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelPost3, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelPost33, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(431, 431, 431)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(jLabel2)
                                .addGap(10, 10, 10))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jRadioBtnSadullah)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jRadioBtnSamet)
                                    .addGap(18, 18, 18)
                                    .addComponent(jBtnPosts)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(23, 23, 23)
                                    .addComponent(jLabel4)
                                    .addGap(127, 127, 127)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jBtnBiografy)
                                        .addComponent(jBtnAbout))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLableAbout1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelBiografy1)
                                    .addComponent(jLableAbout2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelBiografy2)
                                    .addComponent(jLableAbout3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLableAbout4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBtnPost)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelPost3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(3, 3, 3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLableAbout5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton1)
                                .addComponent(jLabel6))
                            .addComponent(jBtnLogout2))
                        .addGap(57, 57, 57)
                        .addComponent(jBtnLogout1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelPost33, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(postLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("Profile 3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(539, 539, 539)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1121, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnLogout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLogout1ActionPerformed

        new login_System().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBtnLogout1ActionPerformed

    private void jBtnPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPostActionPerformed

        if (jRadioBtnSadullah.isSelected()) {

            user1 msj = new user1();

            msj.jLabelPost1.setText("Samet : " + postList2.toString());

            postList3.add(jTxtArea3.getText());

            msj.jLabelPost11.setText("Ali : " + postList3.toString());
            msj.setVisible(true);
            this.setVisible(false);

        } else if (jRadioBtnSamet.isSelected()) {

            user2 msj = new user2();

            msj.jLabelPost2.setText("Sado : " + postList1.toString());

            postList33.add(jTxtArea3.getText());

            msj.jLabelPost22.setText("Ali : " + postList33.toString());

            msj.setVisible(true);
            this.setVisible(false);

        } else {
            JOptionPane.showMessageDialog(this, "you must chose a preson first");

        }


    }//GEN-LAST:event_jBtnPostActionPerformed

    private void jBtnPostsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPostsActionPerformed

    }//GEN-LAST:event_jBtnPostsActionPerformed

    private void jBtnBiografyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBiografyActionPerformed

        user33 biografy = new user33();

        jLabelBiografy1.setText(biografy.biyografy1);
        jLabelBiografy2.setText(biografy.biografy2);
    }//GEN-LAST:event_jBtnBiografyActionPerformed

    private void jBtnAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAboutActionPerformed

        user33 about = new user33();

        jLableAbout1.setText("Isim: " + about.name);
        jLableAbout2.setText("Bölüm: " + about.bolum);
        jLableAbout3.setText("Email: " + about.email);
        jLableAbout4.setText("Fakülte:  " + about.fakulte);
        jLableAbout5.setText("Telefon: " + about.telefon);
    }//GEN-LAST:event_jBtnAboutActionPerformed

    private void jRadioBtnSametActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioBtnSametActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioBtnSametActionPerformed

    private void jBtnLogout2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLogout2ActionPerformed

        new login_System().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBtnLogout2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jComboBox1.getSelectedItem().equals("Sadullah")) {
            new user1().setVisible(true);
            this.setVisible(false);

        } else if (jComboBox1.getSelectedItem().equals("Samet")) {
            new user2().setVisible(true);
            this.setVisible(false);
        } else if (jComboBox1.getSelectedItem().equals("Ali")){
JOptionPane.showMessageDialog(this, "You are here now!");
        } else {
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
            java.util.logging.Logger.getLogger(user3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(user3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(user3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(user3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new user3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAbout;
    private javax.swing.JButton jBtnBiografy;
    private javax.swing.JButton jBtnLogout1;
    private javax.swing.JButton jBtnLogout2;
    public static javax.swing.JButton jBtnPost;
    private javax.swing.JButton jBtnPosts;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelBiografy1;
    private javax.swing.JLabel jLabelBiografy2;
    public javax.swing.JLabel jLabelPost3;
    public javax.swing.JLabel jLabelPost33;
    private javax.swing.JLabel jLableAbout1;
    private javax.swing.JLabel jLableAbout2;
    private javax.swing.JLabel jLableAbout3;
    private javax.swing.JLabel jLableAbout4;
    private javax.swing.JLabel jLableAbout5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioBtnSadullah;
    private javax.swing.JRadioButton jRadioBtnSamet;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTxtArea3;
    private javax.swing.JLabel postLabel2;
    // End of variables declaration//GEN-END:variables
}
