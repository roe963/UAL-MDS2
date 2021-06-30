import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-select/src/vaadin-select.js';
import '@vaadin/vaadin-list-box/src/vaadin-list-box.js';
import '@vaadin/vaadin-item/src/vaadin-item.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-date-picker/src/vaadin-date-picker.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';

class VistaAgregaroferta extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: stretch;">
 <h4>Agregar Oferta</h4>
 <label>Seleccionar producto</label>
 <vaadin-vertical-layout theme="spacing" id="layout-selectProducto">
  <vaadin-select value="Item one" id="select-producto">
   <template>
    <vaadin-list-box>
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
 </vaadin-vertical-layout>
 <vaadin-text-field label="Precio" id="textField-precio"></vaadin-text-field>
 <vaadin-date-picker label="Fecha fin oferta" placeholder="Elija una fecha" id="datePicker-fechaFinOferta"></vaadin-date-picker>
 <vaadin-button id="button-anadir" style="margin-top: var(--lumo-space-xl);">
   Añadir 
 </vaadin-button>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-agregaroferta';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaAgregaroferta.is, VistaAgregaroferta);
