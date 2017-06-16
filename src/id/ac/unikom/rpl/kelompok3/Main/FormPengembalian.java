/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package id.ac.unikom.rpl.kelompok3.Main;

import id.ac.unikom.rpl.kelompok3.dao.PeminjamanDAO;
import id.ac.unikom.rpl.kelompok3.daoimpl.PeminjamanDAOImpl;
import id.ac.unikom.rpl.kelompok3.entity.Anggota;
import id.ac.unikom.rpl.kelompok3.entity.Buku;
import id.ac.unikom.rpl.kelompok3.entity.Pegawai;
import id.ac.unikom.rpl.kelompok3.entity.Peminjaman;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;



/**
 *
 * @author Nugraha
 */
public class FormPengembalian extends javax.swing.JDialog {

    /**
     * Creates new form FormPengembalian
     */
    
    private String id;
    private Buku buku;
    private Anggota anggota;
    private Pegawai pegawai;
    private Peminjaman peminjaman;
    private Calendar tglPinjam;
    private Calendar tglKembali;
    
    public FormPengembalian(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public FormPengembalian(java.awt.Frame parent, boolean modal, Peminjaman peminjaman) {
        super(parent, modal);
        initComponents();
        id = String.valueOf(peminjaman.getIdPinjam());
        labelIdPeminjaman.setText(peminjaman.getIdPinjam());
        fieldNamaAnggota.setText(peminjaman.getNama());
        fieldJudulBuku.setText(peminjaman.getJudul());
        datePeminjaman.setDate(peminjaman.getTglPinjam());

        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        LamaPinjam = new javax.swing.JPanel();
        labelPeminjaman = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fieldNamaAnggota = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fieldJudulBuku = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        buttonSimpan = new javax.swing.JButton();
        buttonBatal = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        labelIdPeminjaman = new javax.swing.JLabel();
        buttonHitung = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        labelTotalBayar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelDenda = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        labelBayar = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        fieldPetugas = new javax.swing.JTextField();
        buttonCari = new javax.swing.JButton();
        fieldIdPetugas = new javax.swing.JTextField();
        datePengembalian = new com.toedter.calendar.JDateChooser();
        datePeminjaman = new com.toedter.calendar.JDateChooser();
        labelLamaPinjam = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        LamaPinjam.setBackground(new java.awt.Color(255, 255, 255));
        LamaPinjam.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelPeminjaman.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelPeminjaman.setText("ID Peminjaman :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Nama");

        fieldNamaAnggota.setEditable(false);
        fieldNamaAnggota.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Judul");

        fieldJudulBuku.setEditable(false);
        fieldJudulBuku.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Tanggal Peminjaman");

        buttonSimpan.setBackground(new java.awt.Color(255, 255, 255));
        buttonSimpan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        buttonSimpan.setText("Simpan");
        buttonSimpan.setBorder(null);
        buttonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSimpanActionPerformed(evt);
            }
        });

        buttonBatal.setBackground(new java.awt.Color(255, 255, 255));
        buttonBatal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        buttonBatal.setText("Batal");
        buttonBatal.setBorder(null);
        buttonBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBatalActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Tanggal Pengembalian");

        labelIdPeminjaman.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelIdPeminjaman.setText("-");

        buttonHitung.setBackground(new java.awt.Color(255, 255, 255));
        buttonHitung.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        buttonHitung.setText("Hitung");
        buttonHitung.setBorder(null);
        buttonHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHitungActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Lama Pinjam(Hari)");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Total Bayar");

        labelTotalBayar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelTotalBayar.setText("-");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Denda");

        labelDenda.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelDenda.setText("-");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Bayar");

        labelBayar.setText("-");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Petugas");

        buttonCari.setBackground(new java.awt.Color(255, 255, 255));
        buttonCari.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        buttonCari.setText("Cari");
        buttonCari.setBorder(null);
        buttonCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCariActionPerformed(evt);
            }
        });

        labelLamaPinjam.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelLamaPinjam.setText("-");

        javax.swing.GroupLayout LamaPinjamLayout = new javax.swing.GroupLayout(LamaPinjam);
        LamaPinjam.setLayout(LamaPinjamLayout);
        LamaPinjamLayout.setHorizontalGroup(
            LamaPinjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LamaPinjamLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LamaPinjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LamaPinjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(LamaPinjamLayout.createSequentialGroup()
                            .addGroup(LamaPinjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(LamaPinjamLayout.createSequentialGroup()
                                    .addComponent(labelPeminjaman)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(labelIdPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel10)
                                .addComponent(jLabel6)
                                .addComponent(datePeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(LamaPinjamLayout.createSequentialGroup()
                                    .addGroup(LamaPinjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel3))
                                    .addGap(18, 18, 18)
                                    .addGroup(LamaPinjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(fieldNamaAnggota, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                                        .addComponent(fieldJudulBuku))))
                            .addGap(95, 95, 95))
                        .addGroup(LamaPinjamLayout.createSequentialGroup()
                            .addComponent(fieldIdPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(fieldPetugas)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buttonCari, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(70, 70, 70)))
                    .addGroup(LamaPinjamLayout.createSequentialGroup()
                        .addComponent(buttonSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134)))
                .addGroup(LamaPinjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonHitung, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(datePengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(LamaPinjamLayout.createSequentialGroup()
                        .addGroup(LamaPinjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(LamaPinjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelDenda, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTotalBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelLamaPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        LamaPinjamLayout.setVerticalGroup(
            LamaPinjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LamaPinjamLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LamaPinjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(LamaPinjamLayout.createSequentialGroup()
                        .addGroup(LamaPinjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelPeminjaman)
                            .addComponent(labelIdPeminjaman))
                        .addGroup(LamaPinjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LamaPinjamLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel3))
                            .addGroup(LamaPinjamLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldNamaAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(LamaPinjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(fieldJudulBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(datePeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(LamaPinjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonCari, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldIdPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(LamaPinjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonSimpan, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addComponent(buttonBatal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(22, 22, 22))
                    .addGroup(LamaPinjamLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(datePengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(LamaPinjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(labelLamaPinjam))
                        .addGap(26, 26, 26)
                        .addGroup(LamaPinjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(labelBayar))
                        .addGap(18, 18, 18)
                        .addGroup(LamaPinjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(labelDenda))
                        .addGap(18, 18, 18)
                        .addGroup(LamaPinjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(labelTotalBayar))
                        .addGap(30, 30, 30)
                        .addComponent(buttonHitung, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LamaPinjam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LamaPinjam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCariActionPerformed
        FormCariPegawai fcp = new FormCariPegawai(null, true);
        fcp.setLocationRelativeTo(null);
        fcp.setVisible(true);

        pegawai = fcp.getPegawai();
        if (pegawai != null) {
            fieldIdPetugas.setText(pegawai.getIdPegawai());
            fieldPetugas.setText(pegawai.getNama());
        }
    }//GEN-LAST:event_buttonCariActionPerformed

    private void buttonHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHitungActionPerformed
        // ambil tanggal pinjam dan kembali
        tglPinjam = datePeminjaman.getCalendar();
        tglKembali = datePengembalian.getCalendar();

        // konversi ke milliseconds
        long tglPinjamMili = tglPinjam.getTimeInMillis();
        long tglKembaliMili = tglKembali.getTimeInMillis();

        // hitung selisih
        long selisih = tglKembaliMili - tglPinjamMili;

        // konversi ke hari
        long hari = TimeUnit.MILLISECONDS.toDays(selisih);
        String lamaPin = String.valueOf(hari);
        Integer lamaPin2 = Integer.valueOf(lamaPin);

        if (hari < 0) {
            JOptionPane.showMessageDialog(this, "Masukan Tanggal Yang Valid !");
        }else if(hari > 3) {
            Integer bayar = lamaPin2 * 2000;
            Integer denda = (lamaPin2 - 3)*1000;
            Integer totalB = bayar + denda;
            labelLamaPinjam.setText(String.valueOf(hari));
            labelLamaPinjam.setText(String.valueOf(hari));
            labelBayar.setText(String.valueOf(bayar));
            labelDenda.setText(String.valueOf(denda));
            labelTotalBayar.setText(String.valueOf(totalB));
        }else{
            Integer bayar = lamaPin2 * 2000;
            Integer denda = 0;
            Integer totalB = bayar + denda;
            labelLamaPinjam.setText(String.valueOf(hari));
            labelBayar.setText(String.valueOf(bayar));
            labelDenda.setText(String.valueOf(denda));
            labelTotalBayar.setText(String.valueOf(totalB));
        }
    }//GEN-LAST:event_buttonHitungActionPerformed

    private void buttonBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBatalActionPerformed
        dispose();
    }//GEN-LAST:event_buttonBatalActionPerformed

    private void buttonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSimpanActionPerformed
        simpan();
    }//GEN-LAST:event_buttonSimpanActionPerformed

    private void simpan() {
        Peminjaman peminjaman = new Peminjaman();
        String idp = labelIdPeminjaman.getText();
        String lama = labelLamaPinjam.getText();
        String denda = labelDenda.getText();
        String tb = labelTotalBayar.getText();
        String pg = fieldIdPetugas.getName();
        tglKembali = datePengembalian.getCalendar();

        if (labelLamaPinjam.getText().equals("-")) {
            JOptionPane.showMessageDialog(this, "Masukan Tanggal Kembali dan Hitung Total Bayar !");
            labelLamaPinjam.requestFocus();
        } else if(labelTotalBayar.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Masukan Tanggal Kembali dan Hitung Total Bayar !");
            labelTotalBayar.requestFocus();
        }else{
            
            peminjaman.setIdPinjam(idp);
            peminjaman.setLamaPinjam(lama);
            peminjaman.setDenda(denda);
            peminjaman.setTotalBayar(tb);
            peminjaman.setPetugas(pg);
 
            PeminjamanDAO dao = new PeminjamanDAOImpl();
            boolean sukses = dao.kembali(peminjaman, tglKembali, 
                    Integer.parseInt(pegawai.getIdPegawai()));

            if (sukses) {
                JOptionPane.showMessageDialog(this, "Berhasil melakukan pengembalian");
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Gagal melakukan pengembalian");
            }
        }
    }
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
            java.util.logging.Logger.getLogger(FormPengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormPengembalian dialog = new FormPengembalian(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel LamaPinjam;
    private javax.swing.JButton buttonBatal;
    private javax.swing.JButton buttonCari;
    private javax.swing.JButton buttonHitung;
    private javax.swing.JButton buttonSimpan;
    private com.toedter.calendar.JDateChooser datePeminjaman;
    private com.toedter.calendar.JDateChooser datePengembalian;
    private javax.swing.JTextField fieldIdPetugas;
    private javax.swing.JTextField fieldJudulBuku;
    private javax.swing.JTextField fieldNamaAnggota;
    private javax.swing.JTextField fieldPetugas;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel labelBayar;
    private javax.swing.JLabel labelDenda;
    private javax.swing.JLabel labelIdPeminjaman;
    private javax.swing.JLabel labelLamaPinjam;
    private javax.swing.JLabel labelPeminjaman;
    private javax.swing.JLabel labelTotalBayar;
    // End of variables declaration//GEN-END:variables
}