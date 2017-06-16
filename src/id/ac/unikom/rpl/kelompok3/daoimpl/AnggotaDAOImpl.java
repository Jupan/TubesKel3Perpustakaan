/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package id.ac.unikom.rpl.kelompok3.daoimpl;




import id.ac.unikom.rpl.kelompok3.dao.AnggotaDAO;
import id.ac.unikom.rpl.kelompok3.entity.Anggota;
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
 * @author Robi Tanzil
 */
public class AnggotaDAOImpl implements AnggotaDAO {
    
    private final Connection conn;

    public AnggotaDAOImpl() {
        conn = DatabaseConnectivity.getConnection();
    }

    @Override
    public ArrayList<Anggota> getAnggota() {
        ArrayList<Anggota> arrayAnggota = null;
        String SELECT = "SELECT * FROM anggota";
        PreparedStatement state = null;

        try {
            state = conn.prepareStatement(SELECT);

            ResultSet result = state.executeQuery();
            if (result != null) {
                arrayAnggota = new ArrayList<>();
                
                // selama result memiliki data
                // return lebih dari 1 data
                while (result.next()) {
                    
                    // mengambil 1 data
                    Anggota anggota = new Anggota();
                    anggota.setIdAnggota(result.getString(1));
                    anggota.setNama(result.getString(2));
                    anggota.setAlamat(result.getString(3));
                    anggota.setNoTlp(result.getString(4));
                    anggota.setTanggalLahir(result.getDate(5));

                    
                    // menambahkan data ke array
                    arrayAnggota.add(anggota);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(AnggotaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return arrayAnggota;
    }

    @Override
    public ArrayList<Anggota> cariAnggota(String keyword) {
        
        ArrayList<Anggota> arrayAnggota = null;
        PreparedStatement state = null;
        
        boolean isSearching = keyword != null && !keyword.isEmpty();
        String SELECT;
        if (isSearching) {
            SELECT = "SELECT * FROM anggota WHERE nama LIKE ?";
        } else {
            SELECT = "SELECT * FROM anggota";
        }
        
        try {
            state = conn.prepareStatement(SELECT);
            if (isSearching) {
                state.setString(1, keyword + "%");
            }
            
            ResultSet result = state.executeQuery();
            if (result != null) {
                arrayAnggota = new ArrayList<>();
                
                while (result.next()) {                    
                    Anggota anggota = new Anggota();
                    anggota.setIdAnggota(result.getString(1));
                    anggota.setNama(result.getString(2));
                    anggota.setAlamat(result.getString(3));
                    anggota.setNoTlp(result.getString(4));
                    anggota.setTanggalLahir(result.getDate(5));
                    
                    arrayAnggota.add(anggota);
                }
            }
            result.close();
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (state != null) {
                try {
                    state.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AnggotaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        return arrayAnggota;
    }

    @Override
    public boolean tambahAnggota(Anggota anggota, Calendar tglLahir) {
    String INSERT = "INSERT INTO anggota "
            + "(id_anggota,nama, alamat, no_tlp, ttl) "
            + "VALUES (?, ?, ?, ?,?)";

        PreparedStatement state = null;
        
        try {
            state = conn.prepareStatement(INSERT);
            state.setString(1, anggota.getIdAnggota());
            state.setString(2, anggota.getNama());
            state.setString(3, anggota.getAlamat());
            state.setString(4, anggota.getNoTlp());
            state.setDate(5, new Date(tglLahir.getTimeInMillis()));

            int result = state.executeUpdate();
            return result > 0;
            
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (state != null) {
                try {
                    state.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AnggotaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }  
        return false;
    }

    @Override
    public boolean hapusAnggota(int idAnggota) {
    String DELETE = "DELETE FROM anggota "
                + "WHERE id_anggota = ?";
        PreparedStatement state = null;
        
        try {
            state = conn.prepareStatement(DELETE);
            state.setInt(1, idAnggota);
            
            int qty = state.executeUpdate();
            return qty > 0; 
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;       
    }

    @Override
    public boolean ubahAnggota(Anggota anggota, Calendar tglLahir) {
        String UPDATE = "UPDATE anggota "
                + "SET nama = ?, alamat = ?, "
                + "no_tlp = ?, ttl = ?  WHERE "
                + "id_anggota = ?";
        PreparedStatement state = null;
        
        try {
            state = conn.prepareStatement(UPDATE);
            state.setString(1, anggota.getNama());
            state.setString(2, anggota.getAlamat());
            state.setString(3, anggota.getNoTlp());
            state.setDate(4, new Date(tglLahir.getTimeInMillis()));
            state.setString(5, anggota.getIdAnggota());

            int qty = state.executeUpdate();
            return qty > 0; 
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }

   
}
