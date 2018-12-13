/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sosyal.medya;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author yusuf
 */
public class DataBase {

    public static Connection Connect() throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/test", "app", "app");
        return con;
    }

    public static boolean InsertProfile(String firstName, String lastName, String age, String biografy, String photo) throws SQLException {
        boolean result = false;
        Connection con = Connect();

        String sql = "INSERT INTO PROFILE  (firstname,surname,age,biografy,photo,username) values(?,?,?,?,?,?)";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, firstName);
        pst.setString(2, lastName);
        pst.setString(3, age);
        pst.setString(4, biografy);
        pst.setString(5, photo);
        pst.setString(6, login_System.username);
        pst.executeUpdate();
        result = true;

        return result;
    }

    public static boolean UpadteProfile(String firstName, String lastName, String age, String biografy, String photo) throws SQLException {
                boolean result = false;

        Connection con = Connect();
        Statement st = con.createStatement();
        String sql2 = "UPDATE Profile " + "SET firstname=?, surname=?, age=?,biografy=? , photo=? WHERE username='" + login_System.username + "'";
        PreparedStatement pst2 = con.prepareStatement(sql2);
        pst2.setString(1, firstName);
        pst2.setString(2, lastName);
        pst2.setString(3, age);
        pst2.setString(4, biografy);
        pst2.setString(5, photo);

        pst2.executeUpdate();
        return  result;
    }
}
