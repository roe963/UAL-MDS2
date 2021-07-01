package basededatos;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class Cantidades {
    public BDPrincipal _bdprincipal_cantidades;
    public Vector<Cantidad> _contiene_cantidad = new Vector<Cantidad>();

    public Cantidad[] realizar_pedido(Producto[] aProductos, int[] aCantidades, Cliente aCliente)
            throws PersistentException {

        PersistentTransaction t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession()
                .beginTransaction();

        List<Cantidad> listaCantidad = new ArrayList<Cantidad>();
        Cantidad arrayCantidad[] = null;

        try {

            for (int i = 0; i < aProductos.length; i++) {
                Producto producto = ProductoDAO.getProductoByORMID(aProductos[i].getId());
                Cantidad cant = CantidadDAO.createCantidad();
                cant.setContiene_un(producto);
                // cant.setORM_Contiene_un(producto);
                cant.setCantidad(aCantidades[i]);

                CantidadDAO.save(cant);

            }

            t.commit();
        } catch (PersistentException e) {
            t.rollback();
        }

        // convertir una lista a un array
        arrayCantidad = listaCantidad.stream().toArray(basededatos.Cantidad[]::new);

        // borrar el for
        for (int i = 0; i < arrayCantidad.length; i++) {
            System.out.println("" + arrayCantidad[i].getId() + " idproducto" + arrayCantidad[i].getContiene_un().getId()
                    + " cantidad" + arrayCantidad[i].getCantidad());
        }

        return arrayCantidad;

    }

    public Cantidad[] cargar_cantidades_pedido(int aIdPedido) throws PersistentException {
        PersistentTransaction t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession()
                .beginTransaction();

        Cantidad[] arrayCantidades = null;
        try {
            arrayCantidades = PedidoDAO.getPedidoByORMID(aIdPedido).contiene_un.toArray();
            t.commit();
        } catch (PersistentException e) {
            t.rollback();
        }
        return arrayCantidades;
    }
}