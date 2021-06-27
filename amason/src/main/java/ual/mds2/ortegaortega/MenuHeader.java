package ual.mds2.ortegaortega;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.contextmenu.MenuItem;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.textfield.TextField;

import basededatos.Usuario;
import bds.BDPrincipal;
import interfaz.Buscar_producto_cliente;
import interfaz.Cliente;
import interfaz.Iniciar_sesion;
import interfaz.Ver_catalogo_cliente;
import interfaz.Ver_pedidos;
import interfaz.Ver_perfil;
import interfaz.Ver_producto;

public class MenuHeader {
    
    private static MenuBar menuBar;
    
    public static MenuBar getMenuBar() {
        return menuBar;
    }
    
    public static void generarMenuBar() {

        menuBar = new MenuBar();
        menuBar.setThemeName("tertiary");
        
        Button btnHome = new Button(new Icon(VaadinIcon.HOME));
        btnHome.setThemeName("tertiary");
        btnHome.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
            @Override
            public void onComponentEvent(ClickEvent<Button> event) {
                UI.getCurrent().navigate("cliente");
            }
        });

        TextField txtBuscar = new TextField();
        txtBuscar.setPlaceholder("Buscar...");
        txtBuscar.setWidth("400px");
        
        Button btnBuscar = new Button(new Icon(VaadinIcon.SEARCH));
        btnBuscar.setThemeName("tertiary");
        btnBuscar.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
            @Override
            public void onComponentEvent(ClickEvent<Button> event) {                
                if (txtBuscar.isEmpty()) {
                	//UI.getCurrent().navigate("ver_catalogo_cliente");
                	//UI.getCurrent().navigate("administrar_productos");
                	UI.getCurrent().navigate("encargadocompras");
    			} else {
    				//CambiarVista(new Buscar_producto_cliente(txtBuscar.getValue()));
    				//UI.getCurrent().navigate("producto");
    				UI.getCurrent().navigate("ver_catalogo_cliente");
    			}
            }
        });

        Button btnCarrito = new Button(new Icon(VaadinIcon.CART));
        btnCarrito.setThemeName("tertiary");
        btnCarrito.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
            @Override
            public void onComponentEvent(ClickEvent<Button> event) {
                UI.getCurrent().navigate("carrito");
            }
        });

        switch (Session.getTipo()) {
        case ADMIN:
            
            MenuItem administrateMenu = menuBar.addItem("Administrar");
            administrateMenu.getSubMenu().addItem("Productos", e -> UI.getCurrent().navigate("administrar_productos"));
            administrateMenu.getSubMenu().addItem("Categorias", e -> UI.getCurrent().navigate("administrar_categorias"));
            administrateMenu.getSubMenu().addItem("Ofertas", e -> UI.getCurrent().navigate("administrar_ofertas"));
            administrateMenu.getSubMenu().addItem("Empleados", e -> UI.getCurrent().navigate("administrar_empleados"));

            MenuItem showMenu = menuBar.addItem("Ver");
            showMenu.getSubMenu().addItem("Catalogo", e -> UI.getCurrent().navigate("ver_catalogo_administrador"));
            showMenu.getSubMenu().addItem("Pedidos", e -> UI.getCurrent().navigate("pedidos"));
            showMenu.getSubMenu().addItem("Mensajes", e -> UI.getCurrent().navigate("ver_mensajes_administrador"));

            menuBar.addItem(closeSessionButton());

            break;

        case CLIENTE:
            
            Button btnChangeSesion = new Button("Entrar");
            btnChangeSesion.setThemeName("tertiary");
            btnChangeSesion.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
                @Override
                public void onComponentEvent(ClickEvent<Button> event) {
                    
                    Iniciar_sesion ini = new Iniciar_sesion();
                    ini.getLoginForm().setEnabled(true);
                    Dialog d = new Dialog();
                    d.add(ini);
                    d.open();
                    ini.getLoginForm().addLoginListener(e -> {

                        Usuario usu = new BDPrincipal().iniciar_sesion(e.getUsername(), e.getPassword());
                        if (usu == null) {
                            ini.getLoginForm().setError(true);
                        } else {
                            Session.setUsuario(usu);
                            d.close();
                        }
                    });
                }
            });
            
            menuBar.addItem(btnHome);
            menuBar.addItem(txtBuscar);
            menuBar.addItem(btnBuscar);
            menuBar.addItem(btnCarrito);
            menuBar.addItem(btnChangeSesion);
            
            break;

        case REGISTRADO:
            
            menuBar.addItem(btnHome);
            menuBar.addItem(txtBuscar);
            menuBar.addItem(btnBuscar);
            menuBar.addItem(btnCarrito);

            MenuItem me = menuBar.addItem("Yo");
            me.getSubMenu().addItem("Mis datos", e -> UI.getCurrent().navigate("ver_perfil"));
            me.getSubMenu().addItem("Mis pedidos", e -> UI.getCurrent().navigate("pedidos"));
            me.getSubMenu().addItem("Mis mensajes", e -> UI.getCurrent().navigate("ver_mensajes_cliente_registrado"));

            menuBar.addItem(closeSessionButton());

            break;

        case ENCARGADO:
        case TRANSPORTES:
            menuBar.addItem(closeSessionButton());
            break;

        default:
            break;
        }
    }
    
    public static Button closeSessionButton() {
        Button btnChangeSesion = new Button("Salir");
        btnChangeSesion.setThemeName("tertiary");
        btnChangeSesion.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
            @Override
            public void onComponentEvent(ClickEvent<Button> event) {
                Session.setTipo(TIPOUSUARIO.CLIENTE);
                Session.setUsuario(null);
                UI.getCurrent().navigate("");
            }
        });
        return btnChangeSesion;
    }
}
