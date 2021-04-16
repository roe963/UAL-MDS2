package basededatos;

import interfaz.Pedido_cliente_registrado;

public interface iCliente_registrado extends iCliente {

	public void seleccionar_direccion_envio(String aDireccionUsuario);

	public void seleccionar_metodo_pago(String aFormaPagoUsuario);

	public void verificar_compra();

	public Cantidad realizar_pedido(Producto[] aProductos, Cantidad[] aCantidades, int aIdCliente, String aDireccion, String aFormaPago);

	public Usuario cargar_perfil(int aIdUsuario);

	public void guardar_perfil(String aNombreUsuario, String aMailUsuario, String aDireccionUsuario, String aFormaPagoUsuario, String aFotoUsuario, boolean aEstadoCuenta);

	public Pedido_cliente_registrado[] cargar_pedidos_cliente_registrado(int aIdUsuario);

	public Pedido cargar_pedido_cliente_registrado(int aIdPedido);

	public void calcelar_compra(int aIdPedido);

	public void comprobar_envio(int aIdPedido);
}