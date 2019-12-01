-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 13, 2018 at 08:25 AM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `busm`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin_details`
--

CREATE TABLE `admin_details` (
  `id` int(20) NOT NULL,
  `name` varchar(100) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin_details`
--

INSERT INTO `admin_details` (`id`, `name`, `username`, `password`) VALUES
(1, 'sami', 'admin', 'admin'),
(2, 'raj', 'admin2', 'admin2');

-- --------------------------------------------------------

--
-- Table structure for table `booking_details`
--

CREATE TABLE `booking_details` (
  `booking_id` int(200) NOT NULL,
  `booking_user` varchar(200) NOT NULL,
  `journey_date` varchar(200) NOT NULL,
  `bus_no` varchar(200) NOT NULL,
  `seat` varchar(200) NOT NULL,
  `paid` varchar(200) NOT NULL,
  `id_no` varchar(200) NOT NULL,
  `first_name` varchar(200) NOT NULL,
  `last_name` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `bus_details`
--

CREATE TABLE `bus_details` (
  `id` int(20) NOT NULL,
  `bus_no` varchar(200) NOT NULL,
  `movement` varchar(200) NOT NULL,
  `bus_source` varchar(200) NOT NULL,
  `bus_dest` varchar(200) NOT NULL,
  `depart_date` varchar(200) NOT NULL,
  `depart_time` varchar(200) NOT NULL,
  `price` int(20) NOT NULL,
  `total_seat` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bus_details`
--

INSERT INTO `bus_details` (`id`, `bus_no`, `movement`, `bus_source`, `bus_dest`, `depart_date`, `depart_time`, `price`, `total_seat`) VALUES
(1, 'jhhk', 'Up', 'kjkjlkl', 'jhkjgk', '2018-03-13', '10.10', 100, 1),
(2, 'Hnf', 'Up', 'Dhaka', 'Mymensingh', '2018-03-10', '5.10', 220, 1),
(3, 'Ena', 'Up', 'Dhaka ', 'Mymensingh', '2018-04-10', '10.30', 300, 56),
(4, 'a1', 'Down', 'adasdf', 'asdfasf', '2018-03-06', '10', 1233, 56),
(5, 'GreemTVL-101', 'Up', 'Dhaka', 'Natore', '2018-03-12', '10:50', 370, 4);

-- --------------------------------------------------------

--
-- Table structure for table `employee_details`
--

CREATE TABLE `employee_details` (
  `eid` int(20) NOT NULL,
  `first_name` varchar(200) NOT NULL,
  `last_name` varchar(200) NOT NULL,
  `phone_no1` varchar(200) NOT NULL,
  `phone_no2` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee_details`
--

INSERT INTO `employee_details` (`eid`, `first_name`, `last_name`, `phone_no1`, `phone_no2`) VALUES
(1, 'sdfd', 'asdfdsf', '12', '23'),
(2, 'asdf', 'dsf', '13', '24');

-- --------------------------------------------------------

--
-- Table structure for table `user_details`
--

CREATE TABLE `user_details` (
  `id` int(10) NOT NULL,
  `firstname` varchar(100) NOT NULL,
  `lastname` varchar(100) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `email_id` varchar(100) NOT NULL,
  `web_url` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user_details`
--

INSERT INTO `user_details` (`id`, `firstname`, `lastname`, `username`, `password`, `email_id`, `web_url`) VALUES
(1, 'ss', 's', 's', '123', 'as', 'asd'),
(2, 'a', 'asd', 'adsf', '65654', 'asdf', 'sdfdsf'),
(3, 'n', 'o', 'm', 'a', 'n', 'h'),
(4, 'ngh', 'ohgj', 'mhgj', 'a44', 'nhj', 'hhg'),
(5, 'df', 'adsf', 'sdf', '3434', 'erdf', 'adfaf'),
(6, 'sakib', 'raj', 'sakibraj', '324', 'adf', 'adf'),
(7, 's', 's', 's', 's', 's', 's'),
(8, 'a', 'aa', 'b', '123', 'dfgd', 'adfdf'),
(9, 'd', 'adfa', 'd', '123', 'ads', 'asdf'),
(10, 'zsd', 'sdf', 'a', '123', 'asdf', 'adf'),
(11, 'l', 'adsf', 'l', '123', 'adf', 'adf'),
(12, 'fhjk', 'ghjk', 'n', '123', 'ghjhk', 'ghjhk'),
(13, 'hjh', 'ghjdh', 'o', '123', 'hgjfh', 'hjjhk'),
(14, 'jkljkl', 'lkk', 'z', '123', 'hjkbk', 'jkljjll'),
(15, 'adfdf', 'dafdf', 'z', '123', 'sfgfs', 'sfgfg');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin_details`
--
ALTER TABLE `admin_details`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `booking_details`
--
ALTER TABLE `booking_details`
  ADD PRIMARY KEY (`booking_id`);

--
-- Indexes for table `bus_details`
--
ALTER TABLE `bus_details`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `employee_details`
--
ALTER TABLE `employee_details`
  ADD PRIMARY KEY (`eid`);

--
-- Indexes for table `user_details`
--
ALTER TABLE `user_details`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin_details`
--
ALTER TABLE `admin_details`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `booking_details`
--
ALTER TABLE `booking_details`
  MODIFY `booking_id` int(200) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `bus_details`
--
ALTER TABLE `bus_details`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `employee_details`
--
ALTER TABLE `employee_details`
  MODIFY `eid` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `user_details`
--
ALTER TABLE `user_details`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
