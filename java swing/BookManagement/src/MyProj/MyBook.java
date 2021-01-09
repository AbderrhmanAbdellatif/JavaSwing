/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyProj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author tmtm6
 */
public class MyBook implements Book {

    private Connection con;

    public void connectedToDB() {

        String url = "jdbc:derby://localhost:1527/sample";
        try {
            con = DriverManager.getConnection(url, "app", "app");
        } catch (SQLException ex) {
            Logger.getLogger(MyBook.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void AddBook(int Id, String name, String Author, String publisher, int years, String Lang, int PRICE) {
        try {
            Statement s = con.createStatement();
            String q = "INSERT INTO APP.BOOK (ID, \"NAME\", AUTHOR, PUBLISHER, YEARS, \"LANGUAGE\", PRICE)"
                    + " VALUES (" + Id + ", '" + name + "', '" + Author + "', '" + publisher + "', " + years + ",'" + Lang + "'," + PRICE + ")";
            System.out.println(q);
            s.executeUpdate(q);
            JOptionPane.showMessageDialog(null, "insert successfully!!!");
        } catch (SQLIntegrityConstraintViolationException ex) {
            JOptionPane.showMessageDialog(null, "   Sorry There are some information at system please try another one ");

        } catch (SQLException ex) {
            Logger.getLogger(MyBook.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void DeleteBook(int id) {
        try {
            Statement s = con.createStatement();
            String q = "DELETE FROM APP.BOOK WHERE ID =" + id;
            System.out.println(q);
            int update = s.executeUpdate(q);
            System.out.println("update number : " + update);
            if (update == 0) {
                JOptionPane.showMessageDialog(null, "the book is not found");

            } else {
                JOptionPane.showMessageDialog(null, "Remove successfully !!!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(MyBook.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void UpdateBook(int id, String name, int years) {

        try {
            Statement s = con.createStatement();
            String q = "UPDATE APP.BOOK SET \"ID\" = " + id + ", \"NAME\" = '" + name + "', \"YEARS\" = " + years + " WHERE ID =" + id;
            System.out.println(q);
            int update = s.executeUpdate(q);
            System.out.println("update number : " + update);
            if (update == 0) {
                JOptionPane.showMessageDialog(null, " The book is not found");

            } else {
                JOptionPane.showMessageDialog(null, "Update  successfully !!!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(MyBook.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void UpdateBook(int id, int price) {

        try {
            Statement s = con.createStatement();
            String q = "UPDATE APP.BOOK SET \"ID\" = " + id + ", PRICE=" + price + " WHERE ID =" + id;
            System.out.println(q);
            int update = s.executeUpdate(q);
            System.out.println("update number : " + update);
            if (update == 0) {
                JOptionPane.showMessageDialog(null, " The book is not found");

            } else {
                JOptionPane.showMessageDialog(null, "Update  successfully !!!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(MyBook.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void UpdateBook(int id, String name) {

        try {
            Statement s = con.createStatement();
            String q = "UPDATE APP.BOOK SET \"ID\" = " + id + ", \"NAME\" = '" + name + "' WHERE ID =" + id;
            System.out.println(q);
            int update = s.executeUpdate(q);
            System.out.println("update number : " + update);
            if (update == 0) {
                JOptionPane.showMessageDialog(null, " The book is not found");

            } else {
                JOptionPane.showMessageDialog(null, "Update  successfully !!!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(MyBook.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void SearchBook(int id) {

        try {
            // TODO add your handling code here:
            Statement s = con.createStatement();
            String q = "SELECT * FROM APP.BOOK WHERE ID =" + id;

            System.out.println(q);
            ResultSet rs = s.executeQuery(q);
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "successfully  Found  Book ");

            } else {
                JOptionPane.showMessageDialog(null, "The book is not found !!!");

            }

        } catch (SQLException ex) {
            Logger.getLogger(MyBook.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void SearchBook(String name) {
        try {
            // TODO add your handling code here:
            Statement s = con.createStatement();
            String q = "SELECT * FROM APP.BOOK WHERE \"NAME\" ='" + name + "'";
            System.out.println(q);
            ResultSet rs = s.executeQuery(q);
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "successfully  Found  Book ");

            } else {
                JOptionPane.showMessageDialog(null, "The book is not found !!!");

            }

        } catch (SQLException ex) {
            Logger.getLogger(MyBook.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void ShowBook(int id) {
        try {
            // TODO add your handling code here:
            Statement s = con.createStatement();
            String q = "SELECT * FROM APP.BOOK WHERE ID =" + id;

            System.out.println(q);
            ResultSet rs = s.executeQuery(q);
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "successfully  Found  Book ");
                System.out.println(
                        rs.getString(1)
                        + " , " + rs.getString(2)
                        + " , " + rs.getString(3)
                        + "  , " + rs.getString(4)
                        + " ," + rs.getString(5)
                        + " ," + rs.getString(6)
                        + " ," + rs.getString(7)
                        + " ," + rs.getString(8));
            } else {
                JOptionPane.showMessageDialog(null, "The book is not found !!!");

            }

        } catch (SQLException ex) {
            Logger.getLogger(MyBook.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void showBooks() {
        try {
            // TODO add your handling code here:
            Statement s = con.createStatement();
            String q = "SELECT * FROM APP.BOOK ";
            System.out.println(q);
            ResultSet rs = s.executeQuery(q);
            while (rs.next()) {
                System.out.println(
                        rs.getString(1)
                        + " , " + rs.getString(2)
                        + " , " + rs.getString(3)
                        + "  , " + rs.getString(4)
                        + " ," + rs.getString(5)
                        + " ," + rs.getString(6)
                        + " ," + rs.getString(7)
                        + " ," + rs.getString(8)
                );
            }
        } catch (SQLException ex) {
            Logger.getLogger(MyBook.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void main(String[] args) {
        MyBook bookManagement = new MyBook();
        bookManagement.connectedToDB();
        //bookManagement.AddBook(6,"d","t","c", 4, "TR",400);
        //bookManagement.DeleteBook(6);
        // bookManagement.UpdateBook(6,"Abderrhman",1996);
        //bookManagement.UpdateBook(6, "aizen");
        //bookManagement.UpdateBook(1, 9000);
        //bookManagement.SearchBook(9);
        //bookManagement.SearchBook("A");
        //bookManagement.ShowBook(6);
        bookManagement.showBooks();

    }

}
