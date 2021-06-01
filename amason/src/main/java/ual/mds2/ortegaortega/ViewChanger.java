package ual.mds2.ortegaortega;

import java.util.ArrayList;
import java.util.List;

import org.orm.PersistentException;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.contextmenu.MenuItem;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.textfield.TextField;

import basededatos.Cantidad;
import basededatos.Producto;
import basededatos.Usuario;
import basededatos.UsuarioDAO;
import bds.BDPrincipal;
import interfaz.Administrador;
import interfaz.Carrito;
import interfaz.Cliente;
import interfaz.Empresa_transportes;
import interfaz.Encargado_compras;
import interfaz.Iniciar_sesion;
import interfaz.Producto_del_carrito;
import interfaz.Productos;
import interfaz.Productos_del_carrito;
import interfaz.Ver_pedidos;
import interfaz.Ver_perfil;
import interfaz.Ver_producto;
import interfaz.cantidadCache;

public class ViewChanger {

    public enum TIPOUSUARIO {
        ADMIN, CLIENTE, REGISTRADO, TRANSPORTES, ENCARGADO
    }

    public static VerticalLayout layout;
    public static Component vistaActual;
    
    private static int idUsuario = -1;
    private static String eresAdministrador = "NO";
    
    private static basededatos.Cliente cliente = null;
    
    public static basededatos.Cliente getCliente() {
    	return cliente;
    }
    
    public static void setCliente(basededatos.Cliente clientenew) {
    	cliente = clientenew;
    }    
    
    
    private static List<Producto> ListaProductos= new ArrayList<Producto>();
    private static List<cantidadCache> cantidadProductos= new ArrayList<cantidadCache>();
    
	public static List<cantidadCache> getCantidadProductos() {
		return cantidadProductos;
	}
	
	public static void addCantidadProductos(cantidadCache cantidad){
		ViewChanger.cantidadProductos.add(cantidad);
	}
	
	public static void cambiarCantidad(cantidadCache cantidad){
		
		for (int i = 0; i < ListaProductos.size(); i++) {
			if(ListaProductos.get(i).getId() == cantidad.getIdProducto()) {
				
				cantidadProductos.get(i).setCantidad(cantidad.getCantidad());
				break;
			}
			
		}
		
	}
	
	public static List<Producto_del_carrito> productoscarrito = new ArrayList<Producto_del_carrito>();
	
//	public static Productos_del_carrito productoscarrito = new Productos_del_carrito();
    

    public static TIPOUSUARIO usuario = TIPOUSUARIO.CLIENTE;
    
    public static int getIdUsuario() {
		return idUsuario;
	}
    
	public static void setIdUsuario(int idUsuario) {
		ViewChanger.idUsuario = idUsuario;
	}
	
	public static String getEresAdministrador() {
			return eresAdministrador;
	}
	    
	public static void setEresAdministrador(String tipo) {
		ViewChanger.eresAdministrador = tipo;
	}
		
		
	
	public static List<Producto> getListaProductos() {
		return ListaProductos;
	}
	
	public static void addProducto(Producto producto){
		ViewChanger.ListaProductos.add(producto);
	}
	
	public static void removeProducto(Producto producto){		
		 
		for (int i = 0; i < ViewChanger.ListaProductos.size(); i++) {
			
			if(ViewChanger.getListaProductos().get(i).getId() == (producto.getId())) {				
				ViewChanger.getListaProductos().remove(ViewChanger.getListaProductos().get(i));
				break;
			}
			
		}
		
	}
	public static void resetListaProducto(){		
		 ListaProductos = new ArrayList<Producto>();	
	}
	
	public static void resetListaCantidadProducto(){		
		 cantidadProductos= new ArrayList<cantidadCache>();
	}
	
	public static void removeCantidadProducto(cantidadCache cantidadCache){		
		 //cambiarCantidad(cantidadCache);
		 
		for (int i = 0; i < cantidadProductos.size(); i++) {
			
			System.out.println(ListaProductos.get(i).getId() + "- "+cantidadCache.getIdProducto());
			if(ListaProductos.get(i).getId()== (cantidadCache.getIdProducto())) {	
				System.out.println("entra para eliminar");
				cantidadProductos.remove(cantidadProductos.get(i));
				//ViewChanger.getCantidadProductos().remove(ViewChanger.getCantidadProductos().get(i));
				break;
			}
			
		}
		
	}
	

