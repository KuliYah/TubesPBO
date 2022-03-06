-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 17 Jun 2021 pada 20.00
-- Versi server: 10.4.19-MariaDB
-- Versi PHP: 7.3.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tugasakhir`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `admin`
--

CREATE TABLE `admin` (
  `libraryId` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `admin`
--

INSERT INTO `admin` (`libraryId`, `password`) VALUES
('admin', 'admin');

-- --------------------------------------------------------

--
-- Struktur dari tabel `buku`
--

CREATE TABLE `buku` (
  `id_buku` varchar(255) NOT NULL,
  `judul_buku` varchar(255) NOT NULL,
  `penerbit` varchar(255) NOT NULL,
  `stok` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `buku`
--

INSERT INTO `buku` (`id_buku`, `judul_buku`, `penerbit`, `stok`) VALUES
('13', 'Dilan', 'Pidi Baiq', 4),
('22', 'Ayam Kampung', 'Pt.Sabung Ayam', 3),
('66', 'Cantik', 'Dannyla', 9),
('69', 'Rudy Habibie', 'Gramedia', 3);

-- --------------------------------------------------------

--
-- Struktur dari tabel `login_admin`
--

CREATE TABLE `login_admin` (
  `libraryId` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `log_in`
--

CREATE TABLE `log_in` (
  `LibId` varchar(255) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `noHp` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `tgl_lahir` date NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `member`
--

CREATE TABLE `member` (
  `libraryId` varchar(30) NOT NULL,
  `nama` varchar(30) DEFAULT NULL,
  `noHp` varchar(15) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `tgl_lahir` date DEFAULT NULL,
  `password` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `member`
--

INSERT INTO `member` (`libraryId`, `nama`, `noHp`, `email`, `tgl_lahir`, `password`) VALUES
('0601', 'Alif', '082267396716', 'Alif@gmal.com', '1996-06-01', '12345'),
('060122', 'kylnd', '082267396716', 'dandakomang@gmail.com', '2001-06-01', '01122001'),
('1206', 'dondon', '0908982139', 'damksdkm@gmail.com', '2001-06-01', '01122001'),
('1234', 'dora', '9184071240810', 'bahsb@gmail.com', '1987-12-01', '01122001'),
('2212', 'dada', '098765543', 'dasdsa@gmail.com', '2001-12-01', '01122001'),
('3444', 'ddas', '89012830982', 'dads@gmail.com', '1925-01-01', '01122001'),
('666666', 'lolox', '9988776262', 'lolox@gmail.com', '2001-12-22', '12345'),
('7777', 'Priyo', '12414315235', 'asas@gmail.com', '1921-01-01', '01122001');

--
-- Trigger `member`
--
DELIMITER $$
CREATE TRIGGER `updatenamapeminjam` AFTER UPDATE ON `member` FOR EACH ROW UPDATE peminjaman SET namaPeminjam=new.nama
WHERE libraryId = new.libraryId
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Struktur dari tabel `peminjaman`
--

CREATE TABLE `peminjaman` (
  `libraryId` varchar(255) NOT NULL,
  `namaPeminjam` varchar(255) NOT NULL,
  `id_buku` int(255) NOT NULL,
  `namaBuku` varchar(255) NOT NULL,
  `tgl_pinjam` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `peminjaman`
--

INSERT INTO `peminjaman` (`libraryId`, `namaPeminjam`, `id_buku`, `namaBuku`, `tgl_pinjam`) VALUES
('7777', 'Priyo', 13, 'Dilan', '2021-06-18'),
('0601', 'Alif', 66, 'Cantik', '2021-06-18');

--
-- Trigger `peminjaman`
--
DELIMITER $$
CREATE TRIGGER `kembalikanbukut` AFTER DELETE ON `peminjaman` FOR EACH ROW UPDATE buku SET stok=stok+1
WHERE judul_buku = OLD.namaBuku
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `setok` AFTER INSERT ON `peminjaman` FOR EACH ROW UPDATE buku SET stok=stok-1
WHERE judul_buku = NEW.namaBuku
$$
DELIMITER ;

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`libraryId`);

--
-- Indeks untuk tabel `buku`
--
ALTER TABLE `buku`
  ADD PRIMARY KEY (`id_buku`);

--
-- Indeks untuk tabel `login_admin`
--
ALTER TABLE `login_admin`
  ADD PRIMARY KEY (`libraryId`);

--
-- Indeks untuk tabel `log_in`
--
ALTER TABLE `log_in`
  ADD PRIMARY KEY (`LibId`);

--
-- Indeks untuk tabel `member`
--
ALTER TABLE `member`
  ADD PRIMARY KEY (`libraryId`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
