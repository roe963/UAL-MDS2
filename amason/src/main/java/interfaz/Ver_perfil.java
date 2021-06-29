package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.Notification.Position;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.radiobutton.RadioButtonGroup;
import com.vaadin.flow.component.radiobutton.RadioGroupVariant;
import com.vaadin.flow.router.PreserveOnRefresh;
import com.vaadin.flow.router.Route;

import basededatos.Cliente;
import bds.BDPrincipal;
import bds.iCliente_registrado;
import ual.mds2.ortegaortega.MenuHeader;
import ual.mds2.ortegaortega.Session;
import vistas.VistaVeperfil;

@PreserveOnRefresh
@Route("ver_perfil")
public class Ver_perfil extends VistaVeperfil {
    /*
     * private label _nombre; private textField _nombreUsuario; private label _mail;
     * private textField _mailUsuario; private label _direccion; private textField
     * _direccionUsuario; private label _formaPago; private comboBox
     * _formaPagoUsuario; private label _foto; private image _fotoUsuario; private
     * textField _nombreFotoUsuario; private label _estado; private radioButton
     * _estadoCuenta; private button _guardar; public Cliente_registrado
     * _cliente_registrado; public Datos_de_compra _datos_de_compra;
     */

    iCliente_registrado iclientes_registrado = new BDPrincipal();

    public Ver_perfil() {
        MenuBar mb = MenuHeader.getMenuBar();
        this.getLayoutMenu().add(mb);
        this.getLayoutMenu().setHorizontalComponentAlignment(Alignment.CENTER, mb);
        cargar_perfil();
    }

    /*
     * public void seleccionar_direccion_envio() { throw new
     * UnsupportedOperationException(); }
     * 
     * public void seleccionar_metodo_pago() { throw new
     * UnsupportedOperationException(); }
     */

    public void cargar_perfil() {

        // int id = ViewChanger.getIdUsuario();
        int id = Session.getUsuario().getId();

        Cliente cliente = iclientes_registrado.cargar_perfil(id);

        // 1)Crear componente para el Frontend
        this.getVlEstado().removeAll();
        ;
        RadioButtonGroup<String> radioGroup = new RadioButtonGroup<>();
        radioGroup.setLabel("Estado");
        radioGroup.setItems("Operativo", "No Operativo");
        radioGroup.addThemeVariants(RadioGroupVariant.LUMO_VERTICAL);
        if (cliente.getActivo() == true) {
            radioGroup.setValue("Operativo");
        }else {
            radioGroup.setValue("No Operativo");
        }

        this.getVlEstado().add(radioGroup);

        this.getVlDireccionyformaPago().removeAll();
        Datos_de_compra datosCompra = new Datos_de_compra();
        this.getVlDireccionyformaPago().add(datosCompra);

        // 2) Cargar los nombres en el componente

        this.getTextfieldNombre().setValue(cliente.getNombre());
        this.getCorreoElectronico().setValue(cliente.getEmail());
        this.getImgFotousuario().setSrc(cliente.getFotoURL());

        this.getImgFotousuario().setMaxHeight("30%");
        this.getImgFotousuario().setMaxWidth("30%");

        if (cliente.getFotoURL() == null) {// si no tiene ninguna imagen poner esta por defecto
            this.getImgFotousuario().setSrc(
                    "https://static.vecteezy.com/system/resources/previews/000/550/731/non_2x/user-icon-vector.jpg");
            this.getTextfieldFotousuario().setValue(
                    "https://static.vecteezy.com/system/resources/previews/000/550/731/non_2x/user-icon-vector.jpg");

        } else {// carga la foto de la BD
            this.getImgFotousuario().setSrc(cliente.getFotoURL());
            this.getTextfieldFotousuario().setValue(cliente.getFotoURL());
        }

        /*
         * this.getButtonGuardar().addClickListener(new
         * ComponentEventListener<ClickEvent<Button>>() {
         * 
         * @Override public void onComponentEvent(ClickEvent<Button> event) {
         * 
         * String nombre = getTextfieldNombre().getValue(); String email =
         * getCorreoElectrónico().getValue(); String direccionEnvio =
         * datosCompra.getTextfieldDireccion().getValue(); String metodoPago =
         * datosCompra.getFormadepago().getValue();
         * 
         * String fotoURL = getTextfieldFotousuario().getValue();
         * 
         * Boolean activo = false;
         * 
         * if (radioGroup.getValue().equals("Operativo")) { activo = true; } if
         * (radioGroup.getValue().equals("No Operativo")) { activo = false; }
         * 
         * if (!(nombre.equals(cliente.getNombre()) && email.equals(cliente.getEmail())
         * && direccionEnvio.equals(cliente.getDireccionEnvio()) &&
         * metodoPago.equals(cliente.getMetodoPago()) &&
         * fotoURL.equals(cliente.getFotoURL()) && activo.equals(cliente.getActivo())))
         * { iclientes_registrado.guardar_perfil(cliente.getId(), nombre, email,
         * direccionEnvio, metodoPago, fotoURL, activo); cargar_perfil();
         * 
         * notificacion("Los datos se han modificado correctamente."); } else {
         * notificacion("No se ha realizado ningún cambio."); }
         * 
         * } });
         */

        guardar_perfil(cliente, datosCompra, radioGroup);

    }

    public void guardar_perfil(Cliente cliente, Datos_de_compra datosCompra, RadioButtonGroup<String> radioGroup) {
        // throw new UnsupportedOperationException();

        this.getButtonGuardar().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
            @Override
            public void onComponentEvent(ClickEvent<Button> event) {

                String nombre = getTextfieldNombre().getValue();
                String email = getCorreoElectronico().getValue();
                String direccionEnvio = datosCompra.getTextfieldDireccion().getValue();
                String metodoPago = datosCompra.getFormadepago().getValue();

                String fotoURL = getTextfieldFotousuario().getValue();

                Boolean activo = false;

                if (radioGroup.getValue().equals("Operativo")) {
                    activo = true;
                }
                if (radioGroup.getValue().equals("No Operativo")) {
                    activo = false;
                }

                if (!nombre.equals(cliente.getNombre()) || !email.equals(cliente.getEmail())
                        || !direccionEnvio.equals(cliente.getDireccionEnvio())
                        || !metodoPago.equals(cliente.getMetodoPago()) || !fotoURL.equals(cliente.getFotoURL())
                        || !activo.equals(cliente.getActivo())) {
                    iclientes_registrado.guardar_perfil(cliente.getId(), nombre, email, direccionEnvio, metodoPago,
                            fotoURL, activo);

                    notificacion("Los datos se han modificado correctamente.");
                  UI.getCurrent().navigate("");
                  UI.getCurrent().navigate("ver_perfil");
                } else {
                    notificacion("No se ha realizado ningún cambio.");
                }

            }
        });

    }

    public void notificacion(String mensaje) {
        Span content = new Span(mensaje);
        Notification notification = new Notification(content);
        notification.setPosition(Position.MIDDLE);
        notification.setDuration(2000);
        notification.open();
    }

}