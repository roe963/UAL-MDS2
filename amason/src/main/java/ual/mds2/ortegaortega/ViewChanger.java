package ual.mds2.ortegaortega;

import org.orm.PersistentException;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.contextmenu.MenuItem;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.textfield.TextField;

import basededatos.Usuario;
import interfaz.Administrador;
import interfaz.Carrito;
import interfaz.Cliente;
import interfaz.Empresa_transportes;
import interfaz.Encargado_compras;
import interfaz.Iniciar_sesion;

public class ViewChanger {

    public enum TIPOUSUARIO {
        ADMIN, CLIENTE, REGISTRADO, TRANSPORTES, ENCARGADO
    }

    public static VerticalLayout layout;
    public static Component vistaActual;

    static TIPOUSUARIO usuario = TIPOUSUARIO.CLIENTE;

    public static void CambiarVista(Component nuevaVista, boolean sesionChanged) {
        if (vistaActual != null)
            layout.remove(vistaActual);
        if (sesionChanged)
            generarMenuBar();
        layout.add(nuevaVista);
        vistaActual = nuevaVista;
    }

    public static void generarMenuBar() {

        layout.removeAll();

        MenuBar menuBar = new MenuBar();
        menuBar.setThemeName("tertiary");
        layout.setHorizontalComponentAlignment(Alignment.CENTER, menuBar);

        switch (usuario) {
        case ADMIN:

            MenuItem administrateMenu = menuBar.addItem("Administrar");
            administrateMenu.getSubMenu().addItem("Productos", e -> System.out.println("ok1"));
            administrateMenu.getSubMenu().addItem("Categorias", e -> System.out.println("ok1"));
            administrateMenu.getSubMenu().addItem("Ofertas", e -> System.out.println("ok2"));
            administrateMenu.getSubMenu().addItem("Empleados", e -> System.out.println("ok2"));

            MenuItem showMenu = menuBar.addItem("Ver");
            showMenu.getSubMenu().addItem("Catalogo", e -> System.out.println("ok1"));
            showMenu.getSubMenu().addItem("Pedidos", e -> System.out.println("ok2"));
            showMenu.getSubMenu().addItem("Mensajes", e -> System.out.println("ok2"));

            menuBar.addItem(closeSessionButton());

            break;

        case CLIENTE:

            Button btnHome = new Button(new Icon(VaadinIcon.HOME));
            btnHome.setThemeName("tertiary");
            menuBar.addItem(btnHome);
            btnHome.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
                @Override
                public void onComponentEvent(ClickEvent<Button> event) {
                    CambiarVista(new Cliente(), false);
                }
            });

            TextField txtBuscar = new TextField();
            txtBuscar.setPlaceholder("Buscar...");
            txtBuscar.setWidth("400px");
            Button btnBuscar = new Button(new Icon(VaadinIcon.SEARCH));
            btnBuscar.setThemeName("tertiary");
            menuBar.addItem(txtBuscar);
            menuBar.addItem(btnBuscar);

