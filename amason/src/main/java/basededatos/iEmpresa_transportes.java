package basededatos;

public interface iEmpresa_transportes {

	public Pedido[] cargar_pedidos_enviados(int aIdEmpresaTransportes);

	public Pedido[] cargar_pedidos_entregados();

	public void marcar_como_entregado(int aIdPedido);
}