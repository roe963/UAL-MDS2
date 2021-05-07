/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Juandi(University of Almeria)
 * License Type: Academic
 */
package basededatos;

import java.util.List;

import org.hibernate.Query;
import org.orm.PersistentException;
import org.orm.PersistentSession;

public class PedidoDAO {
	public static Pedido loadPedidoByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession();
			return loadPedidoByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pedido getPedidoByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession();
			return getPedidoByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pedido loadPedidoByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession();
			return loadPedidoByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pedido getPedidoByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession();
			return getPedidoByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pedido loadPedidoByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Pedido) session.load(basededatos.Pedido.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pedido getPedidoByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Pedido) session.get(basededatos.Pedido.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pedido loadPedidoByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Pedido) session.load(basededatos.Pedido.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pedido getPedidoByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Pedido) session.get(basededatos.Pedido.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPedido(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession();
			return queryPedido(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPedido(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession();
			return queryPedido(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pedido[] listPedidoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession();
			return listPedidoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pedido[] listPedidoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession();
			return listPedidoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPedido(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Pedido as Pedido");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPedido(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Pedido as Pedido");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Pedido", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pedido[] listPedidoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPedido(session, condition, orderBy);
			return (Pedido[]) list.toArray(new Pedido[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pedido[] listPedidoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPedido(session, condition, orderBy, lockMode);
			return (Pedido[]) list.toArray(new Pedido[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pedido loadPedidoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession();
			return loadPedidoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pedido loadPedidoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession();
			return loadPedidoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pedido loadPedidoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Pedido[] pedidos = listPedidoByQuery(session, condition, orderBy);
		if (pedidos != null && pedidos.length > 0)
			return pedidos[0];
		else
			return null;
	}
	
	public static Pedido loadPedidoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Pedido[] pedidos = listPedidoByQuery(session, condition, orderBy, lockMode);
		if (pedidos != null && pedidos.length > 0)
			return pedidos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePedidoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession();
			return iteratePedidoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePedidoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession();
			return iteratePedidoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePedidoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Pedido as Pedido");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePedidoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Pedido as Pedido");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Pedido", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pedido createPedido() {
		return new basededatos.Pedido();
	}
	
	public static boolean save(basededatos.Pedido pedido) throws PersistentException {
		try {
			MDS12021PFOrtegaOrtegaPersistentManager.instance().saveObject(pedido);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.Pedido pedido) throws PersistentException {
		try {
			MDS12021PFOrtegaOrtegaPersistentManager.instance().deleteObject(pedido);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Pedido pedido)throws PersistentException {
		if (pedido instanceof basededatos.Pedido_pendiente) {
			return basededatos.Pedido_pendienteDAO.deleteAndDissociate((basededatos.Pedido_pendiente) pedido);
		}
		
		if (pedido instanceof basededatos.Pedido_enviado) {
			return basededatos.Pedido_enviadoDAO.deleteAndDissociate((basededatos.Pedido_enviado) pedido);
		}
		
		if (pedido instanceof basededatos.Pedido_entregado) {
			return basededatos.Pedido_entregadoDAO.deleteAndDissociate((basededatos.Pedido_entregado) pedido);
		}
		
		try {
			if (pedido.getRealizado_por() != null) {
				pedido.getRealizado_por().realiza_un.remove(pedido);
			}
			
			basededatos.Cantidad[] lContiene_uns = pedido.contiene_un.toArray();
			for(int i = 0; i < lContiene_uns.length; i++) {
				lContiene_uns[i].contenido_en.remove(pedido);
			}
			return delete(pedido);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Pedido pedido, org.orm.PersistentSession session)throws PersistentException {
		if (pedido instanceof basededatos.Pedido_pendiente) {
			return basededatos.Pedido_pendienteDAO.deleteAndDissociate((basededatos.Pedido_pendiente) pedido, session);
		}
		
		if (pedido instanceof basededatos.Pedido_enviado) {
			return basededatos.Pedido_enviadoDAO.deleteAndDissociate((basededatos.Pedido_enviado) pedido, session);
		}
		
		if (pedido instanceof basededatos.Pedido_entregado) {
			return basededatos.Pedido_entregadoDAO.deleteAndDissociate((basededatos.Pedido_entregado) pedido, session);
		}
		
		try {
			if (pedido.getRealizado_por() != null) {
				pedido.getRealizado_por().realiza_un.remove(pedido);
			}
			
			basededatos.Cantidad[] lContiene_uns = pedido.contiene_un.toArray();
			for(int i = 0; i < lContiene_uns.length; i++) {
				lContiene_uns[i].contenido_en.remove(pedido);
			}
			try {
				session.delete(pedido);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(basededatos.Pedido pedido) throws PersistentException {
		try {
			MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession().refresh(pedido);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.Pedido pedido) throws PersistentException {
		try {
			MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession().evict(pedido);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pedido loadPedidoByCriteria(PedidoCriteria pedidoCriteria) {
		Pedido[] pedidos = listPedidoByCriteria(pedidoCriteria);
		if(pedidos == null || pedidos.length == 0) {
			return null;
		}
		return pedidos[0];
	}
	
	public static Pedido[] listPedidoByCriteria(PedidoCriteria pedidoCriteria) {
		return pedidoCriteria.listPedido();
	}
}
