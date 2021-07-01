package bds;

import java.util.Date;

import basededatos.Categoria;
import basededatos.Oferta;
import basededatos.Producto;
import basededatos.Valoracion;

public interface iCliente {

	public Producto[] busqueda_producto(String aNombreProducto);
	
	public Categoria[] cargar_categorias();

	public Producto[] cargar_productos_categoria(int aIdCategoria);

	public Oferta[] cargar_ofertas();

	public void registrar_usuario(String aNombreUsuario, String aMailUsuario, String aPasswordUsuario, String aConfirmPasswordUsuario, String aDireccionUsuario, String aFormaPagoUsuario, String aFotoUsuario);

	public Producto[] cargar_productos();

	public void valorar_producto(int aIdProducto, int aIdUsuario, int aPuntuacion, String aComentario, long aFecha);

	public Valoracion[] cargar_valoraciones(int aIdProducto);
	
}