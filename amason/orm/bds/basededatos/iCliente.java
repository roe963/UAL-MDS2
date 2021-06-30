package basededatos;

import interfaz.Producto;

public interface iCliente {

	public Producto[] busqueda_producto(String aNombreProducto);

	public Producto[] cargar_productos_categoria(int aIdCategoria);

	public Producto[] cargar_productos_categoria(Categoria aIdCategoria);

	public Oferta[] cargar_ofertas();

	public void registrar_usuario(String aNombreUsuario, String aMailUsuario, String aPasswordUsuario, String aConfirmPasswordUsuario, String aDireccionUsuario, String aFormaPagoUsuario, String aFotoUsuario);

	public Producto[] cargar_productos();

	public Producto cargar_producto(int aIdProducto);

	public Valoracion[] cargar_valoraciones(int aIdProducto);

	public void validar_registro();

	public Categoria[] cargar_categorias();
}