import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-text-field/src/vaadin-password-field.js';
import '@vaadin/vaadin-select/src/vaadin-select.js';
import '@vaadin/vaadin-list-box/src/vaadin-list-box.js';
import '@vaadin/vaadin-item/src/vaadin-item.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
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
 <h4 style="margin-right: var(--lumo-space-xl); margin-left: var(--lumo-space-xl); align-self: center;">Crear cuenta</h4>
 <vaadin-horizontal-layout class="content" style="align-self: center;">
  <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; align-items: flex-end;">
   <vaadin-text-field label="Nombre y Apellidos" id="textarea-nombre"></vaadin-text-field>
   <vaadin-text-field label="Correo electónico" id="textarea-email"></vaadin-text-field>
   <vaadin-password-field label="Contraseña" placeholder="Enter password" value="secret1" id="password" has-value></vaadin-password-field>
   <vaadin-password-field label="Repetir contraseña" placeholder="Enter password" value="secret1" id="repeatpassword" has-value></vaadin-password-field>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="flex-grow: 0;"></vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; align-items: flex-start;">
   <vaadin-text-field label="Dirección" placeholder="Placeholder" id="textarea-direccion"></vaadin-text-field>
   <vaadin-select value="Item one" id="select-formadepago" label="Forma de pago">
    <template>
     <vaadin-list-box selected="0">
      <vaadin-item selected>
        Item one 
      </vaadin-item>
      <vaadin-item>
        Item two 
      </vaadin-item>
      <vaadin-item>
        Item three 
      </vaadin-item>
     </vaadin-list-box>
    </template>
   </vaadin-select>
   <img id="img-fotousaurio" style="padding: var(--lumo-space-xl); align-self: flex-start;">
   <vaadin-text-field label="Foto de usuario" placeholder="Placeholder" id="textarea-fotousuario"></vaadin-text-field>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="align-self: center;">
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
