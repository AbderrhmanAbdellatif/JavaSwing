package sosyal.medya;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Profile extends javax.swing.JFrame {

    int sayacAbout = 0;
    int sayacPosts = 0;

    public Profile() {
        initComponents();
        jLabelName.setText(login_System.username);
        try {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/test", "app", "app");

            Statement st = con.createStatement();
            String sql2 = "SELECT * FROM POST WHERE USERNAME='" + login_System.username + "'";
            ResultSet rs2 = st.executeQuery(sql2);
            String newLine = "\n";

            while (rs2.next()) {
                jTxtAreaPost.append(rs2.getString("date") + "  " + rs2.getString("post") + newLine);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Profile.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelWelcome = new javax.swing.JLabel();
        jBtnAbout = new javax.swing.JButton();
        jBtnPosts = new javax.swing.JButton();
        jLabelAboutName = new javax.swing.JLabel();
        jLabelPhoto = new javax.swing.JLabel();
        jLabelAboutInformation = new javax.swing.JLabel();
        jTxtPost = new javax.swing.JTextField();
        jLabelMind = new javax.swing.JLabel();
        jLabelChar = new javax.swing.JLabel();
        jBtnSend = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxtAreaPost = new javax.swing.JTextArea();
        jLabelPosts = new javax.swing.JLabel();
        jLabelAboutAge = new javax.swing.JLabel();
        jLabelAboutBiografy = new javax.swing.JLabel();
        jBtnAbout1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListSuggested = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListFollowing = new javax.swing.JList();
        jLabelMind1 = new javax.swing.JLabel();
        jLabelMind2 = new javax.swing.JLabel();
        jBtnSend1 = new javax.swing.JButton();
        jBtnFollow = new javax.swing.JButton();
        jBtnPosts1 = new javax.swing.JButton();
        jLabelName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelWelcome.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelWelcome.setText("Welcome ");

        jBtnAbout.setText("About");
        jBtnAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAboutActionPerformed(evt);
            }
        });

        jBtnPosts.setText("Posts");
        jBtnPosts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPostsActionPerformed(evt);
            }
        });

        jLabelAboutName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelAboutName.setForeground(new java.awt.Color(102, 51, 255));

        jLabelAboutInformation.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelAboutInformation.setForeground(new java.awt.Color(102, 51, 255));

        jLabelMind.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelMind.setText("Whats in your mind ?");

        jLabelChar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelChar.setText("Macsimom 100 char");

        jBtnSend.setText("Send");
        jBtnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSendActionPerformed(evt);
            }
        });

        jTxtAreaPost.setColumns(20);
        jTxtAreaPost.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jTxtAreaPost.setForeground(new java.awt.Color(204, 0, 0));
        jTxtAreaPost.setRows(5);
        jScrollPane1.setViewportView(jTxtAreaPost);

        jLabelPosts.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelPosts.setForeground(new java.awt.Color(0, 102, 0));
        jLabelPosts.setText("Your posts");

        jLabelAboutAge.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelAboutAge.setForeground(new java.awt.Color(102, 51, 255));

        jLabelAboutBiografy.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelAboutBiografy.setForeground(new java.awt.Color(102, 51, 255));

        jBtnAbout1.setText("Update profile");
        jBtnAbout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAbout1ActionPerformed(evt);
            }
        });

        jListSuggested.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jListSuggested.setForeground(new java.awt.Color(255, 0, 51));
        jScrollPane2.setViewportView(jListSuggested);

        jListFollowing.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jListFollowing.setForeground(new java.awt.Color(0, 0, 204));
        jScrollPane3.setViewportView(jListFollowing);

        jLabelMind1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelMind1.setText("Suggested to follow");

        jLabelMind2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelMind2.setText("People you following");

        jBtnSend1.setText("Show");
        jBtnSend1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSend1ActionPerformed(evt);
            }
        });

        jBtnFollow.setText("Follow");
        jBtnFollow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnFollowActionPerformed(evt);
            }
        });

        jBtnPosts1.setText("Chat");
        jBtnPosts1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPosts1ActionPerformed(evt);
            }
        });

        jLabelName.setFont(new java.awt.Font("Adobe Arabic", 3, 48)); // NOI18N
        jLabelName.setForeground(new java.awt.Color(0, 0, 204));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jBtnAbout)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBtnSend1)
                                .addGap(37, 37, 37))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(213, 213, 213)
                                .addComponent(jBtnAbout1)
                                .addGap(69, 69, 69)
                                .addComponent(jLabelWelcome)
                                .addGap(55, 55, 55)
                                .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelMind1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jBtnFollow)
                                    .addComponent(jBtnPosts1))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelMind2))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelMind, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelChar, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPosts)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTxtPost, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jBtnSend))
                                .addComponent(jScrollPane1)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnPosts)
                        .addGap(648, 648, 648))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAboutInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAboutName, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabelAboutBiografy, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelAboutAge, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabelPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1134, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnAbout1)
                    .addComponent(jLabelWelcome)
                    .addComponent(jLabelName))
                .addGap(34, 34, 34)
                .addComponent(jBtnSend1)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnAbout)
                    .addComponent(jBtnPosts)
                    .addComponent(jBtnPosts1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelMind)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelChar))
                    .addComponent(jLabelAboutName, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTxtPost, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBtnSend)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabelAboutAge, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelAboutBiografy, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelAboutInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabelPosts)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMind1)
                    .addComponent(jLabelMind2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jBtnFollow))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabelPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(370, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAboutActionPerformed
        if (jBtnAbout.getModel().isArmed()) {
            sayacAbout++;

        }

        if (sayacAbout % 2 != 0) {
            jLabelAboutName.setVisible(true);
            jLabelAboutAge.setVisible(true);
            jLabelAboutBiografy.setVisible(true);

        } else if (sayacAbout % 2 == 0) {
            jLabelAboutName.setVisible(false);
            jLabelAboutAge.setVisible(false);
            jLabelAboutBiografy.setVisible(false);
        }
        try {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/test", "app", "app");
            Statement st;
            st = con.createStatement();
            String sql = "SELECT * FROM PROFILE where username='" + login_System.username + "'";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                jLabelAboutName.setText("Name :  " + rs.getString("firstname") + " " + rs.getString("surname"));
                jLabelAboutAge.setText("Age :  " + rs.getString("age"));
                jLabelAboutBiografy.setText("Biografy :  " + rs.getString("biografy"));
                ImageIcon pic = new ImageIcon(rs.getString("photo"));
                jLabelPhoto.setIcon(pic);

            }

        } catch (SQLException ex) {
            Logger.getLogger(Profile.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());

        }

