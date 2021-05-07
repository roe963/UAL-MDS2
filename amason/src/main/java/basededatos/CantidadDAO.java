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

public class CantidadDAO {
	public static Cantidad loadCantidadByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession();
			return loadCantidadByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cantidad getCantidadByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession();
			return getCantidadByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cantidad loadCantidadByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession();
			return loadCantidadByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cantidad getCantidadByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession();
			return getCantidadByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cantidad loadCantidadByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Cantidad) session.load(basededatos.Cantidad.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cantidad getCantidadByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Cantidad) session.get(basededatos.Cantidad.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cantidad loadCantidadByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Cantidad) session.load(basededatos.Cantidad.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cantidad getCantidadByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Cantidad) session.get(basededatos.Cantidad.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCantidad(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession();
			return queryCantidad(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCantidad(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession();
			return queryCantidad(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cantidad[] listCantidadByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession();
			return listCantidadByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cantidad[] listCantidadByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession();
			return listCantidadByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCantidad(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Cantidad as Cantidad");
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
	
	public static List queryCantidad(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Cantidad as Cantidad");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Cantidad", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cantidad[] listCantidadByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryCantidad(session, condition, orderBy);
			return (Cantidad[]) list.toArray(new Cantidad[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cantidad[] listCantidadByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryCantidad(session, condition, orderBy, lockMode);
			return (Cantidad[]) list.toArray(new Cantidad[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cantidad loadCantidadByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession();
			return loadCantidadByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cantidad loadCantidadByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession();
			return loadCantidadByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cantidad loadCantidadByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Cantidad[] cantidads = listCantidadByQuery(session, condition, orderBy);
		if (cantidads != null && cantidads.length > 0)
			return cantidads[0];
		else
			return null;
	}
	
	public static Cantidad loadCantidadByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Cantidad[] cantidads = listCantidadByQuery(session, condition, orderBy, lockMode);
		if (cantidads != null && cantidads.length > 0)
			return cantidads[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCantidadByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession();
			return iterateCantidadByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCantidadByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession();
			return iterateCantidadByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCantidadByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Cantidad as Cantidad");
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
	
	public static java.util.Iterator iterateCantidadByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Cantidad as Cantidad");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Cantidad", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cantidad createCantidad() {
		return new basededatos.Cantidad();
	}
	
	public static boolean save(basededatos.Cantidad cantidad) throws PersistentException {
		try {
			MDS12021PFOrtegaOrtegaPersistentManager.instance().saveObject(cantidad);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.Cantidad cantidad) throws PersistentException {
		try {
			MDS12021PFOrtegaOrtegaPersistentManager.instance().deleteObject(cantidad);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Cantidad cantidad)throws PersistentException {
		try {
			if (cantidad.getContiene_un() != null) {
				cantidad.getContiene_un().setTiene_una(null);
			}
			
			basededatos.Pedido[] lContenido_ens = cantidad.contenido_en.toArray();
			for(int i = 0; i < lContenido_ens.length; i++) {
				lContenido_ens[i].contiene_un.remove(cantidad);
			}
			return delete(cantidad);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Cantidad cantidad, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (cantidad.getContiene_un() != null) {
				cantidad.getContiene_un().setTiene_una(null);
			}
			
			basededatos.Pedido[] lContenido_ens = cantidad.contenido_en.toArray();
			for(int i = 0; i < lContenido_ens.length; i++) {
				lContenido_ens[i].contiene_un.remove(cantidad);
			}
			try {
				session.delete(cantidad);
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
	
	public static boolean refresh(basededatos.Cantidad cantidad) throws PersistentException {
		try {
			MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession().refresh(cantidad);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.Cantidad cantidad) throws PersistentException {
		try {
			MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession().evict(cantidad);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cantidad loadCantidadByCriteria(CantidadCriteria cantidadCriteria) {
		Cantidad[] cantidads = listCantidadByCriteria(cantidadCriteria);
		if(cantidads == null || cantidads.length == 0) {
			return null;
		}
		return cantidads[0];
	}
	
	public static Cantidad[] listCantidadByCriteria(CantidadCriteria cantidadCriteria) {
		return cantidadCriteria.listCantidad();
	}
}
