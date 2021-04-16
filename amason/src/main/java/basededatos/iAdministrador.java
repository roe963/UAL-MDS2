package basededatos;

public interface iAdministrador {

	public Producto[] cargar_productos();

	public Producto[] cargar_productos_categoria(String aNombreCategoria);

	public Producto[] busqueda_producto(String aNombreProducto);

	public Producto cargar_producto(int aIdProducto);

	public Pedido[] cargar_pedidos();

	public Pedido detalle_pedido(int aIdPedido);

	public void agregar_producto(String aNombreProducto, int aCategoria, double aPrecioProducto, String aDescripcionProducto, String aImagenProducto1, String aImagenProducto2, String aImagenProducto3, String aImagenProducto4, String aImagenProducto5, int aMagenPrincipal);

	public void modificar_proucto(String aNombreProducto, int aCategoria, double aPrecioProducto, String aDescripcionProducto, String aImagenProducto1, String aImagenProducto2, String aImagenProducto3, String aImagenProducto4, String aImagenProducto5, int aImagenPrincipal, booleam aActivo);

	public void agregar_categoria(String aNombreCategoria);

	public Categoria[] cargar_categorias();

	public void activar_categoria(int aIdCategoria);

	public void activar_producto(int aIdProducto);

	public void agregar_oferta(int aIdProducto, double aPrecioOferta, date aFechaFinOferta);

	public Oferta[] cargar_ofertas();

	public void finalizar_oferta();

	public void agregar_usuario(String aNombreUsuario, String aPasswordUsuario, int aTipoUsuario);

	public void cargar_empleados();

	public void modificar_usuario(String aNombreUsuario, String aPasswordUsuario, int aTipoUsuario);
}