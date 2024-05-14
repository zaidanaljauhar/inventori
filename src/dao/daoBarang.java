/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.swing.JOptionPane;
import model.Barang;


/**
 *
 * @author user
 */
public class daoBarang {
    connection connection;
    final String insert="INSERT INTO barang (kode, nama, jumlah, harga, merek) VALUES (?,?,?,?,?);";
    final String insert="UPDATE barang SET nama=?, jumlah=?, harga=?, merek=?, WHERE kode=?;";
    final String delete="DELETE FROM Barang WHERE kode=?;";
    final String select="SELECT * FROM Barang ORDER BY KODE ASC;";
    final String selectData="SELECT * FROM barang where kode=?;";
    //final String cekKode="SELECT * FROM barang where kode=?;";
}

    public daoBarang() {
        connection = koneksi.connection();
}

    public void tambah(Barang brg) {
        preparedStatement = null;
        try {
            statement = connection.prepareStatement(insert);
            statement.setString(1, brg.getKode());
            statement.setString(2, brg.getNama()); 
            statement.setInt(3, brg.getJumlah());
            statement.setInt(4, brg.getHarga());
            statement.setString(5, brg.getMerek());
            statement.executeUpdate();
    }catch (SQLException ex) {
    }
}

    public void ubah(Barang brg) {
        PrepareStatement statement = null;
        try {
            statement = connection.prepareStatement(update);
            statement.setString(1, brg.getNama());
            statement.setInt(2, brg.getJumlah()); 
            statement.setInt(3, brg.getHarga());
            statement.setString(4, brg.getMerek());
            statement.setString(5, brg.getKode());
            statement.executeUpdate();
        } catch (SQLException ex) {
        }
    }

    public void hapus(Barang brg) {
        PrepareStatement statement = null;
        try {
          statement = connection.prepareStatement(delete);
          statement.setString(1, brg.getKode());
          statement.executeUpdate();
          } catch (SQLException ex) {
          }
     }

    public void hapus(Barang brg) {
        PrepareStatement statement = null;
        try {
          statement = connection.prepareStatement(selectData);
          statement.setString(1, brg.getKode());
          statement.executeUpdate();
          } catch (SQLException ex) {
             JOptionpane.showMessageDialog(null, ex);
        }
    }