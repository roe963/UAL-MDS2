package bds;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.Administrador;
import basededatos.AdministradorDAO;
import basededatos.Cantidad;
import basededatos.CantidadDAO;
import basededatos.Categoria;
import basededatos.CategoriaDAO;
import basededatos.Cliente;
import basededatos.ClienteDAO;
import basededatos.Foto;
import basededatos.FotoDAO;
import basededatos.Producto;
import basededatos.ProductoDAO;
import basededatos.Valoracion;

public class Productos {
	public BDPrincipal _bdprincipal_productos;
	public Vector<Producto> _contiene_producto = new Vector<Producto>();

	public Producto[] cargar_productos(String aNombreProducto) throws PersistentException {
		Producto[] productos = null;
		Foto[] fotos= null;
		
        PersistentTransaction t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession().beginTransaction();
        
        try {
        	//productos = ProductoDAO.listProductoByQuery("Nombre LIKE '%" + aNombreProducto + "%'", null);
        	productos = ProductoDAO.listProductoByQuery("Nombre LIKE '%" + aNombreProducto + "%' AND Activo=1", null);
        	
        	fotos = FotoDAO.listFotoByQuery(null, null);
        	
        	for (int i = 0; i < productos.length; i++) {
        		for (int j = 0; j < fotos.length; j++) {
					if(productos[i].getId() == fotos[j].getPertenece_a().getId() ) {						
						productos[i].contiene_una.add(fotos[j]);
						break;
					}						
				}				
			}

            t.commit();
        } catch (PersistentException e) {
            t.rollback();
        }
        
        return productos;
	}

	public Producto[] cargar_productos_categoria(int aIdCategoria) throws PersistentException {
		Producto[] productos = null;
		Foto[] fotos= null;
		
        PersistentTransaction t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession().beginTransaction();
        
        try {
        	//productos = ProductoDAO.listProductoByQuery("CategoriaId=" + aIdCategoria, null);
        	productos = ProductoDAO.listProductoByQuery("CategoriaId=" + aIdCategoria + " AND Activo=1", null);
        	fotos = FotoDAO.listFotoByQuery(null, null);
        	
        	for (int i = 0; i < productos.length; i++) {
        		for (int j = 0; j < fotos.length; j++) {
					if(productos[i].getId() == fotos[j].getPertenece_a().getId() ) {						
						productos[i].contiene_una.add(fotos[j]);
						break;
					}						
				}				
			}

            t.commit();
        } catch (PersistentException e) {
            t.rollback();
        }
        
        return productos;
	}

	public Producto[] cargar_productos() throws PersistentException {
		Producto[] productos = null;
		Foto[] fotos= null;
		
        PersistentTransaction t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession().beginTransaction();
        
        try {
        	//productos = ProductoDAO.listProductoByQuery(null, null);
        	productos = ProductoDAO.listProductoByQuery("Activo=1", null);
        	fotos = FotoDAO.listFotoByQuery(null, null);
        	
        	
        	for (int i = 0; i < productos.length; i++) {
        		for (int j = 0; j < fotos.length; j++) {
					if(productos[i].getId() == fotos[j].getPertenece_a().getId() ) {						
						productos[i].contiene_una.add(fotos[j]);
						break;
					}						
				}				
			}

            t.commit();
        } catch (PersistentException e) {
            t.rollback();
        }
        
        return productos;
	}
	
	public Producto[] cargar_todos_productos() throws PersistentException {
		Producto[] productos = null;
		Foto[] fotos= null;
		
        PersistentTransaction t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession().beginTransaction();
        
        try {
        	//productos = ProductoDAO.listProductoByQuery(null, null);
        	productos = ProductoDAO.listProductoByQuery(null, null);
        	fotos = FotoDAO.listFotoByQuery(null, null);
        	
        	
        	for (int i = 0; i < productos.length; i++) {
        		for (int j = 0; j < fotos.length; j++) {
					if(productos[i].getId() == fotos[j].getPertenece_a().getId() ) {						
						productos[i].contiene_una.add(fotos[j]);
						break;
					}						
				}				
			}

            t.commit();
        } catch (PersistentException e) {
            t.rollback();
        }
        
        return productos;
	}

	public Producto cargar_producto(int aIdProducto) {
		throw new UnsupportedOperationException();
	}

	public void agregar_producto(String aNombreProducto, Categoria aCategoria, double aPrecioProducto, String aDescripcionProducto, String aImagenProducto) throws PersistentException {

		PersistentTransaction t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession()
                .beginTransaction();
		
        Producto producto = new Producto();
        producto.setNombre(aNombreProducto);
        producto.setAsignado_a(aCategoria);
        producto.setPrecio((float)aPrecioProducto);
        producto.setDescripcion(aDescripcionProducto);
        producto.setActivo(true);
        
        Foto foto = new Foto();
        foto.setUrl(aImagenProducto);
        foto.setPertenece_a(producto);

        try {
            ProductoDAO.save(producto);
            FotoDAO.save(foto);
            t.commit();
        } catch (PersistentException e) {
            t.rollback();
        }
	}

	public void modificar_proucto(int aIdProducto, int aIdFoto, String aNombreProducto, Categoria aCategoria, double aPrecioProducto, String aDescripcionProducto, String aImagenProducto) throws PersistentException {
		
		PersistentTransaction t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession()
                .beginTransaction();
		try {
			Producto producto = ProductoDAO.getProductoByORMID(aIdProducto);
	        producto.setNombre(aNombreProducto);
	        producto.setAsignado_a(aCategoria);
	        producto.setPrecio((float)aPrecioProducto);
	        producto.setDescripcion(aDescripcionProducto);
	        producto.setActivo(true);
	        
	        Foto foto = FotoDAO.getFotoByORMID(aIdFoto);
	        foto.setUrl(aImagenProducto);
	        foto.setPertenece_a(producto);
        
            t.commit();
        } catch (PersistentException e) {
            t.rollback();
        }
        
	}

	public void activar_producto(int aIdProducto) {
		throw new UnsupportedOperationException();
	}

	public Producto[] cargar_productos_pedido(Cantidad[] aCantidades) {
		throw new UnsupportedOperationException();
	}

	public void cambiar_estado_producto(int aIdProducto, boolean aActivo) {
		
		PersistentTransaction t;
		try {
			t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession()
			        .beginTransaction();
				try {
				//producto
				Producto producto = ProductoDAO.getProductoByORMID(aIdProducto);
		        producto.setActivo(aActivo);
	        
	            t.commit();
	        } catch (PersistentException e) {
	            t.rollback();
	        }
		} catch (PersistentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

	
}