import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-select/src/vaadin-select.js';
import '@vaadin/vaadin-list-box/src/vaadin-list-box.js';
import '@vaadin/vaadin-item/src/vaadin-item.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaAgregarempleado extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; align-items: stretch; padding: var(--lumo-space-s);">
 <h4 style="align-self: center;">Agregar Usuario</h4>
 <vaadin-text-field label="Id Usuario" placeholder="Placeholder" id="textField-idUsuario"></vaadin-text-field>
 <vaadin-text-field label="Usuario" id="textField-usuario"></vaadin-text-field>
 <vaadin-text-field label="Contraseña" id="textField-password"></vaadin-text-field>
 <label style="margin-top: var(--lumo-space-s);">Tipo de usuario</label>
 <vaadin-vertical-layout id="layout-selectTipoUsuario" style="align-self: stretch;">
  <vaadin-select value="Item one" id="select-tipoUsuario" style="align-self: stretch;">
   <template>
    <vaadin-list-box>
     <vaadin-item selected style="flex-shrink: 0;">
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
 </vaadin-vertical-layout>
 <vaadin-button id="button-anadir" style="margin-top: var(--lumo-space-xl);">
   Añadir 
 </vaadin-button>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-agregarempleado';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaAgregarempleado.is, VistaAgregarempleado);