    public static void CambiarVista(Component nuevaVista, boolean sesionChanged) {
        if (layout == null) {
            layout = new VerticalLayout();
            generarMenuBar();
        }
        if (vistaActual != null)
            layout.remove(vistaActual);
        if (sesionChanged)
            generarMenuBar();
        layout.add(nuevaVista);
        vistaActual = nuevaVista;
    }

    public static void CambiarVista(Component nuevaVista) {
        layout.removeAll();
        generarMenuBar();
        layout.add(nuevaVista);
    }

    public static void generarMenuBar() {

        layout.removeAll();

        MenuBar menuBar = new MenuBar();
        menuBar.setThemeName("tertiary");
        layout.setHorizontalComponentAlignment(Alignment.CENTER, menuBar);

        switch (usuario) {
        case ADMIN:
        	
        	ViewChanger.setEresAdministrador("ADMINISTRADOR");
        	
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
                    CambiarVista(new Cliente());
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
                    //CambiarVista(new Productos());
                    CambiarVista(new Ver_producto());
                }
            });
            
            menuBar.addItem(txtBuscar);
            menuBar.addItem(btnBuscar);

            Button btnCarrito = new Button(new Icon(VaadinIcon.CART));
            btnCarrito.setThemeName("tertiary");
            menuBar.addItem(btnCarrito);
            btnCarrito.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
                @Override
                public void onComponentEvent(ClickEvent<Button> event) {
                    CambiarVista(new Carrito());
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
                    ini.getLoginForm().addLoginListener(e -> {

                        Usuario usu = new BDPrincipal().iniciar_sesion(e.getUsername(), e.getPassword());
                        if (usu == null) {
                            ini.getLoginForm().setError(true);
                        } else {
                            SaveSession(usu);
                            d.close();
                        }

//                        if (usu != null) {
//                            if (Login(usu.getId())) d.close();
//                        }
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
                    });
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
                    CambiarVista(new Cliente());
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
                    CambiarVista(new Carrito());
                }
            });

            MenuItem me = menuBar.addItem("Yo");
            me.getSubMenu().addItem("Mis datos", e -> CambiarVista(new Ver_perfil()));
            me.getSubMenu().addItem("Mis pedidos", e -> CambiarVista(new Ver_pedidos()));
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
                DeleteSession();
                CambiarVista(new Cliente());
            }
        });
        return btnChangeSesion;
    }

    public static void SaveSession(Usuario user) {
    	
    	ViewChanger.setIdUsuario(user.getId());    	
        UI.getCurrent().getPage().executeJs("window.localStorage.setItem($0, $1);", "user", user.getEmail());
        UI.getCurrent().getPage().executeJs("window.localStorage.setItem($0, $1);", "pass", user.getPassword());
    }

//    public static void LoadSession() {
//        String user = "", pass = "";
//        StringBuilder sb = new StringBuilder();
//        UI.getCurrent().getPage().executeJs("return window.localStorage.getItem($0);", "user").then(String.class,
//                result -> System.out.println(result));
//        user = sb.toString();
//        sb.delete(0, user.length());
//        UI.getCurrent().getPage().executeJs("return window.localStorage.getItem($0);", "pass").then(String.class,
//                result -> sb.append(result));
//        pass = sb.toString();
//        if (user.length() > 0 & pass.length() > 0)
//            new BDPrincipal().iniciar_sesion(user.toString(), pass.toString());
//    }

    public static void LoadSession() {
        UI.getCurrent().getPage().executeJs("return window.localStorage.getItem($0);", "user").then(String.class,
                user -> UI.getCurrent().getPage().executeJs("return window.localStorage.getItem($0);", "pass")
                        .then(String.class, pass -> initOptions(user, pass)));
    }

    public static void DeleteSession() {
    	ViewChanger.setIdUsuario(-1);
    	ViewChanger.setEresAdministrador("NO");
    	ViewChanger.ListaProductos= new ArrayList<Producto>();
    	ViewChanger.cantidadProductos= new ArrayList<cantidadCache>();
    
    	
        UI.getCurrent().getPage().executeJs("window.localStorage.removeItem($0);", "user");
        UI.getCurrent().getPage().executeJs("window.localStorage.removeItem($0);", "pass");
    }

    public static void initOptions(String user, String pass) {
        if (user != null && user.length() > 0 && pass != null && pass.length() > 0)
            new BDPrincipal().iniciar_sesion(user, pass);
        else
            CambiarVista(new Cliente());
    }
}
