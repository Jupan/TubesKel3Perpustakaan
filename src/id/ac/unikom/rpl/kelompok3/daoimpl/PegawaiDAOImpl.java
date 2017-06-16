/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package id.ac.unikom.rpl.kelompok3.daoimpl;



import id.ac.unikom.rpl.kelompok3.dao.PegawaiDAO;
import id.ac.unikom.rpl.kelompok3.entity.Pegawai;
import id.ac.unikom.rpl.kelompok3.utility.DatabaseConnectivity;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nugraha
 */
public class PegawaiDAOImpl implements PegawaiDAO{
    
    private Connection conn;

    public PegawaiDAOImpl() {
        conn = DatabaseConnectivity.getConnection();
    }

    @Override
    public ArrayList<Pegawai> getPegawai() {
    
        ArrayList<Pegawai> arrayPegawai = null;
        String SELECT = "SELECT * FROM pegawai";
        PreparedStatement state = null;

        try {
            state = conn.prepareStatement(SELECT);

            ResultSet result = state.executeQuery();
            if (result != null) {
                arrayPegawai = new ArrayList<>();
                
                // selama result memiliki data
                // return lebih dari 1 data
                while (result.next()) {
                    
                    // mengambil 1 data
                    Pegawai pegawai = new Pegawai();
                    pegawai.setIdPegawai(result.getString(1));
                    pegawai.setNama(result.getString(2));
                    pegawai.setAlamat(result.getString(3));
                    pegawai.setNoTlp(result.getString(4));
                    pegawai.setTtl(result.getDate(5));
                    pegawai.setJabatan(result.getString(6));
                    pegawai.setGaji(result.getString(7));
                    
                    // menambahkan data ke array
                    arrayPegawai.add(pegawai);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(PegawaiDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return arrayPegawai;
    }

    @Override
    public ArrayList<Pegawai> cariPegawai(String keyword) {
    
        ArrayList<Pegawai> arrayPegawai = null;
        String SELECT = "SELECT * FROM pegawai "
                + "WHERE nama LIKE ?";
        PreparedStatement state = null;

        try {
            state = conn.prepareStatement(SELECT);
            state.setString(1, keyword + "%");
            
            ResultSet result = state.executeQuery();
            if (result != null) {
                arrayPegawai = new ArrayList<>();
                
                // selama result memiliki data
                // return lebih dari 1 data
                while (result.next()) {
                    
                    // mengambil 1 data
                    Pegawai pegawai = new Pegawai();
                    pegawai.setIdPegawai(result.getString(1));
                    pegawai.setNama(result.getString(2));
                    pegawai.setAlamat(result.getString(3));
                    pegawai.setNoTlp(result.getString(4));
                    pegawai.setTtl(result.getDate(5));
                    pegawai.setJabatan(result.getString(6));
                    pegawai.setGaji(result.getString(7));
                    
                    // menambahkan data ke array
                    arrayPegawai.add(pegawai);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(PegawaiDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return arrayPegawai;
    
    }

    @Override
    public boolean tambahPegawai(Pegawai pegawai, Calendar tglLahir) {
    
        String INSERT = "INSERT INTO pegawai "
                + "(id_pegawai,nama, alamat, no_tlp, "
                + "ttl, jabatan, gaji) "
                + "VALUES (?, ?, ?, ?, ?, ?,?)";

        PreparedStatement state = null;
        
        try {
            state = conn.prepareStatement(INSERT);
            state.setString(1, pegawai.getIdPegawai());
            state.setString(2, pegawai.getNama());
            state.setString(3, pegawai.getAlamat());
            state.setString(4, pegawai.getNoTlp());
            state.setDate(5, new Date(tglLahir.getTimeInMillis()));
            state.setString(6, pegawai.getJabatan());
            state.setString(7, pegawai.getGaji());
            
            int qty = state.executeUpdate();
            return qty > 0; 
        } catch (SQLException ex) {
            Logger.getLogger(PegawaiDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;  
    }

    @Override
    public boolean hapusPegawai(int idPegawai) {
    
        String DELETE = "DELETE FROM pegawai "
                + "WHERE id_pegawai = ?";
        PreparedStatement state = null;
        
        try {
            state = conn.prepareStatement(DELETE);
            state.setInt(1, idPegawai);
            
            int qty = state.executeUpdate();
            return qty > 0; 
        } catch (SQLException ex) {
            Logger.getLogger(PegawaiDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;   
    }

    @Override
    public boolean ubahPegawai(Pegawai pegawai, Calendar tglLahir) {
    
        String UPDATE = "UPDATE pegawai "
                + "SET nama = ?, alamat = ?, no_tlp = ?, "
                + "ttl = ?, jabatan = ?, gaji = ? WHERE "
                + "id_pegawai = ?";
        PreparedStatement state = null;
        
        try {
            state = conn.prepareStatement(UPDATE);
            state.setString(1, pegawai.getNama());
            state.setString(2, pegawai.getAlamat());
            state.setString(3, pegawai.getNoTlp());
            state.setDate(4, new Date(tglLahir.getTimeInMillis()));
            state.setString(5, pegawai.getJabatan());
            state.setString(6, pegawai.getGaji());
            state.setString(7, pegawai.getIdPegawai());
            
            int qty = state.executeUpdate();
            return qty > 0; 
        } catch (SQLException ex) {
            Logger.getLogger(PegawaiDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
}
