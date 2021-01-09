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
    public void AddBook(int Id, String name, String Author, String publisher, int years, String Lang) {
        try {
            Statement s = con.createStatement();
            String q = "INSERT INTO APP.BOOK (ID, \"NAME\", AUTHOR, PUBLISHER, YEARS, \"LANGUAGE\")"
                    + " VALUES (" + Id + ", '" + name + "', '" + Author + "', '" + publisher + "', " + years + ",'" + Lang + "')";
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
            String q = "DELETE FROM APP.BOOK WHERE ID = " + id;
            System.out.println(q);
            ResultSet rs = s.executeQuery(q);
            System.out.println(rs.next());
            if (rs.next()) {
                s.executeUpdate(q);
                JOptionPane.showMessageDialog(null, "Remove successfully !!!");
            } else {
                JOptionPane.showMessageDialog(null, " this  book is not found!");

            }
        } catch (SQLException ex) {
            Logger.getLogger(MyBook.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void UpdateBook(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void UpdateBook(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void SearchBook(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void SearchBook(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ShowBook(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showBooks() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void main(String[] args) {
        MyBook bookManagement = new MyBook();
        bookManagement.connectedToDB();
        //bookManagement.AddBook(6,"d","t","c", 4, "TR");
        bookManagement.DeleteBook(3);
    }
}
