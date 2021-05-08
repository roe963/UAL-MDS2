/**
 * Licensee: Juandi(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.PersistentException;
public class ListMDS12021PFOrtegaOrtegaData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Cantidad...");
		basededatos.Cantidad[] basededatosCantidads = basededatos.CantidadDAO.listCantidadByQuery(null, null);
		int length = Math.min(basededatosCantidads.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosCantidads[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Pedido...");
		basededatos.Pedido[] basededatosPedidos = basededatos.PedidoDAO.listPedidoByQuery(null, null);
		length = Math.min(basededatosPedidos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosPedidos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Pedido_pendiente...");
		basededatos.Pedido_pendiente[] basededatosPedido_pendientes = basededatos.Pedido_pendienteDAO.listPedido_pendienteByQuery(null, null);
		length = Math.min(basededatosPedido_pendientes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosPedido_pendientes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Pedido_enviado...");
		basededatos.Pedido_enviado[] basededatosPedido_enviados = basededatos.Pedido_enviadoDAO.listPedido_enviadoByQuery(null, null);
		length = Math.min(basededatosPedido_enviados.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosPedido_enviados[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Respuesta...");
		basededatos.Respuesta[] basededatosRespuestas = basededatos.RespuestaDAO.listRespuestaByQuery(null, null);
		length = Math.min(basededatosRespuestas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosRespuestas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Mensaje...");
		basededatos.Mensaje[] basededatosMensajes = basededatos.MensajeDAO.listMensajeByQuery(null, null);
		length = Math.min(basededatosMensajes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosMensajes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Pedido_entregado...");
		basededatos.Pedido_entregado[] basededatosPedido_entregados = basededatos.Pedido_entregadoDAO.listPedido_entregadoByQuery(null, null);
		length = Math.min(basededatosPedido_entregados.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosPedido_entregados[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Valoracion...");
		basededatos.Valoracion[] basededatosValoracions = basededatos.ValoracionDAO.listValoracionByQuery(null, null);
		length = Math.min(basededatosValoracions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosValoracions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Oferta...");
		basededatos.Oferta[] basededatosOfertas = basededatos.OfertaDAO.listOfertaByQuery(null, null);
		length = Math.min(basededatosOfertas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosOfertas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Foto...");
		basededatos.Foto[] basededatosFotos = basededatos.FotoDAO.listFotoByQuery(null, null);
		length = Math.min(basededatosFotos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosFotos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Producto...");
		basededatos.Producto[] basededatosProductos = basededatos.ProductoDAO.listProductoByQuery(null, null);
		length = Math.min(basededatosProductos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosProductos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Categoria...");
		basededatos.Categoria[] basededatosCategorias = basededatos.CategoriaDAO.listCategoriaByQuery(null, null);
		length = Math.min(basededatosCategorias.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosCategorias[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Usuario...");
		basededatos.Usuario[] basededatosUsuarios = basededatos.UsuarioDAO.listUsuarioByQuery(null, null);
		length = Math.min(basededatosUsuarios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosUsuarios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Cliente...");
		basededatos.Cliente[] basededatosClientes = basededatos.ClienteDAO.listClienteByQuery(null, null);
		length = Math.min(basededatosClientes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosClientes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Encargado_compras...");
		basededatos.Encargado_compras[] basededatosEncargado_comprases = basededatos.Encargado_comprasDAO.listEncargado_comprasByQuery(null, null);
		length = Math.min(basededatosEncargado_comprases.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosEncargado_comprases[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Empresa_transportes...");
		basededatos.Empresa_transportes[] basededatosEmpresa_transporteses = basededatos.Empresa_transportesDAO.listEmpresa_transportesByQuery(null, null);
		length = Math.min(basededatosEmpresa_transporteses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosEmpresa_transporteses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Administrador...");
		basededatos.Administrador[] basededatosAdministradors = basededatos.AdministradorDAO.listAdministradorByQuery(null, null);
		length = Math.min(basededatosAdministradors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosAdministradors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Cantidad by Criteria...");
		basededatos.CantidadCriteria lbasededatosCantidadCriteria = new basededatos.CantidadCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosCantidadCriteria.id.eq();
		lbasededatosCantidadCriteria.setMaxResults(ROW_COUNT);
		basededatos.Cantidad[] basededatosCantidads = lbasededatosCantidadCriteria.listCantidad();
		int length =basededatosCantidads== null ? 0 : Math.min(basededatosCantidads.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosCantidads[i]);
		}
		System.out.println(length + " Cantidad record(s) retrieved."); 
		
		System.out.println("Listing Pedido by Criteria...");
		basededatos.PedidoCriteria lbasededatosPedidoCriteria = new basededatos.PedidoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosPedidoCriteria.id.eq();
		lbasededatosPedidoCriteria.setMaxResults(ROW_COUNT);
		basededatos.Pedido[] basededatosPedidos = lbasededatosPedidoCriteria.listPedido();
		length =basededatosPedidos== null ? 0 : Math.min(basededatosPedidos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosPedidos[i]);
		}
		System.out.println(length + " Pedido record(s) retrieved."); 
		
		System.out.println("Listing Pedido_pendiente by Criteria...");
		basededatos.Pedido_pendienteCriteria lbasededatosPedido_pendienteCriteria = new basededatos.Pedido_pendienteCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosPedido_pendienteCriteria.id.eq();
		lbasededatosPedido_pendienteCriteria.setMaxResults(ROW_COUNT);
		basededatos.Pedido_pendiente[] basededatosPedido_pendientes = lbasededatosPedido_pendienteCriteria.listPedido_pendiente();
		length =basededatosPedido_pendientes== null ? 0 : Math.min(basededatosPedido_pendientes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosPedido_pendientes[i]);
		}
		System.out.println(length + " Pedido_pendiente record(s) retrieved."); 
		
		System.out.println("Listing Pedido_enviado by Criteria...");
		basededatos.Pedido_enviadoCriteria lbasededatosPedido_enviadoCriteria = new basededatos.Pedido_enviadoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosPedido_enviadoCriteria.id.eq();
		lbasededatosPedido_enviadoCriteria.setMaxResults(ROW_COUNT);
		basededatos.Pedido_enviado[] basededatosPedido_enviados = lbasededatosPedido_enviadoCriteria.listPedido_enviado();
		length =basededatosPedido_enviados== null ? 0 : Math.min(basededatosPedido_enviados.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosPedido_enviados[i]);
		}
		System.out.println(length + " Pedido_enviado record(s) retrieved."); 
		
		System.out.println("Listing Respuesta by Criteria...");
		basededatos.RespuestaCriteria lbasededatosRespuestaCriteria = new basededatos.RespuestaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosRespuestaCriteria.id.eq();
		lbasededatosRespuestaCriteria.setMaxResults(ROW_COUNT);
		basededatos.Respuesta[] basededatosRespuestas = lbasededatosRespuestaCriteria.listRespuesta();
		length =basededatosRespuestas== null ? 0 : Math.min(basededatosRespuestas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosRespuestas[i]);
		}
		System.out.println(length + " Respuesta record(s) retrieved."); 
		
		System.out.println("Listing Mensaje by Criteria...");
		basededatos.MensajeCriteria lbasededatosMensajeCriteria = new basededatos.MensajeCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosMensajeCriteria.id.eq();
		lbasededatosMensajeCriteria.setMaxResults(ROW_COUNT);
		basededatos.Mensaje[] basededatosMensajes = lbasededatosMensajeCriteria.listMensaje();
		length =basededatosMensajes== null ? 0 : Math.min(basededatosMensajes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosMensajes[i]);
		}
		System.out.println(length + " Mensaje record(s) retrieved."); 
		
		System.out.println("Listing Pedido_entregado by Criteria...");
		basededatos.Pedido_entregadoCriteria lbasededatosPedido_entregadoCriteria = new basededatos.Pedido_entregadoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosPedido_entregadoCriteria.id.eq();
		lbasededatosPedido_entregadoCriteria.setMaxResults(ROW_COUNT);
		basededatos.Pedido_entregado[] basededatosPedido_entregados = lbasededatosPedido_entregadoCriteria.listPedido_entregado();
		length =basededatosPedido_entregados== null ? 0 : Math.min(basededatosPedido_entregados.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosPedido_entregados[i]);
		}
		System.out.println(length + " Pedido_entregado record(s) retrieved."); 
		
		System.out.println("Listing Valoracion by Criteria...");
		basededatos.ValoracionCriteria lbasededatosValoracionCriteria = new basededatos.ValoracionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosValoracionCriteria.id.eq();
		lbasededatosValoracionCriteria.setMaxResults(ROW_COUNT);
		basededatos.Valoracion[] basededatosValoracions = lbasededatosValoracionCriteria.listValoracion();
		length =basededatosValoracions== null ? 0 : Math.min(basededatosValoracions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosValoracions[i]);
		}
		System.out.println(length + " Valoracion record(s) retrieved."); 
		
		System.out.println("Listing Oferta by Criteria...");
		basededatos.OfertaCriteria lbasededatosOfertaCriteria = new basededatos.OfertaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosOfertaCriteria.id.eq();
		lbasededatosOfertaCriteria.setMaxResults(ROW_COUNT);
		basededatos.Oferta[] basededatosOfertas = lbasededatosOfertaCriteria.listOferta();
		length =basededatosOfertas== null ? 0 : Math.min(basededatosOfertas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosOfertas[i]);
		}
		System.out.println(length + " Oferta record(s) retrieved."); 
		
		System.out.println("Listing Foto by Criteria...");
		basededatos.FotoCriteria lbasededatosFotoCriteria = new basededatos.FotoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosFotoCriteria.id.eq();
		lbasededatosFotoCriteria.setMaxResults(ROW_COUNT);
		basededatos.Foto[] basededatosFotos = lbasededatosFotoCriteria.listFoto();
		length =basededatosFotos== null ? 0 : Math.min(basededatosFotos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosFotos[i]);
		}
		System.out.println(length + " Foto record(s) retrieved."); 
		
		System.out.println("Listing Producto by Criteria...");
		basededatos.ProductoCriteria lbasededatosProductoCriteria = new basededatos.ProductoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosProductoCriteria.id.eq();
		lbasededatosProductoCriteria.setMaxResults(ROW_COUNT);
		basededatos.Producto[] basededatosProductos = lbasededatosProductoCriteria.listProducto();
		length =basededatosProductos== null ? 0 : Math.min(basededatosProductos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosProductos[i]);
		}
		System.out.println(length + " Producto record(s) retrieved."); 
		
		System.out.println("Listing Categoria by Criteria...");
		basededatos.CategoriaCriteria lbasededatosCategoriaCriteria = new basededatos.CategoriaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosCategoriaCriteria.id.eq();
		lbasededatosCategoriaCriteria.setMaxResults(ROW_COUNT);
		basededatos.Categoria[] basededatosCategorias = lbasededatosCategoriaCriteria.listCategoria();
		length =basededatosCategorias== null ? 0 : Math.min(basededatosCategorias.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosCategorias[i]);
		}
		System.out.println(length + " Categoria record(s) retrieved."); 
		
		System.out.println("Listing Usuario by Criteria...");
		basededatos.UsuarioCriteria lbasededatosUsuarioCriteria = new basededatos.UsuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosUsuarioCriteria.id.eq();
		lbasededatosUsuarioCriteria.setMaxResults(ROW_COUNT);
		basededatos.Usuario[] basededatosUsuarios = lbasededatosUsuarioCriteria.listUsuario();
		length =basededatosUsuarios== null ? 0 : Math.min(basededatosUsuarios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosUsuarios[i]);
		}
		System.out.println(length + " Usuario record(s) retrieved."); 
		
		System.out.println("Listing Cliente by Criteria...");
		basededatos.ClienteCriteria lbasededatosClienteCriteria = new basededatos.ClienteCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosClienteCriteria.id.eq();
		lbasededatosClienteCriteria.setMaxResults(ROW_COUNT);
		basededatos.Cliente[] basededatosClientes = lbasededatosClienteCriteria.listCliente();
		length =basededatosClientes== null ? 0 : Math.min(basededatosClientes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosClientes[i]);
		}
		System.out.println(length + " Cliente record(s) retrieved."); 
		
		System.out.println("Listing Encargado_compras by Criteria...");
		basededatos.Encargado_comprasCriteria lbasededatosEncargado_comprasCriteria = new basededatos.Encargado_comprasCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosEncargado_comprasCriteria.id.eq();
		lbasededatosEncargado_comprasCriteria.setMaxResults(ROW_COUNT);
		basededatos.Encargado_compras[] basededatosEncargado_comprases = lbasededatosEncargado_comprasCriteria.listEncargado_compras();
		length =basededatosEncargado_comprases== null ? 0 : Math.min(basededatosEncargado_comprases.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosEncargado_comprases[i]);
		}
		System.out.println(length + " Encargado_compras record(s) retrieved."); 
		
		System.out.println("Listing Empresa_transportes by Criteria...");
		basededatos.Empresa_transportesCriteria lbasededatosEmpresa_transportesCriteria = new basededatos.Empresa_transportesCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosEmpresa_transportesCriteria.id.eq();
		lbasededatosEmpresa_transportesCriteria.setMaxResults(ROW_COUNT);
		basededatos.Empresa_transportes[] basededatosEmpresa_transporteses = lbasededatosEmpresa_transportesCriteria.listEmpresa_transportes();
		length =basededatosEmpresa_transporteses== null ? 0 : Math.min(basededatosEmpresa_transporteses.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosEmpresa_transporteses[i]);
		}
		System.out.println(length + " Empresa_transportes record(s) retrieved."); 
		
		System.out.println("Listing Administrador by Criteria...");
		basededatos.AdministradorCriteria lbasededatosAdministradorCriteria = new basededatos.AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosAdministradorCriteria.id.eq();
		lbasededatosAdministradorCriteria.setMaxResults(ROW_COUNT);
		basededatos.Administrador[] basededatosAdministradors = lbasededatosAdministradorCriteria.listAdministrador();
		length =basededatosAdministradors== null ? 0 : Math.min(basededatosAdministradors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosAdministradors[i]);
		}
		System.out.println(length + " Administrador record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListMDS12021PFOrtegaOrtegaData listMDS12021PFOrtegaOrtegaData = new ListMDS12021PFOrtegaOrtegaData();
			try {
				listMDS12021PFOrtegaOrtegaData.listTestData();
				//listMDS12021PFOrtegaOrtegaData.listByCriteria();
			}
			finally {
				basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