//            jLabelAboutName.setText("Name :  " + Profile.names.toString());
//            jLabelAboutInformation.setText(Profile.information.toString());

    }//GEN-LAST:event_jBtnAboutActionPerformed

    private void jBtnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSendActionPerformed

        try {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/test", "app", "app");
            Statement st;
            st = con.createStatement();
            //insert into post
            String sql = "insert into post (username,post,date) values(?,?,?)";
            DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm");
            Date dateobj = new Date();

            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, login_System.username);
            pst.setString(2, jTxtPost.getText());
            pst.setString(3, df.format(dateobj));

            pst.executeUpdate();

            // put in the txtArea
            String newline = "\n";

            jTxtAreaPost.append(df.format(dateobj) + "  " + jTxtPost.getText() + newline);
            jTxtPost.setText(null);

        } catch (SQLException ex) {
            Logger.getLogger(Profile.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());

        }

//
//
//        jTextArea1.append(df.format(dateobj) + "  " + jTxtPost.getText() + newline);
//
//        jTextField1.setText(null);

    }//GEN-LAST:event_jBtnSendActionPerformed

    private void jBtnPostsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPostsActionPerformed
        if (jBtnPosts.getModel().isArmed()) {
            sayacPosts++;
        }

        if (sayacPosts % 2 != 0) {
            jTxtPost.setVisible(true);
            jTxtAreaPost.setVisible(true);
            jLabelMind.setVisible(true);
            jLabelChar.setVisible(true);
            jLabelPosts.setVisible(true);
            jBtnSend.setVisible(true);
            jScrollPane1.setVisible(true);

        } else if (sayacPosts % 2 == 0) {
            jTxtPost.setVisible(false);
            jTxtAreaPost.setVisible(false);
            jLabelMind.setVisible(false);
            jLabelChar.setVisible(false);
            jLabelPosts.setVisible(false);
            jBtnSend.setVisible(false);
            jScrollPane1.setVisible(false);

        }

    }
    /*
}    }//GEN-LAST:event_jBtnPostsActionPerformed
*/
    private void jBtnAbout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAbout1ActionPerformed
        new newProfile(login_System.username).setVisible(true);
