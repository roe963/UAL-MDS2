package ual.mds2.ortegaortega;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.contextmenu.MenuItem;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

import interfaz.Administrador;
import interfaz.Carrito;
import interfaz.Cliente;
import interfaz.Empresa_transportes;
import interfaz.Encargado_compras;
import interfaz.Iniciar_sesion;
import interfaz.Productos;
import interfaz.Registrarse;
import interfaz.Ver_producto;

/**
 * A sample Vaadin view class.
 * <p>
 * To implement a Vaadin view just extend any Vaadin component and use @Route
 * annotation to announce it in a URL as a Spring managed bean. Use the @PWA
 * annotation make the application installable on phones, tablets and some
 * desktop browsers.
 * <p>
 * A new instance of this class is created for every new user and every browser
 * tab/window.
 */
@Route
@PWA(name = "Vaadin Application", shortName = "Vaadin App", description = "This is an example Vaadin application.", enableInstallPrompt = false)
@CssImport("./styles/shared-styles.css")
@CssImport(value = "./styles/vaadin-text-field-styles.css", themeFor = "vaadin-text-field")
public class MainView extends VerticalLayout {

//	public VerticalLayout vl; 

	/**
	 * Construct a new Vaadin view.
	 * <p>
	 * Build the initial UI state for the user accessing the application.
	 *
	 * @param service The message service. Automatically injected Spring managed
	 *                bean.
	 */

	TIPOUSUARIO usuario = TIPOUSUARIO.CLIENTE;

	private Component vistaActual;

	Cliente cliente;
	Administrador admin;
	Encargado_compras encargado;
	Empresa_transportes transportes;
	
	Registrarse registrarse;
	Productos productos;
	
	Ver_producto ver_producto;

	Carrito carrito;

	Dialog dialog;
	Iniciar_sesion ini;

	public MainView(@Autowired GreetService service) {
		cliente = new Cliente();
		admin = new Administrador();
		encargado = new Encargado_compras();
		transportes = new Empresa_transportes();
		
		registrarse = new Registrarse();
		productos = new Productos();
		
		ver_producto = new Ver_producto();

		carrito = new Carrito();
		ini = new Iniciar_sesion();

		/*vistaActual = cliente;
		generarMenuBar();
		add(vistaActual);*/
		
		/*vistaActual = registrarse;
		generarMenuBar();
		add(vistaActual);*/
		
		/*vistaActual = productos;
		generarMenuBar();
		add(vistaActual);*/
		
		vistaActual = ver_producto;
		generarMenuBar();
		add(vistaActual);

		dialog = new Dialog();
		dialog.add(ini);

		ini.getLoginForm().addLoginListener(e -> {
			switch (e.getUsername()) {
			case "admin":
				dialog.close();
				usuario = TIPOUSUARIO.ADMIN;
				CambiarVista(admin, true);
				break;
			case "regis":
				dialog.close();
				usuario = TIPOUSUARIO.REGISTRADO;
				CambiarVista(cliente, true);
				break;
			case "encar":
				dialog.close();
				usuario = TIPOUSUARIO.ENCARGADO;
				CambiarVista(encargado, true);
				break;
			case "trans":
				dialog.close();
				usuario = TIPOUSUARIO.TRANSPORTES;
				CambiarVista(transportes, true);
				break;
			default:
				break;
			}
		});
	}

	private void generarMenuBar() {

		removeAll();

		MenuBar menuBar = new MenuBar();
		menuBar.setThemeName("tertiary");
		this.setHorizontalComponentAlignment(Alignment.CENTER, menuBar);

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
			
			Button btnChangeSesion = new Button("Salir");
			btnChangeSesion.setThemeName("tertiary");
			menuBar.addItem(btnChangeSesion);
			btnChangeSesion.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
				@Override
				public void onComponentEvent(ClickEvent<Button> event) {
					usuario = TIPOUSUARIO.CLIENTE;
					CambiarVista(cliente, true);
				}
			});

			break;
			
		case CLIENTE:

			Button btnHome = new Button(new Icon(VaadinIcon.HOME));
			btnHome.setThemeName("tertiary");
			menuBar.addItem(btnHome);
			btnHome.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
				@Override
				public void onComponentEvent(ClickEvent<Button> event) {
					CambiarVista(cliente, false);
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
					CambiarVista(carrito, false);
				}
			});

			btnChangeSesion = new Button("Entrar");
			btnChangeSesion.setThemeName("tertiary");
			menuBar.addItem(btnChangeSesion);
			btnChangeSesion.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
				@Override
				public void onComponentEvent(ClickEvent<Button> event) {
					ini.getLoginForm().setEnabled(true);
					dialog.open();
				}
			});

			break;

		case REGISTRADO:
			
			btnHome = new Button(new Icon(VaadinIcon.HOME));
			btnHome.setThemeName("tertiary");
			menuBar.addItem(btnHome);
			btnHome.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
				@Override
				public void onComponentEvent(ClickEvent<Button> event) {
					CambiarVista(cliente, false);
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
					CambiarVista(carrito, false);
				}
			});

			MenuItem me = menuBar.addItem("Yo");
			me.getSubMenu().addItem("Mis datos", e -> System.out.println("ok1"));
			me.getSubMenu().addItem("Mis pedidos", e -> System.out.println("ok1"));
			me.getSubMenu().addItem("Mis mensajes", e -> System.out.println("ok2"));
			me.getSubMenu().addItem("Salir", e -> System.out.println("ok2"));

			btnChangeSesion = new Button("Salir");
			btnChangeSesion.setThemeName("tertiary");
			menuBar.addItem(btnChangeSesion);
			btnChangeSesion.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
				@Override
				public void onComponentEvent(ClickEvent<Button> event) {
					usuario = TIPOUSUARIO.CLIENTE;
					CambiarVista(cliente, true);
				}
			});

			break;
			
		case ENCARGADO:
			
			btnChangeSesion = new Button("Salir");
			btnChangeSesion.setThemeName("tertiary");
			menuBar.addItem(btnChangeSesion);
			btnChangeSesion.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
				@Override
				public void onComponentEvent(ClickEvent<Button> event) {
					usuario = TIPOUSUARIO.CLIENTE;
					CambiarVista(cliente, true);
				}
			});

			break;
			
		case TRANSPORTES:

			btnChangeSesion = new Button("Salir");
			btnChangeSesion.setThemeName("tertiary");
			menuBar.addItem(btnChangeSesion);
			btnChangeSesion.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
				@Override
				public void onComponentEvent(ClickEvent<Button> event) {
					usuario = TIPOUSUARIO.CLIENTE;
					CambiarVista(cliente, true);
				}
			});
			
			break;
			
		default:
			break;
		}

		add(menuBar);

	}

	private void CambiarVista(Component nuevaVista, boolean sesionChanged) {
		remove(vistaActual);
		if (sesionChanged)
			generarMenuBar();
		add(nuevaVista);
		vistaActual = nuevaVista;
	}

	public enum TIPOUSUARIO {
		ADMIN, CLIENTE, REGISTRADO, TRANSPORTES, ENCARGADO
	}
}
