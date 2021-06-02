package bds;

import basededatos.Cantidad;
import basededatos.Cliente;
import basededatos.Pedido_entregado;
import basededatos.Pedido_enviado;
import basededatos.Pedido_pendiente;
import basededatos.Producto;

public interface iCliente_registrado extends iCliente {

	public void seleccionar_direccion_envio(int aIdUsuario, String aDireccionUsuario);

	public void seleccionar_metodo_pago(int aIdUsuario, String aFormaPagoUsuario);

	public void verificar_compra();

	public void realizar_pedido(Cantidad[] aCantidades, Cliente aCliente, String aDireccion, String aFormaPago);

	public Cliente cargar_perfil(int aIdUsuario);

	public void guardar_perfil(int aIdUsuario, String aNombreUsuario, String aMailUsuario, String aDireccionUsuario, String aFormaPagoUsuario, String aFotoUsuario, boolean aEstadoCuenta);

	public Producto[] cargar_productos_pedido(Cantidad[] aCantidades);

	public boolean cancelar_compra(int aIdPedido);

	public void comprobar_envio(int aIdPedido);

	public Pedido_pendiente[] cargar_pedidos_pendientes_cliente_registrado(int aIdUsuario);

	public Pedido_enviado[] cargar_pedidos_enviados_cliente_registrado(int aIdUsuario);

	public Pedido_entregado[] cargar_pedidos_entregados_cliente_registrado(int aIdUsuario);

	public Cantidad[] cargar_cantidades_pedido(int aIdPedido);
}