-- MySQL dump 10.13  Distrib 5.7.12, for linux-glibc2.5 (x86_64)
--
-- Host: 127.0.0.1    Database: gestor_academia
-- ------------------------------------------------------
-- Server version	5.5.5-10.1.13-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `alumno`
--

DROP TABLE IF EXISTS `alumno`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `alumno` (
  `idAlumno` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `apellidos` varchar(255) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `telefono` varchar(9) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `nif` varchar(9) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `direccion` varchar(255) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `cp` varchar(5) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `poblacion` varchar(255) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `provincia` varchar(255) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `rrss` tinyint(1) NOT NULL,
  `vulebu` tinyint(1) DEFAULT NULL,
  `createdAt` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`idAlumno`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1 COMMENT='Datos de un alumno';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `alumno_asignatura`
--

DROP TABLE IF EXISTS `alumno_asignatura`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `alumno_asignatura` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `idAlumno` int(11) DEFAULT NULL,
  `idAsignatura` int(11) DEFAULT NULL,
  `fecha_inicio` date DEFAULT NULL,
  `fecha_fin` date DEFAULT NULL,
  `importeEditado` float DEFAULT NULL,
  `fechaMod` date DEFAULT NULL,
  `observaciones` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_alumno_asignatura_1_idx` (`idAlumno`),
  KEY `fk_alumno_asignatura_asignatura_idx` (`idAsignatura`),
  CONSTRAINT `fk_alumno_asignatura_alumno` FOREIGN KEY (`idAlumno`) REFERENCES `alumno` (`idAlumno`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `fk_alumno_asignatura_asignatura` FOREIGN KEY (`idAsignatura`) REFERENCES `asignatura` (`idAsignatura`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `asignatura`
--

DROP TABLE IF EXISTS `asignatura`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `asignatura` (
  `idAsignatura` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `precioBruto` float NOT NULL,
  `idProfesor` int(11) NOT NULL,
  `descuento` tinyint(1) NOT NULL DEFAULT '0' COMMENT 'Indica si se le puede aplicar el descuento VULEBU',
  `createdAt` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`idAsignatura`),
  KEY `idProfesor` (`idProfesor`),
  CONSTRAINT `asignatura_ibfk_idProfesor` FOREIGN KEY (`idProfesor`) REFERENCES `profesor` (`idProfesor`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `descuento`
--

DROP TABLE IF EXISTS `descuento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `descuento` (
  `idDescuento` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) COLLATE utf8_spanish_ci DEFAULT NULL,
  PRIMARY KEY (`idDescuento`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `descuentos_alumnos`
--

DROP TABLE IF EXISTS `descuentos_alumnos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `descuentos_alumnos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `idDescuento` int(11) DEFAULT NULL,
  `idAsignatura` int(11) DEFAULT NULL,
  `idAlumno` int(11) DEFAULT NULL,
  `activo` tinyint(1) DEFAULT '0',
  `cantidad` float DEFAULT NULL,
  `porcentaje` float DEFAULT NULL,
  `referidoPor` int(11) DEFAULT NULL,
  `refiereA` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_descuentos_asignaturas_descuento_idx` (`idDescuento`),
  KEY `fk_descuentos_asignaturas_asignatura_idx` (`idAsignatura`),
  KEY `fk_descuentos_asignaturas_alumno_idx` (`idAlumno`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `entrada_recibo`
--

DROP TABLE IF EXISTS `entrada_recibo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `entrada_recibo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `codRecibo` varchar(9) CHARACTER SET utf8 DEFAULT NULL,
  `tipoEntrada` int(11) DEFAULT NULL,
  `concepto` varchar(255) COLLATE utf8_spanish_ci DEFAULT NULL,
  `tipoDescuento` varchar(45) COLLATE utf8_spanish_ci DEFAULT NULL COMMENT 'Tipo de descuento: Porcentual o absoluto',
  `descuento` float DEFAULT '0' COMMENT 'Cantidad a descontar',
  `cantidad` float DEFAULT NULL COMMENT 'Cantidad a pagar después de aplicar el descuento',
  `observaciones` text CHARACTER SET utf8 COMMENT 'Tipo de entrada (asignatura, descuento, hora extra)',
  PRIMARY KEY (`id`),
  KEY `fk_entrada_recibo_recibo_idx` (`codRecibo`),
  CONSTRAINT `fk_entrada_recibo_recibo` FOREIGN KEY (`codRecibo`) REFERENCES `recibo` (`codRecibo`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=293 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `historico_alumno_asignatura`
--

DROP TABLE IF EXISTS `historico_alumno_asignatura`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `historico_alumno_asignatura` (
  `id` int(11) NOT NULL,
  `idAlumno` int(11) DEFAULT NULL,
  `idAsignatura` int(11) DEFAULT NULL,
  `fecha_inicio` date DEFAULT NULL,
  `fecha_fin` date DEFAULT NULL,
  `observaciones` text COLLATE utf8_spanish_ci,
  PRIMARY KEY (`id`),
  KEY `fk_historico_alumno_asignatura_alumno_idx` (`idAlumno`),
  KEY `fk_historico_alumno_asignatura_asignatura_idx` (`idAsignatura`),
  CONSTRAINT `fk_historico_alumno_asignatura_alumno` FOREIGN KEY (`idAlumno`) REFERENCES `alumno` (`idAlumno`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `fk_historico_alumno_asignatura_asignatura` FOREIGN KEY (`idAsignatura`) REFERENCES `asignatura` (`idAsignatura`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `horas_extra`
--

DROP TABLE IF EXISTS `horas_extra`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `horas_extra` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `idAsignatura` int(11) DEFAULT NULL,
  `idAlumno` int(11) DEFAULT NULL,
  `numHoras` float DEFAULT NULL,
  `precio` float DEFAULT NULL,
  `mes` int(2) DEFAULT NULL,
  `anyo` int(4) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_horas_extra_asignatura_idx` (`idAsignatura`),
  KEY `fk_horas_extra_alumno_idx` (`idAlumno`),
  CONSTRAINT `fk_horas_extra_alumno` FOREIGN KEY (`idAlumno`) REFERENCES `alumno` (`idAlumno`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `fk_horas_extra_asignatura` FOREIGN KEY (`idAsignatura`) REFERENCES `asignatura` (`idAsignatura`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `profesor`
--

DROP TABLE IF EXISTS `profesor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `profesor` (
  `idProfesor` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `apellidos` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `fechaNacimiento` date NOT NULL,
  `sueldo` float NOT NULL,
  `telefono` varchar(9) CHARACTER SET utf8 NOT NULL,
  `cuentaBancaria` varchar(24) COLLATE utf8_spanish_ci NOT NULL,
  `createdAt` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`idProfesor`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `recibo`
--

DROP TABLE IF EXISTS `recibo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `recibo` (
  `codRecibo` varchar(9) CHARACTER SET utf8 NOT NULL,
  `idAlumno` int(11) DEFAULT NULL,
  `mes` int(11) DEFAULT NULL,
  `anyo` int(11) DEFAULT NULL,
  `fechaEmision` date DEFAULT NULL,
  `fechaPago` date DEFAULT NULL,
  `cantidadTotal` float DEFAULT NULL,
  `observaciones` float DEFAULT NULL,
  PRIMARY KEY (`codRecibo`),
  KEY `fk_recibo_alumno_idx` (`idAlumno`),
  CONSTRAINT `fk_recibo_alumno` FOREIGN KEY (`idAlumno`) REFERENCES `alumno` (`idAlumno`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario` (
  `idUsuario` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `password` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `rol` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`idUsuario`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-11-03 21:12:38
