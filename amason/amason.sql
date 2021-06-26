-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 26-06-2021 a las 18:25:04
-- Versión del servidor: 10.4.18-MariaDB
-- Versión de PHP: 8.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `amason`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `administrador`
--

CREATE TABLE `administrador` (
  `UsuarioId` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `administrador`
--

INSERT INTO `administrador` (`UsuarioId`) VALUES
(2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cantidad`
--

CREATE TABLE `cantidad` (
  `Id` int(10) NOT NULL,
  `ProductoId` int(10) NOT NULL,
  `PedidoId` int(10) NOT NULL,
  `Cantidad` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cantidad`
--

INSERT INTO `cantidad` (`Id`, `ProductoId`, `PedidoId`, `Cantidad`) VALUES
(1, 1, 1, 2),
(2, 2, 1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoria`
--

CREATE TABLE `categoria` (
  `Id` int(10) NOT NULL,
  `Nombre` varchar(255) DEFAULT NULL,
  `Activo` bit(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `categoria`
--

INSERT INTO `categoria` (`Id`, `Nombre`, `Activo`) VALUES
(1, 'Informática', b'1'),
(2, 'Hogar y cocina', b'1');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `Nombre` varchar(255) DEFAULT NULL,
  `MetodoPago` varchar(255) DEFAULT NULL,
  `DireccionEnvio` varchar(255) DEFAULT NULL,
  `FotoURL` varchar(255) DEFAULT NULL,
  `UsuarioId` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`Nombre`, `MetodoPago`, `DireccionEnvio`, `FotoURL`, `UsuarioId`) VALUES
('Cliente1', 'PayPal', 'Direccion1', 'https://i0.wp.com/www.sectorcine.com/wp-content/uploads/sectorcine/lossy/cast/Kaufman.jpg?fit=520%2C600&ssl=1', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empresa_transportes`
--

CREATE TABLE `empresa_transportes` (
  `UsuarioId` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `empresa_transportes`
--

INSERT INTO `empresa_transportes` (`UsuarioId`) VALUES
(3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `encargado_compras`
--

CREATE TABLE `encargado_compras` (
  `UsuarioId` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `encargado_compras`
--

INSERT INTO `encargado_compras` (`UsuarioId`) VALUES
(4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `foto`
--

CREATE TABLE `foto` (
  `Id` int(10) NOT NULL,
  `ProductoId` int(10) NOT NULL,
  `Url` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `foto`
--

INSERT INTO `foto` (`Id`, `ProductoId`, `Url`) VALUES
(1, 1, 'https://images-na.ssl-images-amazon.com/images/I/81P85qqpkuL._AC_SL1500_.jpg'),
(2, 2, 'https://img.pccomponentes.com/articles/29/290206/xiaomi-mi-led-smart-bulb-essential-blanco-y-color-bombilla-inteligente-9w-e27.jpg'),
(3, 3, 'https://bestchinaproducts.com/wp-content/uploads/2020/07/cheap-mechanical-keyboard.jpg');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mensaje`
--

CREATE TABLE `mensaje` (
  `Id` int(10) NOT NULL,
  `ClienteUsuarioId` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `mensaje`
--

INSERT INTO `mensaje` (`Id`, `ClienteUsuarioId`) VALUES
(4, 1),
(5, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `oferta`
--

CREATE TABLE `oferta` (
  `Id` int(10) NOT NULL,
  `Fecha` bigint(20) NOT NULL,
  `Precio` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `oferta`
--

INSERT INTO `oferta` (`Id`, `Fecha`, `Precio`) VALUES
(1, 1620152800, 10),
(2, 1620152800, 20);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido`
--

CREATE TABLE `pedido` (
  `Id` int(10) NOT NULL,
  `ClienteUsuarioId` int(10) NOT NULL,
  `Fecha` bigint(20) NOT NULL,
  `Precio` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `pedido`
--

INSERT INTO `pedido` (`Id`, `ClienteUsuarioId`, `Fecha`, `Precio`) VALUES
(1, 1, 1620152800, 70);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido_entregado`
--

CREATE TABLE `pedido_entregado` (
  `PedidoId` int(10) NOT NULL,
  `Empresa_transportesUsuarioId` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido_enviado`
--

CREATE TABLE `pedido_enviado` (
  `PedidoId` int(10) NOT NULL,
  `Empresa_transportesUsuarioId` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido_pendiente`
--

CREATE TABLE `pedido_pendiente` (
  `PedidoId` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `pedido_pendiente`
--

INSERT INTO `pedido_pendiente` (`PedidoId`) VALUES
(1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `Id` int(10) NOT NULL,
  `OfertaId` int(10) DEFAULT NULL,
  `CategoriaId` int(10) NOT NULL,
  `Nombre` varchar(255) DEFAULT NULL,
  `Precio` float NOT NULL,
  `Activo` bit(1) NOT NULL,
  `Descripcion` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`Id`, `OfertaId`, `CategoriaId`, `Nombre`, `Precio`, `Activo`, `Descripcion`) VALUES
(1, 1, 1, 'Ratón', 20, b'1', 'Logitech g500'),
(2, 2, 1, 'Teclado', 30, b'1', 'GK61'),
(3, NULL, 2, 'Bombilla', 15, b'1', 'Bombilla Inteligente Xiaomi');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `respuesta`
--

CREATE TABLE `respuesta` (
  `Id` int(10) NOT NULL,
  `UsuarioId` int(10) NOT NULL,
  `MensajeId` int(10) NOT NULL,
  `Orden` int(10) NOT NULL,
  `Contendio` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `respuesta`
--

INSERT INTO `respuesta` (`Id`, `UsuarioId`, `MensajeId`, `Orden`, `Contendio`) VALUES
(1, 1, 4, 2, 'mensaje de prueba 1'),
(2, 1, 5, 2, 'mensaje de prueba 2'),
(3, 1, 5, 3, 'respuesta al mensaje 2'),
(4, 1, 4, 3, 'mensaje a la respuesta 1'),
(5, 1, 4, 4, 'dfsgdesfg');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `Id` int(10) NOT NULL,
  `Email` varchar(255) DEFAULT NULL,
  `Password` varchar(255) DEFAULT NULL,
  `Activo` bit(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`Id`, `Email`, `Password`, `Activo`) VALUES
(1, 'usuarioCliente', '123456', b'1'),
(2, 'usuarioAdministrador', '123456', b'1'),
(3, 'usuarioEmpresaTransportes', '123456', b'0'),
(4, 'usuarioEncargadoCompras', '123456', b'0');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `valoracion`
--

CREATE TABLE `valoracion` (
  `Id` int(10) NOT NULL,
  `ClienteUsuarioId` int(10) NOT NULL,
  `ProductoId` int(10) NOT NULL,
  `Puntuacion` int(10) NOT NULL,
  `Comentario` varchar(255) DEFAULT NULL,
  `Fecha` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `valoracion`
--

INSERT INTO `valoracion` (`Id`, `ClienteUsuarioId`, `ProductoId`, `Puntuacion`, `Comentario`, `Fecha`) VALUES
(1, 1, 1, 5, 'Es un raton muy bueno.', 1620152800),
(2, 1, 1, 4, 'Es aceptable el producto.', 1620152800);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `administrador`
--
ALTER TABLE `administrador`
  ADD PRIMARY KEY (`UsuarioId`);

--
-- Indices de la tabla `cantidad`
--
ALTER TABLE `cantidad`
  ADD PRIMARY KEY (`Id`),
  ADD KEY `FKCantidad556731` (`PedidoId`),
  ADD KEY `FKCantidad314050` (`ProductoId`);

--
-- Indices de la tabla `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`Id`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`UsuarioId`);

--
-- Indices de la tabla `empresa_transportes`
--
ALTER TABLE `empresa_transportes`
  ADD PRIMARY KEY (`UsuarioId`);

--
-- Indices de la tabla `encargado_compras`
--
ALTER TABLE `encargado_compras`
  ADD PRIMARY KEY (`UsuarioId`);

--
-- Indices de la tabla `foto`
--
ALTER TABLE `foto`
  ADD PRIMARY KEY (`Id`),
  ADD KEY `FKFoto399859` (`ProductoId`);

--
-- Indices de la tabla `mensaje`
--
ALTER TABLE `mensaje`
  ADD PRIMARY KEY (`Id`),
  ADD KEY `FKMensaje292928` (`ClienteUsuarioId`);

--
-- Indices de la tabla `oferta`
--
ALTER TABLE `oferta`
  ADD PRIMARY KEY (`Id`);

--
-- Indices de la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD PRIMARY KEY (`Id`),
  ADD KEY `FKPedido408520` (`ClienteUsuarioId`);

--
-- Indices de la tabla `pedido_entregado`
--
ALTER TABLE `pedido_entregado`
  ADD PRIMARY KEY (`PedidoId`),
  ADD KEY `FKPedido_ent545421` (`Empresa_transportesUsuarioId`);

--
-- Indices de la tabla `pedido_enviado`
--
ALTER TABLE `pedido_enviado`
  ADD PRIMARY KEY (`PedidoId`),
  ADD KEY `FKPedido_env653876` (`Empresa_transportesUsuarioId`);

--
-- Indices de la tabla `pedido_pendiente`
--
ALTER TABLE `pedido_pendiente`
  ADD PRIMARY KEY (`PedidoId`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`Id`),
  ADD KEY `FKProducto904800` (`CategoriaId`),
  ADD KEY `FKProducto445011` (`OfertaId`);

--
-- Indices de la tabla `respuesta`
--
ALTER TABLE `respuesta`
  ADD PRIMARY KEY (`Id`),
  ADD KEY `FKRespuesta357541` (`MensajeId`),
  ADD KEY `FKRespuesta179661` (`UsuarioId`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`Id`);

--
-- Indices de la tabla `valoracion`
--
ALTER TABLE `valoracion`
  ADD PRIMARY KEY (`Id`),
  ADD KEY `FKValoracion666204` (`ProductoId`),
  ADD KEY `FKValoracion994559` (`ClienteUsuarioId`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cantidad`
--
ALTER TABLE `cantidad`
  MODIFY `Id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `categoria`
--
ALTER TABLE `categoria`
  MODIFY `Id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `foto`
--
ALTER TABLE `foto`
  MODIFY `Id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `mensaje`
--
ALTER TABLE `mensaje`
  MODIFY `Id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `oferta`
--
ALTER TABLE `oferta`
  MODIFY `Id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `pedido`
--
ALTER TABLE `pedido`
  MODIFY `Id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `Id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `respuesta`
--
ALTER TABLE `respuesta`
  MODIFY `Id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `Id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `valoracion`
--
ALTER TABLE `valoracion`
  MODIFY `Id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `administrador`
--
ALTER TABLE `administrador`
  ADD CONSTRAINT `FKAdministra741099` FOREIGN KEY (`UsuarioId`) REFERENCES `usuario` (`Id`);

--
-- Filtros para la tabla `cantidad`
--
ALTER TABLE `cantidad`
  ADD CONSTRAINT `FKCantidad314050` FOREIGN KEY (`ProductoId`) REFERENCES `producto` (`Id`),
  ADD CONSTRAINT `FKCantidad556731` FOREIGN KEY (`PedidoId`) REFERENCES `pedido` (`Id`);

--
-- Filtros para la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD CONSTRAINT `FKCliente703635` FOREIGN KEY (`UsuarioId`) REFERENCES `usuario` (`Id`);

--
-- Filtros para la tabla `empresa_transportes`
--
ALTER TABLE `empresa_transportes`
  ADD CONSTRAINT `FKEmpresa_tr593472` FOREIGN KEY (`UsuarioId`) REFERENCES `usuario` (`Id`);

--
-- Filtros para la tabla `encargado_compras`
--
ALTER TABLE `encargado_compras`
  ADD CONSTRAINT `FKEncargado_208689` FOREIGN KEY (`UsuarioId`) REFERENCES `usuario` (`Id`);

--
-- Filtros para la tabla `foto`
--
ALTER TABLE `foto`
  ADD CONSTRAINT `FKFoto399859` FOREIGN KEY (`ProductoId`) REFERENCES `producto` (`Id`);

--
-- Filtros para la tabla `mensaje`
--
ALTER TABLE `mensaje`
  ADD CONSTRAINT `FKMensaje292928` FOREIGN KEY (`ClienteUsuarioId`) REFERENCES `cliente` (`UsuarioId`);

--
-- Filtros para la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD CONSTRAINT `FKPedido408520` FOREIGN KEY (`ClienteUsuarioId`) REFERENCES `cliente` (`UsuarioId`);

--
-- Filtros para la tabla `pedido_entregado`
--
ALTER TABLE `pedido_entregado`
  ADD CONSTRAINT `FKPedido_ent545421` FOREIGN KEY (`Empresa_transportesUsuarioId`) REFERENCES `empresa_transportes` (`UsuarioId`),
  ADD CONSTRAINT `FKPedido_ent760506` FOREIGN KEY (`PedidoId`) REFERENCES `pedido` (`Id`);

--
-- Filtros para la tabla `pedido_enviado`
--
ALTER TABLE `pedido_enviado`
  ADD CONSTRAINT `FKPedido_env11786` FOREIGN KEY (`PedidoId`) REFERENCES `pedido` (`Id`),
  ADD CONSTRAINT `FKPedido_env653876` FOREIGN KEY (`Empresa_transportesUsuarioId`) REFERENCES `empresa_transportes` (`UsuarioId`);

--
-- Filtros para la tabla `pedido_pendiente`
--
ALTER TABLE `pedido_pendiente`
  ADD CONSTRAINT `FKPedido_pen439286` FOREIGN KEY (`PedidoId`) REFERENCES `pedido` (`Id`);

--
-- Filtros para la tabla `producto`
--
ALTER TABLE `producto`
  ADD CONSTRAINT `FKProducto445011` FOREIGN KEY (`OfertaId`) REFERENCES `oferta` (`Id`),
  ADD CONSTRAINT `FKProducto904800` FOREIGN KEY (`CategoriaId`) REFERENCES `categoria` (`Id`);

--
-- Filtros para la tabla `respuesta`
--
ALTER TABLE `respuesta`
  ADD CONSTRAINT `FKRespuesta179661` FOREIGN KEY (`UsuarioId`) REFERENCES `usuario` (`Id`),
  ADD CONSTRAINT `FKRespuesta357541` FOREIGN KEY (`MensajeId`) REFERENCES `mensaje` (`Id`);

--
-- Filtros para la tabla `valoracion`
--
ALTER TABLE `valoracion`
  ADD CONSTRAINT `FKValoracion666204` FOREIGN KEY (`ProductoId`) REFERENCES `producto` (`Id`),
  ADD CONSTRAINT `FKValoracion994559` FOREIGN KEY (`ClienteUsuarioId`) REFERENCES `cliente` (`UsuarioId`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
