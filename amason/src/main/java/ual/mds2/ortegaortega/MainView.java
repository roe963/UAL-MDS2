package ual.mds2.ortegaortega;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.contextmenu.MenuItem;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

import interfaz.Carrito;
import interfaz.Cliente;
import interfaz.Iniciar_sesion;

import org.springframework.beans.factory.annotation.Autowired;

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

	private Component vistaActual;
	
	public MainView(@Autowired GreetService service) {
		Cliente cliente = new Cliente();
		Carrito carrito = new Carrito();
		Iniciar_sesion ini = new Iniciar_sesion();
		
		vistaActual = cliente;
		
		Button btnHome= new Button(new Icon(VaadinIcon.HOME));
		btnHome.setThemeName("tertiary");
		TextField txtBuscar = new TextField();
		txtBuscar.setPlaceholder("Buscar...");
		txtBuscar.setWidth("400px");
		Button btnBuscar= new Button(new Icon(VaadinIcon.SEARCH));
		btnBuscar.setThemeName("tertiary");
		Button btnCarrito = new Button(new Icon(VaadinIcon.CART));
		btnCarrito.setThemeName("tertiary");
		
		Button btnIniciarSesion = new Button("Entrar");
		btnIniciarSesion.setThemeName("tertiary");
		
		MenuBar menuBar = new MenuBar();
//		menuBar.setWidthFull();
		menuBar.setThemeName("tertiary");
		menuBar.addItem(btnHome);
		menuBar.addItem(txtBuscar);
		menuBar.addItem(btnBuscar);
		menuBar.addItem(btnCarrito);
		menuBar.addItem(btnIniciarSesion);
		
		
		MenuItem project = menuBar.addItem("Yo");
		project.getSubMenu().addItem("Mis datos",
		        e -> System.out.println("ok1"));
		project.getSubMenu().addItem("Mis pedidos",
		        e -> System.out.println("ok1"));
		project.getSubMenu().addItem("Mis mensajes",
		        e -> System.out.println("ok2"));
		project.getSubMenu().addItem("Salir",
		        e -> System.out.println("ok2"));
		this.setHorizontalComponentAlignment(Alignment.CENTER, menuBar);

		add(menuBar);
		add(vistaActual);
		
		btnCarrito.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				CambiarVista(carrito);
			}
		});
		
		btnHome.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				CambiarVista(cliente);
			}
		});
		
		btnIniciarSesion.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				Dialog dialog = new Dialog();
				dialog.add(ini);
				dialog.open();
			}
		});

	}

	private void GenerarMenuBar() {
		
	}
	
	private void CambiarVista(Component nuevaVista) {
		remove(vistaActual);
		add(nuevaVista);
		vistaActual = nuevaVista;
	}
}
