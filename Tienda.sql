-- phpMyAdmin SQL Dump
-- version 4.5.2
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 30-11-2016 a las 21:52:36
-- Versión del servidor: 10.1.16-MariaDB
-- Versión de PHP: 7.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

CREATE database Tienda;
USE Tienda;

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `Tienda`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `cod` int(11) NOT NULL,
  `nombre` varchar(50) COLLATE utf8_general_mysql500_ci NOT NULL,
  `descripcion` varchar(3000) COLLATE utf8_general_mysql500_ci NOT NULL,
  `precio` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`cod`, `nombre`, `descripcion`, `precio`) VALUES
(1, 'Patito de goma', 'Juguete con forma de pato. Flota en el agua. Color amarillo.', 3.5),
(2, 'Jarrón exótico floral', 'Jarrón decorativo hecho de porcelana.', 17),
(3, 'Vaso transparente', 'Vaso de vidrio muy resistente. Apropiado para su uso en microondas.', 4),
(4, 'Set de cubiertos', 'Set de cubertería. Compuesto de tenedor, cuchara y cuchillo. Fabricado en acero inoxidable. Se puede lavar en lavavajillas.', 10.25),
(5, 'Pelapatatas', 'Pelapatatas ergonómico de alta calidad. Cuchillas de acero inoxidable.', 12);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`cod`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `productos`
--
ALTER TABLE `productos`
  MODIFY `cod` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
