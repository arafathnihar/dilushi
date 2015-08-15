-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Aug 15, 2015 at 07:25 PM
-- Server version: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `movedb`
--

-- --------------------------------------------------------

--
-- Table structure for table `bill`
--

CREATE TABLE IF NOT EXISTS `bill` (
  `BillNo` varchar(255) NOT NULL,
  `BiLLDate` datetime DEFAULT NULL,
  `BiLLNote` varchar(255) DEFAULT NULL,
  `BiLLAmount` int(11) DEFAULT '0',
  PRIMARY KEY (`BillNo`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `billitem`
--

CREATE TABLE IF NOT EXISTS `billitem` (
  `BiLLItemNo` int(11) NOT NULL AUTO_INCREMENT,
  `BiLLNo` varchar(255) DEFAULT NULL,
  `ProductID` varchar(255) DEFAULT NULL,
  `Qty` int(11) DEFAULT '0',
  `UnitPrice` int(11) DEFAULT '0',
  `Total` int(11) DEFAULT '0',
  PRIMARY KEY (`BiLLItemNo`),
  KEY `ProductID` (`ProductID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `distri`
--

CREATE TABLE IF NOT EXISTS `distri` (
  `DistriCode` varchar(255) NOT NULL,
  `DistriName` varchar(255) NOT NULL,
  `DistriAdd` varchar(255) DEFAULT NULL,
  `DistriTel` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`DistriCode`),
  KEY `DistriCode` (`DistriCode`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `initem`
--

CREATE TABLE IF NOT EXISTS `initem` (
  `InItemID` int(11) NOT NULL AUTO_INCREMENT,
  `InvoiceID` varchar(255) DEFAULT NULL,
  `ProductID` varchar(255) NOT NULL,
  `InItemPackSize` int(11) DEFAULT '0',
  `InItemQty` int(11) DEFAULT '0',
  `InItemFree` int(11) DEFAULT '0',
  `InItemPrice` decimal(19,4) DEFAULT '0.0000',
  `InItemMargin` int(11) DEFAULT '15',
  `InItemExpiry` datetime DEFAULT NULL,
  `InItemDisc` decimal(19,4) DEFAULT '0.0000',
  `InItemSold` int(11) DEFAULT '0',
  PRIMARY KEY (`InItemID`),
  KEY `InvoiceID` (`InvoiceID`),
  KEY `ProductID` (`ProductID`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 AUTO_INCREMENT=14 ;

--
-- Dumping data for table `initem`
--

INSERT INTO `initem` (`InItemID`, `InvoiceID`, `ProductID`, `InItemPackSize`, `InItemQty`, `InItemFree`, `InItemPrice`, `InItemMargin`, `InItemExpiry`, `InItemDisc`, `InItemSold`) VALUES
(1, '2222', '3333', 4444, 5555, 6666, '7777.0000', 8888, NULL, '111.0000', 222),
(2, '2222', '3333', 4444, 5555, 6666, '7777.0000', 8888, NULL, '111.0000', 222),
(3, '2222', '3333', 4444, 5555, 6666, '7777.0000', 8888, NULL, '111.0000', 222),
(4, '2222', '3333', 4444, 5555, 6666, '7777.0000', 8888, NULL, '111.0000', 222),
(5, '2222', '3333', 4444, 5555, 6666, '7777.0000', 8888, NULL, '111.0000', 222),
(6, '2222', '3333', 4444, 5555, 6666, '7777.0000', 8888, NULL, '111.0000', 222),
(7, '2222', '3333', 4444, 5555, 6666, '7777.0000', 8888, NULL, '111.0000', 222),
(8, '', '', 33, 44, 55, '66.0000', 77, '2015-08-01 00:00:00', '99.0000', 10),
(9, '', '', 33, 44, 55, '66.0000', 77, '2015-08-01 00:00:00', '99.0000', 10),
(10, '', '', 33, 44, 55, '66.0000', 77, '2015-08-01 00:00:00', '99.0000', 10),
(11, '11', '22', 33, 44, 55, '66.0000', 77, NULL, '99.0000', 10),
(12, 'InvoiceID', 'ProductID', 11, 22, 33, '44.0000', 55, '2015-08-02 00:00:00', '66.0000', 77),
(13, 'InvoiceID', 'ProductID', 11, 22, 33, '44.0000', 55, '2015-08-02 00:00:00', '66.0000', 77);

-- --------------------------------------------------------

--
-- Table structure for table `invoice`
--

CREATE TABLE IF NOT EXISTS `invoice` (
  `InvoiceID` varchar(255) NOT NULL DEFAULT '',
  `DistriCode` varchar(255) NOT NULL,
  `InvoiceDate` datetime DEFAULT NULL,
  `InvoiceNote` char(255) DEFAULT NULL,
  `InvoicePayMode` char(255) DEFAULT '0',
  `InvoicePayment` decimal(19,4) DEFAULT '0.0000',
  PRIMARY KEY (`InvoiceID`),
  KEY `DistriCode` (`DistriCode`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE IF NOT EXISTS `product` (
  `ProductID` varchar(255) NOT NULL,
  `ProductName` varchar(255) NOT NULL,
  `ProductDiscription` varchar(255) DEFAULT NULL,
  `ProductBrand` varchar(255) DEFAULT NULL,
  `ProductStrength` int(11) DEFAULT '0',
  `ProductStype` varchar(255) DEFAULT NULL,
  `ProductStock` int(11) DEFAULT '0',
  `ProductMinStock` double DEFAULT NULL,
  PRIMARY KEY (`ProductID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
