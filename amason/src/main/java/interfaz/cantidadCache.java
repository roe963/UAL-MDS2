package interfaz;

public class cantidadCache {
	
	public int idProducto;
	public int cantidad;
	
	public cantidadCache(int idProducto, int cantidad) {
		this.idProducto= idProducto;
		this.cantidad= cantidad;
		
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
	

}
