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

public class Pedido_enviadoDAO {
	public static Pedido_enviado loadPedido_enviadoByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession();
			return loadPedido_enviadoByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pedido_enviado getPedido_enviadoByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession();
			return getPedido_enviadoByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pedido_enviado loadPedido_enviadoByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession();
			return loadPedido_enviadoByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pedido_enviado getPedido_enviadoByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession();
			return getPedido_enviadoByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pedido_enviado loadPedido_enviadoByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Pedido_enviado) session.load(basededatos.Pedido_enviado.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pedido_enviado getPedido_enviadoByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Pedido_enviado) session.get(basededatos.Pedido_enviado.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pedido_enviado loadPedido_enviadoByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Pedido_enviado) session.load(basededatos.Pedido_enviado.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pedido_enviado getPedido_enviadoByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Pedido_enviado) session.get(basededatos.Pedido_enviado.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPedido_enviado(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession();
			return queryPedido_enviado(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPedido_enviado(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession();
			return queryPedido_enviado(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pedido_enviado[] listPedido_enviadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession();
			return listPedido_enviadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pedido_enviado[] listPedido_enviadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession();
			return listPedido_enviadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPedido_enviado(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Pedido_enviado as Pedido_enviado");
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
	
	public static List queryPedido_enviado(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Pedido_enviado as Pedido_enviado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Pedido_enviado", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pedido_enviado[] listPedido_enviadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPedido_enviado(session, condition, orderBy);
			return (Pedido_enviado[]) list.toArray(new Pedido_enviado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pedido_enviado[] listPedido_enviadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPedido_enviado(session, condition, orderBy, lockMode);
			return (Pedido_enviado[]) list.toArray(new Pedido_enviado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pedido_enviado loadPedido_enviadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession();
			return loadPedido_enviadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pedido_enviado loadPedido_enviadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession();
			return loadPedido_enviadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pedido_enviado loadPedido_enviadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Pedido_enviado[] pedido_enviados = listPedido_enviadoByQuery(session, condition, orderBy);
		if (pedido_enviados != null && pedido_enviados.length > 0)
			return pedido_enviados[0];
		else
			return null;
	}
	
	public static Pedido_enviado loadPedido_enviadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Pedido_enviado[] pedido_enviados = listPedido_enviadoByQuery(session, condition, orderBy, lockMode);
		if (pedido_enviados != null && pedido_enviados.length > 0)
			return pedido_enviados[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePedido_enviadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession();
			return iteratePedido_enviadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePedido_enviadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession();
			return iteratePedido_enviadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePedido_enviadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Pedido_enviado as Pedido_enviado");
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
	
	public static java.util.Iterator iteratePedido_enviadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Pedido_enviado as Pedido_enviado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Pedido_enviado", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pedido_enviado createPedido_enviado() {
		return new basededatos.Pedido_enviado();
	}
	
	public static boolean save(basededatos.Pedido_enviado pedido_enviado) throws PersistentException {
		try {
			MDS12021PFOrtegaOrtegaPersistentManager.instance().saveObject(pedido_enviado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.Pedido_enviado pedido_enviado) throws PersistentException {
		try {
			MDS12021PFOrtegaOrtegaPersistentManager.instance().deleteObject(pedido_enviado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Pedido_enviado pedido_enviado)throws PersistentException {
		try {
			if (pedido_enviado.getAsignado_a() != null) {
				pedido_enviado.getAsignado_a().tiene_asignado_un.remove(pedido_enviado);
			}
			
			if (pedido_enviado.getRealizado_por() != null) {
				pedido_enviado.getRealizado_por().realiza_un.remove(pedido_enviado);
			}
			
			basededatos.Cantidad[] lContiene_uns = pedido_enviado.contiene_un.toArray();
			for(int i = 0; i < lContiene_uns.length; i++) {
				lContiene_uns[i].contenido_en.remove(pedido_enviado);
			}
			return delete(pedido_enviado);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Pedido_enviado pedido_enviado, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (pedido_enviado.getAsignado_a() != null) {
				pedido_enviado.getAsignado_a().tiene_asignado_un.remove(pedido_enviado);
			}
			
			if (pedido_enviado.getRealizado_por() != null) {
				pedido_enviado.getRealizado_por().realiza_un.remove(pedido_enviado);
			}
			
			basededatos.Cantidad[] lContiene_uns = pedido_enviado.contiene_un.toArray();
			for(int i = 0; i < lContiene_uns.length; i++) {
				lContiene_uns[i].contenido_en.remove(pedido_enviado);
			}
			try {
				session.delete(pedido_enviado);
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
	
	public static boolean refresh(basededatos.Pedido_enviado pedido_enviado) throws PersistentException {
		try {
			MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession().refresh(pedido_enviado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.Pedido_enviado pedido_enviado) throws PersistentException {
		try {
			MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession().evict(pedido_enviado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pedido_enviado loadPedido_enviadoByCriteria(Pedido_enviadoCriteria pedido_enviadoCriteria) {
		Pedido_enviado[] pedido_enviados = listPedido_enviadoByCriteria(pedido_enviadoCriteria);
		if(pedido_enviados == null || pedido_enviados.length == 0) {
			return null;
		}
		return pedido_enviados[0];
	}
	
	public static Pedido_enviado[] listPedido_enviadoByCriteria(Pedido_enviadoCriteria pedido_enviadoCriteria) {
		return pedido_enviadoCriteria.listPedido_enviado();
	}
}
