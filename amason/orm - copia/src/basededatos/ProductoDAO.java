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

public class ProductoDAO {
	public static Producto loadProductoByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession();
			return loadProductoByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto getProductoByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession();
			return getProductoByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto loadProductoByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession();
			return loadProductoByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto getProductoByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession();
			return getProductoByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto loadProductoByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Producto) session.load(basededatos.Producto.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto getProductoByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Producto) session.get(basededatos.Producto.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto loadProductoByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Producto) session.load(basededatos.Producto.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto getProductoByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Producto) session.get(basededatos.Producto.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProducto(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession();
			return queryProducto(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProducto(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession();
			return queryProducto(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto[] listProductoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession();
			return listProductoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto[] listProductoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession();
			return listProductoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProducto(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Producto as Producto");
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
	
	public static List queryProducto(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Producto as Producto");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Producto", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto[] listProductoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryProducto(session, condition, orderBy);
			return (Producto[]) list.toArray(new Producto[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto[] listProductoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryProducto(session, condition, orderBy, lockMode);
			return (Producto[]) list.toArray(new Producto[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto loadProductoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession();
			return loadProductoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto loadProductoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession();
			return loadProductoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto loadProductoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Producto[] productos = listProductoByQuery(session, condition, orderBy);
		if (productos != null && productos.length > 0)
			return productos[0];
		else
			return null;
	}
	
	public static Producto loadProductoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Producto[] productos = listProductoByQuery(session, condition, orderBy, lockMode);
		if (productos != null && productos.length > 0)
			return productos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateProductoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession();
			return iterateProductoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateProductoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession();
			return iterateProductoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateProductoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Producto as Producto");
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
	
	public static java.util.Iterator iterateProductoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Producto as Producto");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Producto", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto createProducto() {
		return new basededatos.Producto();
	}
	
	public static boolean save(basededatos.Producto producto) throws PersistentException {
		try {
			MDS12021PFOrtegaOrtegaPersistentManager.instance().saveObject(producto);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.Producto producto) throws PersistentException {
		try {
			MDS12021PFOrtegaOrtegaPersistentManager.instance().deleteObject(producto);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Producto producto)throws PersistentException {
		try {
			if (producto.getPertenece_a() != null) {
				producto.getPertenece_a().setContiene_un(null);
			}
			
			if (producto.getAsignado_a() != null) {
				producto.getAsignado_a().contiene_un.remove(producto);
			}
			
			basededatos.Valoracion[] lRecibe_unas = producto.recibe_una.toArray();
			for(int i = 0; i < lRecibe_unas.length; i++) {
				lRecibe_unas[i].setValora_un(null);
			}
			basededatos.Foto[] lContiene_unas = producto.contiene_una.toArray();
			for(int i = 0; i < lContiene_unas.length; i++) {
				lContiene_unas[i].setPertenece_a(null);
			}
			if (producto.getTiene_una() != null) {
				producto.getTiene_una().setContiene_un(null);
			}
			
			return delete(producto);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Producto producto, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (producto.getPertenece_a() != null) {
				producto.getPertenece_a().setContiene_un(null);
			}
			
			if (producto.getAsignado_a() != null) {
				producto.getAsignado_a().contiene_un.remove(producto);
			}
			
			basededatos.Valoracion[] lRecibe_unas = producto.recibe_una.toArray();
			for(int i = 0; i < lRecibe_unas.length; i++) {
				lRecibe_unas[i].setValora_un(null);
			}
			basededatos.Foto[] lContiene_unas = producto.contiene_una.toArray();
			for(int i = 0; i < lContiene_unas.length; i++) {
				lContiene_unas[i].setPertenece_a(null);
			}
			if (producto.getTiene_una() != null) {
				producto.getTiene_una().setContiene_un(null);
			}
			
			try {
				session.delete(producto);
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
	
	public static boolean refresh(basededatos.Producto producto) throws PersistentException {
		try {
			MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession().refresh(producto);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.Producto producto) throws PersistentException {
		try {
			MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession().evict(producto);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto loadProductoByCriteria(ProductoCriteria productoCriteria) {
		Producto[] productos = listProductoByCriteria(productoCriteria);
		if(productos == null || productos.length == 0) {
			return null;
		}
		return productos[0];
	}
	
	public static Producto[] listProductoByCriteria(ProductoCriteria productoCriteria) {
		return productoCriteria.listProducto();
	}
}
