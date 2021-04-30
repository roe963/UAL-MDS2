package bds;

import java.util.Date;

import basededatos.Producto;
import basededatos.Pedido;
import basededatos.Categoria;
import basededatos.Empresa_transportes;
import basededatos.Encargado_compras;
import basededatos.Oferta;
import basededatos.Usuario;
import basededatos.Valoracion;
import basededatos.Cantidad;
import basededatos.Mensaje;
import basededatos.Respuesta;
import basededatos.Pedido_pendiente;
import basededatos.Pedido_enviado;
import basededatos.Pedido_entregado;

public class BDPrincipal implements iAdministrador, iCliente, iCliente_registrado, iCorreo_personal, iEmpresa_transportes, iEncargado_compras, iIniciar_sesion, iPasarela_de_pagos {
	public Administradores _bd_administradores;
	public Empresas_transportes _bd_empresas_transportes;
	public Encargados_compras _bd_encargados_compras;
	public Clientes _bd_clientes;
	public Categorias _bd_categorias;
	public Productos _bd_productos;
	public Fotos _bd_fotos;
	public Ofertas _bd_ofertas;
	public Valoraciones _bd_valoraciones;
	public Pedidos_enviados _bd_pedidos_enviados;
	public Pedidos_entregados _bd_pedidos_entregados;
	public Mensajes _bd_mensajes;
	public Respuestas _bd_respuestas;
	public Pedidos_pendientes _bd_pedidos_pendientes;
	public Cantidades _bd_cantidades;

	public Producto[] cargar_productos() {
		throw new UnsupportedOperationException();
	}

	public Producto[] cargar_productos_categoria(String aNombreCategoria) {
		throw new UnsupportedOperationException();
	}

	public Producto[] busqueda_producto(String aNombreProducto) {
		throw new UnsupportedOperationException();
	}

	public Producto cargar_producto(int aIdProducto) {
		throw new UnsupportedOperationException();
	}

	public Pedido[] cargar_pedidos() {
		throw new UnsupportedOperationException();
	}

	public Pedido detalle_pedido(int aIdPedido) {
		throw new UnsupportedOperationException();
	}

	public void agregar_producto(String aNombreProducto, int aCategoria, double aPrecioProducto, String aDescripcionProducto, String aImagenProducto1, String aImagenProducto2, String aImagenProducto3, String aImagenProducto4, String aImagenProducto5, int aMagenPrincipal) {
		throw new UnsupportedOperationException();
	}

	public void modificar_proucto(String aNombreProducto, int aCategoria, double aPrecioProducto, String aDescripcionProducto, String aImagenProducto1, String aImagenProducto2, String aImagenProducto3, String aImagenProducto4, String aImagenProducto5, int aImagenPrincipal, boolean aActivo) {
		throw new UnsupportedOperationException();
	}

	public void agregar_categoria(String aNombreCategoria) {
		throw new UnsupportedOperationException();
	}

	public Categoria[] cargar_categorias() {
		throw new UnsupportedOperationException();
	}

	public void activar_categoria(int aIdCategoria) {
		throw new UnsupportedOperationException();
	}

	public void activar_producto(int aIdProducto) {
		throw new UnsupportedOperationException();
	}

	public void agregar_oferta(int aIdProducto, double aPrecioOferta, Date aFechaFinOferta) {
		throw new UnsupportedOperationException();
	}

	public Oferta[] cargar_ofertas() {
		throw new UnsupportedOperationException();
	}

	public void finalizar_oferta(int aIdOferta) {
		throw new UnsupportedOperationException();
	}

	public boolean agregar_usuario(String aNombreUsuario, String aPasswordUsuario, int aTipoUsuario) {
		throw new UnsupportedOperationException();
	}

	public Usuario[] cargar_empleados() {
		throw new UnsupportedOperationException();
	}

	public boolean modificar_usuario(String aNombreUsuario, String aPasswordUsuario, int aTipoUsuario) {
		throw new UnsupportedOperationException();
	}

	public Producto[] cargar_categoria(String aNombreCategoria) {
		throw new UnsupportedOperationException();
	}

	public void registrar_usuario(String aNombreUsuario, String aMailUsuario, String aPasswordUsuario, String aConfirmPasswordUsuario, String aDireccionUsuario, String aFormaPagoUsuario, String aFotoUsuario) {
		throw new UnsupportedOperationException();
	}

	public void valorar_producto(int aIdPedido, int aIdUsuario, int aPuntuacion, String aComentario) {
		throw new UnsupportedOperationException();
	}

	public Valoracion[] cargar_valoraciones(int aIdProducto) {
		throw new UnsupportedOperationException();
	}

	public void validar_registro() {
		throw new UnsupportedOperationException();
	}

