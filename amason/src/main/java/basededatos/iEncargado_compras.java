package basededatos;

public interface iEncargado_compras {

	public Pedido[] cargar_pedidos_pendientes();

	public Pedido ver_pedido_pendiente(int aIdPedido);

	public Pedido[] cargar_pedidos_enviados();

	public Pedido ver_pedido_enviado(int aIdPedido);

	public void marcar_como_enviado(int aIdPedido);
}