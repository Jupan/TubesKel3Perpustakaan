/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package id.ac.unikom.rpl.kelompok3.daoimpl;



import id.ac.unikom.rpl.kelompok3.dao.PeminjamanDAO;
import id.ac.unikom.rpl.kelompok3.entity.Peminjaman;
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
public class PeminjamanDAOImpl implements PeminjamanDAO {
    
    private final Connection conn;

    public PeminjamanDAOImpl() {
        conn = DatabaseConnectivity.getConnection();
    }

    @Override
    public ArrayList<Peminjaman> getPeminjaman() {
        
        ArrayList<Peminjaman> arrayPeminjaman = null;
        String SELECT = "SELECT "
                + "peminjaman.id_pin, "
                + "peminjaman.tgl_pin, "
                + "peminjaman.tgl_kem, "
                + "buku.judul, "
                + "anggota.nama, "
                + "peminjaman.lama_pin, "
                + "peminjaman.denda, "
                + "peminjaman.total_bayar "
                + "FROM peminjaman, buku, anggota "
                + "WHERE peminjaman.id_buku = buku.id_buku AND "
                + "peminjaman.id_anggota = anggota.id_anggota";
        PreparedStatement state = null;
        
        try {
            state = conn.prepareStatement(SELECT);
            
            ResultSet result = state.executeQuery();
            if (result != null) {
                arrayPeminjaman = new ArrayList<>();
                
                while (result.next()) {                    
                    Peminjaman p = new Peminjaman();
                    p.setIdPinjam(result.getString(1));
                    p.setTglPinjam(result.getDate(2));
                    p.setTglKembali(result.getDate(3));
                    p.setJudul(result.getString(4));
                    p.setNama(result.getString(5));
                    p.setLamaPinjam(result.getString(6));
                    p.setDenda(result.getString(7));
                    p.setTotalBayar(result.getString(8));

                    arrayPeminjaman.add(p);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(PeminjamanDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (state != null) {
                try {
                    state.close();
                } catch (SQLException ex) {
                    Logger.getLogger(PeminjamanDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        
        return arrayPeminjaman;
    }

    @Override
    public boolean pinjam(int idAnggota, int idBuku, Calendar tglPinjam) {
        String INSERT = "INSERT INTO peminjaman "
                + "(id_anggota, id_buku, tgl_pin) "
                + "VALUES (?, ?, ?)";
        PreparedStatement state = null;
        
        try {
            state = conn.prepareStatement(INSERT);
            
            state.setInt(1, idAnggota);
            state.setInt(2, idBuku);
            state.setDate(3, new Date(tglPinjam.getTimeInMillis()));
            
            int result = state.executeUpdate();
            return result > 0;
            
        } catch (SQLException ex) {
            Logger.getLogger(PeminjamanDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (state != null) {
                try {
                    state.close();
                } catch (SQLException ex) {
                    Logger.getLogger(PeminjamanDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        return false;
    }

    @Override
    public boolean kembali(Peminjaman peminjaman, Calendar tglKembali, int idPegawai) {
        
        String UPDATE = "UPDATE peminjaman "
                + "SET lama_pin = ?, total_bayar = ?, "
                + "denda = ?, tgl_kem = ?, id_pegawai = ? "
                + "WHERE id_pin = ?";
        PreparedStatement state = null;
        
        try {
            state = conn.prepareStatement(UPDATE);
            state.setInt(1, Integer.parseInt(peminjaman.getLamaPinjam()));
            state.setFloat(2, Float.parseFloat(peminjaman.getTotalBayar()));
            state.setFloat(3, Float.parseFloat(peminjaman.getDenda()));
            state.setDate(4, new Date(tglKembali.getTimeInMillis()));
            state.setInt(5, idPegawai);
            state.setInt(6, Integer.parseInt(peminjaman.getIdPinjam()));

            
            int result = state.executeUpdate();
            return result > 0;
            
        } catch (SQLException ex) {
            Logger.getLogger(PeminjamanDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (state != null) {
                try {
                    state.close();
                } catch (SQLException ex) {
                    Logger.getLogger(PeminjamanDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        return false;
    }

    @Override
    public ArrayList<Peminjaman> cariPeminjaman(String keyword) {
    ArrayList<Peminjaman> arrayPeminjaman = null;
        PreparedStatement state = null;
        
        boolean isSearching = keyword != null && !keyword.isEmpty();
        String SELECT;
        if (isSearching) {
            SELECT = "SELECT * FROM peminjaman WHERE id_pin LIKE ?";
        } else {
            SELECT = "SELECT * FROM buku ";
        }

        try {
            state = conn.prepareStatement(SELECT);
            if (isSearching) {
            state.setString(1, keyword + "%");
            }
            ResultSet result = state.executeQuery();
            if (result != null) {
                arrayPeminjaman = new ArrayList<>();
 
                while (result.next()) {
  
                    Peminjaman p = new Peminjaman();
                    p.setIdPinjam(result.getString(1));
                    p.setTglPinjam(result.getDate(2));
                    p.setTglKembali(result.getDate(3));
                    p.setJudul(result.getString(4));
                    p.setNama(result.getString(5));
                    p.setLamaPinjam(result.getString(6));
                    p.setDenda(result.getString(7));
                    p.setTotalBayar(result.getString(8));
                    
                    arrayPeminjaman.add(p);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(PeminjamanDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return arrayPeminjaman;   
    }

    @Override
    public ArrayList<Peminjaman> getCariPengembalian() {
    
        ArrayList<Peminjaman> arrayPeminjaman = null;
        String SELECT = "SELECT "
                + "peminjaman.id_pin, "
                + "peminjaman.tgl_pin, "
                + "peminjaman.tgl_kem, "
                + "buku.judul, "
                + "anggota.nama, "
                + "peminjaman.lama_pin, "
                + "peminjaman.denda, "
                + "peminjaman.total_bayar, "
                + "pegawai.nama "
                + "FROM peminjaman, buku, anggota, pegawai "
                + "WHERE peminjaman.id_buku = buku.id_buku AND "
                + "peminjaman.id_anggota = anggota.id_anggota AND "
                + "peminjaman.id_pegawai = pegawai.id_pegawai";
        PreparedStatement state = null;
        
        
        try {
            
            state = conn.prepareStatement(SELECT);
            
            
            ResultSet result = state.executeQuery();
            if (result != null) {
                arrayPeminjaman = new ArrayList<>();
                
                while (result.next()) {                    
                    Peminjaman p = new Peminjaman();
                    p.setIdPinjam(result.getString(1));
                    p.setTglPinjam(result.getDate(2));
                    p.setTglKembali(result.getDate(3));
                    p.setJudul(result.getString(4));
                    p.setNama(result.getString(5));
                    p.setLamaPinjam(result.getString(6));
                    p.setDenda(result.getString(7));
                    p.setTotalBayar(result.getString(8));
                    p.setPetugas(result.getString(9));
                    
                    arrayPeminjaman.add(p);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(PeminjamanDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (state != null) {
                try {
                    state.close();
                } catch (SQLException ex) {
                    Logger.getLogger(PeminjamanDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        
        return arrayPeminjaman;
    }
    
}
