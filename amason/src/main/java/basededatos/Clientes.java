package basededatos;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class Clientes {
    public BDPrincipal _bdprincipal_clientes;
    public Vector<Cliente> _contiene_cliente = new Vector<Cliente>();

    public Usuario iniciar_sesion_cliente(int aIdUsuario) {
        Cliente cliente = null;
        PersistentTransaction t;
        try {
            t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession().beginTransaction();
            try {
                cliente = ClienteDAO.getClienteByORMID(aIdUsuario);
                t.commit();
            } catch (Exception e) {
                t.rollback();
            }
        } catch (PersistentException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        return cliente;
    }

    public void registrar_usuario(String aNombreUsuario, String aMailUsuario, String aPasswordUsuario,
            String aConfirmPasswordUsuario, String aDireccionUsuario, String aFormaPagoUsuario, String aFotoUsuario)
            throws PersistentException {
        PersistentTransaction t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession()
                .beginTransaction();

        Cliente cliente = new Cliente();
        cliente.setNombre(aNombreUsuario);
        cliente.setEmail(aMailUsuario);
        cliente.setPassword(aPasswordUsuario);
        cliente.setDireccionEnvio(aDireccionUsuario);
        cliente.setMetodoPago(aFormaPagoUsuario);
        cliente.setFotoURL(aFotoUsuario);
        cliente.setActivo(true);

        try {
            ClienteDAO.save(cliente);
            t.commit();
        } catch (PersistentException e) {
            t.rollback();
        }
    }

    public Cliente cargar_perfil(int aIdUsuario) {
        PersistentTransaction t;

        Cliente cliente = null;
        try {
            t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession().beginTransaction();
            try {
                cliente = ClienteDAO.getClienteByORMID(aIdUsuario);

                t.commit();
            } catch (PersistentException e) {
                t.rollback();
            }
        } catch (Exception e) {
            // TODO: handle exception
        }

        return cliente;
    }

    public void guardar_perfil(int aIdUsuario, String aNombreUsuario, String aMailUsuario, String aDireccionUsuario,
            String aFormaPagoUsuario, String aFotoUsuario, boolean aEstadoCuenta) throws PersistentException {
        PersistentTransaction t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession()
                .beginTransaction();

        try {
            Cliente cliente = ClienteDAO.getClienteByORMID(aIdUsuario);
            cliente.setNombre(aNombreUsuario);
            cliente.setEmail(aMailUsuario);
            cliente.setDireccionEnvio(aDireccionUsuario);
            cliente.setMetodoPago(aFormaPagoUsuario);
            cliente.setFotoURL(aFotoUsuario);
            cliente.setActivo(aEstadoCuenta);

            t.commit();
        } catch (PersistentException e) {
            t.rollback();
        }
    }

    public void actualizas_datos_compra(String aDireccion, String aFormaPago, Cliente aCliente) {
        PersistentTransaction t;
        try {
            t = basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().getSession().beginTransaction();
            try {
                Cliente cliente = ClienteDAO.getClienteByORMID(aCliente.getId());
                cliente.setDireccionEnvio(aDireccion);
                cliente.setMetodoPago(aFormaPago);

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