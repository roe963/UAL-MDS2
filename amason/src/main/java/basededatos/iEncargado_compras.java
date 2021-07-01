package basededatos;

public interface iEncargado_compras {
    
    public Pedido[] cargar_pedidos_pendientes();

	public Pedido[] cargar_pedidos_enviados();

	public void marcar_como_enviado(int aIdPedido, int aIdEmpresaTransportes);

	public Empresa_transportes[] cargar_empresas_transportes();
}