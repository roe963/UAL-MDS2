import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-grid/src/vaadin-grid.js';
import '@vaadin/vaadin-grid/src/vaadin-grid-column.js';

class VistaCarrito extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-horizontal-layout style="width: 100%; height: 100%;">
 <vaadin-grid items="[[items]]">
  <vaadin-grid-column width="50px" flex-grow="0">
   <template class="header">
     # 
   </template>
   <template>
     [[index]] 
   </template>
  </vaadin-grid-column>
  <vaadin-grid-column>
   <template class="header">
    Producto
   </template>
   <template>
     [[item.value1]] 
   </template>
  </vaadin-grid-column>
  <vaadin-grid-column>
   <template class="header">
    Categoría
   </template>
   <template>
     [[item.value2]] 
   </template>
  </vaadin-grid-column>
  <vaadin-grid-column>
   <template class="header">
    Precio
   </template>
   <template>
     [[item.value3]] 
   </template>
  </vaadin-grid-column>
  <vaadin-grid-column>
   <template class="header">
    Cantidad
   </template>
   <template>
     [[item.value4]] 
   </template>
  </vaadin-grid-column>
  <vaadin-grid-column>
   <template>
    T
   </template>
   <button>Button</button>
  </vaadin-grid-column>
 </vaadin-grid>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-carrito';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaCarrito.is, VistaCarrito);
