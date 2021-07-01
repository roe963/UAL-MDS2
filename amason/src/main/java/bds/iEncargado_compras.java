package bds;

import basededatos.Empresa_transportes;
import basededatos.Pedido;

public interface iEncargado_compras {
    
    public Pedido[] cargar_pedidos_pendientes();

	public Pedido[] cargar_pedidos_enviados();

	public void marcar_como_enviado(int aIdPedido, int aIdEmpresaTransportes);

	public Empresa_transportes[] cargar_empresas_transportes();
}