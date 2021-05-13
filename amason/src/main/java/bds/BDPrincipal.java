package bds;

import java.util.Date;

import org.orm.PersistentException;

import basededatos.Cantidad;
import basededatos.Categoria;
import basededatos.Empresa_transportes;
import basededatos.Encargado_compras;
import basededatos.Mensaje;
import basededatos.Oferta;
import basededatos.Pedido;
import basededatos.Pedido_entregado;
import basededatos.Pedido_enviado;
import basededatos.Pedido_pendiente;
import basededatos.Producto;
import basededatos.Respuesta;
import basededatos.Usuario;
import basededatos.Valoracion;

public class BDPrincipal implements iAdministrador, iCliente, iCliente_registrado, iCorreo_personal, iEmpresa_transportes, iEncargado_compras, iIniciar_sesion, iPasarela_de_pagos {
	public Administradores _bd_administradores = new Administradores();
	public Empresas_transportes _bd_empresas_transportes = new Empresas_transportes();
	public Encargados_compras _bd_encargados_compras = new Encargados_compras();
	public Clientes _bd_clientes = new Clientes();
	public Categorias _bd_categorias = new Categorias();
	public Productos _bd_productos = new Productos();
	public Fotos _bd_fotos = new Fotos();
	public Ofertas _bd_ofertas = new Ofertas();
	public Valoraciones _bd_valoraciones = new Valoraciones();
	public Pedidos_enviados _bd_pedidos_enviados = new Pedidos_enviados();
	public Pedidos_entregados _bd_pedidos_entregados = new Pedidos_entregados();
	public Mensajes _bd_mensajes = new Mensajes();
	public Respuestas _bd_respuestas = new Respuestas();
	public Pedidos_pendientes _bd_pedidos_pendientes = new Pedidos_pendientes();
	public Cantidades _bd_cantidades = new Cantidades();
	public Usuario _bd_usuario = new Usuario();

