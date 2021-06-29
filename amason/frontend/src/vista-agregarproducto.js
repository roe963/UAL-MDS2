import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-select/src/vaadin-select.js';
import '@vaadin/vaadin-list-box/src/vaadin-list-box.js';
import '@vaadin/vaadin-item/src/vaadin-item.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-checkbox/src/vaadin-checkbox.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';

class VistaAgregarproducto extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: stretch;">
 <h4 style="margin-top: var(--lumo-space-xs);">Agregar Categoría</h4>
 <vaadin-text-field label="Id Producto" placeholder="Placeholder" id="textField-idProducto"></vaadin-text-field>
 <vaadin-text-field label="Nombre" id="textField-nombre" style="align-self: stretch;"></vaadin-text-field>
 <label>Categoría</label>
 <vaadin-vertical-layout theme="spacing" id="layout-selectCategoria">
  <vaadin-select value="Item one" id="select-categoria">
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
 <vaadin-text-area label="Descripción" placeholder="" id="textArea-descripcion"></vaadin-text-area>
 <vaadin-text-field label="Id Foto" placeholder="Placeholder" id="textField-idFoto"></vaadin-text-field>
 <vaadin-text-field label="Imagen" id="textField-imagen" style="flex-grow: 0;"></vaadin-text-field>
 <vaadin-checkbox id="checkbox-productoActivo" style="align-self: center; margin: var(--lumo-space-m);" checked>
   Producto Activo/Desactivo 
 </vaadin-checkbox>
 <vaadin-button id="button-anadir">
   Añadir 
 </vaadin-button>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-agregarproducto';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaAgregarproducto.is, VistaAgregarproducto);
