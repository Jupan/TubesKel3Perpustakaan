/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package id.ac.unikom.rpl.kelompok3.daoimpl;

import id.ac.unikom.rpl.kelompok3.dao.AdminDAO;
import id.ac.unikom.rpl.kelompok3.entity.Pegawai;
import id.ac.unikom.rpl.kelompok3.utility.DatabaseConnectivity;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nugraha
 */
public class AdminDAOImpl implements AdminDAO {
    
    private Connection conn;

    public AdminDAOImpl() {
        conn = DatabaseConnectivity.getConnection();
    }

    @Override
    public Pegawai login(String username, String password) {
        Pegawai pegawai = null;
        PreparedStatement state = null;
        String SELECT = "SELECT * FROM pegawai WHERE "
                + "username = ? AND password = ?";

        try {
            state = conn.prepareStatement(SELECT);
            state.setString(1, username);
            state.setString(2, password);
            
            ResultSet result = state.executeQuery();
            if (result != null && result.next()) {
                pegawai = new Pegawai();
                pegawai.setIdPegawai(result.getString(1));
                pegawai.setNama(result.getString(2));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(PegawaiDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return pegawai;}

    @Override
    public ArrayList<Pegawai> getPegawaiUser() {
        ArrayList<Pegawai> arrayPegawai = null;
        String SELECT = "SELECT "
                + "id_pegawai, nama, "
                + "username, password "
                + "FROM pegawai";
        PreparedStatement state = null;

        try {
            state = conn.prepareStatement(SELECT);

            ResultSet result = state.executeQuery();
            if (result != null) {
                arrayPegawai = new ArrayList<>();

                while (result.next()) {

                    Pegawai pegawai = new Pegawai();
                    pegawai.setIdPegawai(result.getString(1));
                    pegawai.setNama(result.getString(2));
                    pegawai.setUsername(result.getString(3));
                    pegawai.setPassword(result.getString(4));

                    arrayPegawai.add(pegawai);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(PegawaiDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return arrayPegawai;
    }

    @Override
    public ArrayList<Pegawai> cariPegawaiUser(String keyword) {
        ArrayList<Pegawai> arrayPegawai = null;
        String SELECT = "SELECT "
                + "id_pegawai, nama, "
                + "username, password "
                + "FROM pegawai "
                + "WHERE nama LIKE ?";
        PreparedStatement state = null;

        try {
            state = conn.prepareStatement(SELECT);
            state.setString(1, keyword + "%");
            
            ResultSet result = state.executeQuery();
            if (result != null) {
                arrayPegawai = new ArrayList<>();

                while (result.next()) {
                    
                    Pegawai pegawai = new Pegawai();
                    pegawai.setIdPegawai(result.getString(1));
                    pegawai.setNama(result.getString(2));
                    pegawai.setUsername(result.getString(3));
                    pegawai.setPassword(result.getString(4));

                    arrayPegawai.add(pegawai);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(PegawaiDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return arrayPegawai; }


    @Override
    public boolean ubahPegawai(Pegawai pegawai) {
        String UPDATE = "UPDATE pegawai "
                + "SET username = ?, password = ? "
                + "WHERE id_pegawai = ?";
        PreparedStatement state = null;
        
        try {
            state = conn.prepareStatement(UPDATE);
            state.setString(1, pegawai.getUsername());
            state.setString(2, pegawai.getPassword());
            state.setString(3, pegawai.getIdPegawai());
            
            int qty = state.executeUpdate();
            return qty > 0; 
        } catch (SQLException ex) {
            Logger.getLogger(PegawaiDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;}
    
}
