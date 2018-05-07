-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 22-04-2018 a las 00:13:37
-- Versión del servidor: 10.1.31-MariaDB
-- Versión de PHP: 7.2.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `camiseta`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `administrador`
--

CREATE TABLE `administrador` (
  `id_Administrador` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `id_cliente` int(11) NOT NULL,
  `id_artista` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `artista`
--

CREATE TABLE `artista` (
  `id_artista` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `apellido` varchar(30) NOT NULL,
  `correo` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `genero` varchar(30) NOT NULL,
  `telefono` varchar(30) NOT NULL,
  `direccion` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `camiseta`
--

CREATE TABLE `camiseta` (
  `id_camiseta` int(11) NOT NULL,
  `nombre` int(11) NOT NULL,
  `color` int(11) NOT NULL,
  `talla` int(11) NOT NULL,
  `estilo` varchar(30) NOT NULL,
  `material` varchar(30) NOT NULL,
  `precio` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `carro_compras`
--

CREATE TABLE `carro_compras` (
  `id_carro` int(11) NOT NULL,
  `id_confguracion` int(11) NOT NULL,
  `id_cliente` int(11) NOT NULL,
  `precioTotal` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `catalogo_estampas`
--

CREATE TABLE `catalogo_estampas` (
  `id_estampa` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `tema` varchar(30) NOT NULL,
  `autor` varchar(30) NOT NULL,
  `descripcion` varchar(30) NOT NULL,
  `tamaño` varchar(30) NOT NULL,
  `precio` varchar(30) NOT NULL,
  `imagen` varchar(30) NOT NULL,
  `id_artista` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `id_cliente` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `apellido` varchar(30) NOT NULL,
  `correo` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `genero` varchar(30) NOT NULL,
  `telefono` varchar(30) NOT NULL,
  `direccion` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `configuracion_estampa`
--

CREATE TABLE `configuracion_estampa` (
  `id_configuracion` int(11) NOT NULL,
  `calificacion` varchar(30) NOT NULL,
  `ubicacion` varchar(30) NOT NULL,
  `id_catalogo` int(11) NOT NULL,
  `id_camiseta` int(11) NOT NULL,
  `id_texto` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `forma_pago`
--

CREATE TABLE `forma_pago` (
  `id_pago` int(11) NOT NULL,
  `nombrePago` varchar(30) NOT NULL,
  `id_targeta` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido`
--

CREATE TABLE `pedido` (
  `id_pedido` int(11) NOT NULL,
  `id_cliente` int(11) NOT NULL,
  `direccion` varchar(30) NOT NULL,
  `fecha` date NOT NULL,
  `id_registro` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `registro`
--

CREATE TABLE `registro` (
  `id_registro` int(11) NOT NULL,
  `nombreEstampa` varchar(30) NOT NULL,
  `precio` varchar(30) NOT NULL,
  `tema` varchar(30) NOT NULL,
  `autor` varchar(30) NOT NULL,
  `cantidad` varchar(30) NOT NULL,
  `formaPago` varchar(30) NOT NULL,
  `numeroCuenta` varchar(30) NOT NULL,
  `id_carrito` int(11) NOT NULL,
  `id_forma` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `targeta`
--

CREATE TABLE `targeta` (
  `id_targeta` int(11) NOT NULL,
  `nombreBanco` varchar(30) NOT NULL,
  `tipoTargeta` varchar(30) NOT NULL,
  `franquicia` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `texto`
--

CREATE TABLE `texto` (
  `id_texto` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `tamaño` varchar(30) NOT NULL,
  `precio` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `administrador`
--
ALTER TABLE `administrador`
  ADD PRIMARY KEY (`id_Administrador`),
  ADD KEY `id_artista` (`id_artista`),
  ADD KEY `id_cliente` (`id_cliente`);

--
-- Indices de la tabla `artista`
--
ALTER TABLE `artista`
  ADD PRIMARY KEY (`id_artista`);

--
-- Indices de la tabla `camiseta`
--
ALTER TABLE `camiseta`
  ADD PRIMARY KEY (`id_camiseta`);

--
-- Indices de la tabla `carro_compras`
--
ALTER TABLE `carro_compras`
  ADD PRIMARY KEY (`id_carro`),
  ADD KEY `id_cliente` (`id_cliente`),
  ADD KEY `id_confguracion` (`id_confguracion`);

--
-- Indices de la tabla `catalogo_estampas`
--
ALTER TABLE `catalogo_estampas`
  ADD PRIMARY KEY (`id_estampa`),
  ADD KEY `id_artista` (`id_artista`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id_cliente`);

--
-- Indices de la tabla `configuracion_estampa`
--
ALTER TABLE `configuracion_estampa`
  ADD PRIMARY KEY (`id_configuracion`),
  ADD KEY `id_camiseta` (`id_camiseta`),
  ADD KEY `id_texto` (`id_texto`),
  ADD KEY `id_catalogo` (`id_catalogo`);

--
-- Indices de la tabla `forma_pago`
--
ALTER TABLE `forma_pago`
  ADD PRIMARY KEY (`id_pago`),
  ADD KEY `id_targeta` (`id_targeta`);

--
-- Indices de la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD PRIMARY KEY (`id_pedido`),
  ADD KEY `id_cliente` (`id_cliente`),
  ADD KEY `id_registro` (`id_registro`);

--
-- Indices de la tabla `registro`
--
ALTER TABLE `registro`
  ADD PRIMARY KEY (`id_registro`),
  ADD KEY `id_forma` (`id_forma`),
  ADD KEY `id_carrito` (`id_carrito`);

--
-- Indices de la tabla `targeta`
--
ALTER TABLE `targeta`
  ADD PRIMARY KEY (`id_targeta`);

--
-- Indices de la tabla `texto`
--
ALTER TABLE `texto`
  ADD PRIMARY KEY (`id_texto`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `administrador`
--
ALTER TABLE `administrador`
  MODIFY `id_Administrador` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `artista`
--
ALTER TABLE `artista`
  MODIFY `id_artista` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `camiseta`
--
ALTER TABLE `camiseta`
  MODIFY `id_camiseta` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `carro_compras`
--
ALTER TABLE `carro_compras`
  MODIFY `id_carro` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `catalogo_estampas`
--
ALTER TABLE `catalogo_estampas`
  MODIFY `id_estampa` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id_cliente` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `configuracion_estampa`
--
ALTER TABLE `configuracion_estampa`
  MODIFY `id_configuracion` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `forma_pago`
--
ALTER TABLE `forma_pago`
  MODIFY `id_pago` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `pedido`
--
ALTER TABLE `pedido`
  MODIFY `id_pedido` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `registro`
--
ALTER TABLE `registro`
  MODIFY `id_registro` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `targeta`
--
ALTER TABLE `targeta`
  MODIFY `id_targeta` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `texto`
--
ALTER TABLE `texto`
  MODIFY `id_texto` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `administrador`
--
ALTER TABLE `administrador`
  ADD CONSTRAINT `administrador_ibfk_1` FOREIGN KEY (`id_artista`) REFERENCES `artista` (`id_artista`),
  ADD CONSTRAINT `administrador_ibfk_2` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id_cliente`);

--
-- Filtros para la tabla `carro_compras`
--
ALTER TABLE `carro_compras`
  ADD CONSTRAINT `carro_compras_ibfk_1` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id_cliente`),
  ADD CONSTRAINT `carro_compras_ibfk_2` FOREIGN KEY (`id_confguracion`) REFERENCES `configuracion_estampa` (`id_configuracion`);

--
-- Filtros para la tabla `catalogo_estampas`
--
ALTER TABLE `catalogo_estampas`
  ADD CONSTRAINT `catalogo_estampas_ibfk_1` FOREIGN KEY (`id_artista`) REFERENCES `artista` (`id_artista`);

--
-- Filtros para la tabla `configuracion_estampa`
--
ALTER TABLE `configuracion_estampa`
  ADD CONSTRAINT `configuracion_estampa_ibfk_1` FOREIGN KEY (`id_camiseta`) REFERENCES `camiseta` (`id_camiseta`),
  ADD CONSTRAINT `configuracion_estampa_ibfk_2` FOREIGN KEY (`id_texto`) REFERENCES `texto` (`id_texto`),
  ADD CONSTRAINT `configuracion_estampa_ibfk_3` FOREIGN KEY (`id_catalogo`) REFERENCES `catalogo_estampas` (`id_estampa`);

--
-- Filtros para la tabla `forma_pago`
--
ALTER TABLE `forma_pago`
  ADD CONSTRAINT `forma_pago_ibfk_1` FOREIGN KEY (`id_targeta`) REFERENCES `targeta` (`id_targeta`);

--
-- Filtros para la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD CONSTRAINT `pedido_ibfk_1` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id_cliente`),
  ADD CONSTRAINT `pedido_ibfk_2` FOREIGN KEY (`id_registro`) REFERENCES `registro` (`id_registro`);

--
-- Filtros para la tabla `registro`
--
ALTER TABLE `registro`
  ADD CONSTRAINT `registro_ibfk_1` FOREIGN KEY (`id_forma`) REFERENCES `forma_pago` (`id_pago`),
  ADD CONSTRAINT `registro_ibfk_2` FOREIGN KEY (`id_carrito`) REFERENCES `carro_compras` (`id_carro`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
