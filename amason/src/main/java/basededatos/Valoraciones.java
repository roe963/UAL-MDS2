package basededatos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class Valoraciones {
    public BDPrincipal _bdprincipal_valoraciones;
    public Vector<Valoracion> _contine_valoracion = new Vector<Valoracion>();

    public void valorar_producto(int aIdProducto, int aIdUsuario, int aPuntiacion, String aComentario, long aFecha) {
        PersistentTransaction t;

        try {
            t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession().beginTransaction();
            try {
                Valoracion valoracion = ValoracionDAO.createValoracion();
                basededatos.Cliente cliente = ClienteDAO.getClienteByORMID(aIdUsuario);
                basededatos.Producto producto = ProductoDAO.getProductoByORMID(aIdProducto);
                valoracion.setValora_un(producto);
                valoracion.setEscrito_por(cliente);
                valoracion.setPuntuacion(aPuntiacion);
                valoracion.setComentario(aComentario);
                valoracion.setFecha(System.currentTimeMillis());
                ValoracionDAO.save(valoracion);
                
                t.commit();
            } catch (PersistentException e) {
                t.rollback();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Valoracion[] cargar_valoraciones(int aIdProducto) throws PersistentException {
        Valoracion[] valoraciones = null;
        List<Valoracion> aux = new ArrayList<>();
        Valoracion[] SalidaValoraciones = null;

        PersistentTransaction t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession()
                .beginTransaction();

        try {
            valoraciones = ValoracionDAO.listValoracionByQuery(null, null);

            for (int i = 0; i < valoraciones.length; i++) {
                if (valoraciones[i].getValora_un().getId() == aIdProducto) {
                    aux.add(valoraciones[i]);
                }
            }

            t.commit();
        } catch (PersistentException e) {
            t.rollback();
        }

        // convertir a un array
        SalidaValoraciones = aux.stream().toArray(Valoracion[]::new);

        return SalidaValoraciones;
    }
}