            Button btnCarrito = new Button(new Icon(VaadinIcon.CART));
            btnCarrito.setThemeName("tertiary");
            menuBar.addItem(btnCarrito);
            btnCarrito.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
                @Override
                public void onComponentEvent(ClickEvent<Button> event) {
                    CambiarVista(new Carrito(), false);
                }
            });
            Button btnChangeSesion = new Button("Salir");
            btnChangeSesion = new Button("Entrar");
            btnChangeSesion.setThemeName("tertiary");
            btnChangeSesion.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
                @Override
                public void onComponentEvent(ClickEvent<Button> event) {
                    Iniciar_sesion ini = new Iniciar_sesion();
                    ini.getLoginForm().setEnabled(true);
                    Dialog d = new Dialog();
                    d.add(ini);
                    d.open();
                    /*ini.getLoginForm().addLoginListener(e -> {

                        Usuario usu = null, aux = null;
                        //usu = new Usuario().iniciar_sesion(e.getUsername(), e.getPassword());
                        
                        try {
							usu = new Usuario().iniciar_sesion(e.getUsername(), e.getPassword());
						} catch (PersistentException e2) {
							// TODO Auto-generated catch block
							e2.printStackTrace();
						}

                        if (usu != null) {
                            try {
                                aux = new bds.Clientes().iniciar_sesion_cliente(usu.getId());
                            } catch (PersistentException e1) {
                                // TODO Auto-generated catch block
                                e1.printStackTrace();
                            }
                            if (aux != null) {
                                d.close();
                                ViewChanger.usuario = ViewChanger.TIPOUSUARIO.REGISTRADO;
                                ViewChanger.CambiarVista(new Cliente(), true);
                            } else {
//                                try {
//                                    aux = new bds.Administradores().iniciar_sesion_administrador(usu.getId());
//                                } catch (PersistentException e1) {
//                                    // TODO Auto-generated catch block
//                                    e1.printStackTrace();
//                                }
//                                if (aux != null) {
//                                    d.close();
//                                    ViewChanger.usuario = ViewChanger.TIPOUSUARIO.ADMIN;
//                                    ViewChanger.CambiarVista(new Administrador(), true);
//                                } else {
//                                    try {
//                                        aux = new bds.Encargados_compras()
//                                                .iniciar_sesion_encargado_compras(usu.getId());
//                                    } catch (PersistentException e1) {
//                                        // TODO Auto-generated catch block
//                                        e1.printStackTrace();
//                                    }
//                                    if (aux != null) {
//                                        d.close();
//                                        ViewChanger.usuario = ViewChanger.TIPOUSUARIO.ENCARGADO;
//                                        ViewChanger.CambiarVista(new Encargado_compras(), true);
//                                    } else
//                                        try {
//                                            aux = new bds.Empresas_transportes()
//                                                    .iniciar_sesion_empresa_transportes(usu.getId());
//                                        } catch (PersistentException e1) {
//                                            // TODO Auto-generated catch block
//                                            e1.printStackTrace();
//                                        }
//                                    if (aux != null) {
//                                        d.close();
//                                        ViewChanger.usuario = ViewChanger.TIPOUSUARIO.TRANSPORTES;
//                                        ViewChanger.CambiarVista(new Empresa_transportes(), true);
//                                    }
//                                }
                            }
                        }

//                        System.out.println(e.getUsername());
//                        switch (e.getUsername()) {
//                        case "admin":
//                            d.close();
//                            ViewChanger.usuario = ViewChanger.TIPOUSUARIO.ADMIN;
//                            ViewChanger.CambiarVista(new Administrador(), true);
//                            break;
//                        case "regis":
//                            d.close();
//                            ViewChanger.usuario = ViewChanger.TIPOUSUARIO.REGISTRADO;
//                            ViewChanger.CambiarVista(new Cliente(), true);
//                            break;
//                        case "encar":
//                            d.close();
//                            ViewChanger.usuario = ViewChanger.TIPOUSUARIO.ENCARGADO;
//                            ViewChanger.CambiarVista(new Encargado_compras(), true);
//                            break;
//                        case "trans":
//                            d.close();
//                            ViewChanger.usuario = ViewChanger.TIPOUSUARIO.TRANSPORTES;
//                            ViewChanger.CambiarVista(new Empresa_transportes(), true);
//                            break;
//                        default:
//                            break;
//                        }
                    });*/
                }
            });
            menuBar.addItem(btnChangeSesion);
            break;

        case REGISTRADO:

            btnHome = new Button(new Icon(VaadinIcon.HOME));
            btnHome.setThemeName("tertiary");
            menuBar.addItem(btnHome);
            btnHome.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
                @Override
                public void onComponentEvent(ClickEvent<Button> event) {
                    CambiarVista(new Cliente(), false);
                }
            });

            txtBuscar = new TextField();
            txtBuscar.setPlaceholder("Buscar...");
            txtBuscar.setWidth("400px");
            btnBuscar = new Button(new Icon(VaadinIcon.SEARCH));
            btnBuscar.setThemeName("tertiary");
            menuBar.addItem(txtBuscar);
            menuBar.addItem(btnBuscar);

            btnCarrito = new Button(new Icon(VaadinIcon.CART));
            btnCarrito.setThemeName("tertiary");
            menuBar.addItem(btnCarrito);
            btnCarrito.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
                @Override
                public void onComponentEvent(ClickEvent<Button> event) {
                    CambiarVista(new Carrito(), false);
                }
            });

            MenuItem me = menuBar.addItem("Yo");
            me.getSubMenu().addItem("Mis datos", e -> System.out.println("ok1"));
            me.getSubMenu().addItem("Mis pedidos", e -> System.out.println("ok1"));
            me.getSubMenu().addItem("Mis mensajes", e -> System.out.println("ok2"));
            me.getSubMenu().addItem("Salir", e -> System.out.println("ok2"));

            menuBar.addItem(closeSessionButton());

            break;

        case ENCARGADO:
            menuBar.addItem(closeSessionButton());

            break;

        case TRANSPORTES:
            menuBar.addItem(closeSessionButton());
            break;

        default:
            break;
        }

        layout.add(menuBar);
    }

    public static Button closeSessionButton() {
        Button btnChangeSesion = new Button("Salir");
        btnChangeSesion = new Button("Salir");
        btnChangeSesion.setThemeName("tertiary");
        btnChangeSesion.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
            @Override
            public void onComponentEvent(ClickEvent<Button> event) {
                usuario = TIPOUSUARIO.CLIENTE;
                CambiarVista(new Cliente(), true);
            }
        });
        return btnChangeSesion;
    }
}