//        this.setVisible(false);
    }//GEN-LAST:event_jBtnAbout1ActionPerformed

    private void jBtnSend1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSend1ActionPerformed
        try {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/test", "app", "app");

            Statement st = con.createStatement();
            String sql2 = "SELECT * FROM PROFILE";
            ResultSet rs2 = st.executeQuery(sql2);
            //insert into suggested
                       DefaultListModel model = new DefaultListModel();

            while (rs2.next()) //go through each row that your query returns
            {
                String itemCode = rs2.getString("username"); //get the element in column "item_code"

                model.addElement(itemCode); //add each item to the model

                model.removeElement(login_System.username);

            }
            jListSuggested.setModel(model);

//
//            rs2.close();
//            st.close();
//            //sinsert into following
            String sql = "SELECT * FROM FRIEND WHERE username='" + login_System.username + "'";
            ResultSet rs = st.executeQuery(sql);
            DefaultListModel model2 = new DefaultListModel();
            while (rs.next()) {
                // why the should be insinde !!!
                String friend = rs.getString("FRIEND");

                model2.addElement(friend);
                model.removeElement(friend);

            }
            jListFollowing.setModel(model2);
                        jListSuggested.setModel(model);


        } catch (SQLException ex) {
            Logger.getLogger(Profile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBtnSend1ActionPerformed

    private void jBtnFollowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnFollowActionPerformed

        try {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/test", "app", "app");

            //insert
            String sql2 = "insert into FRIEND" + "(username,FRIEND)" + "values(?,?)";
            PreparedStatement pst = con.prepareStatement(sql2);
            String item = jListSuggested.getSelectedValue().toString();
            pst.setString(1, login_System.username);
            pst.setString(2, item);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Done, now you are following " + item);
            
            
            //sinsert into following
//            String sql = "SELECT * FROM FRIEND WHERE username='" + login_System.username + "'";
//                        Statement st = con.createStatement();
//
//            ResultSet rs = st.executeQuery(sql);
//                        DefaultListModel model = new DefaultListModel();
//
//            DefaultListModel model2 = new DefaultListModel();
//            while (rs.next()) {
//                // why the should be insinde !!!
//                String friend = rs.getString("FRIEND");
//
//                model2.addElement(friend);
//           model.removeElement(friend);
//
//            }
//            jListFollowing.setModel(model2);
//                     jListSuggested.setModel(model);
                        

        } catch (SQLException e) {
            Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }//GEN-LAST:event_jBtnFollowActionPerformed

    private void jBtnPosts1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPosts1ActionPerformed
        new message().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBtnPosts1ActionPerformed

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
            java.util.logging.Logger.getLogger(Profile.class
                    .getName()
            ).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profile.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profile.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profile.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAbout;
    private javax.swing.JButton jBtnAbout1;
    private javax.swing.JButton jBtnFollow;
    private javax.swing.JButton jBtnPosts;
    private javax.swing.JButton jBtnPosts1;
    private javax.swing.JButton jBtnSend;
    private javax.swing.JButton jBtnSend1;
    private javax.swing.JLabel jLabelAboutAge;
    private javax.swing.JLabel jLabelAboutBiografy;
    private javax.swing.JLabel jLabelAboutInformation;
    private javax.swing.JLabel jLabelAboutName;
    private javax.swing.JLabel jLabelChar;
    private javax.swing.JLabel jLabelMind;
    private javax.swing.JLabel jLabelMind1;
    private javax.swing.JLabel jLabelMind2;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelPhoto;
    private javax.swing.JLabel jLabelPosts;
    private javax.swing.JLabel jLabelWelcome;
    private javax.swing.JList jListFollowing;
    private javax.swing.JList jListSuggested;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTxtAreaPost;
    private javax.swing.JTextField jTxtPost;
    // End of variables declaration//GEN-END:variables
}
