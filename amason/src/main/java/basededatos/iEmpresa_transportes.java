package basededatos;

public interface iEmpresa_transportes {

	public Pedido[] cargar_pedidos_enviados();

	public Pedido[] ver_pedido_enviado(int aIdPedido);

	public Pedido[] cargar_pedidos_entregados();

	public Pedido[] ver_pedido_entregado();

	public void marcar_como_entregado(int aIdPedido);
}