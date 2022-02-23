-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Φιλοξενητής: 127.0.0.1
-- Χρόνος δημιουργίας: 19 Ιουν 2021 στις 15:14:34
-- Έκδοση διακομιστή: 10.4.11-MariaDB
-- Έκδοση PHP: 7.4.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Βάση δεδομένων: `nefos`
--

-- --------------------------------------------------------

--
-- Δομή πίνακα για τον πίνακα `mitroo`
--

CREATE TABLE `mitroo` (
  `at` varchar(45) NOT NULL,
  `name` varchar(45) NOT NULL,
  `lname` varchar(45) NOT NULL,
  `fylo` varchar(45) NOT NULL,
  `bdate` varchar(45) NOT NULL,
  `afm` varchar(45) NOT NULL,
  `amka` varchar(45) NOT NULL,
  `address` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Άδειασμα δεδομένων του πίνακα `mitroo`
--

INSERT INTO `mitroo` (`at`, `name`, `lname`, `fylo`, `bdate`, `afm`, `amka`, `address`) VALUES
('1234567890', 'kostas ', 'nikoll ', 'male', '2-7-99', '222555511 ', '655fxbfbx ', ' kolooy 9 '),
('1478523690', 'Hlias', 'Papas', 'male', '5-10-1982', '1478521472', '3654741218', 'Aisopou 7 Xalandri'),
('4588963361', 'Maria', 'Anagnostou', 'female', '4-6-1996', '3144785121', '1244556698', 'Papanikolaou 19 Hrakleio'),
('7485114723', 'Antonis', 'Antoniou', 'male', '7-9-1994', '1456785210', '1247854712', 'Nikis 8 Galatsi'),
('7888541200', 'Katerina', 'Papadopoulou', 'female', '6-8-1997', '1598647235', '6985321475', 'Nikolaou 8 kavala'),
('87453215698', 'Stauroula', 'Karra', 'female', '22-9-1990', '4102569812', '0212559874', 'Themistokli 11 Patisia'),
('8965741236', 'Niki', 'Nikou', 'female', '5-2-1996', '4578963214', '1554748556', 'Laxana 20 Keratsini'),
('test1', 'test1', 'test1', 'test1', 'test1', 'test1', 'test1', 'test1'),
('test4', 'test4', 'test4', 'test4', 'test4', 'test4', 'test4', 'test4');

--
-- Ευρετήρια για άχρηστους πίνακες
--

--
-- Ευρετήρια για πίνακα `mitroo`
--
ALTER TABLE `mitroo`
  ADD PRIMARY KEY (`at`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
