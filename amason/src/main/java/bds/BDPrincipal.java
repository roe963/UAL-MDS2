package bds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.orm.PersistentException;

import basededatos.Cantidad;
import basededatos.Categoria;
import basededatos.Cliente;
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

public class BDPrincipal implements iAdministrador, iCliente, iCliente_registrado, iCorreo_personal,
        iEmpresa_transportes, iEncargado_compras, iIniciar_sesion, iPasarela_de_pagos {
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
    
    public Producto[] cargar_todos_productos() {
        Producto[] productos = null;
        try {
            productos = _bd_productos.cargar_todos_productos();

        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return productos;
    }

    public Producto[] cargar_productos_categoria(String aNombreCategoria) {
        throw new UnsupportedOperationException();
    }

    public Producto[] busqueda_producto(String aNombreProducto) {
        Producto[] productos = null;
        try {
            productos = _bd_productos.cargar_productos(aNombreProducto);

        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return productos;
    }

    public Producto cargar_producto(int aIdProducto) {
        throw new UnsupportedOperationException();
    }

    public Pedido[] cargar_pedidos_entregados() {
        return _bd_pedidos_entregados.cargar_pedidos_entregados();
    }

    public Pedido detalle_pedido(int aIdPedido) {
        throw new UnsupportedOperationException();
    }

    public void agregar_producto(String aNombreProducto, Categoria aCategoria, double aPrecioProducto,
            String aDescripcionProducto, String aImagenProducto) {

        _bd_productos.agregar_producto(aNombreProducto, aCategoria, aPrecioProducto, aDescripcionProducto,
		        aImagenProducto);
    }

    public void modificar_proucto(int aIdProducto, int aIdFoto, String aNombreProducto, Categoria aCategoria, double aPrecioProducto,
            String aDescripcionProducto, String aImagenProducto) {
    	
    	try {
            _bd_productos.modificar_proucto(aIdProducto, aIdFoto, aNombreProducto, aCategoria, aPrecioProducto, aDescripcionProducto,
                    aImagenProducto);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
    }

    public void agregar_categoria(String aNombreCategoria) {
    	_bd_categorias.agregar_categoria(aNombreCategoria);
    }

    public Categoria[] cargar_categorias() {
        Categoria[] categorias = null;
        try {
            // categorias = _bd_productos.cargar_productos();
            categorias = _bd_categorias.cargar_categorias();

        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return categorias;
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

//    public boolean modificar_usuario(String aNombreUsuario, String aPasswordUsuario, int aTipoUsuario) {
//        throw new UnsupportedOperationException();
//    }

    public Empresa_transportes[] cargar_empleados_empresa_transportes() {
        throw new UnsupportedOperationException();
    }

    public Encargado_compras[] cargar_empleados_encargado_compras() {
        throw new UnsupportedOperationException();
    }

    public void cambiar_estado_producto(int aIdProducto, boolean aActivo) {
    	_bd_productos.cambiar_estado_producto(aIdProducto, aActivo);
    }

    public void cambiar_estado_categoria(int aIdCategoria, boolean aActivo) {
        _bd_categorias.cambiar_estado_categoria(aIdCategoria, aActivo);
    }

//    public boolean cambiar_estado_usaurio(int aIdUsuario, boolean aActivo) {
//        throw new UnsupportedOperationException();
//    }

    public Producto[] cargar_productos_categoria(int aIdCategoria) {
        Producto[] productos = null;
        try {
            productos = _bd_productos.cargar_productos_categoria(aIdCategoria);

        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return productos;
    }

    public void registrar_usuario(String aNombreUsuario, String aMailUsuario, String aPasswordUsuario,
            String aConfirmPasswordUsuario, String aDireccionUsuario, String aFormaPagoUsuario, String aFotoUsuario) {
        try {
            _bd_clientes.registrar_usuario(aNombreUsuario, aMailUsuario, aPasswordUsuario, aConfirmPasswordUsuario,
                    aDireccionUsuario, aFormaPagoUsuario, aFotoUsuario);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
    }

    public void valorar_producto(int aIdProducto, int aIdUsuario, int aPuntuacion, String aComentario, long aFecha) {
        _bd_valoraciones.valorar_producto(aIdProducto, aIdUsuario, aPuntuacion, aComentario, aFecha);
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

    public void realizar_pedido(Cantidad[] aCantidades, Cliente aCliente, String aDireccion, String aFormaPago) {
        _bd_clientes.actualizas_datos_compra(aDireccion, aFormaPago, aCliente);
        _bd_pedidos_pendientes.realizar_pedido(aCantidades, aCliente);
    }
    
    public void verificar_compra() {
        throw new UnsupportedOperationException();
    }

    public Cliente cargar_perfil(int aIdUsuario) {
        return _bd_clientes.cargar_perfil(aIdUsuario);
    }
    
    public void guardar_perfil(int aIdUsuario, String aNombreUsuario, String aMailUsuario, String aDireccionUsuario,
            String aFormaPagoUsuario, String aFotoUsuario, boolean aEstadoCuenta) {
        try {
            _bd_clientes.guardar_perfil(aIdUsuario, aNombreUsuario, aMailUsuario, aDireccionUsuario, aFormaPagoUsuario,
                    aFotoUsuario, aEstadoCuenta);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
    }

    public Producto[] cargar_productos_pedido(Cantidad[] aCantidades) {
        throw new UnsupportedOperationException();
    }

    public boolean cancelar_compra(int aIdPedido) {
        return _bd_pedidos_pendientes.cancelar_compra(aIdPedido);
    }

    public void comprobar_envio(int aIdPedido) {
        throw new UnsupportedOperationException();
    }

    public Pedido_pendiente[] cargar_pedidos_pendientes_cliente_registrado(int aIdUsuario) {
        return _bd_pedidos_pendientes.cargar_pedidos_pendientes_cliente_registrado(aIdUsuario);
    }

    public Pedido_enviado[] cargar_pedidos_enviados_cliente_registrado(int aIdUsuario) {
        return _bd_pedidos_enviados.cargar_pedidos_enviados_cliente_registrado(aIdUsuario);
    }

    public Pedido_entregado[] cargar_pedidos_entregados_cliente_registrado(int aIdUsuario) {
        return _bd_pedidos_entregados.cargar_pedidos_entregados_cliente_registrado(aIdUsuario);
    }

    public Cantidad[] cargar_cantidades_pedido(int aIdPedido) {
        Cantidad[] arrayCantidades = null;
        try {
            arrayCantidades = _bd_cantidades.cargar_cantidades_pedido(aIdPedido);

        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return arrayCantidades;
    }

	public Mensaje[] cargar_mensajes_cliente(int aIdUsuario) {
		return _bd_mensajes.cargar_mensajes_cliente(aIdUsuario);
	}
    
	public void redactar_mensaje(int aIdUsuario, String aMensajeUsuario) {
		Mensaje mensaje= _bd_mensajes.crear_mensaje(aIdUsuario);
		_bd_respuestas.redactar_mensaje(aMensajeUsuario,mensaje);
	}

	public Respuesta[] cargar_respuestas_mensaje(int aIdMensaje) {
		return _bd_respuestas.cargar_respuestas_mensaje(aIdMensaje);
	}
	
    public void ver_mensaje(int aIdMensaje) {
        throw new UnsupportedOperationException();
    }
        
	public void responder_respuesta(int aIdMensaje, String aRespuesta) {
		_bd_respuestas.responder_respuesta(aIdMensaje, aRespuesta);
	}

	public Mensaje[] cargar_mensajes_administrador() {
		return _bd_mensajes.cargar_mensajes_administrador();
	}

    public Pedido[] cargar_pedidos_enviados(int aIdEmpresaTransportes) {
        return _bd_pedidos_enviados.cargar_pedidos_enviados(aIdEmpresaTransportes);
    }

    public Pedido[] cargar_pedidos_entregados(int aIdEmpresaTransportes) {
        return _bd_pedidos_entregados.cargar_pedidos_entregados(aIdEmpresaTransportes);
    }

    public void marcar_como_entregado(int aIdPedido) {
        _bd_pedidos_entregados.agregar_enviado_entregado(aIdPedido);
        _bd_pedidos_enviados.eliminar_enviado_entregado(aIdPedido);
    }

    public Pedido[] cargar_pedidos_pendientes() {
        return _bd_pedidos_pendientes.cargar_pedidos_pendientes();
    }

    public void marcar_como_enviado(int aIdPedido, int aIdEmpresaTransportes) {
        _bd_pedidos_enviados.agregar_pendiente_enviado(aIdPedido, aIdEmpresaTransportes);
        _bd_pedidos_pendientes.eliminar_pendiente_enviado(aIdPedido);
    }

    public Pedido[] cargar_pedidos_enviados() {
        return _bd_pedidos_enviados.cargar_pedidos_enviados();
    }

    public Empresa_transportes[] cargar_empresas_transportes() {
        return _bd_empresas_transportes.cargar_empresas_transportes();
    }

    public Usuario iniciar_sesion(String aMailUsuario, String aPasswordUsuario) {
        return _bd_usuario.iniciar_sesion(aMailUsuario, aPasswordUsuario);
    }

    public boolean recuperar_contrasena(String aMailUsuario) {
        throw new UnsupportedOperationException();
    }
    
	public boolean cambiar_estado_usuario_encargado_compras(int aIdUsuario, boolean aActivo) {
		throw new UnsupportedOperationException();
	}
    
	public boolean modificar_usuario_encargado_compras(int aIdUsuario, String aNombreUsuario, String aPasswordUsuario, int aTipoUsuario) {
		throw new UnsupportedOperationException();
	}

	public boolean cambiar_estado_usuario_empresa_transportes(int aIdUsuario, boolean aActivo) {
		throw new UnsupportedOperationException();
	}

	public boolean modificar_usuario_empresa_transportes(int aIdUsuario, String aNombreUsuario, String aPasswordUsuario, int aTipoUsuario) {
		throw new UnsupportedOperationException();
	}

}