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

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class Pedido_pendienteDAO {
	public static Pedido_pendiente loadPedido_pendienteByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession();
			return loadPedido_pendienteByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pedido_pendiente getPedido_pendienteByORMID(int id){
		try {
			PersistentSession session = MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession();
			return getPedido_pendienteByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Pedido_pendiente loadPedido_pendienteByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession();
			return loadPedido_pendienteByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pedido_pendiente getPedido_pendienteByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession();
			return getPedido_pendienteByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pedido_pendiente loadPedido_pendienteByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Pedido_pendiente) session.load(basededatos.Pedido_pendiente.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pedido_pendiente getPedido_pendienteByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Pedido_pendiente) session.get(basededatos.Pedido_pendiente.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pedido_pendiente loadPedido_pendienteByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Pedido_pendiente) session.load(basededatos.Pedido_pendiente.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pedido_pendiente getPedido_pendienteByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Pedido_pendiente) session.get(basededatos.Pedido_pendiente.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPedido_pendiente(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession();
			return queryPedido_pendiente(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPedido_pendiente(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession();
			return queryPedido_pendiente(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pedido_pendiente[] listPedido_pendienteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession();
			return listPedido_pendienteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pedido_pendiente[] listPedido_pendienteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession();
			return listPedido_pendienteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPedido_pendiente(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Pedido_pendiente as Pedido_pendiente");
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
	
	public static List queryPedido_pendiente(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Pedido_pendiente as Pedido_pendiente");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Pedido_pendiente", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pedido_pendiente[] listPedido_pendienteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPedido_pendiente(session, condition, orderBy);
			return (Pedido_pendiente[]) list.toArray(new Pedido_pendiente[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pedido_pendiente[] listPedido_pendienteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPedido_pendiente(session, condition, orderBy, lockMode);
			return (Pedido_pendiente[]) list.toArray(new Pedido_pendiente[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pedido_pendiente loadPedido_pendienteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession();
			return loadPedido_pendienteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pedido_pendiente loadPedido_pendienteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession();
			return loadPedido_pendienteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pedido_pendiente loadPedido_pendienteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Pedido_pendiente[] pedido_pendientes = listPedido_pendienteByQuery(session, condition, orderBy);
		if (pedido_pendientes != null && pedido_pendientes.length > 0)
			return pedido_pendientes[0];
		else
			return null;
	}
	
	public static Pedido_pendiente loadPedido_pendienteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Pedido_pendiente[] pedido_pendientes = listPedido_pendienteByQuery(session, condition, orderBy, lockMode);
		if (pedido_pendientes != null && pedido_pendientes.length > 0)
			return pedido_pendientes[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePedido_pendienteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession();
			return iteratePedido_pendienteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePedido_pendienteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession();
			return iteratePedido_pendienteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePedido_pendienteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Pedido_pendiente as Pedido_pendiente");
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
	
	public static java.util.Iterator iteratePedido_pendienteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Pedido_pendiente as Pedido_pendiente");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Pedido_pendiente", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pedido_pendiente createPedido_pendiente() {
		return new basededatos.Pedido_pendiente();
	}
	
	public static boolean save(basededatos.Pedido_pendiente pedido_pendiente) throws PersistentException {
		try {
			MDS12021PFOrtegaOrtegaPersistentManager.instance().saveObject(pedido_pendiente);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.Pedido_pendiente pedido_pendiente) throws PersistentException {
		try {
			MDS12021PFOrtegaOrtegaPersistentManager.instance().deleteObject(pedido_pendiente);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Pedido_pendiente pedido_pendiente)throws PersistentException {
		try {
			if (pedido_pendiente.getRealizado_por() != null) {
				pedido_pendiente.getRealizado_por().realiza_un.remove(pedido_pendiente);
			}
			
			basededatos.Cantidad[] lContiene_uns = pedido_pendiente.contiene_un.toArray();
			for(int i = 0; i < lContiene_uns.length; i++) {
				lContiene_uns[i].contenido_en.remove(pedido_pendiente);
			}
			return delete(pedido_pendiente);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Pedido_pendiente pedido_pendiente, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (pedido_pendiente.getRealizado_por() != null) {
				pedido_pendiente.getRealizado_por().realiza_un.remove(pedido_pendiente);
			}
			
			basededatos.Cantidad[] lContiene_uns = pedido_pendiente.contiene_un.toArray();
			for(int i = 0; i < lContiene_uns.length; i++) {
				lContiene_uns[i].contenido_en.remove(pedido_pendiente);
			}
			try {
				session.delete(pedido_pendiente);
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
	
	public static boolean refresh(basededatos.Pedido_pendiente pedido_pendiente) throws PersistentException {
		try {
			MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession().refresh(pedido_pendiente);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.Pedido_pendiente pedido_pendiente) throws PersistentException {
		try {
			MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession().evict(pedido_pendiente);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pedido_pendiente loadPedido_pendienteByCriteria(Pedido_pendienteCriteria pedido_pendienteCriteria) {
		Pedido_pendiente[] pedido_pendientes = listPedido_pendienteByCriteria(pedido_pendienteCriteria);
		if(pedido_pendientes == null || pedido_pendientes.length == 0) {
			return null;
		}
		return pedido_pendientes[0];
	}
	
	public static Pedido_pendiente[] listPedido_pendienteByCriteria(Pedido_pendienteCriteria pedido_pendienteCriteria) {
		return pedido_pendienteCriteria.listPedido_pendiente();
	}
}
