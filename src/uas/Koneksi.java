/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Azis Nurjaman
 */
public class Koneksi {
    private static Connection KD;
    public static Connection konek() throws SQLException{
        try{
            String DB  ="jdbc:mysql://localhost/kursus";
            String user="root";
            String pass="";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            KD = (Connection) DriverManager.getConnection(DB, user, pass);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Tidak ada koneksi", "Error", JOptionPane.INFORMATION_MESSAGE);
            System.err.println(e.getMessage());
            System.exit(0);
        }
        return KD;
    }
}
