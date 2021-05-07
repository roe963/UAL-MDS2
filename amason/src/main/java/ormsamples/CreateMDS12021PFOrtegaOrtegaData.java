/**
 * Licensee: Juandi(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;
public class CreateMDS12021PFOrtegaOrtegaData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession().beginTransaction();
		try {
			basededatos.Cantidad lbasededatosCantidad = basededatos.CantidadDAO.createCantidad();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : contenido_en, cantidad, contiene_un
			basededatos.CantidadDAO.save(lbasededatosCantidad);
			basededatos.Pedido lbasededatosPedido = basededatos.PedidoDAO.createPedido();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : contiene_un, precio, fecha, realizado_por
			basededatos.PedidoDAO.save(lbasededatosPedido);
			basededatos.Pedido_pendiente lbasededatosPedido_pendiente = basededatos.Pedido_pendienteDAO.createPedido_pendiente();
			// Initialize the properties of the persistent object here
			basededatos.Pedido_pendienteDAO.save(lbasededatosPedido_pendiente);
			basededatos.Pedido_enviado lbasededatosPedido_enviado = basededatos.Pedido_enviadoDAO.createPedido_enviado();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : asignado_a
			basededatos.Pedido_enviadoDAO.save(lbasededatosPedido_enviado);
			basededatos.Respuesta lbasededatosRespuesta = basededatos.RespuestaDAO.createRespuesta();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : orden, pertenece_a
			basededatos.RespuestaDAO.save(lbasededatosRespuesta);
			basededatos.Mensaje lbasededatosMensaje = basededatos.MensajeDAO.createMensaje();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : contiene_un, escrito_por
			basededatos.MensajeDAO.save(lbasededatosMensaje);
			basededatos.Pedido_entregado lbasededatosPedido_entregado = basededatos.Pedido_entregadoDAO.createPedido_entregado();
			// Initialize the properties of the persistent object here
			basededatos.Pedido_entregadoDAO.save(lbasededatosPedido_entregado);
			basededatos.Valoracion lbasededatosValoracion = basededatos.ValoracionDAO.createValoracion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : escrito_por, puntuacion, valora_un
			basededatos.ValoracionDAO.save(lbasededatosValoracion);
			basededatos.Oferta lbasededatosOferta = basededatos.OfertaDAO.createOferta();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : precio, fecha
			basededatos.OfertaDAO.save(lbasededatosOferta);
			basededatos.Foto lbasededatosFoto = basededatos.FotoDAO.createFoto();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : pertenece_a
			basededatos.FotoDAO.save(lbasededatosFoto);
			basededatos.Producto lbasededatosProducto = basededatos.ProductoDAO.createProducto();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tiene_una, contiene_una, recibe_una, activo, precio, asignado_a
			basededatos.ProductoDAO.save(lbasededatosProducto);
			basededatos.Categoria lbasededatosCategoria = basededatos.CategoriaDAO.createCategoria();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : contiene_un, activo
			basededatos.CategoriaDAO.save(lbasededatosCategoria);
			basededatos.Usuario lbasededatosUsuario = basededatos.UsuarioDAO.createUsuario();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : activo
			basededatos.UsuarioDAO.save(lbasededatosUsuario);
			basededatos.Cliente lbasededatosCliente = basededatos.ClienteDAO.createCliente();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : realiza_una, manda_un, realiza_un
			basededatos.ClienteDAO.save(lbasededatosCliente);
			basededatos.Encargado_compras lbasededatosEncargado_compras = basededatos.Encargado_comprasDAO.createEncargado_compras();
			// Initialize the properties of the persistent object here
			basededatos.Encargado_comprasDAO.save(lbasededatosEncargado_compras);
			basededatos.Empresa_transportes lbasededatosEmpresa_transportes = basededatos.Empresa_transportesDAO.createEmpresa_transportes();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tiene_asignado_un
			basededatos.Empresa_transportesDAO.save(lbasededatosEmpresa_transportes);
			basededatos.Administrador lbasededatosAdministrador = basededatos.AdministradorDAO.createAdministrador();
			// Initialize the properties of the persistent object here
			basededatos.AdministradorDAO.save(lbasededatosAdministrador);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateMDS12021PFOrtegaOrtegaData createMDS12021PFOrtegaOrtegaData = new CreateMDS12021PFOrtegaOrtegaData();
			try {
				createMDS12021PFOrtegaOrtegaData.createTestData();
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
