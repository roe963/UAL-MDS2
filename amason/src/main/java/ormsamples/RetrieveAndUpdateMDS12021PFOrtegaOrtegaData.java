/**
 * Licensee: Juandi(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;
public class RetrieveAndUpdateMDS12021PFOrtegaOrtegaData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession().beginTransaction();
		try {
			basededatos.Cantidad lbasededatosCantidad = basededatos.CantidadDAO.loadCantidadByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.CantidadDAO.save(lbasededatosCantidad);
			basededatos.Pedido lbasededatosPedido = basededatos.PedidoDAO.loadPedidoByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.PedidoDAO.save(lbasededatosPedido);
			basededatos.Pedido_pendiente lbasededatosPedido_pendiente = basededatos.Pedido_pendienteDAO.loadPedido_pendienteByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.Pedido_pendienteDAO.save(lbasededatosPedido_pendiente);
			basededatos.Pedido_enviado lbasededatosPedido_enviado = basededatos.Pedido_enviadoDAO.loadPedido_enviadoByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.Pedido_enviadoDAO.save(lbasededatosPedido_enviado);
			basededatos.Respuesta lbasededatosRespuesta = basededatos.RespuestaDAO.loadRespuestaByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.RespuestaDAO.save(lbasededatosRespuesta);
			basededatos.Mensaje lbasededatosMensaje = basededatos.MensajeDAO.loadMensajeByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.MensajeDAO.save(lbasededatosMensaje);
			basededatos.Pedido_entregado lbasededatosPedido_entregado = basededatos.Pedido_entregadoDAO.loadPedido_entregadoByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.Pedido_entregadoDAO.save(lbasededatosPedido_entregado);
			basededatos.Valoracion lbasededatosValoracion = basededatos.ValoracionDAO.loadValoracionByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.ValoracionDAO.save(lbasededatosValoracion);
			basededatos.Oferta lbasededatosOferta = basededatos.OfertaDAO.loadOfertaByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.OfertaDAO.save(lbasededatosOferta);
			basededatos.Foto lbasededatosFoto = basededatos.FotoDAO.loadFotoByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.FotoDAO.save(lbasededatosFoto);
			basededatos.Producto lbasededatosProducto = basededatos.ProductoDAO.loadProductoByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.ProductoDAO.save(lbasededatosProducto);
			basededatos.Categoria lbasededatosCategoria = basededatos.CategoriaDAO.loadCategoriaByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.CategoriaDAO.save(lbasededatosCategoria);
			basededatos.Usuario lbasededatosUsuario = basededatos.UsuarioDAO.loadUsuarioByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.UsuarioDAO.save(lbasededatosUsuario);
			basededatos.Cliente lbasededatosCliente = basededatos.ClienteDAO.loadClienteByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.ClienteDAO.save(lbasededatosCliente);
			basededatos.Encargado_compras lbasededatosEncargado_compras = basededatos.Encargado_comprasDAO.loadEncargado_comprasByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.Encargado_comprasDAO.save(lbasededatosEncargado_compras);
			basededatos.Empresa_transportes lbasededatosEmpresa_transportes = basededatos.Empresa_transportesDAO.loadEmpresa_transportesByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.Empresa_transportesDAO.save(lbasededatosEmpresa_transportes);
			basededatos.Administrador lbasededatosAdministrador = basededatos.AdministradorDAO.loadAdministradorByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.AdministradorDAO.save(lbasededatosAdministrador);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Cantidad by CantidadCriteria");
		basededatos.CantidadCriteria lbasededatosCantidadCriteria = new basededatos.CantidadCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosCantidadCriteria.id.eq();
		System.out.println(lbasededatosCantidadCriteria.uniqueCantidad());
		
		System.out.println("Retrieving Pedido by PedidoCriteria");
		basededatos.PedidoCriteria lbasededatosPedidoCriteria = new basededatos.PedidoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosPedidoCriteria.id.eq();
		System.out.println(lbasededatosPedidoCriteria.uniquePedido());
		
		System.out.println("Retrieving Pedido_pendiente by Pedido_pendienteCriteria");
		basededatos.Pedido_pendienteCriteria lbasededatosPedido_pendienteCriteria = new basededatos.Pedido_pendienteCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosPedido_pendienteCriteria.id.eq();
		System.out.println(lbasededatosPedido_pendienteCriteria.uniquePedido_pendiente());
		
		System.out.println("Retrieving Pedido_enviado by Pedido_enviadoCriteria");
		basededatos.Pedido_enviadoCriteria lbasededatosPedido_enviadoCriteria = new basededatos.Pedido_enviadoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosPedido_enviadoCriteria.id.eq();
		System.out.println(lbasededatosPedido_enviadoCriteria.uniquePedido_enviado());
		
		System.out.println("Retrieving Respuesta by RespuestaCriteria");
		basededatos.RespuestaCriteria lbasededatosRespuestaCriteria = new basededatos.RespuestaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosRespuestaCriteria.id.eq();
		System.out.println(lbasededatosRespuestaCriteria.uniqueRespuesta());
		
		System.out.println("Retrieving Mensaje by MensajeCriteria");
		basededatos.MensajeCriteria lbasededatosMensajeCriteria = new basededatos.MensajeCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosMensajeCriteria.id.eq();
		System.out.println(lbasededatosMensajeCriteria.uniqueMensaje());
		
		System.out.println("Retrieving Pedido_entregado by Pedido_entregadoCriteria");
		basededatos.Pedido_entregadoCriteria lbasededatosPedido_entregadoCriteria = new basededatos.Pedido_entregadoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosPedido_entregadoCriteria.id.eq();
		System.out.println(lbasededatosPedido_entregadoCriteria.uniquePedido_entregado());
		
		System.out.println("Retrieving Valoracion by ValoracionCriteria");
		basededatos.ValoracionCriteria lbasededatosValoracionCriteria = new basededatos.ValoracionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosValoracionCriteria.id.eq();
		System.out.println(lbasededatosValoracionCriteria.uniqueValoracion());
		
		System.out.println("Retrieving Oferta by OfertaCriteria");
		basededatos.OfertaCriteria lbasededatosOfertaCriteria = new basededatos.OfertaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosOfertaCriteria.id.eq();
		System.out.println(lbasededatosOfertaCriteria.uniqueOferta());
		
		System.out.println("Retrieving Foto by FotoCriteria");
		basededatos.FotoCriteria lbasededatosFotoCriteria = new basededatos.FotoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosFotoCriteria.id.eq();
		System.out.println(lbasededatosFotoCriteria.uniqueFoto());
		
		System.out.println("Retrieving Producto by ProductoCriteria");
		basededatos.ProductoCriteria lbasededatosProductoCriteria = new basededatos.ProductoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosProductoCriteria.id.eq();
		System.out.println(lbasededatosProductoCriteria.uniqueProducto());
		
		System.out.println("Retrieving Categoria by CategoriaCriteria");
		basededatos.CategoriaCriteria lbasededatosCategoriaCriteria = new basededatos.CategoriaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosCategoriaCriteria.id.eq();
		System.out.println(lbasededatosCategoriaCriteria.uniqueCategoria());
		
		System.out.println("Retrieving Usuario by UsuarioCriteria");
		basededatos.UsuarioCriteria lbasededatosUsuarioCriteria = new basededatos.UsuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosUsuarioCriteria.id.eq();
		System.out.println(lbasededatosUsuarioCriteria.uniqueUsuario());
		
		System.out.println("Retrieving Cliente by ClienteCriteria");
		basededatos.ClienteCriteria lbasededatosClienteCriteria = new basededatos.ClienteCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosClienteCriteria.id.eq();
		System.out.println(lbasededatosClienteCriteria.uniqueCliente());
		
		System.out.println("Retrieving Encargado_compras by Encargado_comprasCriteria");
		basededatos.Encargado_comprasCriteria lbasededatosEncargado_comprasCriteria = new basededatos.Encargado_comprasCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosEncargado_comprasCriteria.id.eq();
		System.out.println(lbasededatosEncargado_comprasCriteria.uniqueEncargado_compras());
		
		System.out.println("Retrieving Empresa_transportes by Empresa_transportesCriteria");
		basededatos.Empresa_transportesCriteria lbasededatosEmpresa_transportesCriteria = new basededatos.Empresa_transportesCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosEmpresa_transportesCriteria.id.eq();
		System.out.println(lbasededatosEmpresa_transportesCriteria.uniqueEmpresa_transportes());
		
		System.out.println("Retrieving Administrador by AdministradorCriteria");
		basededatos.AdministradorCriteria lbasededatosAdministradorCriteria = new basededatos.AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosAdministradorCriteria.id.eq();
		System.out.println(lbasededatosAdministradorCriteria.uniqueAdministrador());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateMDS12021PFOrtegaOrtegaData retrieveAndUpdateMDS12021PFOrtegaOrtegaData = new RetrieveAndUpdateMDS12021PFOrtegaOrtegaData();
			try {
				retrieveAndUpdateMDS12021PFOrtegaOrtegaData.retrieveAndUpdateTestData();
				//retrieveAndUpdateMDS12021PFOrtegaOrtegaData.retrieveByCriteria();
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
