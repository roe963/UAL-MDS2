package interfaz;

import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.router.PreserveOnRefresh;
import com.vaadin.flow.router.Route;

import bds.BDPrincipal;
import bds.iAdministrador;
import ual.mds2.ortegaortega.MenuHeader;
import vistas.VistaAdministrarempleados;

@PreserveOnRefresh
@Route("administrar_empleados")
public class Administrar_empleados extends VistaAdministrarempleados {

    iAdministrador administrador = new BDPrincipal();
    Encargados_de_compras encargados_de_compras;
    Empresas_de_transporte empresas_de_transporte;
    Agregar_empleado agregar_empleado;

    public Administrar_empleados() {
        MenuBar mb = MenuHeader.getMenuBar();
        this.getLayoutMenu().add(mb);
        this.getLayoutMenu().setHorizontalComponentAlignment(Alignment.CENTER, mb);

        agregar_empleado = new Agregar_empleado();
        this.getLayoutAnadirUsuario().removeAll();
        this.getLayoutAnadirUsuario().add(agregar_empleado);

        encargados_de_compras = new Encargados_de_compras(agregar_empleado);
        this.getLayoutEncargadoCompras().removeAll();
        this.getLayoutEncargadoCompras().add(encargados_de_compras);

        empresas_de_transporte = new Empresas_de_transporte(agregar_empleado);
        this.getLayoutEmpresaTransportes().removeAll();
        this.getLayoutEmpresaTransportes().add(empresas_de_transporte);

        this.getButtonGuardar().addClickListener(event -> {
            modificar_usuario();
        });
    }

    public void modificar_usuario() {

        if (agregar_empleado.tipoUsuario == 2) {
            empresas_de_transporte.modificar_usuario_empresa_transportes();
        }

        if (agregar_empleado.tipoUsuario == 1) {
            encargados_de_compras.modificar_usuario_encargado_compras();
        }
    }

}