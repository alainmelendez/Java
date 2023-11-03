-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 10-09-2023 a las 21:08:50
-- Versión del servidor: 10.4.27-MariaDB
-- Versión de PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bazar`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `id_cliente` bigint(20) NOT NULL,
  `apellido_cliente` varchar(255) DEFAULT NULL,
  `dni` varchar(255) DEFAULT NULL,
  `nombre_cliente` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`id_cliente`, `apellido_cliente`, `dni`, `nombre_cliente`) VALUES
(1, 'Merengue', '987654', 'Lele'),
(2, 'Merengue', '123456', 'Alain');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `codigo_producto` bigint(20) NOT NULL,
  `cantidad_disponible` double DEFAULT NULL,
  `costo` double DEFAULT NULL,
  `marca_producto` varchar(255) DEFAULT NULL,
  `nombre_producto` varchar(255) DEFAULT NULL,
  `codigo_venta` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`codigo_producto`, `cantidad_disponible`, `costo`, `marca_producto`, `nombre_producto`, `codigo_venta`) VALUES
(1, 10, 1.5, 'marca1', 'Producto1', 1),
(2, 8, 1.7, 'marca2', 'Producto2', 1),
(5, 8, 4, 'Marca2', 'Producto2', 1),
(6, 8, 10, 'Marca2', 'Producto2', 1),
(7, 8, 10, 'Marca2', 'Producto2', 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta`
--

CREATE TABLE `venta` (
  `codigo_venta` bigint(20) NOT NULL,
  `fecha_venta` date DEFAULT NULL,
  `total` double DEFAULT NULL,
  `id_cliente` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Volcado de datos para la tabla `venta`
--

INSERT INTO `venta` (`codigo_venta`, `fecha_venta`, `total`, `id_cliente`) VALUES
(1, '2020-01-13', 14, 1),
(3, '2020-05-13', 10, 2);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id_cliente`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`codigo_producto`),
  ADD KEY `FK8iurek4xdqdy9vd9nk8dux49l` (`codigo_venta`);

--
-- Indices de la tabla `venta`
--
ALTER TABLE `venta`
  ADD PRIMARY KEY (`codigo_venta`),
  ADD KEY `FKsor2qmi3thao7a8or49vlohp9` (`id_cliente`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id_cliente` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `codigo_producto` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `venta`
--
ALTER TABLE `venta`
  MODIFY `codigo_venta` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `producto`
--
ALTER TABLE `producto`
  ADD CONSTRAINT `FK8iurek4xdqdy9vd9nk8dux49l` FOREIGN KEY (`codigo_venta`) REFERENCES `venta` (`codigo_venta`);

--
-- Filtros para la tabla `venta`
--
ALTER TABLE `venta`
  ADD CONSTRAINT `FKsor2qmi3thao7a8or49vlohp9` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id_cliente`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
