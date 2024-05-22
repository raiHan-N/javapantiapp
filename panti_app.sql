-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 29 Apr 2024 pada 11.01
-- Versi server: 10.4.32-MariaDB
-- Versi PHP: 8.1.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `panti_app`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `admin`
--

CREATE TABLE `admin` (
  `id` varchar(10) NOT NULL,
  `nama` varchar(200) NOT NULL,
  `jenis` varchar(100) NOT NULL,
  `username` varchar(150) NOT NULL,
  `password` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `admin`
--

INSERT INTO `admin` (`id`, `nama`, `jenis`, `username`, `password`) VALUES
('AD001', 'Suryati', 'Orang Tua Asuh', 'Bu Sur', '12345678'),
('AD002', 'Wawan', 'Item 3', 'Pak Waw', '12345678');

-- --------------------------------------------------------

--
-- Struktur dari tabel `anak_asuh`
--

CREATE TABLE `anak_asuh` (
  `id` varchar(10) NOT NULL,
  `nama` varchar(200) NOT NULL,
  `jenis_kelamin` varchar(20) NOT NULL,
  `usia` int(100) NOT NULL,
  `tanggal_lahir` date NOT NULL,
  `tinggi_badan` int(250) NOT NULL,
  `berat_badan` int(250) NOT NULL,
  `golongan_darah` varchar(5) NOT NULL,
  `asal_daerah` varchar(150) NOT NULL,
  `berkebutuhan` varchar(20) NOT NULL,
  `riwayat_penyakit` varchar(150) NOT NULL,
  `riwayat_perilaku` varchar(150) NOT NULL,
  `tanggal_masuk_panti` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `anak_asuh`
--

INSERT INTO `anak_asuh` (`id`, `nama`, `jenis_kelamin`, `usia`, `tanggal_lahir`, `tinggi_badan`, `berat_badan`, `golongan_darah`, `asal_daerah`, `berkebutuhan`, `riwayat_penyakit`, `riwayat_perilaku`, `tanggal_masuk_panti`) VALUES
('AA001', 'Yoga', 'Laki-laki', 20, '2024-04-29', 169, 45, 'CB', 'Kramat Jati', 'Tidak', 'Tidak Ada', 'Baik', '2024-04-29');

-- --------------------------------------------------------

--
-- Struktur dari tabel `donasi`
--

CREATE TABLE `donasi` (
  `id` varchar(10) NOT NULL,
  `tanggal_donasi` date NOT NULL,
  `jenis_donasi` varchar(20) NOT NULL,
  `jumlah_donasi` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Struktur dari tabel `donatur`
--

CREATE TABLE `donatur` (
  `id` varchar(10) NOT NULL,
  `asal_donasi` varchar(50) NOT NULL,
  `nama_donatur` varchar(200) NOT NULL,
  `tipe_donasi` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `donatur`
--

INSERT INTO `donatur` (`id`, `asal_donasi`, `nama_donatur`, `tipe_donasi`) VALUES
('asd', 'Instasi', 'Perorangan', 'Tetap');

-- --------------------------------------------------------

--
-- Struktur dari tabel `ortu_adopsi`
--

CREATE TABLE `ortu_adopsi` (
  `id` varchar(10) NOT NULL,
  `nama_suami` varchar(200) NOT NULL,
  `usia_suami` int(100) NOT NULL,
  `agama_suami` varchar(100) NOT NULL,
  `pekerjaan_suami` varchar(150) NOT NULL,
  `nama_istri` varchar(200) NOT NULL,
  `usia_istri` int(100) NOT NULL,
  `agama_istri` varchar(100) NOT NULL,
  `pekerjaan_istri` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Struktur dari tabel `pengeluaran`
--

CREATE TABLE `pengeluaran` (
  `id` varchar(10) NOT NULL,
  `jumlah_pengeluaran` int(255) NOT NULL,
  `keperluan_pengeluaran` varchar(200) NOT NULL,
  `tanggal_pengeluaran` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `anak_asuh`
--
ALTER TABLE `anak_asuh`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `donasi`
--
ALTER TABLE `donasi`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `donatur`
--
ALTER TABLE `donatur`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `ortu_adopsi`
--
ALTER TABLE `ortu_adopsi`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `pengeluaran`
--
ALTER TABLE `pengeluaran`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
