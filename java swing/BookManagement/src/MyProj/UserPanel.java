/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyProj;

import static com.sun.xml.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tmtm6
 */
public final class UserPanel extends javax.swing.JFrame {

    ArrayList<String> BooksName = new ArrayList();
    Connection con;
    DefaultListModel defaultListModel = new DefaultListModel();
    DefaultTableModel defaultTableModel = new DefaultTableModel();
    MyBook myBook = new MyBook(con);
    FileWriter fileWriter = null;
    BufferedWriter bufferedWriter = null;
    Scanner scanner = null;
    FileReader fileReader = null;
    BufferedReader bufferedReader = null;

    /**
     * Creates new form UserPanel
     */
    public UserPanel() {
        initComponents();
        this.setLocationRelativeTo(this);
        String url = "jdbc:derby://localhost:1527/sample";
        try {
            con = DriverManager.getConnection(url, "app", "app");
        } catch (SQLException ex) {
            Logger.getLogger(Long.class.getName()).log(Level.SEVERE, null, ex);
        }
        NameOFuser.setText(GetNameOfUser(Login.IDUser));
        MyBookList.setModel(defaultListModel);
        BooksName = myBook.ShowBook();
        BooksName.forEach((Booklist) -> {
            defaultListModel.addElement(Booklist);
        });
        defaultTableModel.setColumnIdentifiers(new Object[]{"ID", "NAME", "AUTHOR", "PUBLISHER", "YEARS", "LANGUAGE", "PRICE"});
        BookTable.setModel(defaultTableModel);
    }

    public String GetNameOfUser(int id) {
        try {
            // TODO add your handling code here:
            Statement s = con.createStatement();
            String q = "SELECT \"NAME\" FROM APP.USERS where ID=" + id;
            System.out.println(q);
            ResultSet rs = s.executeQuery(q);
            while (rs.next()) {
                return "Welcome : " + rs.getString("NAME");

            }
        } catch (SQLException ex) {
            Logger.getLogger(MyBook.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     *
     * @param Userid
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        NameOFuser = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        MyBookList = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        BookTable = new javax.swing.JTable();
        showTheBook = new javax.swing.JButton();
        PriceSilder = new javax.swing.JSlider();
        PriceButton = new javax.swing.JButton();
        AR = new javax.swing.JRadioButton();
        EN = new javax.swing.JRadioButton();
        TR = new javax.swing.JRadioButton();
        LanButton = new javax.swing.JButton();
        silderShown = new javax.swing.JLabel();
        AuthorNameText = new javax.swing.JTextField();
        AuthorName = new javax.swing.JButton();
        PrintFile = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtdosya = new javax.swing.JTextField();
        printAllInformation = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        NameOFuser.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NameOFuser.setForeground(new java.awt.Color(0, 51, 204));

        jButton1.setText("<<");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyProj/read-books-that-you-enjoy.jpg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Available books");

        MyBookList.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        MyBookList.setForeground(new java.awt.Color(0, 153, 204));
        MyBookList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(MyBookList);

        BookTable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BookTable.setForeground(new java.awt.Color(0, 102, 255));
        BookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(BookTable);

        showTheBook.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        showTheBook.setText("Chose");
        showTheBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showTheBookActionPerformed(evt);
            }
        });

