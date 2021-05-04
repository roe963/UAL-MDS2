package bds;

import java.util.Date;

import basededatos.Categoria;
import basededatos.Empresa_transportes;
import basededatos.Oferta;
import basededatos.Pedido;
import basededatos.Producto;
import basededatos.Usuario;
import basededatos.Encargado_compras;

public interface iAdministrador {

	public Producto[] cargar_productos();

	public Producto[] cargar_productos_categoria(String aNombreCategoria);

	public Producto[] busqueda_producto(String aNombreProducto);

	public Producto cargar_producto(int aIdProducto);

	public Pedido[] cargar_pedidos();

	public Pedido detalle_pedido(int aIdPedido);

	public void agregar_producto(String aNombreProducto, int aCategoria, double aPrecioProducto, String aDescripcionProducto, String aImagenProducto1, String aImagenProducto2, String aImagenProducto3, String aImagenProducto4, String aImagenProducto5, int aMagenPrincipal);

	public void modificar_proucto(String aNombreProducto, int aCategoria, double aPrecioProducto, String aDescripcionProducto, String aImagenProducto1, String aImagenProducto2, String aImagenProducto3, String aImagenProducto4, String aImagenProducto5, int aImagenPrincipal);

	public void agregar_categoria(String aNombreCategoria);

	public Categoria[] cargar_categorias();

	public void activar_categoria(int aIdCategoria);

	public void activar_producto(int aIdProducto);

	public void agregar_oferta(int aIdProducto, double aPrecioOferta, Date aFechaFinOferta);

	public Oferta[] cargar_ofertas();

	public void finalizar_oferta(int aIdOferta);

	public boolean agregar_usuario(String aNombreUsuario, String aPasswordUsuario, int aTipoUsuario);

	public Usuario[] cargar_empleados();

	public boolean modificar_usuario(String aNombreUsuario, String aPasswordUsuario, int aTipoUsuario);

	public Empresa_transportes[] cargar_empleados_empresa_transportes();

	public Encargado_compras[] cargar_empleados_encargado_compras();

	public void cambiar_estado_producto(int aIdProducto, boolean aActivo);

	public void cambiar_estado_categoria(int aIdCategoria, boolean aActivo);

	public boolean cambiar_estado_usaurio(int aIdUsuario, boolean aActivo);
}