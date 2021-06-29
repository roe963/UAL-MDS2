import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-password-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaRegistrarse extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;">
 <vaadin-vertical-layout theme="spacing" id="layout-menu"></vaadin-vertical-layout>
 <h4 style="margin-right: var(--lumo-space-xl); margin-left: var(--lumo-space-xl); align-self: center;">Crear cuenta</h4>
 <vaadin-horizontal-layout class="content" style="align-self: center;">
  <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; align-items: flex-end; margin: var(--lumo-space-m);">
   <vaadin-text-field label="Nombre y Apellidos" id="textarea-nombre" placeholder="Escriba su nombre y apellidos"></vaadin-text-field>
   <vaadin-text-field label="Correo electónico" id="textarea-email" placeholder="Escriba su correo"></vaadin-text-field>
   <vaadin-password-field label="Contraseña" placeholder="Escriba una contraseña" value="secret1" id="password" has-value></vaadin-password-field>
   <vaadin-password-field label="Repitir Contraseña" placeholder="Repita la contraseña" value="secret1" id="repeatpassword" has-value></vaadin-password-field>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; align-items: flex-start; margin: var(--lumo-space-m);">
   <vaadin-text-field label="Dirección" placeholder="Escriba su direccion" id="textarea-direccion"></vaadin-text-field>
   <vaadin-horizontal-layout theme="spacing" id="hlSeleccionarFomra"></vaadin-horizontal-layout>
   <vaadin-text-field label="Foto de usuario" placeholder="Añadir url" id="textarea-fotousuario"></vaadin-text-field>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="align-self: center;" id="vaadinHorizontalLayout">
  <vaadin-button id="button-crearcuenta">
    Crear cuenta 
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-registrarse';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaRegistrarse.is, VistaRegistrarse);
