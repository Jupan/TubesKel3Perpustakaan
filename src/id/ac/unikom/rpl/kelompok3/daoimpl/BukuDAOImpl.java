package id.ac.unikom.rpl.kelompok3.daoimpl;




import id.ac.unikom.rpl.kelompok3.utility.DatabaseConnectivity;
import id.ac.unikom.rpl.kelompok3.dao.BukuDAO;
import id.ac.unikom.rpl.kelompok3.entity.Buku;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BukuDAOImpl implements BukuDAO {
    
    private final Connection conn;

    public BukuDAOImpl() {
        conn = DatabaseConnectivity.getConnection();
    }

    @Override
    public ArrayList<Buku> getBuku() {
      ArrayList<Buku> arrayBuku = null;
        String SELECT = "SELECT * FROM buku";
        PreparedStatement state = null;
        
        try {
            state = conn.prepareStatement(SELECT);

            ResultSet result = state.executeQuery();
            if (result != null) {
                arrayBuku = new ArrayList<>();
                
                while (result.next()) {
                    
                    Buku buku = new Buku();
                    buku.setIdBuku(result.getString(1));
                    buku.setJudul(result.getString(2));
                    buku.setPengarang(result.getString(3));
                    buku.setPenerbit(result.getString(4));
                    buku.setStok(result.getString(5));
                    buku.setThnTerbit(result.getString(6));
                    buku.setHarga(result.getString(7));

                    arrayBuku.add(buku);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(BukuDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return arrayBuku;
    }

    @Override
    public ArrayList<Buku> cariBuku(String keyword) {
        
       ArrayList<Buku> arrayBuku = null;
        PreparedStatement state = null;
        
        boolean isSearching = keyword != null && !keyword.isEmpty();
        String SELECT;
        if (isSearching) {
            SELECT = "SELECT * FROM buku WHERE judul LIKE ?";
        } else {
            SELECT = "SELECT * FROM buku";
        }
        
        try {
            state = conn.prepareStatement(SELECT);
            if (isSearching) {
                state.setString(1, keyword + "%");
            }
            
            ResultSet result = state.executeQuery();
            if (result != null) {
                arrayBuku = new ArrayList<>();
                
                while (result.next()) {                    
                    Buku buku = new Buku();
                    buku.setIdBuku(result.getString(1));
                    buku.setJudul(result.getString(2));
                    buku.setPengarang(result.getString(3));
                    buku.setPenerbit(result.getString(4));
                    buku.setStok(result.getString(5));
                    buku.setThnTerbit(result.getString(6));
                    buku.setHarga(result.getString(7));
                    
                    arrayBuku.add(buku);
                }
            }
            result.close();
        } catch (SQLException ex) {
            Logger.getLogger(BukuDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (state != null) {
                try {
                    state.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BukuDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        return arrayBuku;  
    }

    @Override
    public boolean tambahBuku(Buku buku) {
    String INSERT = "INSERT INTO buku "
            + "(id_buku,judul, pengarang, penerbit,stok, thn_terbit, harga) "
            + "VALUES (?, ?, ?, ?, ?, ?,?)";

        PreparedStatement state = null;
        
        try {
            state = conn.prepareStatement(INSERT);
            state.setString(1, buku.getIdBuku());
            state.setString(2, buku.getJudul());
            state.setString(3, buku.getPengarang());
            state.setString(4, buku.getPenerbit());
            state.setString(5, buku.getStok());
            state.setString(6, buku.getThnTerbit());
            state.setString(7, buku.getHarga());
            
            int qty = state.executeUpdate();
            return qty > 0; 
        } catch (SQLException ex) {
            Logger.getLogger(BukuDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (state != null) {
                try {
                    state.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BukuDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }  
        return false;  
    }

    @Override
    public boolean hapusBuku(int idBuku) {
    String DELETE = "DELETE FROM buku "
                + "WHERE id_buku = ?";
        PreparedStatement state = null;
        
        try {
            state = conn.prepareStatement(DELETE);
            state.setInt(1, idBuku);
            
            int qty = state.executeUpdate();
            return qty > 0; 
        } catch (SQLException ex) {
            Logger.getLogger(BukuDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;   
    }    

    @Override
    public boolean ubahBuku(Buku buku) {
        String UPDATE = "UPDATE buku "
                + "SET judul = ?, pengarang = ?, "
                + "penerbit = ?, stok = ?, "
                + "thn_terbit = ?, harga = ? WHERE "
                + "id_buku = ?";
        PreparedStatement state = null;
        
        try {
            state = conn.prepareStatement(UPDATE);
            state.setString(1, buku.getJudul());
            state.setString(2, buku.getPengarang());
            state.setString(3, buku.getPenerbit());
            state.setString(4, buku.getStok());
            state.setString(5, buku.getThnTerbit());
            state.setString(6, buku.getHarga());
            state.setString(7, buku.getIdBuku());
            
            int qty = state.executeUpdate();
            return qty > 0; 
        } catch (SQLException ex) {
            Logger.getLogger(BukuDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;}



}
