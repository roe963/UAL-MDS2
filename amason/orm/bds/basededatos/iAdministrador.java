package basededatos;

public interface iAdministrador {

	public Producto[] cargar_productos();

	public Producto[] cargar_productos_categoria(String aNombreCategoria);

	public Producto[] busqueda_producto(String aNombreProducto);

	public Producto cargar_producto(int aIdProducto);

	public Pedido[] cargar_pedidos();

	public Pedido detalle_pedido(int aIdPedido);

	public void agregar_producto(String aNombreProducto, int aCategoria, double aPrecioProducto, String aDescripcionProducto, String aImagenProducto);

	public void modificar_proucto(String aNombreProducto, Categoria aCategoria, double aPrecioProducto, String aDescripcionProducto, String aImagenProducto);

	public void agregar_categoria(String aNombreCategoria);

	public Categoria[] cargar_categorias();

	public void activar_producto(int aIdProducto);

	public void agregar_oferta(int aIdProducto, double aPrecioOferta, Date aFechaFinOferta);

	public Oferta[] cargar_ofertas();

	public void finalizar_oferta(int aIdOferta);

	public boolean agregar_usuario(String aNombreUsuario, String aPasswordUsuario, int aTipoUsuario);

	public Usuario[] cargar_empleados();

	public boolean modificar_usuario_encargado_compras(int aIdUsuario, String aNombreUsuario, String aPasswordUsuario, int aTipoUsuario);

	public Empresa_transportes[] cargar_empleados_empresa_transportes();

	public Encargado_compras[] cargar_empleados_encargado_compras();

	public void cambiar_estado_producto(int aIdProducto, boolean aActivo);

	public void cambiar_estado_categoria(int aIdCategoria, boolean aActivo);

	public boolean cambiar_estado_usuario_encargado_compras(int aIdUsuario, boolean aActivo);

	public Producto[] cargar_todos_productos();

	public Pedido[] cargar_pedidos_entregados();

	public Pedido[] cargar_pedidos_enviados();

	public Pedido[] cargar_pedidos_pendientes();

	public boolean cambiar_estado_usuario_empresa_transportes(int aIdUsuario, boolean aActivo);

	public boolean modificar_usuario_empresa_transportes(int aIdUsuario, String aNombreUsuario, String aPasswordUsuario, int aTipoUsuario);
}