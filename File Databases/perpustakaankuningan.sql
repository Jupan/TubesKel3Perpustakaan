-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 04 Jun 2017 pada 14.40
-- Versi Server: 10.1.16-MariaDB
-- PHP Version: 7.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `perpustakaankuningan`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `anggota`
--

CREATE TABLE `anggota` (
  `id_anggota` int(11) NOT NULL,
  `nama` varchar(50) DEFAULT NULL,
  `alamat` varchar(50) DEFAULT NULL,
  `no_tlp` varchar(16) DEFAULT NULL,
  `ttl` date DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `anggota`
--

INSERT INTO `anggota` (`id_anggota`, `nama`, `alamat`, `no_tlp`, `ttl`) VALUES
(1004364, 'Euis', 'Luragung', '08974017954', '1995-09-03'),
(120315, 'Indri', 'Kadugede', '087824555671', '1993-01-25'),
(151114, 'Chandra', 'Darma', '087828301291', '1996-07-01'),
(160614, 'Khildan', 'Pasapen', '081324554222', '1991-12-12'),
(150116, 'Cahyo', 'Ciniru', '08985318110', '1994-02-15'),
(121115, 'Anton ', 'Ciniru', '082321057150', '1991-08-04'),
(251114, 'Lena', 'Kramatmulya', '087845301256', '1980-01-05'),
(201215, 'Eva', 'Pasapen', '082322257155', '1996-04-17'),
(150816, 'Pipih', 'Kertawangun', '8987718223', '1990-08-08'),
(280314, 'Dino', 'Winduhaji', '0898797952', '1995-10-16');

-- --------------------------------------------------------

--
-- Struktur dari tabel `buku`
--

CREATE TABLE `buku` (
  `id_buku` int(13) NOT NULL,
  `judul` varchar(30) DEFAULT NULL,
  `pengarang` varchar(30) DEFAULT NULL,
  `penerbit` varchar(30) DEFAULT NULL,
  `stok` int(11) DEFAULT NULL,
  `thn_terbit` int(11) DEFAULT NULL,
  `harga` double DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `buku`
--

INSERT INTO `buku` (`id_buku`, `judul`, `pengarang`, `penerbit`, `stok`, `thn_terbit`, `harga`) VALUES
(566289, 'Manajemen Proyek', 'Nurhayati', 'Graha Ilmu', 5, 2008, 125000),
(761452, 'Metode Penelitian Pendidikan', 'H Mahmud', 'Pustaka Setia', 5, 2011, 75000),
(281539, 'Pengantar Akutansi', 'Jonathan E', 'Salemba Empat', 5, 2011, 50000),
(624035, 'Hukum Pajak', 'Roristua P', 'Graha Ilmu', 4, 2008, 60000),
(133113, 'Easy Toefl', 'Slamet R', 'Pustaka Pelajar', 10, 2011, 50000),
(309015, 'Filsafat Hukum Islam', 'Beni Ahmad', 'Pustaka Setia ', 4, 2008, 100000),
(584121, 'Statistika', 'Riduwan', 'Alfabeta Bandung', 3, 2012, 50000),
(701345, 'Matematika', 'Sukirman', 'PT Elex Media', 10, 2000, 25000),
(631448, 'Kamus Basa Sunda', 'R.Satjadibrata', 'PT Kiblat Buku Utama', 10, 2005, 75000),
(941223, 'Pendidikan Kewarganegaraan', 'Zainnul Ittihas', 'UT DPN', 5, 2004, 40000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `pegawai`
--

CREATE TABLE `pegawai` (
  `id_pegawai` int(11) NOT NULL,
  `nama` varchar(50) DEFAULT NULL,
  `alamat` varchar(50) DEFAULT NULL,
  `no_tlp` varchar(16) DEFAULT NULL,
  `ttl` date DEFAULT NULL,
  `jabatan` varchar(30) DEFAULT NULL,
  `gaji` double DEFAULT NULL,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `pegawai`
--

INSERT INTO `pegawai` (`id_pegawai`, `nama`, `alamat`, `no_tlp`, `ttl`, `jabatan`, `gaji`, `username`, `password`) VALUES
(1, 'Aan Sugiantomas', 'Kuningan Kota', '089765432', '1980-06-20', 'Ketua Perpustakaan', 750000, 'Aan', '123'),
(2, 'Soni Nuralam', 'Kramatmulya', '08974017954', '1987-12-14', 'Bag Pelayanan Teknisi', 500000, 'Soni', '123'),
(3, 'Iping Permana', 'Sangkanhurip', '087828301291', '1990-01-01', 'Bag Pelayanan Pembaca', 500000, 'Iping ', '123'),
(4, 'Jupan LT', 'Darmaloka', '087845301256', '1988-01-13', 'Bag Pengadaan & Pengolahan', 500000, 'Jupan', '123'),
(5, 'Lia A', 'Garawangi', '087824555671', '1985-08-19', 'Bag Administrasi ', 500000, 'Lia', '123');

-- --------------------------------------------------------

--
-- Struktur dari tabel `peminjaman`
--

CREATE TABLE `peminjaman` (
  `id_pin` int(11) NOT NULL,
  `tgl_pin` date DEFAULT NULL,
  `tgl_kem` date DEFAULT NULL,
  `id_buku` int(11) DEFAULT NULL,
  `id_anggota` int(11) DEFAULT NULL,
  `lama_pin` int(11) DEFAULT NULL,
  `denda` float DEFAULT NULL,
  `total_bayar` float DEFAULT NULL,
  `id_pegawai` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `peminjaman`
--

INSERT INTO `peminjaman` (`id_pin`, `tgl_pin`, `tgl_kem`, `id_buku`, `id_anggota`, `lama_pin`, `denda`, `total_bayar`, `id_pegawai`) VALUES
(6, '2016-07-13', '2016-07-16', 584121, 150116, 3, 0, 6000, 4),
(5, '2016-07-01', '2016-07-05', 566289, 120315, 4, 1000, 9000, 2),
(7, '2017-06-05', NULL, 701345, 120315, NULL, NULL, NULL, NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `anggota`
--
ALTER TABLE `anggota`
  ADD PRIMARY KEY (`id_anggota`);

--
-- Indexes for table `buku`
--
ALTER TABLE `buku`
  ADD PRIMARY KEY (`id_buku`);

--
-- Indexes for table `pegawai`
--
ALTER TABLE `pegawai`
  ADD PRIMARY KEY (`id_pegawai`);

--
-- Indexes for table `peminjaman`
--
ALTER TABLE `peminjaman`
  ADD PRIMARY KEY (`id_pin`),
  ADD KEY `id_buku` (`id_buku`),
  ADD KEY `id_anggota` (`id_anggota`),
  ADD KEY `id_pegawai` (`id_pegawai`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `peminjaman`
--
ALTER TABLE `peminjaman`
  MODIFY `id_pin` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
