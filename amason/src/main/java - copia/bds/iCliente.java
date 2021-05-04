package bds;

import basededatos.Categoria;
import basededatos.Oferta;
import basededatos.Producto;
import basededatos.Valoracion;

public interface iCliente {

	public Producto[] busqueda_producto(String aNombreProducto);

	public Producto[] cargar_productos_categoria(Categoria aCategoria);

	public Oferta[] cargar_ofertas();

	public void registrar_usuario(String aNombreUsuario, String aMailUsuario, String aPasswordUsuario, String aConfirmPasswordUsuario, String aDireccionUsuario, String aFormaPagoUsuario, String aFotoUsuario);

	public Producto[] cargar_productos();

	public void valorar_producto(int aIdProducto, int aIdUsuario, int aPuntuacion, String aComentario);

	public Producto cargar_producto(int aIdProducto);

	public Valoracion[] cargar_valoraciones(int aIdProducto);

	public void validar_registro();
}