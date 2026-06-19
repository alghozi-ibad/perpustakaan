/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanpbo;

import com.mysql.jdbc.Connection;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.SQLException;


/**
 *
 * @author Ayu Dwi
 */

public class koneksi {
 static Connection conn;
 //fungsi fungsi 
 public static Connection getConnection(){
     
     try {
     //memanggil koneksi     
         conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/latihanpbo","root","");
         //membuat pop up
     } catch (HeadlessException | SQLException e) {
        JOptionPane.showMessageDialog(null,"Koneksi Gagal"); 
     }

     return conn;
 } 
}
 

