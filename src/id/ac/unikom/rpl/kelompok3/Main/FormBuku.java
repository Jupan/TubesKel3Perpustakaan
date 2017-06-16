/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package id.ac.unikom.rpl.kelompok3.Main;

import id.ac.unikom.rpl.kelompok3.dao.BukuDAO;
import id.ac.unikom.rpl.kelompok3.daoimpl.BukuDAOImpl;
import id.ac.unikom.rpl.kelompok3.entity.Buku;
import id.ac.unikom.rpl.kelompok3.tablemodel.BukuTM;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Nugraha
 */
public class FormBuku extends javax.swing.JDialog {

    private Buku buku;
    private BukuDAO dao;
    private ArrayList<Buku> arrayBuku;

    public Buku getBuku() {
        return buku;
    }
    
    public FormBuku(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        getData();
    }
    
    private void getData() {
        dao = new BukuDAOImpl();
        arrayBuku = dao.getBuku();

        BukuTM tm = new BukuTM();
        tm.setArrayBuku(arrayBuku);

        tableBuku.setModel(tm);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBuku = new javax.swing.JTable();
        fieldCari = new javax.swing.JTextField();
        buttonCari = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        buttonRefresh = new javax.swing.JButton();
        buttonTambah = new javax.swing.JButton();
        buttonHapus = new javax.swing.JButton();
        buttonUbah = new javax.swing.JButton();
        buttonSelesai = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("DATA BUKU");
        setMinimumSize(new java.awt.Dimension(835, 350));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tableBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tableBuku);

        fieldCari.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buttonCari.setBackground(new java.awt.Color(255, 255, 255));
        buttonCari.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonCari.setText("Cari");
        buttonCari.setBorder(null);
        buttonCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCariActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Cari Judul");

        buttonRefresh.setBackground(new java.awt.Color(255, 255, 255));
        buttonRefresh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonRefresh.setText("Refresh");
        buttonRefresh.setBorder(null);
        buttonRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(fieldCari, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonCari, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 165, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldCari)
                    .addComponent(buttonCari, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(buttonRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(60, 30, 700, 210);

        buttonTambah.setBackground(new java.awt.Color(255, 255, 255));
        buttonTambah.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonTambah.setText("Tambah");
        buttonTambah.setBorder(null);
        buttonTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTambahActionPerformed(evt);
            }
        });
        getContentPane().add(buttonTambah);
        buttonTambah.setBounds(60, 270, 130, 30);

        buttonHapus.setBackground(new java.awt.Color(255, 255, 255));
        buttonHapus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonHapus.setText("Hapus");
        buttonHapus.setBorder(null);
        buttonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHapusActionPerformed(evt);
            }
        });
        getContentPane().add(buttonHapus);
        buttonHapus.setBounds(250, 270, 120, 30);

        buttonUbah.setBackground(new java.awt.Color(255, 255, 255));
        buttonUbah.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonUbah.setText("Ubah");
        buttonUbah.setBorder(null);
        buttonUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUbahActionPerformed(evt);
            }
        });
        getContentPane().add(buttonUbah);
        buttonUbah.setBounds(450, 270, 120, 30);

        buttonSelesai.setBackground(new java.awt.Color(255, 255, 255));
        buttonSelesai.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonSelesai.setText("Selesai");
        buttonSelesai.setBorder(null);
        buttonSelesai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSelesaiActionPerformed(evt);
            }
        });
        getContentPane().add(buttonSelesai);
        buttonSelesai.setBounds(650, 270, 120, 30);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 820, 310);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTambahActionPerformed
       FormTambahBuku fta = new FormTambahBuku (null, true);
       fta.setLocationRelativeTo(null);
       fta.setVisible(true);
       getData();
    }//GEN-LAST:event_buttonTambahActionPerformed

    private void buttonUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUbahActionPerformed
       int baris = tableBuku.getSelectedRow();
        if (baris >= 0) {

            Buku bukuPilih = arrayBuku.get(baris);

            FormUbahBuku fua = new FormUbahBuku(null, true, bukuPilih);
            fua.setVisible(true);
            getData();
                    
        } else {
            JOptionPane.showMessageDialog(this, "Pilih Buku yang akan diubah");
        }
    }//GEN-LAST:event_buttonUbahActionPerformed

    private void buttonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHapusActionPerformed
        int baris = tableBuku.getSelectedRow();
        if (baris >= 0) {
            Buku bukuPilih = arrayBuku.get(baris);

            int aksiUser = JOptionPane.showConfirmDialog(this, "Apakah Anda "
                    + "yakin akan menghapus Buku "
                    + bukuPilih.getJudul(), "Hapus Buku",
                    JOptionPane.YES_NO_OPTION);

            if (aksiUser == JOptionPane.YES_OPTION) {
                int id = Integer.parseInt(bukuPilih.getIdBuku());
                boolean sukses = dao.hapusBuku(id);

                if (sukses) {
                    JOptionPane.showMessageDialog(this, "Buku berhasil dihapus");
                    getData();
                } else {
                    JOptionPane.showMessageDialog(this, "Buku gagal dihapus");
                }
            }

        } else {
            JOptionPane.showMessageDialog(this, "Pilih Buku yang akan dihapus");
        }
    }//GEN-LAST:event_buttonHapusActionPerformed

    private void buttonSelesaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSelesaiActionPerformed
        dispose();
    }//GEN-LAST:event_buttonSelesaiActionPerformed

    private void buttonRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRefreshActionPerformed
        getData();
    }//GEN-LAST:event_buttonRefreshActionPerformed

    private void buttonCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCariActionPerformed

        String keyword = fieldCari.getText();
        dao = new BukuDAOImpl();
        arrayBuku = dao.cariBuku(keyword);

        BukuTM tm = new BukuTM();
        tm.setArrayBuku(arrayBuku);

        tableBuku.setModel(tm);
    }//GEN-LAST:event_buttonCariActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormBuku dialog = new FormBuku(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCari;
    private javax.swing.JButton buttonHapus;
    private javax.swing.JButton buttonRefresh;
    private javax.swing.JButton buttonSelesai;
    private javax.swing.JButton buttonTambah;
    private javax.swing.JButton buttonUbah;
    private javax.swing.JTextField fieldCari;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableBuku;
    // End of variables declaration//GEN-END:variables
}