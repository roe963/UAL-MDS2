/**
 * Licensee: Juandi(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;
public class DeleteMDS12021PFOrtegaOrtegaData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession().beginTransaction();
		try {
			basededatos.Cantidad lbasededatosCantidad = basededatos.CantidadDAO.loadCantidadByQuery(null, null);
			// Delete the persistent object
			basededatos.CantidadDAO.delete(lbasededatosCantidad);
			basededatos.Pedido lbasededatosPedido = basededatos.PedidoDAO.loadPedidoByQuery(null, null);
			// Delete the persistent object
			basededatos.PedidoDAO.delete(lbasededatosPedido);
			basededatos.Pedido_pendiente lbasededatosPedido_pendiente = basededatos.Pedido_pendienteDAO.loadPedido_pendienteByQuery(null, null);
			// Delete the persistent object
			basededatos.Pedido_pendienteDAO.delete(lbasededatosPedido_pendiente);
			basededatos.Pedido_enviado lbasededatosPedido_enviado = basededatos.Pedido_enviadoDAO.loadPedido_enviadoByQuery(null, null);
			// Delete the persistent object
			basededatos.Pedido_enviadoDAO.delete(lbasededatosPedido_enviado);
			basededatos.Respuesta lbasededatosRespuesta = basededatos.RespuestaDAO.loadRespuestaByQuery(null, null);
			// Delete the persistent object
			basededatos.RespuestaDAO.delete(lbasededatosRespuesta);
			basededatos.Mensaje lbasededatosMensaje = basededatos.MensajeDAO.loadMensajeByQuery(null, null);
			// Delete the persistent object
			basededatos.MensajeDAO.delete(lbasededatosMensaje);
			basededatos.Pedido_entregado lbasededatosPedido_entregado = basededatos.Pedido_entregadoDAO.loadPedido_entregadoByQuery(null, null);
			// Delete the persistent object
			basededatos.Pedido_entregadoDAO.delete(lbasededatosPedido_entregado);
			basededatos.Valoracion lbasededatosValoracion = basededatos.ValoracionDAO.loadValoracionByQuery(null, null);
			// Delete the persistent object
			basededatos.ValoracionDAO.delete(lbasededatosValoracion);
			basededatos.Oferta lbasededatosOferta = basededatos.OfertaDAO.loadOfertaByQuery(null, null);
			// Delete the persistent object
			basededatos.OfertaDAO.delete(lbasededatosOferta);
			basededatos.Foto lbasededatosFoto = basededatos.FotoDAO.loadFotoByQuery(null, null);
			// Delete the persistent object
			basededatos.FotoDAO.delete(lbasededatosFoto);
			basededatos.Producto lbasededatosProducto = basededatos.ProductoDAO.loadProductoByQuery(null, null);
			// Delete the persistent object
			basededatos.ProductoDAO.delete(lbasededatosProducto);
			basededatos.Categoria lbasededatosCategoria = basededatos.CategoriaDAO.loadCategoriaByQuery(null, null);
			// Delete the persistent object
			basededatos.CategoriaDAO.delete(lbasededatosCategoria);
			basededatos.Usuario lbasededatosUsuario = basededatos.UsuarioDAO.loadUsuarioByQuery(null, null);
			// Delete the persistent object
			basededatos.UsuarioDAO.delete(lbasededatosUsuario);
			basededatos.Cliente lbasededatosCliente = basededatos.ClienteDAO.loadClienteByQuery(null, null);
			// Delete the persistent object
			basededatos.ClienteDAO.delete(lbasededatosCliente);
			basededatos.Encargado_compras lbasededatosEncargado_compras = basededatos.Encargado_comprasDAO.loadEncargado_comprasByQuery(null, null);
			// Delete the persistent object
			basededatos.Encargado_comprasDAO.delete(lbasededatosEncargado_compras);
			basededatos.Empresa_transportes lbasededatosEmpresa_transportes = basededatos.Empresa_transportesDAO.loadEmpresa_transportesByQuery(null, null);
			// Delete the persistent object
			basededatos.Empresa_transportesDAO.delete(lbasededatosEmpresa_transportes);
			basededatos.Administrador lbasededatosAdministrador = basededatos.AdministradorDAO.loadAdministradorByQuery(null, null);
			// Delete the persistent object
			basededatos.AdministradorDAO.delete(lbasededatosAdministrador);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteMDS12021PFOrtegaOrtegaData deleteMDS12021PFOrtegaOrtegaData = new DeleteMDS12021PFOrtegaOrtegaData();
			try {
				deleteMDS12021PFOrtegaOrtegaData.deleteTestData();
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