	public void seleccionar_direccion_envio(String aDireccionUsuario, int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public void seleccionar_metodo_pago(String aFormaPagoUsuario, int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public void verificar_compra() {
		throw new UnsupportedOperationException();
	}

	public Cantidad realizar_pedido(Producto[] aProductos, Cantidad[] aCantidades, int aIdCliente, String aDireccion, String aFormaPago) {
		throw new UnsupportedOperationException();
	}

	public Usuario cargar_perfil(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public void guardar_perfil(String aNombreUsuario, String aMailUsuario, String aDireccionUsuario, String aFormaPagoUsuario, String aFotoUsuario, boolean aEstadoCuenta, int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public Producto[] cargar_productos_pedido(int aIdPedido) {
		throw new UnsupportedOperationException();
	}

	public boolean cancelar_compra(int aIdPedido) {
		throw new UnsupportedOperationException();
	}

	public void comprobar_envio(int aIdPedido) {
		throw new UnsupportedOperationException();
	}

	public Mensaje[] cargar_mensajes_cliente(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public void redactar_mensaje(int aIdUsuario, String aMensajeUsuario) {
		throw new UnsupportedOperationException();
	}

	public void ver_mensaje(int aIdMensaje) {
		throw new UnsupportedOperationException();
	}

	public Respuesta[] cargar_respuestas_mensaje(int aIdMensaje) {
		throw new UnsupportedOperationException();
	}

	public void responder_respuesta(int aIdMensaje, String aRespuesta) {
		throw new UnsupportedOperationException();
	}

	public Mensaje[] cargar_mensajes_administrador() {
		throw new UnsupportedOperationException();
	}

	public Pedido[] cargar_pedidos_enviados(int aIdEmpresaTransportes) {
		throw new UnsupportedOperationException();
	}

	public Pedido[] cargar_pedidos_entregados() {
		throw new UnsupportedOperationException();
	}

	public void marcar_como_entregado(int aIdPedido) {
		throw new UnsupportedOperationException();
	}

	public Pedido[] cargar_pedidos_pendientes() {
		throw new UnsupportedOperationException();
	}

	public void marcar_como_enviado(int aIdPedido, int aIdEmpresaTransportes) {
		throw new UnsupportedOperationException();
	}

	public Usuario iniciar_sesion(String aMailUsuario, String aPasswordUsuario) {
		throw new UnsupportedOperationException();
	}

	public String recuperar_contrasena(String aMailUsuario) {
		throw new UnsupportedOperationException();
	}

	public void modificar_proucto(String aNombreProducto, int aCategoria, double aPrecioProducto, String aDescripcionProducto, String aImagenProducto1, String aImagenProducto2, String aImagenProducto3, String aImagenProducto4, String aImagenProducto5, int aImagenPrincipal) {
		throw new UnsupportedOperationException();
	}

	public Empresa_transportes[] cargar_empleados_empresa_transportes() {
		throw new UnsupportedOperationException();
	}

	public Encargado_compras[] cargar_empleados_encargado_compras() {
		throw new UnsupportedOperationException();
	}

	public void cambiar_estado_producto(int aIdProducto, boolean aActivo) {
		throw new UnsupportedOperationException();
	}

	public void cambiar_estado_categoria(int aIdCategoria, boolean aActivo) {
		throw new UnsupportedOperationException();
	}

	public boolean cambiar_estado_usaurio(int aIdUsuario, boolean aActivo) {
		throw new UnsupportedOperationException();
	}

	public Producto[] cargar_productos_categoria(Categoria aCategoria) {
		throw new UnsupportedOperationException();
	}

	public void seleccionar_direccion_envio(int aIdUsuario, String aDireccionUsuario) {
		throw new UnsupportedOperationException();
	}

	public void seleccionar_metodo_pago(int aIdUsuario, String aFormaPagoUsuario) {
		throw new UnsupportedOperationException();
	}

	public void guardar_perfil(int aIdUsuario, String aNombreUsuario, String aMailUsuario, String aDireccionUsuario, int aFormaPagoUsuario, String aFotoUsuario, boolean aEstadoCuenta) {
		throw new UnsupportedOperationException();
	}

	public Producto[] cargar_productos_pedido(Cantidad[] aCantidades) {
		throw new UnsupportedOperationException();
	}

	public Pedido_pendiente[] cargar_pedidos_pendientes_cliente_registrado(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public Pedido_enviado[] cargar_pedidos_enviados_cliente_registrado(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public Pedido_entregado[] cargar_pedidos_entregados_cliente_registrado(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public Cantidad[] cargar_cantidades_pedido(int aIdPedido) {
		throw new UnsupportedOperationException();
	}

	public Pedido[] cargar_pedidos_enviados() {
		throw new UnsupportedOperationException();
	}

	public Empresa_transportes[] cargar_empresas_transportes() {
		throw new UnsupportedOperationException();
	}

	public void realizar_pedido(Producto[] aProductos, int[] aCantidades, Clientes aCliente, String aDireccion, String aFormaPago) {
		throw new UnsupportedOperationException();
	}
}