        PriceSilder.setMaximum(1000);
        PriceSilder.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                PriceSilderStateChanged(evt);
            }
        });

        PriceButton.setText("Show With Price");
        PriceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(AR);
        AR.setText("Arabic");

        buttonGroup1.add(EN);
        EN.setText("English");

        buttonGroup1.add(TR);
        TR.setText("Turkish");

        LanButton.setText("Show With Lanagude");
        LanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LanButtonActionPerformed(evt);
            }
        });

        AuthorName.setText("Author");
        AuthorName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AuthorNameActionPerformed(evt);
            }
        });

        PrintFile.setText("Print Selected Book");
        PrintFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintFileActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 255));
        jLabel3.setText("Name Of File");

        printAllInformation.setText("Print All Informations");
        printAllInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printAllInformationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(361, 361, 361)
                .addComponent(NameOFuser, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(785, 785, 785)
                                .addComponent(PriceButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(735, 735, 735)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(AR)
                                        .addGap(26, 26, 26)
                                        .addComponent(EN)
                                        .addGap(18, 18, 18)
                                        .addComponent(TR))
                                    .addComponent(PriceSilder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(809, 809, 809)
                                .addComponent(silderShown, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(153, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(showTheBook, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(AuthorNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)
                                        .addComponent(AuthorName))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(111, 111, 111)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(LanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtdosya, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PrintFile, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(printAllInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NameOFuser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(showTheBook)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AuthorNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AuthorName))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(silderShown, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PriceSilder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PriceButton)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AR)
                            .addComponent(EN)
                            .addComponent(TR))
                        .addGap(18, 18, 18)
                        .addComponent(LanButton)
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtdosya, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PrintFile)
                        .addGap(33, 33, 33)
                        .addComponent(printAllInformation)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void showTheBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showTheBookActionPerformed
        // TODO add your handling code here:
        defaultTableModel.setRowCount(0);
        try {
            // TODO add your handling code here:
            Statement s = con.createStatement();
            String q = "SELECT * FROM APP.BOOK WHERE \"NAME\"='" + MyBookList.getSelectedValue() + "'";
            System.out.println(q);
            ResultSet rs = s.executeQuery(q);
            if (rs.next()) {
                defaultTableModel.addRow(new Object[]{rs.getString("ID"), rs.getString("NAME"), rs.getString("AUTHOR"), rs.getString("PUBLISHER"), rs.getString("YEARS"), rs.getString("LANGUAGE"), rs.getString("PRICE")});
            } else {
                JOptionPane.showMessageDialog(null, "The book is not found !!!");
            }

        } catch (SQLException ex) {
            Logger.getLogger(MyBook.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_showTheBookActionPerformed

    private void PriceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceButtonActionPerformed
        try {
            // TODO add your handling code here:
            defaultTableModel.setRowCount(0);
            String q = "SELECT * FROM APP.BOOK WHERE PRICE<" + PriceSilder.getValue();
            Statement s = con.createStatement();
            System.out.println(q);
            ResultSet rs = s.executeQuery(q);
            while (rs.next()) {
                defaultTableModel.addRow(new Object[]{rs.getString("ID"), rs.getString("NAME"), rs.getString("AUTHOR"), rs.getString("PUBLISHER"), rs.getString("YEARS"), rs.getString("LANGUAGE"), rs.getString("PRICE")});

            }

        } catch (SQLException ex) {
            Logger.getLogger(UserPanel.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_PriceButtonActionPerformed

    private void PriceSilderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_PriceSilderStateChanged
        // TODO add your handling code here:
        silderShown.setText(String.valueOf(PriceSilder.getValue()));
    }//GEN-LAST:event_PriceSilderStateChanged

    private void LanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LanButtonActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            defaultTableModel.setRowCount(0);
            String Lang;
            if (AR.isSelected()) {
                Lang = "Arabic";
            } else if (TR.isSelected()) {
                Lang = "Turkish";
            } else {
                Lang = "English";
            }
            String q = "SELECT * FROM APP.BOOK WHERE \"LANGUAGE\"='" + Lang + "'";
            Statement s = con.createStatement();
            System.out.println(q);
            ResultSet rs = s.executeQuery(q);
            while (rs.next()) {
                defaultTableModel.addRow(new Object[]{rs.getString("ID"), rs.getString("NAME"), rs.getString("AUTHOR"), rs.getString("PUBLISHER"), rs.getString("YEARS"), rs.getString("LANGUAGE"), rs.getString("PRICE")});

            }

        } catch (SQLException ex) {
            Logger.getLogger(UserPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_LanButtonActionPerformed

    private void AuthorNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AuthorNameActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            defaultTableModel.setRowCount(0);
            String q = "SELECT * FROM APP.BOOK WHERE AUTHOR='" + AuthorNameText.getText() + "'";
            Statement s = con.createStatement();
            System.out.println(q);
            ResultSet rs = s.executeQuery(q);
            while (rs.next()) {
                defaultTableModel.addRow(new Object[]{rs.getString("ID"), rs.getString("NAME"), rs.getString("AUTHOR"), rs.getString("PUBLISHER"), rs.getString("YEARS"), rs.getString("LANGUAGE"), rs.getString("PRICE")});

            }

        } catch (SQLException ex) {
            Logger.getLogger(UserPanel.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_AuthorNameActionPerformed

    private void PrintFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintFileActionPerformed
        // TODO add your handling code here:

        try {
            // TODO add your handling code here:
            if (txtdosya.getText().equals("") || txtdosya.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please Don't leave this empty ");
            } else {
                fileWriter = new FileWriter(txtdosya.getText() + ".txt");
                bufferedWriter = new BufferedWriter(fileWriter);
                for (int i = 0; i < BookTable.getColumnCount(); i++) {
                    bufferedWriter.write(BookTable.getColumnName(i));
                    bufferedWriter.write("\t");
                }
                for (int i = 0; i < BookTable.getRowCount(); i++) {
                    bufferedWriter.newLine();
                    for (int j = 0; j < BookTable.getColumnCount(); j++) {
                        bufferedWriter.write(String.valueOf(BookTable.getValueAt(i, j)));
                        bufferedWriter.write("\t");
                    }
                    bufferedWriter.flush();
                    bufferedWriter.close();
                    fileWriter.close();
                    JOptionPane.showMessageDialog(this, txtdosya.getText() + " File has been printed");
                }

                txtdosya.setText(null);
            }
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_PrintFileActionPerformed

    private void printAllInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printAllInformationActionPerformed
        PrintWriter os = null;
        try {
            // TODO add your handling code here:
            File file = new File("AllBooksinformations.txt");
            os = new PrintWriter(file);
            os.println("");
            for (int col = 0; col < BookTable.getColumnCount(); col++) {
                os.print(BookTable.getColumnName(col) + "\t");
            }
            os.println("");
            os.println("");
            for (int row = 0; row < BookTable.getRowCount(); row++) {
                for (int col = 0; col < BookTable.getColumnCount(); col++) {
                    //os.print(BookTable.getColumnName(col));
                    os.print(BookTable.getValueAt(row, col) + "\t");
                }
                os.println(" ");

            }
            os.close();
            System.out.println("Done!");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(UserPanel.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            os.close();
        }


    }//GEN-LAST:event_printAllInformationActionPerformed

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
            java.util.logging.Logger.getLogger(UserPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton AR;
    private javax.swing.JButton AuthorName;
    private javax.swing.JTextField AuthorNameText;
    private javax.swing.JTable BookTable;
    private javax.swing.JRadioButton EN;
    private javax.swing.JButton LanButton;
    private javax.swing.JList<String> MyBookList;
    private javax.swing.JLabel NameOFuser;
    private javax.swing.JButton PriceButton;
    private javax.swing.JSlider PriceSilder;
    private javax.swing.JButton PrintFile;
    private javax.swing.JRadioButton TR;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton printAllInformation;
    private javax.swing.JButton showTheBook;
    private javax.swing.JLabel silderShown;
    private javax.swing.JTextField txtdosya;
    // End of variables declaration//GEN-END:variables
}
