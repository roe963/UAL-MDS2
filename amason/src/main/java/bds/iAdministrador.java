package bds;

import java.util.Date;

import basededatos.Categoria;
import basededatos.Empresa_transportes;
import basededatos.Encargado_compras;
import basededatos.Oferta;
import basededatos.Pedido;
import basededatos.Producto;
import basededatos.Usuario;

public interface iAdministrador {

	public Producto[] cargar_todos_productos();

	public Producto[] cargar_productos_categoria(int aIdCategoria);

	public Pedido[] cargar_pedidos_pendientes();
	
	public Pedido[] cargar_pedidos_enviados();
	
	public Pedido[] cargar_pedidos_entregados();

	public void agregar_producto(String aNombreProducto, Categoria aCategoria, double aPrecioProducto, String aDescripcionProducto, String aImagenProducto);

	public void modificar_proucto(int aIdProducto, int aIdFoto, String aNombreProducto, Categoria aCategoria, double aPrecioProducto, String aDescripcionProducto, String aImagenProducto);

	public void agregar_categoria(String aNombreCategoria);

	public Categoria[] cargar_categorias();
	
	public Categoria[] cargar_todas_categorias();

	public void agregar_oferta(int aIdProducto, double aPrecioOferta, long aFechaFinOferta);

	public Oferta[] cargar_ofertas();

	public void finalizar_oferta(int aIdOferta);

	public boolean agregar_usuario(String aNombreUsuario, String aPasswordUsuario, int aTipoUsuario);

	public Empresa_transportes[] cargar_empleados_empresa_transportes();

	public Encargado_compras[] cargar_empleados_encargado_compras();

	public void cambiar_estado_producto(int aIdProducto, boolean aActivo);

	public void cambiar_estado_categoria(int aIdCategoria, boolean aActivo);
	
	public boolean cambiar_estado_usuario_encargado_compras(int aIdUsuario, boolean aActivo);
	
	public boolean modificar_usuario_encargado_compras(int aIdUsuario, String aNombreUsuario, String aPasswordUsuario);
	
	public boolean cambiar_estado_usuario_empresa_transportes(int aIdUsuario, boolean aActivo);

	public boolean modificar_usuario_empresa_transportes(int aIdUsuario, String aNombreUsuario, String aPasswordUsuario);
	
}