	public Producto[] cargar_productos() {
		Producto[] productos = null;
        try {
        	productos = _bd_productos.cargar_productos();
        	
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return productos;
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

	public void modificar_proucto(String aNombreProducto, int aCategoria, double aPrecioProducto, String aDescripcionProducto, String aImagenProducto1, String aImagenProducto2, String aImagenProducto3, String aImagenProducto4, String aImagenProducto5, int aImagenPrincipal) {
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
		Oferta[] ofertas = null;
        try {
        	ofertas = _bd_ofertas.cargar_ofertas();
        	
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return ofertas;
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

	public void registrar_usuario(String aNombreUsuario, String aMailUsuario, String aPasswordUsuario, String aConfirmPasswordUsuario, String aDireccionUsuario, String aFormaPagoUsuario, String aFotoUsuario) {
		try {
			_bd_clientes.registrar_usuario(aNombreUsuario, aMailUsuario, aPasswordUsuario, aConfirmPasswordUsuario, aDireccionUsuario, aFormaPagoUsuario, aFotoUsuario);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
	}

	public void valorar_producto(int aIdProducto, int aIdUsuario, int aPuntuacion, String aComentario, Date aFecha) {
		throw new UnsupportedOperationException();
	}

	public Valoracion[] cargar_valoraciones(int aIdProducto) {
		Valoracion[] valoracion = null;
        try {
        	valoracion = _bd_valoraciones.cargar_valoraciones(aIdProducto);
        	
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return valoracion;
	}

	public void validar_registro() {
		throw new UnsupportedOperationException();
	}

	public void seleccionar_direccion_envio(int aIdUsuario, String aDireccionUsuario) {
		throw new UnsupportedOperationException();
	}

	public void seleccionar_metodo_pago(int aIdUsuario, String aFormaPagoUsuario) {
		throw new UnsupportedOperationException();
	}

	public void verificar_compra() {
		throw new UnsupportedOperationException();
	}

	public void realizar_pedido(Producto[] aProductos, int[] aCantidades, Clientes aCliente, String aDireccion, String aFormaPago) {
		throw new UnsupportedOperationException();
	}

	public Usuario cargar_perfil(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public void guardar_perfil(int aIdUsuario, String aNombreUsuario, String aMailUsuario, String aDireccionUsuario, int aFormaPagoUsuario, String aFotoUsuario, boolean aEstadoCuenta) {
		throw new UnsupportedOperationException();
	}

	public Producto[] cargar_productos_pedido(Cantidad[] aCantidades) {
		throw new UnsupportedOperationException();
	}

	public boolean cancelar_compra(int aIdPedido) {
		throw new UnsupportedOperationException();
	}

	public void comprobar_envio(int aIdPedido) {
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

	public Pedido[] cargar_pedidos_enviados() {
		throw new UnsupportedOperationException();
	}

	public Empresa_transportes[] cargar_empresas_transportes() {
		throw new UnsupportedOperationException();
	}

	public Usuario iniciar_sesion(String aMailUsuario, String aPasswordUsuario) {
		
		return _bd_usuario.iniciar_sesion(aMailUsuario, aPasswordUsuario);    
	    
		/*Usuario usuario = null;
		
		//usuario = _bd_usuario.iniciar_sesion(aMailUsuario, aPasswordUsuario);
		//_bd_clientes.iniciar_sesion_cliente(usuario.getId());
		_bd_administradores.iniciar_sesion_administrador(usuario.getId());
		_bd_empresas_transportes.iniciar_sesion_empresa_transportes(usuario.getId());
		_bd_encargados_compras.iniciar_sesion_encargado_compras(usuario.getId());
		
		return usuario = _bd_usuario.iniciar_sesion(aMailUsuario, aPasswordUsuario);*/
		
//		
//		Usuario usuario = new Usuario();
//		int id= 0;
//		//Buscar en usuario
//        usuario = _bd_usuario.iniciar_sesion(aMailUsuario, aPasswordUsuario);	
//        
//        if(usuario == null) {
//        	usuario = new Usuario();
//
//        	usuario.setEmail("INCORRECTO");	
//        	usuario.setPassword("INCORRECTO");
//
//        }else {
//        	id= usuario.getId();
//        	usuario = new Usuario();
//        	usuario.setEmail("SeguirBuscandoTabla");
//        }			
//        
//        if( usuario.getEmail().equals("INCORRECTO")) {//NO hay usuario				
//        		return usuario;		
//        }				
//        		
//        
//        //Buscar en cliente
//        if( usuario.getEmail().equals("SeguirBuscandoTabla")) {	
//        	usuario= _bd_clientes.iniciar_sesion_cliente(id);	
//
//        	if(usuario == null) {
//        		usuario = new Usuario();
//        		usuario.setEmail("SeguirBuscandoTabla");	
//        	}else {		
//        		usuario = new Usuario();
//        		usuario.setEmail((Integer.toString(id)));
//        		usuario.setPassword("TIPO_CLIENTE");
//        		return usuario;
//        	}	
//        }	
//        
//        		
//        //Buscar en Administrador
//        if( usuario.getEmail().equals("SeguirBuscandoTabla")) {
//        	usuario= _bd_administradores.iniciar_sesion_administrador(id);				
//        	if(usuario == null) {
//        		usuario = new Usuario();
//        		usuario.setEmail("SeguirBuscandoTabla");	
//        	}else {		
//        		usuario = new Usuario();
//        		usuario.setEmail((Integer.toString(id)));
//        		usuario.setPassword("TIPO_ADMINISTRADOR");
//        		return usuario;
//        	}			
//        }		
//        
//        
//        //Buscar en Empresa de transporte
//        if( usuario.getEmail().equals("SeguirBuscandoTabla")) {
//        	usuario= _bd_empresas_transportes.iniciar_sesion_empresa_transportes(id);				
//        	if(usuario == null) {
//        		usuario = new Usuario();
//        		usuario.setEmail("SeguirBuscandoTabla");	
//        	}else {		
//        		usuario = new Usuario();
//        		usuario.setEmail((Integer.toString(id)));
//        		usuario.setPassword("TIPO_EMPRESA_TRANSPORTE");
//        		return usuario;
//        	}			
//        }	
//        
//        
//        //Buscar en Encargado
//        if( usuario.getEmail().equals("SeguirBuscandoTabla")) {//Busca en Empresa de transporte
//        	usuario= _bd_encargados_compras.iniciar_sesion_encargado_compras(id);			
//        	if(usuario == null) {
//        		usuario = new Usuario();
//        		usuario.setEmail("SeguirBuscandoTabla");	
//        	}else {		
//        		usuario = new Usuario();
//        		usuario.setEmail((Integer.toString(id)));
//        		usuario.setPassword("TIPO_ENCARGADO");
//        		return usuario;
//        	}			
//        }
//				
//		return usuario;
	}

	public boolean recuperar_contrasena(String aMailUsuario) {
		throw new UnsupportedOperationException();
	}
}